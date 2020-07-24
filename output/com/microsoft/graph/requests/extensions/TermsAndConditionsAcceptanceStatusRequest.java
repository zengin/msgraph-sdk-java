// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusRequest;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusRequest;
import com.microsoft.graph.models.extensions.TermsAndConditionsAcceptanceStatus;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Acceptance Status Request.
 */
public class TermsAndConditionsAcceptanceStatusRequest extends BaseRequest implements ITermsAndConditionsAcceptanceStatusRequest {
	
    /**
     * The request for the TermsAndConditionsAcceptanceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsAndConditionsAcceptanceStatusRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TermsAndConditionsAcceptanceStatus.class);
    }

    /**
     * Gets the TermsAndConditionsAcceptanceStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<TermsAndConditionsAcceptanceStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TermsAndConditionsAcceptanceStatus from the service
     *
     * @return the TermsAndConditionsAcceptanceStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TermsAndConditionsAcceptanceStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<TermsAndConditionsAcceptanceStatus> callback) {
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
     * Patches this TermsAndConditionsAcceptanceStatus with a source
     *
     * @param sourceTermsAndConditionsAcceptanceStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TermsAndConditionsAcceptanceStatus sourceTermsAndConditionsAcceptanceStatus, final ICallback<TermsAndConditionsAcceptanceStatus> callback) {
        send(HttpMethod.PATCH, callback, sourceTermsAndConditionsAcceptanceStatus);
    }

    /**
     * Patches this TermsAndConditionsAcceptanceStatus with a source
     *
     * @param sourceTermsAndConditionsAcceptanceStatus the source object with updates
     * @return the updated TermsAndConditionsAcceptanceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TermsAndConditionsAcceptanceStatus patch(final TermsAndConditionsAcceptanceStatus sourceTermsAndConditionsAcceptanceStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceTermsAndConditionsAcceptanceStatus);
    }

    /**
     * Creates a TermsAndConditionsAcceptanceStatus with a new object
     *
     * @param newTermsAndConditionsAcceptanceStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TermsAndConditionsAcceptanceStatus newTermsAndConditionsAcceptanceStatus, final ICallback<TermsAndConditionsAcceptanceStatus> callback) {
        send(HttpMethod.POST, callback, newTermsAndConditionsAcceptanceStatus);
    }

    /**
     * Creates a TermsAndConditionsAcceptanceStatus with a new object
     *
     * @param newTermsAndConditionsAcceptanceStatus the new object to create
     * @return the created TermsAndConditionsAcceptanceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TermsAndConditionsAcceptanceStatus post(final TermsAndConditionsAcceptanceStatus newTermsAndConditionsAcceptanceStatus) throws ClientException {
        return send(HttpMethod.POST, newTermsAndConditionsAcceptanceStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITermsAndConditionsAcceptanceStatusRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TermsAndConditionsAcceptanceStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITermsAndConditionsAcceptanceStatusRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TermsAndConditionsAcceptanceStatusRequest)this;
     }

}

