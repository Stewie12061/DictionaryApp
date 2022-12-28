package com.example.toeic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterVocab extends RecyclerView.Adapter<AdapterVocab.VocabVH> {
    ArrayList<Vocab> arrayList;
    Listener listener;


    public AdapterVocab(ArrayList<Vocab> arrayList, AdapterVocab.Listener listener) {
        this.arrayList = arrayList;
        this.listener=listener;
    }


    @NonNull
    @Override
    public VocabVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_vocab, parent, false);
        return new VocabVH(view);    }

    @Override
    public void onBindViewHolder(@NonNull VocabVH holder, int position) {
        Vocab vocab = arrayList.get(position);
        holder.tvTopic.setText(vocab.topicvocab);
        holder.tvdes1.setText(vocab.des1vocab);
        holder.tvdes2.setText(vocab.des2vocab);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onclick(vocab);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class VocabVH extends RecyclerView.ViewHolder{
        TextView tvTopic,tvdes1,tvdes2;

        public VocabVH(@NonNull View itemView) {
            super(itemView);
            tvTopic=itemView.findViewById(R.id.tvTopic);
            tvdes1=itemView.findViewById(R.id.tvnoidung1);
            tvdes2=itemView.findViewById(R.id.tvnoidung2);
        }
    }
    interface Listener{
        void onclick(Vocab vocab);
    }
}
