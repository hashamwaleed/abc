/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartItems 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5235326245275618108L;
    private List<CartItem> cartItem;
    private Price subTotal;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CartItem")
    public List<CartItem> getCartItem ( ) { 
        return this.cartItem;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CartItem")
    public void setCartItem (List<CartItem> value) { 
        this.cartItem = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SubTotal")
    public Price getSubTotal ( ) { 
        return this.subTotal;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SubTotal")
    public void setSubTotal (Price value) { 
        this.subTotal = value;
    }
 
}
 