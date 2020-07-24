// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IRoomRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Room Request Builder.
 */
public interface IRoomRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IRoomRequest instance
     */
    IRoomRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IRoomRequest instance
     */
    IRoomRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


}