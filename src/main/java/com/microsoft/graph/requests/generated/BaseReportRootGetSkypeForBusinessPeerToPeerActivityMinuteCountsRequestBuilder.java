// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Report Root Get Skype For Business Peer To Peer Activity Minute Counts Request Builder.
 */
public class BaseReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public BaseReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest instance
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest request = new ReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequest(
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