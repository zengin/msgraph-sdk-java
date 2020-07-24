// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRomanRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRomanRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Roman Request Builder.
 */
public class WorkbookFunctionsRomanRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsRomanRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRoman
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param form the form
     */
    public WorkbookFunctionsRomanRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement form) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("form", form);
    }

    /**
     * Creates the IWorkbookFunctionsRomanRequest
     *
     * @return the IWorkbookFunctionsRomanRequest instance
     */
    public IWorkbookFunctionsRomanRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRomanRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRomanRequest instance
     */
    public IWorkbookFunctionsRomanRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsRomanRequest request = new WorkbookFunctionsRomanRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("form")) {
            request.body.form = getParameter("form");
        }

        return request;
    }
}