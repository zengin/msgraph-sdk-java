// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartAddRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Add Request Builder.
 */
public interface IWorkbookChartAddRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookChartAddRequest
     *
     * @return the IWorkbookChartAddRequest instance
     */
    IWorkbookChartAddRequest buildRequest();

    /**
     * Creates the IWorkbookChartAddRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartAddRequest instance
     */
    IWorkbookChartAddRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}