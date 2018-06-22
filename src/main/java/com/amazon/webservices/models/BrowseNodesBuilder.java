/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class BrowseNodesBuilder {
    //the instance to build
    private BrowseNodes browseNodes;

    /**
     * Default constructor to initialize the instance
     */
    public BrowseNodesBuilder() {
        browseNodes = new BrowseNodes();
    }

    public BrowseNodesBuilder request(Request request) {
        browseNodes.setRequest(request);
        return this;
    }

    public BrowseNodesBuilder browseNode(List<BrowseNode> browseNode) {
        browseNodes.setBrowseNode(browseNode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BrowseNodes build() {
        return browseNodes;
    }
}