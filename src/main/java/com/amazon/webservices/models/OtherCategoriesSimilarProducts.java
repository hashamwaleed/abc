/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OtherCategoriesSimilarProducts 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4895018197964295320L;
    private List<OtherCategoriesSimilarProduct> otherCategoriesSimilarProduct;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("OtherCategoriesSimilarProduct")
    public List<OtherCategoriesSimilarProduct> getOtherCategoriesSimilarProduct ( ) { 
        return this.otherCategoriesSimilarProduct;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("OtherCategoriesSimilarProduct")
    public void setOtherCategoriesSimilarProduct (List<OtherCategoriesSimilarProduct> value) { 
        this.otherCategoriesSimilarProduct = value;
    }
 
}
 