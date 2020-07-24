// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImProductRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Im Product Request Builder.
 */
public interface IWorkbookFunctionsImProductRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImProductRequest
     *
     * @return the IWorkbookFunctionsImProductRequest instance
     */
    IWorkbookFunctionsImProductRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsImProductRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImProductRequest instance
     */
    IWorkbookFunctionsImProductRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
