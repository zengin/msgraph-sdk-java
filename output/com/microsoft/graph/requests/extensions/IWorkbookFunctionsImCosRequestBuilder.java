// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImCosRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Im Cos Request Builder.
 */
public interface IWorkbookFunctionsImCosRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImCosRequest
     *
     * @return the IWorkbookFunctionsImCosRequest instance
     */
    IWorkbookFunctionsImCosRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsImCosRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImCosRequest instance
     */
    IWorkbookFunctionsImCosRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}