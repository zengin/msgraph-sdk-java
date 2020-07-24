// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBesselIRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBesselIRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Bessel IRequest Builder.
 */
public class WorkbookFunctionsBesselIRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsBesselIRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBesselI
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param n the n
     */
    public WorkbookFunctionsBesselIRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement n) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("n", n);
    }

    /**
     * Creates the IWorkbookFunctionsBesselIRequest
     *
     * @return the IWorkbookFunctionsBesselIRequest instance
     */
    public IWorkbookFunctionsBesselIRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBesselIRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBesselIRequest instance
     */
    public IWorkbookFunctionsBesselIRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBesselIRequest request = new WorkbookFunctionsBesselIRequest(
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

        return request;
    }
}
