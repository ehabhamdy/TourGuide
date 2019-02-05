package com.example.tourguide.model;

public class Site {
    private int picture;
    private String attraction;
    private String description;

    public int getPicture() {
        return picture;
    }

    public String getAttraction() {
        return attraction;
    }

    public String getDescription() {
        return description;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
