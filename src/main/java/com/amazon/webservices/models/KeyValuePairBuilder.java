/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class KeyValuePairBuilder {
    //the instance to build
    private KeyValuePair keyValuePair;

    /**
     * Default constructor to initialize the instance
     */
    public KeyValuePairBuilder() {
        keyValuePair = new KeyValuePair();
    }

    public KeyValuePairBuilder key(String key) {
        keyValuePair.setKey(key);
        return this;
    }

    public KeyValuePairBuilder value(String value) {
        keyValuePair.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public KeyValuePair build() {
        return keyValuePair;
    }
}