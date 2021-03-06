// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusRequest;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusRequest;
import com.microsoft.graph.models.extensions.IosUpdateDeviceStatus;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Update Device Status Request.
 */
public class IosUpdateDeviceStatusRequest extends BaseRequest implements IIosUpdateDeviceStatusRequest {
	
    /**
     * The request for the IosUpdateDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosUpdateDeviceStatusRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosUpdateDeviceStatus.class);
    }

    /**
     * Gets the IosUpdateDeviceStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosUpdateDeviceStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosUpdateDeviceStatus from the service
     *
     * @return the IosUpdateDeviceStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosUpdateDeviceStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IosUpdateDeviceStatus> callback) {
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
     * Patches this IosUpdateDeviceStatus with a source
     *
     * @param sourceIosUpdateDeviceStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosUpdateDeviceStatus sourceIosUpdateDeviceStatus, final ICallback<IosUpdateDeviceStatus> callback) {
        send(HttpMethod.PATCH, callback, sourceIosUpdateDeviceStatus);
    }

    /**
     * Patches this IosUpdateDeviceStatus with a source
     *
     * @param sourceIosUpdateDeviceStatus the source object with updates
     * @return the updated IosUpdateDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosUpdateDeviceStatus patch(final IosUpdateDeviceStatus sourceIosUpdateDeviceStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosUpdateDeviceStatus);
    }

    /**
     * Creates a IosUpdateDeviceStatus with a new object
     *
     * @param newIosUpdateDeviceStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosUpdateDeviceStatus newIosUpdateDeviceStatus, final ICallback<IosUpdateDeviceStatus> callback) {
        send(HttpMethod.POST, callback, newIosUpdateDeviceStatus);
    }

    /**
     * Creates a IosUpdateDeviceStatus with a new object
     *
     * @param newIosUpdateDeviceStatus the new object to create
     * @return the created IosUpdateDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosUpdateDeviceStatus post(final IosUpdateDeviceStatus newIosUpdateDeviceStatus) throws ClientException {
        return send(HttpMethod.POST, newIosUpdateDeviceStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosUpdateDeviceStatusRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (IosUpdateDeviceStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosUpdateDeviceStatusRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (IosUpdateDeviceStatusRequest)this;
     }

}

