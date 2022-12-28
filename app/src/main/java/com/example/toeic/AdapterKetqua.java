package com.example.toeic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterKetqua extends RecyclerView.Adapter<AdapterKetqua.KetquaVH> {

    ArrayList<Ketqua> arrayList;

    public AdapterKetqua(ArrayList<Ketqua> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public KetquaVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_ketqua, parent, false);
        return new AdapterKetqua.KetquaVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KetquaVH holder, int position) {
        Ketqua ketqua = arrayList.get(position);
        holder.Diem.setText(ketqua.diem);
        holder.TimeLeft.setText(ketqua.timeleft);
        holder.Bode.setText(ketqua.bode);
        holder.Level.setText(ketqua.level);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class KetquaVH extends RecyclerView.ViewHolder {
        TextView Diem, TimeLeft, Bode, Level;

        public KetquaVH(@NonNull View itemView) {
            super(itemView);

            Diem = itemView.findViewById(R.id.diem);
            TimeLeft = itemView.findViewById(R.id.timeleft);
            Bode = itemView.findViewById(R.id.bode);
            Level = itemView.findViewById(R.id.level);
        }
    }
}
