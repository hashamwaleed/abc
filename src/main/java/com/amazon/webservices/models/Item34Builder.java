/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class Item34Builder {
    //the instance to build
    private Item34 item34;

    /**
     * Default constructor to initialize the instance
     */
    public Item34Builder() {
        item34 = new Item34();
    }

    public Item34Builder action(ActionEnum action) {
        item34.setAction(action);
        return this;
    }

    public Item34Builder cartItemId(String cartItemId) {
        item34.setCartItemId(cartItemId);
        return this;
    }

    public Item34Builder quantity(Integer quantity) {
        item34.setQuantity(quantity);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Item34 build() {
        return item34;
    }
}