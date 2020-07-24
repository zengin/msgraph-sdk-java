// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationRequest;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Based Auth Configuration Request Builder.
 */
public class CertificateBasedAuthConfigurationRequestBuilder extends BaseRequestBuilder implements ICertificateBasedAuthConfigurationRequestBuilder {

    /**
     * The request builder for the CertificateBasedAuthConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CertificateBasedAuthConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ICertificateBasedAuthConfigurationRequest instance
     */
    public ICertificateBasedAuthConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ICertificateBasedAuthConfigurationRequest instance
     */
    public ICertificateBasedAuthConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new CertificateBasedAuthConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

