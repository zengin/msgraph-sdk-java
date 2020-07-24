// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeSortRequest;
import com.microsoft.graph.requests.extensions.WorkbookRangeSortRequest;
import com.microsoft.graph.models.extensions.WorkbookSortField;
import com.microsoft.graph.requests.extensions.IWorkbookRangeSortApplyRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeSortApplyRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Sort Request Builder.
 */
public class WorkbookRangeSortRequestBuilder extends BaseRequestBuilder implements IWorkbookRangeSortRequestBuilder {

    /**
     * The request builder for the WorkbookRangeSort
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeSortRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookRangeSortRequest instance
     */
    public IWorkbookRangeSortRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookRangeSortRequest instance
     */
    public IWorkbookRangeSortRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookRangeSortRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IWorkbookRangeSortApplyRequestBuilder apply(final java.util.List<WorkbookSortField> fields, final Boolean matchCase, final Boolean hasHeaders, final String orientation, final String method) {
        return new WorkbookRangeSortApplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.apply"), getClient(), null, fields, matchCase, hasHeaders, orientation, method);
    }
}
