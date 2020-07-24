// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFilterRequest;
import com.microsoft.graph.requests.extensions.WorkbookFilterRequest;
import com.microsoft.graph.models.extensions.WorkbookFilterCriteria;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyBottomItemsFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyBottomItemsFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyBottomPercentFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyBottomPercentFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyCellColorFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyCellColorFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyCustomFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyCustomFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyDynamicFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyDynamicFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyFontColorFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyFontColorFilterRequestBuilder;
import com.microsoft.graph.models.extensions.WorkbookIcon;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyIconFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyIconFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyTopItemsFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyTopItemsFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyTopPercentFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyTopPercentFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyValuesFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyValuesFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFilterClearRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFilterClearRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Request Builder.
 */
public class WorkbookFilterRequestBuilder extends BaseRequestBuilder implements IWorkbookFilterRequestBuilder {

    /**
     * The request builder for the WorkbookFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookFilterRequest instance
     */
    public IWorkbookFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookFilterRequest instance
     */
    public IWorkbookFilterRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookFilterRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IWorkbookFilterApplyRequestBuilder apply(final WorkbookFilterCriteria criteria) {
        return new WorkbookFilterApplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.apply"), getClient(), null, criteria);
    }

    public IWorkbookFilterApplyBottomItemsFilterRequestBuilder applyBottomItemsFilter(final Integer count) {
        return new WorkbookFilterApplyBottomItemsFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyBottomItemsFilter"), getClient(), null, count);
    }

    public IWorkbookFilterApplyBottomPercentFilterRequestBuilder applyBottomPercentFilter(final Integer percent) {
        return new WorkbookFilterApplyBottomPercentFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyBottomPercentFilter"), getClient(), null, percent);
    }

    public IWorkbookFilterApplyCellColorFilterRequestBuilder applyCellColorFilter(final String color) {
        return new WorkbookFilterApplyCellColorFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyCellColorFilter"), getClient(), null, color);
    }

    public IWorkbookFilterApplyCustomFilterRequestBuilder applyCustomFilter(final String criteria1, final String criteria2, final String oper) {
        return new WorkbookFilterApplyCustomFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyCustomFilter"), getClient(), null, criteria1, criteria2, oper);
    }

    public IWorkbookFilterApplyDynamicFilterRequestBuilder applyDynamicFilter(final String criteria) {
        return new WorkbookFilterApplyDynamicFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyDynamicFilter"), getClient(), null, criteria);
    }

    public IWorkbookFilterApplyFontColorFilterRequestBuilder applyFontColorFilter(final String color) {
        return new WorkbookFilterApplyFontColorFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyFontColorFilter"), getClient(), null, color);
    }

    public IWorkbookFilterApplyIconFilterRequestBuilder applyIconFilter(final WorkbookIcon icon) {
        return new WorkbookFilterApplyIconFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyIconFilter"), getClient(), null, icon);
    }

    public IWorkbookFilterApplyTopItemsFilterRequestBuilder applyTopItemsFilter(final Integer count) {
        return new WorkbookFilterApplyTopItemsFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyTopItemsFilter"), getClient(), null, count);
    }

    public IWorkbookFilterApplyTopPercentFilterRequestBuilder applyTopPercentFilter(final Integer percent) {
        return new WorkbookFilterApplyTopPercentFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyTopPercentFilter"), getClient(), null, percent);
    }

    public IWorkbookFilterApplyValuesFilterRequestBuilder applyValuesFilter(final com.google.gson.JsonElement values) {
        return new WorkbookFilterApplyValuesFilterRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyValuesFilter"), getClient(), null, values);
    }

    public IWorkbookFilterClearRequestBuilder clear() {
        return new WorkbookFilterClearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clear"), getClient(), null);
    }
}

