/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RentalOffers 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5393202333458383050L;
    private List<RentalOffer> rentalOffer;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RentalOffer")
    public List<RentalOffer> getRentalOffer ( ) { 
        return this.rentalOffer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RentalOffer")
    public void setRentalOffer (List<RentalOffer> value) { 
        this.rentalOffer = value;
    }
 
}
 