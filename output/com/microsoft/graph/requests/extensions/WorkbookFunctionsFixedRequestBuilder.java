// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFixedRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFixedRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Fixed Request Builder.
 */
public class WorkbookFunctionsFixedRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsFixedRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFixed
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param decimals the decimals
     * @param noCommas the noCommas
     */
    public WorkbookFunctionsFixedRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement decimals, final com.google.gson.JsonElement noCommas) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("decimals", decimals);
        bodyParams.put("noCommas", noCommas);
    }

    /**
     * Creates the IWorkbookFunctionsFixedRequest
     *
     * @return the IWorkbookFunctionsFixedRequest instance
     */
    public IWorkbookFunctionsFixedRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFixedRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFixedRequest instance
     */
    public IWorkbookFunctionsFixedRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsFixedRequest request = new WorkbookFunctionsFixedRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("decimals")) {
            request.body.decimals = getParameter("decimals");
        }

        if (hasParameter("noCommas")) {
            request.body.noCommas = getParameter("noCommas");
        }

        return request;
    }
}
