/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BrowseNodes243 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4838010704020956915L;
    private Request162 request;
    private List<BrowseNode> browseNode;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Request")
    public Request162 getRequest ( ) { 
        return this.request;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Request")
    public void setRequest (Request162 value) { 
        this.request = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BrowseNode")
    public List<BrowseNode> getBrowseNode ( ) { 
        return this.browseNode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BrowseNode")
    public void setBrowseNode (List<BrowseNode> value) { 
        this.browseNode = value;
    }
 
}
 