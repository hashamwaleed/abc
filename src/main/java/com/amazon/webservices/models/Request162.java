/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Request162 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4748894284805237260L;
    private String isValid;
    private BrowseNodeLookupRequest browseNodeLookupRequest;
    private ItemSearchRequest itemSearchRequest;
    private ItemLookupRequest itemLookupRequest;
    private SimilarityLookupRequest similarityLookupRequest;
    private CartGetRequest cartGetRequest;
    private CartAddRequest cartAddRequest;
    private CartCreateRequest cartCreateRequest;
    private CartModifyRequest cartModifyRequest;
    private CartClearRequest cartClearRequest;
    private Errors errors;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IsValid")
    public String getIsValid ( ) { 
        return this.isValid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IsValid")
    public void setIsValid (String value) { 
        this.isValid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BrowseNodeLookupRequest")
    public BrowseNodeLookupRequest getBrowseNodeLookupRequest ( ) { 
        return this.browseNodeLookupRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BrowseNodeLookupRequest")
    public void setBrowseNodeLookupRequest (BrowseNodeLookupRequest value) { 
        this.browseNodeLookupRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ItemSearchRequest")
    public ItemSearchRequest getItemSearchRequest ( ) { 
        return this.itemSearchRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ItemSearchRequest")
    public void setItemSearchRequest (ItemSearchRequest value) { 
        this.itemSearchRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ItemLookupRequest")
    public ItemLookupRequest getItemLookupRequest ( ) { 
        return this.itemLookupRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ItemLookupRequest")
    public void setItemLookupRequest (ItemLookupRequest value) { 
        this.itemLookupRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SimilarityLookupRequest")
    public SimilarityLookupRequest getSimilarityLookupRequest ( ) { 
        return this.similarityLookupRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SimilarityLookupRequest")
    public void setSimilarityLookupRequest (SimilarityLookupRequest value) { 
        this.similarityLookupRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CartGetRequest")
    public CartGetRequest getCartGetRequest ( ) { 
        return this.cartGetRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CartGetRequest")
    public void setCartGetRequest (CartGetRequest value) { 
        this.cartGetRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CartAddRequest")
    public CartAddRequest getCartAddRequest ( ) { 
        return this.cartAddRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CartAddRequest")
    public void setCartAddRequest (CartAddRequest value) { 
        this.cartAddRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CartCreateRequest")
    public CartCreateRequest getCartCreateRequest ( ) { 
        return this.cartCreateRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CartCreateRequest")
    public void setCartCreateRequest (CartCreateRequest value) { 
        this.cartCreateRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CartModifyRequest")
    public CartModifyRequest getCartModifyRequest ( ) { 
        return this.cartModifyRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CartModifyRequest")
    public void setCartModifyRequest (CartModifyRequest value) { 
        this.cartModifyRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CartClearRequest")
    public CartClearRequest getCartClearRequest ( ) { 
        return this.cartClearRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CartClearRequest")
    public void setCartClearRequest (CartClearRequest value) { 
        this.cartClearRequest = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Errors")
    public Errors getErrors ( ) { 
        return this.errors;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Errors")
    public void setErrors (Errors value) { 
        this.errors = value;
    }
 
}
 