// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsF_InvRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsF_InvRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions F_Inv Request Builder.
 */
public class WorkbookFunctionsF_InvRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsF_InvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsF_Inv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param probability the probability
     * @param degFreedom1 the degFreedom1
     * @param degFreedom2 the degFreedom2
     */
    public WorkbookFunctionsF_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement degFreedom1, final com.google.gson.JsonElement degFreedom2) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("probability", probability);
        bodyParams.put("degFreedom1", degFreedom1);
        bodyParams.put("degFreedom2", degFreedom2);
    }

    /**
     * Creates the IWorkbookFunctionsF_InvRequest
     *
     * @return the IWorkbookFunctionsF_InvRequest instance
     */
    public IWorkbookFunctionsF_InvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsF_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsF_InvRequest instance
     */
    public IWorkbookFunctionsF_InvRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsF_InvRequest request = new WorkbookFunctionsF_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.body.probability = getParameter("probability");
        }

        if (hasParameter("degFreedom1")) {
            request.body.degFreedom1 = getParameter("degFreedom1");
        }

        if (hasParameter("degFreedom2")) {
            request.body.degFreedom2 = getParameter("degFreedom2");
        }

        return request;
    }
}