// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFormatAutofitColumnsRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Format Autofit Columns Request Builder.
 */
public interface IWorkbookRangeFormatAutofitColumnsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRangeFormatAutofitColumnsRequest
     *
     * @return the IWorkbookRangeFormatAutofitColumnsRequest instance
     */
    IWorkbookRangeFormatAutofitColumnsRequest buildRequest();

    /**
     * Creates the IWorkbookRangeFormatAutofitColumnsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeFormatAutofitColumnsRequest instance
     */
    IWorkbookRangeFormatAutofitColumnsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
