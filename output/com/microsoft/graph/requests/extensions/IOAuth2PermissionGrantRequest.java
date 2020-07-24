// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the OAuth2Permission Grant Request.
 */
public interface IOAuth2PermissionGrantRequest extends IHttpRequest {

    /**
     * Gets the OAuth2PermissionGrant from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<OAuth2PermissionGrant> callback);

    /**
     * Gets the OAuth2PermissionGrant from the service
     *
     * @return the OAuth2PermissionGrant from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OAuth2PermissionGrant get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<OAuth2PermissionGrant> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OAuth2PermissionGrant with a source
     *
     * @param sourceOAuth2PermissionGrant the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OAuth2PermissionGrant sourceOAuth2PermissionGrant, final ICallback<OAuth2PermissionGrant> callback);

    /**
     * Patches this OAuth2PermissionGrant with a source
     *
     * @param sourceOAuth2PermissionGrant the source object with updates
     * @return the updated OAuth2PermissionGrant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OAuth2PermissionGrant patch(final OAuth2PermissionGrant sourceOAuth2PermissionGrant) throws ClientException;

    /**
     * Posts a OAuth2PermissionGrant with a new object
     *
     * @param newOAuth2PermissionGrant the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OAuth2PermissionGrant newOAuth2PermissionGrant, final ICallback<OAuth2PermissionGrant> callback);

    /**
     * Posts a OAuth2PermissionGrant with a new object
     *
     * @param newOAuth2PermissionGrant the new object to create
     * @return the created OAuth2PermissionGrant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OAuth2PermissionGrant post(final OAuth2PermissionGrant newOAuth2PermissionGrant) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOAuth2PermissionGrantRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOAuth2PermissionGrantRequest expand(final String value);

}

