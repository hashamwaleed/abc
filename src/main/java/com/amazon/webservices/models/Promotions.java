/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Promotions 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5599456967985913663L;
    private List<Promotion> promotion;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Promotion")
    public List<Promotion> getPromotion ( ) { 
        return this.promotion;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Promotion")
    public void setPromotion (List<Promotion> value) { 
        this.promotion = value;
    }
 
}
 