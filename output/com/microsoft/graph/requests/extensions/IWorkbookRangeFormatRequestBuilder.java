// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFormatRequest;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBorderRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFillRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFontRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFormatProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFormatAutofitColumnsRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFormatAutofitRowsRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Format Request Builder.
 */
public interface IWorkbookRangeFormatRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookRangeFormatRequest instance
     */
    IWorkbookRangeFormatRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookRangeFormatRequest instance
     */
    IWorkbookRangeFormatRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IWorkbookRangeBorderCollectionRequestBuilder borders();

    IWorkbookRangeBorderRequestBuilder borders(final String id);

    /**
     * Gets the request builder for WorkbookRangeFill
     *
     * @return the IWorkbookRangeFillRequestBuilder instance
     */
    IWorkbookRangeFillRequestBuilder fill();

    /**
     * Gets the request builder for WorkbookRangeFont
     *
     * @return the IWorkbookRangeFontRequestBuilder instance
     */
    IWorkbookRangeFontRequestBuilder font();

    /**
     * Gets the request builder for WorkbookFormatProtection
     *
     * @return the IWorkbookFormatProtectionRequestBuilder instance
     */
    IWorkbookFormatProtectionRequestBuilder protection();
    IWorkbookRangeFormatAutofitColumnsRequestBuilder autofitColumns();
    IWorkbookRangeFormatAutofitRowsRequestBuilder autofitRows();

}
