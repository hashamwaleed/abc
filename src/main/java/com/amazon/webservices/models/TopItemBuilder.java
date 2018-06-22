/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class TopItemBuilder {
    //the instance to build
    private TopItem topItem;

    /**
     * Default constructor to initialize the instance
     */
    public TopItemBuilder() {
        topItem = new TopItem();
    }

    public TopItemBuilder aSIN(String aSIN) {
        topItem.setASIN(aSIN);
        return this;
    }

    public TopItemBuilder title(String title) {
        topItem.setTitle(title);
        return this;
    }

    public TopItemBuilder detailPageURL(String detailPageURL) {
        topItem.setDetailPageURL(detailPageURL);
        return this;
    }

    public TopItemBuilder productGroup(String productGroup) {
        topItem.setProductGroup(productGroup);
        return this;
    }

    public TopItemBuilder author(List<String> author) {
        topItem.setAuthor(author);
        return this;
    }

    public TopItemBuilder artist(List<String> artist) {
        topItem.setArtist(artist);
        return this;
    }

    public TopItemBuilder actor(List<String> actor) {
        topItem.setActor(actor);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TopItem build() {
        return topItem;
    }
}