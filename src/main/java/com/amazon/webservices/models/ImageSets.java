/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ImageSets 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4694763990210562330L;
    private List<ImageSet> imageSet;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ImageSet")
    public List<ImageSet> getImageSet ( ) { 
        return this.imageSet;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ImageSet")
    public void setImageSet (List<ImageSet> value) { 
        this.imageSet = value;
    }
 
}
 