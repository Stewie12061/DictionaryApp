package com.example.toeic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DetailTudiensAdapter extends RecyclerView.Adapter<DetailTudiensAdapter.DetailTudiensVH> {

    ArrayList <Tudiens> arrayList;
    public DetailTudiensAdapter(ArrayList<Tudiens>arrayList) {
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public DetailTudiensVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_tudiens, parent, false);
        return new DetailTudiensVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailTudiensVH holder, int position) {
        Tudiens tudiens=arrayList.get(position);
        holder.tvTudien.setText(tudiens.tudien);
        holder.tvDanhtu.setText(tudiens.danhtu);
        holder.tvViet.setText(tudiens.viet);
        holder.tvViet1.setText(tudiens.viet1);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class DetailTudiensVH extends RecyclerView.ViewHolder {
        TextView tvTudien,tvDanhtu,tvViet,tvViet1;

        public DetailTudiensVH(@NonNull View itemView) {
            super(itemView);
            tvTudien=itemView.findViewById(R.id.tvTudien);
            tvDanhtu=itemView.findViewById(R.id.tvDanhTu);
            tvViet=itemView.findViewById(R.id.tvViet);
            tvViet1=itemView.findViewById(R.id.tvViet1);

        }
    }
}
