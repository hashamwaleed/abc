/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemLookupRequestMsg 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5758794935545127983L;
    private ItemLookup body;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("body")
    public ItemLookup getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("body")
    public void setBody (ItemLookup value) { 
        this.body = value;
    }
 
}
 