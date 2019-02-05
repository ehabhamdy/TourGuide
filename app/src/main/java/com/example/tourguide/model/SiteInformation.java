package com.example.tourguide.model;

import android.content.res.TypedArray;

public class SiteInformation {
    String[] attractions;
    String[] descriptions;
    TypedArray imgs;

    public SiteInformation(String[] attractions, String[] descriptions, TypedArray imgs) {
        this.descriptions = descriptions;
        this.attractions = attractions;
        this.imgs = imgs;
    }

    public String[] getDescriptions() {
        return descriptions;
    }

    public String[] getAttractions() {
        return attractions;
    }

    public TypedArray getImgs() {
        return imgs;
    }

    public void setDescriptions(String[] descriptions) {
        this.descriptions = descriptions;
    }

    public void setAttractions(String[] attractions) {
        this.attractions = attractions;
    }

    public void setImgs(TypedArray imgs) {
        this.imgs = imgs;
    }
}
