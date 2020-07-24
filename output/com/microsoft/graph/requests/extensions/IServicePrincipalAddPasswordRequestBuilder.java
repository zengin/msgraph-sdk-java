// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IServicePrincipalAddPasswordRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Service Principal Add Password Request Builder.
 */
public interface IServicePrincipalAddPasswordRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IServicePrincipalAddPasswordRequest
     *
     * @return the IServicePrincipalAddPasswordRequest instance
     */
    IServicePrincipalAddPasswordRequest buildRequest();

    /**
     * Creates the IServicePrincipalAddPasswordRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IServicePrincipalAddPasswordRequest instance
     */
    IServicePrincipalAddPasswordRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
