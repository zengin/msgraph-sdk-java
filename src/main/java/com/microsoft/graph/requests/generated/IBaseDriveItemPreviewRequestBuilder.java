// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDriveItemPreviewRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Drive Item Preview Request Builder.
 */
public interface IBaseDriveItemPreviewRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDriveItemPreviewRequest
     *
     * @return the IDriveItemPreviewRequest instance
     */
    IDriveItemPreviewRequest buildRequest();

    /**
     * Creates the IDriveItemPreviewRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemPreviewRequest instance
     */
    IDriveItemPreviewRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
