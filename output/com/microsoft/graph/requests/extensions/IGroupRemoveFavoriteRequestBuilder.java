// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupRemoveFavoriteRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Remove Favorite Request Builder.
 */
public interface IGroupRemoveFavoriteRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IGroupRemoveFavoriteRequest
     *
     * @return the IGroupRemoveFavoriteRequest instance
     */
    IGroupRemoveFavoriteRequest buildRequest();

    /**
     * Creates the IGroupRemoveFavoriteRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IGroupRemoveFavoriteRequest instance
     */
    IGroupRemoveFavoriteRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
