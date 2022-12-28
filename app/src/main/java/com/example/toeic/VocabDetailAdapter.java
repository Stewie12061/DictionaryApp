package com.example.toeic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VocabDetailAdapter extends RecyclerView.Adapter<VocabDetailAdapter.DetailVocabVH> {

    ArrayList<Vocabulary> arrayList;
    public VocabDetailAdapter(ArrayList<Vocabulary> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public DetailVocabVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_vocabulary, parent, false);
        return new DetailVocabVH(view);    }
    @Override
    public void onBindViewHolder(@NonNull DetailVocabVH holder, int position) {
        Vocabulary vocabulary = arrayList.get(position);
        holder.tvTopic.setText(vocabulary.topicvoca);
        holder.tvdes1.setText(vocabulary.des1voca);
        holder.tvdes2.setText(vocabulary.des2voca);
        holder.tvdes3.setText(vocabulary.des3voca);
        holder.tvdes4.setText(vocabulary.des4voca);
        holder.tvdes5.setText(vocabulary.des5voca);
        holder.tvdes6.setText(vocabulary.des6voca);
        holder.tvdes7.setText(vocabulary.des7voca);
        holder.tvdes8.setText(vocabulary.des8voca);
        holder.tvdes9.setText(vocabulary.des9voca);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class DetailVocabVH extends RecyclerView.ViewHolder {
        TextView tvTopic, tvdes1, tvdes2, tvdes3, tvdes4, tvdes5, tvdes6, tvdes7, tvdes8, tvdes9;

        public DetailVocabVH(@NonNull View itemView) {
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
