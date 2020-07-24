// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookApplicationCalculateRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Application Calculate Request Builder.
 */
public interface IWorkbookApplicationCalculateRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookApplicationCalculateRequest
     *
     * @return the IWorkbookApplicationCalculateRequest instance
     */
    IWorkbookApplicationCalculateRequest buildRequest();

    /**
     * Creates the IWorkbookApplicationCalculateRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookApplicationCalculateRequest instance
     */
    IWorkbookApplicationCalculateRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
