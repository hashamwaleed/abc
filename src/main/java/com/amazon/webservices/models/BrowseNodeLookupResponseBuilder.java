/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class BrowseNodeLookupResponseBuilder {
    //the instance to build
    private BrowseNodeLookupResponse browseNodeLookupResponse;

    /**
     * Default constructor to initialize the instance
     */
    public BrowseNodeLookupResponseBuilder() {
        browseNodeLookupResponse = new BrowseNodeLookupResponse();
    }

    public BrowseNodeLookupResponseBuilder operationRequest(OperationRequest operationRequest) {
        browseNodeLookupResponse.setOperationRequest(operationRequest);
        return this;
    }

    public BrowseNodeLookupResponseBuilder browseNodes(List<BrowseNodes243> browseNodes) {
        browseNodeLookupResponse.setBrowseNodes(browseNodes);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BrowseNodeLookupResponse build() {
        return browseNodeLookupResponse;
    }
}