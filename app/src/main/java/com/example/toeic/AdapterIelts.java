package com.example.toeic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterIelts extends RecyclerView.Adapter<AdapterIelts.IeltsVH> {
    ArrayList<Ielts> arrayList;
    public AdapterIelts(ArrayList<Ielts> arrayList) {
        this.arrayList=arrayList;

    }

    @NonNull
    @Override
    public IeltsVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new IeltsVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IeltsVH holder, int position) {
        Ielts ielts = arrayList.get(position);
        holder.tvName.setText(ielts.English);
        holder.tvDes.setText(ielts.Vietnamese);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class IeltsVH extends RecyclerView.ViewHolder {
        TextView tvName,tvDes;
        public IeltsVH(@NonNull View itemView) {
            super(itemView);

            tvName=itemView.findViewById(R.id.txtName);
            tvDes=itemView.findViewById(R.id.txtDescription);
        }
    }
}
