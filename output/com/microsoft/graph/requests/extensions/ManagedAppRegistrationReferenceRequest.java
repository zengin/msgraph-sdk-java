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
 * The class for the Managed App Registration Reference Request.
 */
public class ManagedAppRegistrationReferenceRequest extends BaseRequest implements IManagedAppRegistrationReferenceRequest {

    /**
     * The request for the ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppRegistration.class);
    }

    public void delete(final ICallback<ManagedAppRegistration> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ManagedAppRegistration delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedAppRegistrationReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedAppRegistrationReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedAppRegistrationReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedAppRegistrationReferenceRequest)this;
    }
    /**
     * Puts the ManagedAppRegistration
     *
     * @param srcManagedAppRegistration the ManagedAppRegistration reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagedAppRegistration srcManagedAppRegistration, final ICallback<ManagedAppRegistration> callback) {
        send(HttpMethod.PUT, callback, srcManagedAppRegistration);
    }

    /**
     * Puts the ManagedAppRegistration
     *
     * @param srcManagedAppRegistration the ManagedAppRegistration reference to PUT
     * @return the ManagedAppRegistration
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagedAppRegistration put(ManagedAppRegistration srcManagedAppRegistration) throws ClientException {
        return send(HttpMethod.PUT, srcManagedAppRegistration);
    }
}