// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBaseRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBaseRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Base Request Builder.
 */
public class WorkbookFunctionsBaseRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsBaseRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param radix the radix
     * @param minLength the minLength
     */
    public WorkbookFunctionsBaseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement radix, final com.google.gson.JsonElement minLength) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("radix", radix);
        bodyParams.put("minLength", minLength);
    }

    /**
     * Creates the IWorkbookFunctionsBaseRequest
     *
     * @return the IWorkbookFunctionsBaseRequest instance
     */
    public IWorkbookFunctionsBaseRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBaseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBaseRequest instance
     */
    public IWorkbookFunctionsBaseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsBaseRequest request = new WorkbookFunctionsBaseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("radix")) {
            request.body.radix = getParameter("radix");
        }

        if (hasParameter("minLength")) {
            request.body.minLength = getParameter("minLength");
        }

        return request;
    }
}
