package com.ch.appiwhiskey.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Destileria implements Serializable {
    @SerializedName("name")
    private String destileriaName;

    @SerializedName("slug")
    private String destileriaSlug;

    @SerializedName("country")
    private String destileriaCountry;

    @SerializedName("whiskybase_whiskies")
    private String destileriaWhiskybase_whiskies;

    @SerializedName("whiskybase_votes")
    private String destileriaWhiskybase_votes;

    @SerializedName("whiskybase_rating")
    private String destileriawhiskybase_rating;

    public Destileria(String destileriaName, String destileriaSlug, String destileriaCountry, String destileriaWhiskybase_whiskies, String destileriaWhiskybase_votes, String destileriawhiskybase_rating) {
        this.destileriaName = destileriaName;
        this.destileriaSlug = destileriaSlug;
        this.destileriaCountry = destileriaCountry;
        this.destileriaWhiskybase_whiskies = destileriaWhiskybase_whiskies;
        this.destileriaWhiskybase_votes = destileriaWhiskybase_votes;
        this.destileriawhiskybase_rating = destileriawhiskybase_rating;
    }

    public String getDestileriaName() {
        return destileriaName;
    }

    public void setDestileriaName(String destileriaName) {
        this.destileriaName = destileriaName;
    }

    public String getDestileriaSlug() {
        return destileriaSlug;
    }

    public void setDestileriaSlug(String destileriaSlug) {
        this.destileriaSlug = destileriaSlug;
    }

    public String getDestileriaCountry() {
        return destileriaCountry;
    }

    public void setDestileriaCountry(String destileriaCountry) {
        this.destileriaCountry = destileriaCountry;
    }

    public String getDestileriaWhiskybase_whiskies() {
        return destileriaWhiskybase_whiskies;
    }

    public void setDestileriaWhiskybase_whiskies(String destileriaWhiskybase_whiskies) {
        this.destileriaWhiskybase_whiskies = destileriaWhiskybase_whiskies;
    }

    public String getDestileriaWhiskybase_votes() {
        return destileriaWhiskybase_votes;
    }

    public void setDestileriaWhiskybase_votes(String destileriaWhiskybase_votes) {
        this.destileriaWhiskybase_votes = destileriaWhiskybase_votes;
    }

    public String getDestileriawhiskybase_rating() {
        return destileriawhiskybase_rating;
    }

    public void setDestileriawhiskybase_rating(String destileriawhiskybase_rating) {
        this.destileriawhiskybase_rating = destileriawhiskybase_rating;
    }
}