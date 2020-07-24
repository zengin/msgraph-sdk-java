// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTrimMeanRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTrimMeanRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Trim Mean Request Builder.
 */
public class WorkbookFunctionsTrimMeanRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsTrimMeanRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsTrimMean
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     * @param percent the percent
     */
    public WorkbookFunctionsTrimMeanRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement percent) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("array", array);
        bodyParams.put("percent", percent);
    }

    /**
     * Creates the IWorkbookFunctionsTrimMeanRequest
     *
     * @return the IWorkbookFunctionsTrimMeanRequest instance
     */
    public IWorkbookFunctionsTrimMeanRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTrimMeanRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTrimMeanRequest instance
     */
    public IWorkbookFunctionsTrimMeanRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsTrimMeanRequest request = new WorkbookFunctionsTrimMeanRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.body.array = getParameter("array");
        }

        if (hasParameter("percent")) {
            request.body.percent = getParameter("percent");
        }

        return request;
    }
}
