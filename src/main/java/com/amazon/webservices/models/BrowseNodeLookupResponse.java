/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BrowseNodeLookupResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5149906029231492718L;
    private OperationRequest operationRequest;
    private List<BrowseNodes243> browseNodes;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("OperationRequest")
    public OperationRequest getOperationRequest ( ) { 
        return this.operationRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("OperationRequest")
    public void setOperationRequest (OperationRequest value) { 
        this.operationRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BrowseNodes")
    public List<BrowseNodes243> getBrowseNodes ( ) { 
        return this.browseNodes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BrowseNodes")
    public void setBrowseNodes (List<BrowseNodes243> value) { 
        this.browseNodes = value;
    }
 
}
 