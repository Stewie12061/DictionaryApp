package com.example.toeic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SentencesDetailAdapter extends RecyclerView.Adapter<SentencesDetailAdapter.DeatailSentenVH> {
    ArrayList<Senten> arrayList;


    public SentencesDetailAdapter(ArrayList<Senten> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public DeatailSentenVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_sen, parent, false);
        return new DeatailSentenVH(view);    }

    @Override
    public void onBindViewHolder(@NonNull DeatailSentenVH holder, int position) {
        Senten senten = arrayList.get(position);
        holder.tvTopic.setText(senten.topicsente);
        holder.tvdes1.setText(senten.des1sente);
        holder.tvdes2.setText(senten.des2sente);
        holder.tvdes3.setText(senten.des3sente);
        holder.tvdes4.setText(senten.des4sente);
        holder.tvdes5.setText(senten.des5sente);
        holder.tvdes6.setText(senten.des6sente);
        holder.tvdes7.setText(senten.des7sente);
        holder.tvdes8.setText(senten.des8sente);
        holder.tvdes9.setText(senten.des9sente);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class DeatailSentenVH extends RecyclerView.ViewHolder {
        TextView tvTopic, tvdes1, tvdes2, tvdes3, tvdes4, tvdes5, tvdes6, tvdes7, tvdes8, tvdes9;

        public DeatailSentenVH(@NonNull View itemView) {
            super(itemView);

            tvTopic = itemView.findViewById(R.id.tvTopicVocabulary);
            tvdes1 = itemView.findViewById(R.id.tv1);
            tvdes2 = itemView.findViewById(R.id.tv2);
            tvdes3 = itemView.findViewById(R.id.tv3);
            tvdes4 = itemView.findViewById(R.id.tv4);
            tvdes5 = itemView.findViewById(R.id.tv5);
            tvdes6 = itemView.findViewById(R.id.tv6);
            tvdes7 = itemView.findViewById(R.id.tv7);
            tvdes8 = itemView.findViewById(R.id.tv8);
            tvdes9 = itemView.findViewById(R.id.tv9);
        }
    }
}
