/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CorrectedQuery 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4724460594711777814L;
    private String keywords;
    private String message;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Keywords")
    public String getKeywords ( ) { 
        return this.keywords;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Keywords")
    public void setKeywords (String value) { 
        this.keywords = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
}
 