// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBinom_InvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBinom_InvRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Binom_Inv Request Builder.
 */
public class WorkbookFunctionsBinom_InvRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsBinom_InvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBinom_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param trials the trials
     * @param probabilityS the probabilityS
     * @param alpha the alpha
     */
    public WorkbookFunctionsBinom_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement trials, final com.google.gson.JsonElement probabilityS, final com.google.gson.JsonElement alpha) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("trials", trials);
        bodyParams.put("probabilityS", probabilityS);
        bodyParams.put("alpha", alpha);
    }

    /**
     * Creates the IWorkbookFunctionsBinom_InvRequest
     *
     * @return the IWorkbookFunctionsBinom_InvRequest instance
     */
    public IWorkbookFunctionsBinom_InvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBinom_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBinom_InvRequest instance
     */
    public IWorkbookFunctionsBinom_InvRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsBinom_InvRequest request = new WorkbookFunctionsBinom_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("trials")) {
            request.body.trials = getParameter("trials");
        }

        if (hasParameter("probabilityS")) {
            request.body.probabilityS = getParameter("probabilityS");
        }

        if (hasParameter("alpha")) {
            request.body.alpha = getParameter("alpha");
        }

        return request;
    }
}
