/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Offers 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4708842751799319305L;
    private Integer totalOffers;
    private Integer totalOfferPages;
    private String moreOffersUrl;
    private List<Offer> offer;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TotalOffers")
    public Integer getTotalOffers ( ) { 
        return this.totalOffers;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TotalOffers")
    public void setTotalOffers (Integer value) { 
        this.totalOffers = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TotalOfferPages")
    public Integer getTotalOfferPages ( ) { 
        return this.totalOfferPages;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TotalOfferPages")
    public void setTotalOfferPages (Integer value) { 
        this.totalOfferPages = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MoreOffersUrl")
    public String getMoreOffersUrl ( ) { 
        return this.moreOffersUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MoreOffersUrl")
    public void setMoreOffersUrl (String value) { 
        this.moreOffersUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Offer")
    public List<Offer> getOffer ( ) { 
        return this.offer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Offer")
    public void setOffer (List<Offer> value) { 
        this.offer = value;
    }
 
}
 