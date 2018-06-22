/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartGetRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4929594773987915167L;
    private String cartId;
    private String hMAC;
    private String mergeCart;
    private List<String> responseGroup;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CartId")
    public String getCartId ( ) { 
        return this.cartId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CartId")
    public void setCartId (String value) { 
        this.cartId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HMAC")
    public String getHMAC ( ) { 
        return this.hMAC;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HMAC")
    public void setHMAC (String value) { 
        this.hMAC = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MergeCart")
    public String getMergeCart ( ) { 
        return this.mergeCart;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MergeCart")
    public void setMergeCart (String value) { 
        this.mergeCart = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ResponseGroup")
    public List<String> getResponseGroup ( ) { 
        return this.responseGroup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ResponseGroup")
    public void setResponseGroup (List<String> value) { 
        this.responseGroup = value;
    }
 
}
 