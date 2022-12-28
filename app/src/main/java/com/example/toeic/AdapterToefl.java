package com.example.toeic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterToefl extends RecyclerView.Adapter<AdapterToefl.ToeflVH> {
    ArrayList<Toefl> arrayList;
    public AdapterToefl(ArrayList<Toefl>arrayList) {
        this.arrayList=arrayList;

    }

    @NonNull
    @Override
    public ToeflVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ToeflVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToeflVH holder, int position) {
        Toefl toefl = arrayList.get(position);
        holder.tvName.setText(toefl.English);
        holder.tvDes.setText(toefl.Vietnamese);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ToeflVH extends RecyclerView.ViewHolder {
        TextView tvName,tvDes;
        public ToeflVH(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.txtName);
            tvDes=itemView.findViewById(R.id.txtDescription);
        }
    }
}
