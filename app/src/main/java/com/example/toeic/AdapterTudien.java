package com.example.toeic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterTudien extends RecyclerView.Adapter<AdapterTudien.TuDienVH>
        implements Filterable
{
    ArrayList<Tudien> arrayList;
    ArrayList<Tudien> arrayListFilter;

    Listener listener;

    public AdapterTudien(ArrayList<Tudien> arrayList,Listener listener) {
        this.arrayList = arrayList;
        this.arrayListFilter = arrayList;
        this.listener=listener;
    }

    @NonNull
    @Override
    public TuDienVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new TuDienVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull TuDienVH holder, int position) {
        Tudien tudien = arrayListFilter.get(position);
        holder.tvName.setText(tudien.name);
        holder.tvDes.setText(tudien.des);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onclick(tudien);
            }
        });
    }


    @Override
    public int getItemCount() {
        return arrayListFilter.size();
    }

    @Override
    public Filter getFilter() {
            return new TudienFilter();
    }
    class TudienFilter extends Filter{

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            String charString = constraint.toString();
            if (charString.isEmpty()) {
                arrayListFilter = arrayList;
            } else {
                ArrayList<Tudien> filteredList = new ArrayList<>();
                for (Tudien row : arrayList) {
                    if ((row.name.toLowerCase().contains(charString.toLowerCase()))) {
                        filteredList.add(row);
                    }
                }
                arrayListFilter = filteredList;
            }

            FilterResults filterResults = new FilterResults();
            filterResults.values = arrayListFilter;
            return filterResults;

        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            arrayListFilter = (ArrayList<Tudien>) results.values;
            notifyDataSetChanged();
        }
    }

    class TuDienVH extends RecyclerView.ViewHolder {
        TextView tvName, tvDes;

        public TuDienVH(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.txtName);
            tvDes = itemView.findViewById(R.id.txtDescription);
        }
    }

    interface Listener {
        void onclick(Tudien tudien);
    }
}
