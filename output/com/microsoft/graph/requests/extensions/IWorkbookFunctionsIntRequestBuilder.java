// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIntRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Int Request Builder.
 */
public interface IWorkbookFunctionsIntRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsIntRequest
     *
     * @return the IWorkbookFunctionsIntRequest instance
     */
    IWorkbookFunctionsIntRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsIntRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIntRequest instance
     */
    IWorkbookFunctionsIntRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
