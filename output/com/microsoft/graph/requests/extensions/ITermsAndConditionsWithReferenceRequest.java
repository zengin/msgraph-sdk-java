// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Terms And Conditions With Reference Request.
 */
public interface ITermsAndConditionsWithReferenceRequest extends IHttpRequest {

    void post(final TermsAndConditions newTermsAndConditions, final IJsonBackedObject payload, final ICallback<TermsAndConditions> callback);

    TermsAndConditions post(final TermsAndConditions newTermsAndConditions, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<TermsAndConditions> callback);

    TermsAndConditions get() throws ClientException;

	void delete(final ICallback<TermsAndConditions> callback);

	void delete() throws ClientException;

	void patch(final TermsAndConditions sourceTermsAndConditions, final ICallback<TermsAndConditions> callback);

	TermsAndConditions patch(final TermsAndConditions sourceTermsAndConditions) throws ClientException;

    ITermsAndConditionsWithReferenceRequest select(final String value);

    ITermsAndConditionsWithReferenceRequest expand(final String value);

}