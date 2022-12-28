package com.example.toeic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterSentences extends RecyclerView.Adapter<AdapterSentences.SentenVH> {
    ArrayList<Sentences> arrayList;
    AdapterSentences.Listener listener;


    public AdapterSentences(ArrayList<Sentences> arrayList, AdapterSentences.Listener listener) {
        this.arrayList = arrayList;
        this.listener=listener;
    }


    @NonNull
    @Override
    public AdapterSentences.SentenVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_sentences, parent, false);
        return new AdapterSentences.SentenVH (view);    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSentences.SentenVH holder, int position) {
        Sentences sentences = arrayList.get(position);
        holder.tvTopic.setText(sentences.topicsenten);
        holder.tvdes1.setText(sentences.des1senten);
        holder.tvdes2.setText(sentences.des2senten);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onclick(sentences);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class SentenVH extends RecyclerView.ViewHolder{
        TextView tvTopic,tvdes1,tvdes2;

        public SentenVH(@NonNull View itemView) {
            super(itemView);
            tvTopic=itemView.findViewById(R.id.tvTopicSen);
            tvdes1=itemView.findViewById(R.id.tvNoidungSen);
            tvdes2=itemView.findViewById(R.id.tvNoidungSen1);
        }
    }
    interface Listener{
        void onclick(Sentences sentences);
    }
}
