// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserRequest;
import com.microsoft.graph.requests.extensions.UserRequest;
import com.microsoft.graph.models.extensions.User;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Request.
 */
public class UserRequest extends BaseRequest implements IUserRequest {
	
    /**
     * The request for the User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, User.class);
    }

    /**
     * Gets the User from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<User> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the User from the service
     *
     * @return the User from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public User get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<User> callback) {
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
     * Patches this User with a source
     *
     * @param sourceUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final User sourceUser, final ICallback<User> callback) {
        send(HttpMethod.PATCH, callback, sourceUser);
    }

    /**
     * Patches this User with a source
     *
     * @param sourceUser the source object with updates
     * @return the updated User
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public User patch(final User sourceUser) throws ClientException {
        return send(HttpMethod.PATCH, sourceUser);
    }

    /**
     * Creates a User with a new object
     *
     * @param newUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final User newUser, final ICallback<User> callback) {
        send(HttpMethod.POST, callback, newUser);
    }

    /**
     * Creates a User with a new object
     *
     * @param newUser the new object to create
     * @return the created User
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public User post(final User newUser) throws ClientException {
        return send(HttpMethod.POST, newUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserRequest)this;
     }

}

