/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Price 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4954410282820318152L;
    private String formattedPrice;
    private Integer amount;
    private String currencyCode;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("FormattedPrice")
    public String getFormattedPrice ( ) { 
        return this.formattedPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("FormattedPrice")
    public void setFormattedPrice (String value) { 
        this.formattedPrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Amount")
    public Integer getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Amount")
    public void setAmount (Integer value) { 
        this.amount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CurrencyCode")
    public String getCurrencyCode ( ) { 
        return this.currencyCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CurrencyCode")
    public void setCurrencyCode (String value) { 
        this.currencyCode = value;
    }
 
}
 