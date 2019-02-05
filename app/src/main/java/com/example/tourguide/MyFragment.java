package com.example.tourguide;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.tourguide.adapters.RecyclerViewAdapter;
import com.example.tourguide.model.SiteInformation;

import java.util.ArrayList;

public class MyFragment extends Fragment {

    RecyclerView recyclerView;
    ListView list;

    public static MyFragment newInstance(int id) {
        MyFragment myFragment = new MyFragment();

        Bundle args = new Bundle();
        args.putInt("location_id", id);
        myFragment.setArguments(args);

        return myFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.fragment, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int locationId = getArguments().getInt("location_id");

        String[] berlinAttractions = getResources().getStringArray(R.array.berlin_attractions);
        String[] berlinDescriptions = getResources().getStringArray(R.array.berlin_descriptions);
        TypedArray berlineiImgs = getResources().obtainTypedArray(R.array.berlin_imgs);

        String[] cologneAttractions = getResources().getStringArray(R.array.cologne_attractions);
        String[] cologneDescriptions = getResources().getStringArray(R.array.cologne_descriptions);
        TypedArray cologneiImgs = getResources().obtainTypedArray(R.array.cologne_imgs);

        String[] passauAttractions = getResources().getStringArray(R.array.passau_attractions);
        String[] passauDescriptions = getResources().getStringArray(R.array.passau_descriptions);
        TypedArray passauiImgs = getResources().obtainTypedArray(R.array.passau_imgs);

        String[] munichAttractions = getResources().getStringArray(R.array.munich_attractions);
        String[] munichDescriptions = getResources().getStringArray(R.array.munich_descriptions);
        TypedArray munichImgs = getResources().obtainTypedArray(R.array.munich_imgs);

        SiteInformation berlineInfos = new SiteInformation(berlinAttractions, berlinDescriptions, berlineiImgs);
        SiteInformation cologneInfos = new SiteInformation(cologneAttractions, cologneDescriptions, cologneiImgs);
        SiteInformation passauInfos = new SiteInformation(passauAttractions, passauDescriptions, passauiImgs);
        SiteInformation munichInfos = new SiteInformation(munichAttractions, munichDescriptions, munichImgs);

        ArrayList<SiteInformation> infoList = new ArrayList<>();
        infoList.add(berlineInfos);
        infoList.add(munichInfos);
        infoList.add(cologneInfos);
        infoList.add(passauInfos);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(infoList.get(locationId));
        recyclerView = view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}

