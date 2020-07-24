// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionRequest;
import com.microsoft.graph.requests.extensions.DefaultManagedAppProtectionRequest;
import com.microsoft.graph.models.extensions.DefaultManagedAppProtection;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Default Managed App Protection Request.
 */
public class DefaultManagedAppProtectionRequest extends BaseRequest implements IDefaultManagedAppProtectionRequest {
	
    /**
     * The request for the DefaultManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DefaultManagedAppProtectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DefaultManagedAppProtection.class);
    }

    /**
     * Gets the DefaultManagedAppProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DefaultManagedAppProtection> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DefaultManagedAppProtection from the service
     *
     * @return the DefaultManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DefaultManagedAppProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DefaultManagedAppProtection> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DefaultManagedAppProtection with a source
     *
     * @param sourceDefaultManagedAppProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DefaultManagedAppProtection sourceDefaultManagedAppProtection, final ICallback<DefaultManagedAppProtection> callback) {
        send(HttpMethod.PATCH, callback, sourceDefaultManagedAppProtection);
    }

    /**
     * Patches this DefaultManagedAppProtection with a source
     *
     * @param sourceDefaultManagedAppProtection the source object with updates
     * @return the updated DefaultManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DefaultManagedAppProtection patch(final DefaultManagedAppProtection sourceDefaultManagedAppProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceDefaultManagedAppProtection);
    }

    /**
     * Creates a DefaultManagedAppProtection with a new object
     *
     * @param newDefaultManagedAppProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DefaultManagedAppProtection newDefaultManagedAppProtection, final ICallback<DefaultManagedAppProtection> callback) {
        send(HttpMethod.POST, callback, newDefaultManagedAppProtection);
    }

    /**
     * Creates a DefaultManagedAppProtection with a new object
     *
     * @param newDefaultManagedAppProtection the new object to create
     * @return the created DefaultManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DefaultManagedAppProtection post(final DefaultManagedAppProtection newDefaultManagedAppProtection) throws ClientException {
        return send(HttpMethod.POST, newDefaultManagedAppProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDefaultManagedAppProtectionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DefaultManagedAppProtectionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDefaultManagedAppProtectionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DefaultManagedAppProtectionRequest)this;
     }

}

