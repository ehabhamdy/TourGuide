package com.example.tourguide.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tourguide.R;
import com.example.tourguide.model.Site;

public class TextItemViewHolder extends RecyclerView.ViewHolder {
    private TextView nameTextView;
    private TextView descriptionTextView;
    private ImageView imageView;

    public TextItemViewHolder(View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.name_textview);
        descriptionTextView = itemView.findViewById(R.id.description_textview);
        imageView = itemView.findViewById(R.id.img);
    }

    public void bind(Site site) {
        nameTextView.setText(site.getAttraction());
        descriptionTextView.setText(site.getDescription());
        imageView.setImageResource(site.getPicture());
    }

}
