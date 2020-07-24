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
 * The interface for the Site With Reference Request.
 */
public interface ISiteWithReferenceRequest extends IHttpRequest {

    void post(final Site newSite, final IJsonBackedObject payload, final ICallback<Site> callback);

    Site post(final Site newSite, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<Site> callback);

    Site get() throws ClientException;

	void delete(final ICallback<Site> callback);

	void delete() throws ClientException;

	void patch(final Site sourceSite, final ICallback<Site> callback);

	Site patch(final Site sourceSite) throws ClientException;

    ISiteWithReferenceRequest select(final String value);

    ISiteWithReferenceRequest expand(final String value);

}