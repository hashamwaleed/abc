/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Property 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5276244884706392909L;
    private String name;
    private String value;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Value")
    public String getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Value")
    public void setValue (String value) { 
        this.value = value;
    }
 
}
 