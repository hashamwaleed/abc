/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RelatedItem 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5525748704407671377L;
    private Item item;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Item")
    public Item getItem ( ) { 
        return this.item;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Item")
    public void setItem (Item value) { 
        this.item = value;
    }
 
}
 