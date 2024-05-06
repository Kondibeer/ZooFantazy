package com.example.zoofantazy.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.example.zoofantazy.Adapters.CageAdapter;
import com.example.zoofantazy.Models.CageModel;
import com.example.zoofantazy.R;



import java.util.ArrayList;


public class CageFragment extends Fragment {

    private GridView gridView;
    private CageAdapter adapter;
    private ArrayList<CageModel> camodel;

    public CageFragment() {
        // Required empty public constructor
    }


    public static CageFragment newInstance(String param1, String param2) {
        CageFragment fragment = new CageFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_cage, container, false);


        camodel = new ArrayList<>();


        getCage();
        return view;
    }
    public void getCage(){

    }
}