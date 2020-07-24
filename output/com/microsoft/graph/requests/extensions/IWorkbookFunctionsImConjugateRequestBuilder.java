// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImConjugateRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Im Conjugate Request Builder.
 */
public interface IWorkbookFunctionsImConjugateRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImConjugateRequest
     *
     * @return the IWorkbookFunctionsImConjugateRequest instance
     */
    IWorkbookFunctionsImConjugateRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsImConjugateRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImConjugateRequest instance
     */
    IWorkbookFunctionsImConjugateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}