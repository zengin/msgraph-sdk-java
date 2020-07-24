// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSeriesSumRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsSeriesSumRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Series Sum Request Builder.
 */
public class WorkbookFunctionsSeriesSumRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsSeriesSumRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSeriesSum
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param n the n
     * @param m the m
     * @param coefficients the coefficients
     */
    public WorkbookFunctionsSeriesSumRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement n, final com.google.gson.JsonElement m, final com.google.gson.JsonElement coefficients) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("n", n);
        bodyParams.put("m", m);
        bodyParams.put("coefficients", coefficients);
    }

    /**
     * Creates the IWorkbookFunctionsSeriesSumRequest
     *
     * @return the IWorkbookFunctionsSeriesSumRequest instance
     */
    public IWorkbookFunctionsSeriesSumRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSeriesSumRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSeriesSumRequest instance
     */
    public IWorkbookFunctionsSeriesSumRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsSeriesSumRequest request = new WorkbookFunctionsSeriesSumRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("n")) {
            request.body.n = getParameter("n");
        }

        if (hasParameter("m")) {
            request.body.m = getParameter("m");
        }

        if (hasParameter("coefficients")) {
            request.body.coefficients = getParameter("coefficients");
        }

        return request;
    }
}
