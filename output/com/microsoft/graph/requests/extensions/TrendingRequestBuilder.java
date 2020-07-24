// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITrendingRequest;
import com.microsoft.graph.requests.extensions.TrendingRequest;
import com.microsoft.graph.requests.extensions.IEntityWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityWithReferenceRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trending Request Builder.
 */
public class TrendingRequestBuilder extends BaseRequestBuilder implements ITrendingRequestBuilder {

    /**
     * The request builder for the Trending
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrendingRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ITrendingRequest instance
     */
    public ITrendingRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITrendingRequest instance
     */
    public ITrendingRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TrendingRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Entity
     *
     * @return the IEntityWithReferenceRequestBuilder instance
     */
    public IEntityWithReferenceRequestBuilder resource() {
        return new EntityWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("resource"), getClient(), null);
    }
}

