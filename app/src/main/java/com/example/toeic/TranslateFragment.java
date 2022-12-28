package com.example.toeic;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TranslateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TranslateFragment extends Fragment implements AdapterTudien.Listener {

    RecyclerView rcTrans, rvKetqua;
    ArrayList<Tudien> arrayList;
    ArrayList<Ketqua> ketquaArrayList;
    AdapterKetqua adapterKetqua;
    AdapterTudien adapterTudien;
    Database database;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public TranslateFragment() {
        // Required empty public constructor
    }

    public static TranslateFragment newInstance(String param1, String param2) {
        TranslateFragment fragment = new TranslateFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        database = new Database(getContext());
        return inflater.inflate(R.layout.fragment_translate, container, false);

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rcTrans = view.findViewById(R.id.rcTrans);

//        Log.d("ABC", database.getTudien().size()+"");
//        arrayList = database.getHistoryTudien();
//        adapterTudien = new AdapterTudien(arrayList, this); // this ở đây là fragment
//        rcTrans.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
//        rcTrans.setAdapter(adapterTudien);

        rvKetqua = view.findViewById(R.id.rvKetqua);
        ketquaArrayList = database.getKetqua();
        adapterKetqua = new AdapterKetqua(ketquaArrayList);
        rvKetqua.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rvKetqua.setAdapter(adapterKetqua);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("ABC", database.getTudien().size()+"");
        arrayList = database.getHistoryTudien();
        adapterTudien = new AdapterTudien(arrayList, this); // this ở đây là fragment
        rcTrans.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rcTrans.setAdapter(adapterTudien);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.search_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mnuSearch) {
            Intent intent = new Intent(getContext(), SearchTudienActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    public static int idTudien;

    @Override
    public void onclick(Tudien tudien) {
        idTudien=tudien.idTudien;
        Intent intent=new Intent(getContext(),DetailTudienActivity.class);
        intent.putExtra("id",idTudien);
        startActivity(intent);

    }
}