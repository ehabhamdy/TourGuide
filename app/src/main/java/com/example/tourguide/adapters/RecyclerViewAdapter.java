package com.example.tourguide.adapters;

import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tourguide.R;
import com.example.tourguide.model.Site;
import com.example.tourguide.model.SiteInformation;

/**
 * Created by anupamchugh on 05/10/16.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<TextItemViewHolder> {

    Site[] sites;

    public RecyclerViewAdapter(SiteInformation items) {
        String[] descriptions = items.getDescriptions();
        String[] attractions = items.getAttractions();
        TypedArray images = items.getImgs();
        sites = new Site[attractions.length];

        for (int i = 0; i < attractions.length; i++) {
            sites[i] = new Site();
            sites[i].setAttraction(attractions[i]);
            sites[i].setDescription(descriptions[i]);
            sites[i].setPicture(images.getResourceId(i, -1));
        }
    }

    @Override
    public TextItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_list_item, parent, false);
        return new TextItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TextItemViewHolder holder, int position) {
        holder.bind(sites[position]);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return sites.length;
    }
}
