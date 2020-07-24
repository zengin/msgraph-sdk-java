// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImCschRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Im Csch Request Builder.
 */
public interface IWorkbookFunctionsImCschRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImCschRequest
     *
     * @return the IWorkbookFunctionsImCschRequest instance
     */
    IWorkbookFunctionsImCschRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsImCschRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImCschRequest instance
     */
    IWorkbookFunctionsImCschRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
