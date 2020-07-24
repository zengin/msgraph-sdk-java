// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIosVppEBookAssignmentRequest;
import com.microsoft.graph.requests.extensions.IosVppEBookAssignmentRequest;
import com.microsoft.graph.models.extensions.IosVppEBookAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp EBook Assignment Request.
 */
public class IosVppEBookAssignmentRequest extends BaseRequest implements IIosVppEBookAssignmentRequest {
	
    /**
     * The request for the IosVppEBookAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosVppEBookAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosVppEBookAssignment.class);
    }

    /**
     * Gets the IosVppEBookAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosVppEBookAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosVppEBookAssignment from the service
     *
     * @return the IosVppEBookAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVppEBookAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IosVppEBookAssignment> callback) {
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
     * Patches this IosVppEBookAssignment with a source
     *
     * @param sourceIosVppEBookAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosVppEBookAssignment sourceIosVppEBookAssignment, final ICallback<IosVppEBookAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceIosVppEBookAssignment);
    }

    /**
     * Patches this IosVppEBookAssignment with a source
     *
     * @param sourceIosVppEBookAssignment the source object with updates
     * @return the updated IosVppEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVppEBookAssignment patch(final IosVppEBookAssignment sourceIosVppEBookAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosVppEBookAssignment);
    }

    /**
     * Creates a IosVppEBookAssignment with a new object
     *
     * @param newIosVppEBookAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosVppEBookAssignment newIosVppEBookAssignment, final ICallback<IosVppEBookAssignment> callback) {
        send(HttpMethod.POST, callback, newIosVppEBookAssignment);
    }

    /**
     * Creates a IosVppEBookAssignment with a new object
     *
     * @param newIosVppEBookAssignment the new object to create
     * @return the created IosVppEBookAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVppEBookAssignment post(final IosVppEBookAssignment newIosVppEBookAssignment) throws ClientException {
        return send(HttpMethod.POST, newIosVppEBookAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosVppEBookAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosVppEBookAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosVppEBookAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosVppEBookAssignmentRequest)this;
     }

}

