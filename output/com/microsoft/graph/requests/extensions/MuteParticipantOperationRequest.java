// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMuteParticipantOperationRequest;
import com.microsoft.graph.requests.extensions.MuteParticipantOperationRequest;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mute Participant Operation Request.
 */
public class MuteParticipantOperationRequest extends BaseRequest implements IMuteParticipantOperationRequest {
	
    /**
     * The request for the MuteParticipantOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MuteParticipantOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, MuteParticipantOperation.class);
    }

    /**
     * Gets the MuteParticipantOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MuteParticipantOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MuteParticipantOperation from the service
     *
     * @return the MuteParticipantOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MuteParticipantOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MuteParticipantOperation> callback) {
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
     * Patches this MuteParticipantOperation with a source
     *
     * @param sourceMuteParticipantOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MuteParticipantOperation sourceMuteParticipantOperation, final ICallback<MuteParticipantOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceMuteParticipantOperation);
    }

    /**
     * Patches this MuteParticipantOperation with a source
     *
     * @param sourceMuteParticipantOperation the source object with updates
     * @return the updated MuteParticipantOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MuteParticipantOperation patch(final MuteParticipantOperation sourceMuteParticipantOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceMuteParticipantOperation);
    }

    /**
     * Creates a MuteParticipantOperation with a new object
     *
     * @param newMuteParticipantOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MuteParticipantOperation newMuteParticipantOperation, final ICallback<MuteParticipantOperation> callback) {
        send(HttpMethod.POST, callback, newMuteParticipantOperation);
    }

    /**
     * Creates a MuteParticipantOperation with a new object
     *
     * @param newMuteParticipantOperation the new object to create
     * @return the created MuteParticipantOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MuteParticipantOperation post(final MuteParticipantOperation newMuteParticipantOperation) throws ClientException {
        return send(HttpMethod.POST, newMuteParticipantOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMuteParticipantOperationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (MuteParticipantOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMuteParticipantOperationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (MuteParticipantOperationRequest)this;
     }

}

