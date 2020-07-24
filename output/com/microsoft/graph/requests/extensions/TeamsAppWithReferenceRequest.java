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
 * The class for the Teams App With Reference Request.
 */
public class TeamsAppWithReferenceRequest extends BaseRequest implements ITeamsAppWithReferenceRequest {

    /**
     * The request for the TeamsApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsApp.class);
    }

    public void post(final TeamsApp newTeamsApp, final IJsonBackedObject payload, final ICallback<TeamsApp> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public TeamsApp post(final TeamsApp newTeamsApp, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newTeamsApp;
        }
        return null;
    }

    public void get(final ICallback<TeamsApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public TeamsApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<TeamsApp> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final TeamsApp sourceTeamsApp, final ICallback<TeamsApp> callback) {
		send(HttpMethod.PATCH, callback, sourceTeamsApp);
	}

	public TeamsApp patch(final TeamsApp sourceTeamsApp) throws ClientException {
		return send(HttpMethod.PATCH, sourceTeamsApp);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamsAppWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ITeamsAppWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamsAppWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TeamsAppWithReferenceRequest)this;
    }
}