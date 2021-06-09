package com.ch.appiwhiskey.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Whiskey implements Serializable {

    @SerializedName("name")
    private String whiskeyName;

    @SerializedName("slug")
    private String whiskeySlug;

    @SerializedName("url")
    private String whiskeyUrl;

    @SerializedName("buyers_fee")
    private String whiskeyBuyers_fee;

    @SerializedName("sellers_fee")
    private String whiskeySellers_fee;

    @SerializedName("reserve_fee")
    private String whiskeyReserve_fee;

    @SerializedName("listing_fee")
    private String whiskeyListing_fee;

    @SerializedName("base_currency")
    private String whiskeyBase_currency;

    public Whiskey(String whiskeyName, String whiskeySlug, String whiskeyUrl, String whiskeyBuyers_fee, String whiskeySellers_fee, String whiskeyReserve_fee, String whiskeyListing_fee, String whiskeyBase_currency) {
        this.whiskeyName = whiskeyName;
        this.whiskeySlug = whiskeySlug;
        this.whiskeyUrl = whiskeyUrl;
        this.whiskeyBuyers_fee = whiskeyBuyers_fee;
        this.whiskeySellers_fee = whiskeySellers_fee;
        this.whiskeyReserve_fee = whiskeyReserve_fee;
        this.whiskeyListing_fee = whiskeyListing_fee;
        this.whiskeyBase_currency = whiskeyBase_currency;
    }

    public String getWhiskeyName() {
        return whiskeyName;
    }

    public void setWhiskeyName(String whiskeyName) {
        this.whiskeyName = whiskeyName;
    }

    public String getWhiskeySlug() {
        return whiskeySlug;
    }

    public void setWhiskeySlug(String whiskeySlug) {
        this.whiskeySlug = whiskeySlug;
    }

    public String getWhiskeyUrl() {
        return whiskeyUrl;
    }

    public void setWhiskeyUrl(String whiskeyUrl) {
        this.whiskeyUrl = whiskeyUrl;
    }

    public String getWhiskeyBuyers_fee() {
        return whiskeyBuyers_fee;
    }

    public void setWhiskeyBuyers_fee(String whiskeyBuyers_fee) {
        this.whiskeyBuyers_fee = whiskeyBuyers_fee;
    }

    public String getWhiskeySellers_fee() {
        return whiskeySellers_fee;
    }

    public void setWhiskeySellers_fee(String whiskeySellers_fee) {
        this.whiskeySellers_fee = whiskeySellers_fee;
    }

    public String getWhiskeyReserve_fee() {
        return whiskeyReserve_fee;
    }

    public void setWhiskeyReserve_fee(String whiskeyReserve_fee) {
        this.whiskeyReserve_fee = whiskeyReserve_fee;
    }

    public String getWhiskeyListing_fee() {
        return whiskeyListing_fee;
    }

    public void setWhiskeyListing_fee(String whiskeyListing_fee) {
        this.whiskeyListing_fee = whiskeyListing_fee;
    }

    public String getWhiskeyBase_currency() {
        return whiskeyBase_currency;
    }

    public void setWhiskeyBase_currency(String whiskeyBase_currency) {
        this.whiskeyBase_currency = whiskeyBase_currency;
    }
}
