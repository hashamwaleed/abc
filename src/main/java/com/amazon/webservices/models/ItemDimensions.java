/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemDimensions 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5752773175188762570L;
    private DecimalWithUnits height;
    private DecimalWithUnits length;
    private DecimalWithUnits weight;
    private DecimalWithUnits width;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Height")
    public DecimalWithUnits getHeight ( ) { 
        return this.height;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Height")
    public void setHeight (DecimalWithUnits value) { 
        this.height = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Length")
    public DecimalWithUnits getLength ( ) { 
        return this.length;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Length")
    public void setLength (DecimalWithUnits value) { 
        this.length = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Weight")
    public DecimalWithUnits getWeight ( ) { 
        return this.weight;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Weight")
    public void setWeight (DecimalWithUnits value) { 
        this.weight = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Width")
    public DecimalWithUnits getWidth ( ) { 
        return this.width;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Width")
    public void setWidth (DecimalWithUnits value) { 
        this.width = value;
    }
 
}
 