// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Operation Collection Request Builder.
 */
public class OnenoteOperationCollectionRequestBuilder extends BaseRequestBuilder implements IOnenoteOperationCollectionRequestBuilder {

    /**
     * The request builder for this collection of Onenote
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteOperationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IOnenoteOperationCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IOnenoteOperationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new OnenoteOperationCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOnenoteOperationRequestBuilder byId(final String id) {
        return new OnenoteOperationRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
