// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerGroupsActivityCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerGroupsActivityCountsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Yammer Groups Activity Counts Request Builder.
 */
public class ReportRootGetYammerGroupsActivityCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetYammerGroupsActivityCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetYammerGroupsActivityCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetYammerGroupsActivityCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetYammerGroupsActivityCountsRequest
     *
     * @return the IReportRootGetYammerGroupsActivityCountsRequest instance
     */
    public IReportRootGetYammerGroupsActivityCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetYammerGroupsActivityCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetYammerGroupsActivityCountsRequest instance
     */
    public IReportRootGetYammerGroupsActivityCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetYammerGroupsActivityCountsRequest request = new ReportRootGetYammerGroupsActivityCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
