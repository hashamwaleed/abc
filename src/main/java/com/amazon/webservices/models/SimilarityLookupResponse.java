/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SimilarityLookupResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4751870243491260830L;
    private OperationRequest operationRequest;
    private List<Items134> items;
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
    @JsonGetter("Items")
    public List<Items134> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Items")
    public void setItems (List<Items134> value) { 
        this.items = value;
    }
 
}
 