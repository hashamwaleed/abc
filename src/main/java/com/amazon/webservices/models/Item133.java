/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Item133 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5562307783416564259L;
    private String aSIN;
    private String parentASIN;
    private Errors errors;
    private String detailPageURL;
    private ItemLinks itemLinks;
    private String salesRank;
    private Image smallImage;
    private Image mediumImage;
    private Image largeImage;
    private List<ImageSets> imageSets;
    private ItemAttributes itemAttributes;
    private VariationAttributes variationAttributes;
    private List<RelatedItems> relatedItems;
    private Collections collections;
    private Subjects subjects;
    private OfferSummary offerSummary;
    private Offers offers;
    private RentalOffers rentalOffers;
    private VariationSummary variationSummary;
    private Variations variations;
    private CustomerReviews customerReviews;
    private EditorialReviews editorialReviews;
    private SimilarProducts similarProducts;
    private Accessories accessories;
    private Tracks tracks;
    private BrowseNodes browseNodes;
    private AlternateVersions alternateVersions;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ASIN")
    public String getASIN ( ) { 
        return this.aSIN;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ASIN")
    public void setASIN (String value) { 
        this.aSIN = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ParentASIN")
    public String getParentASIN ( ) { 
        return this.parentASIN;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ParentASIN")
    public void setParentASIN (String value) { 
        this.parentASIN = value;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("DetailPageURL")
    public String getDetailPageURL ( ) { 
        return this.detailPageURL;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("DetailPageURL")
    public void setDetailPageURL (String value) { 
        this.detailPageURL = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ItemLinks")
    public ItemLinks getItemLinks ( ) { 
        return this.itemLinks;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ItemLinks")
    public void setItemLinks (ItemLinks value) { 
        this.itemLinks = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SalesRank")
    public String getSalesRank ( ) { 
        return this.salesRank;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SalesRank")
    public void setSalesRank (String value) { 
        this.salesRank = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SmallImage")
    public Image getSmallImage ( ) { 
        return this.smallImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SmallImage")
    public void setSmallImage (Image value) { 
        this.smallImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MediumImage")
    public Image getMediumImage ( ) { 
        return this.mediumImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MediumImage")
    public void setMediumImage (Image value) { 
        this.mediumImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("LargeImage")
    public Image getLargeImage ( ) { 
        return this.largeImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("LargeImage")
    public void setLargeImage (Image value) { 
        this.largeImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ImageSets")
    public List<ImageSets> getImageSets ( ) { 
        return this.imageSets;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ImageSets")
    public void setImageSets (List<ImageSets> value) { 
        this.imageSets = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ItemAttributes")
    public ItemAttributes getItemAttributes ( ) { 
        return this.itemAttributes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ItemAttributes")
    public void setItemAttributes (ItemAttributes value) { 
        this.itemAttributes = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("VariationAttributes")
    public VariationAttributes getVariationAttributes ( ) { 
        return this.variationAttributes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("VariationAttributes")
    public void setVariationAttributes (VariationAttributes value) { 
        this.variationAttributes = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RelatedItems")
    public List<RelatedItems> getRelatedItems ( ) { 
        return this.relatedItems;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RelatedItems")
    public void setRelatedItems (List<RelatedItems> value) { 
        this.relatedItems = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Collections")
    public Collections getCollections ( ) { 
        return this.collections;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Collections")
    public void setCollections (Collections value) { 
        this.collections = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Subjects")
    public Subjects getSubjects ( ) { 
        return this.subjects;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Subjects")
    public void setSubjects (Subjects value) { 
        this.subjects = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("OfferSummary")
    public OfferSummary getOfferSummary ( ) { 
        return this.offerSummary;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("OfferSummary")
    public void setOfferSummary (OfferSummary value) { 
        this.offerSummary = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Offers")
    public Offers getOffers ( ) { 
        return this.offers;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Offers")
    public void setOffers (Offers value) { 
        this.offers = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RentalOffers")
    public RentalOffers getRentalOffers ( ) { 
        return this.rentalOffers;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RentalOffers")
    public void setRentalOffers (RentalOffers value) { 
        this.rentalOffers = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("VariationSummary")
    public VariationSummary getVariationSummary ( ) { 
        return this.variationSummary;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("VariationSummary")
    public void setVariationSummary (VariationSummary value) { 
        this.variationSummary = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Variations")
    public Variations getVariations ( ) { 
        return this.variations;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Variations")
    public void setVariations (Variations value) { 
        this.variations = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CustomerReviews")
    public CustomerReviews getCustomerReviews ( ) { 
        return this.customerReviews;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CustomerReviews")
    public void setCustomerReviews (CustomerReviews value) { 
        this.customerReviews = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EditorialReviews")
    public EditorialReviews getEditorialReviews ( ) { 
        return this.editorialReviews;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EditorialReviews")
    public void setEditorialReviews (EditorialReviews value) { 
        this.editorialReviews = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SimilarProducts")
    public SimilarProducts getSimilarProducts ( ) { 
        return this.similarProducts;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SimilarProducts")
    public void setSimilarProducts (SimilarProducts value) { 
        this.similarProducts = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Accessories")
    public Accessories getAccessories ( ) { 
        return this.accessories;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Accessories")
    public void setAccessories (Accessories value) { 
        this.accessories = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Tracks")
    public Tracks getTracks ( ) { 
        return this.tracks;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Tracks")
    public void setTracks (Tracks value) { 
        this.tracks = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BrowseNodes")
    public BrowseNodes getBrowseNodes ( ) { 
        return this.browseNodes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BrowseNodes")
    public void setBrowseNodes (BrowseNodes value) { 
        this.browseNodes = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AlternateVersions")
    public AlternateVersions getAlternateVersions ( ) { 
        return this.alternateVersions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AlternateVersions")
    public void setAlternateVersions (AlternateVersions value) { 
        this.alternateVersions = value;
    }
 
}
 