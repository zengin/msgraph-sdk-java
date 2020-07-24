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
 * The class for the Certificate Based Auth Configuration Collection With References Request Builder.
 */
public class CertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements ICertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of Organization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ICertificateBasedAuthConfigurationCollectionWithReferencesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ICertificateBasedAuthConfigurationCollectionWithReferencesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new CertificateBasedAuthConfigurationCollectionWithReferencesRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ICertificateBasedAuthConfigurationWithReferenceRequestBuilder byId(final String id) {
        return new CertificateBasedAuthConfigurationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public ICertificateBasedAuthConfigurationCollectionReferenceRequestBuilder references(){
        return new CertificateBasedAuthConfigurationCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }
}