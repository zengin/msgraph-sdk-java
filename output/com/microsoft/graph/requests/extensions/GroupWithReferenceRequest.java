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
 * The class for the Group With Reference Request.
 */
public class GroupWithReferenceRequest extends BaseRequest implements IGroupWithReferenceRequest {

    /**
     * The request for the Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Group.class);
    }

    public void post(final Group newGroup, final IJsonBackedObject payload, final ICallback<Group> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public Group post(final Group newGroup, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newGroup;
        }
        return null;
    }

    public void get(final ICallback<Group> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public Group get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<Group> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final Group sourceGroup, final ICallback<Group> callback) {
		send(HttpMethod.PATCH, callback, sourceGroup);
	}

	public Group patch(final Group sourceGroup) throws ClientException {
		return send(HttpMethod.PATCH, sourceGroup);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IGroupWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupWithReferenceRequest)this;
    }
}
