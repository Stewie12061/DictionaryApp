package com.example.toeic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterToeic extends RecyclerView.Adapter<AdapterToeic.ToeicVH>{
    ArrayList<Toeic> arrayList;
    public AdapterToeic(ArrayList<Toeic> arrayList ) {
    this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public ToeicVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ToeicVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToeicVH holder, int position) {
        Toeic toeic = arrayList.get(position);
        holder.tvName.setText(toeic.English);
        holder.tvDes.setText(toeic.Vietnamese);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ToeicVH extends RecyclerView.ViewHolder {
        TextView tvName,tvDes;
        public ToeicVH(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.txtName);
            tvDes=itemView.findViewById(R.id.txtDescription);
        }
    }
}
