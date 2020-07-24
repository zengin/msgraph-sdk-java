// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryRequest;
import com.microsoft.graph.requests.extensions.MobileAppCategoryRequest;
import com.microsoft.graph.models.extensions.MobileAppCategory;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Category Request.
 */
public class MobileAppCategoryRequest extends BaseRequest implements IMobileAppCategoryRequest {
	
    /**
     * The request for the MobileAppCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppCategoryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppCategory.class);
    }

    /**
     * Gets the MobileAppCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MobileAppCategory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileAppCategory from the service
     *
     * @return the MobileAppCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MobileAppCategory> callback) {
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
     * Patches this MobileAppCategory with a source
     *
     * @param sourceMobileAppCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MobileAppCategory sourceMobileAppCategory, final ICallback<MobileAppCategory> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileAppCategory);
    }

    /**
     * Patches this MobileAppCategory with a source
     *
     * @param sourceMobileAppCategory the source object with updates
     * @return the updated MobileAppCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppCategory patch(final MobileAppCategory sourceMobileAppCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppCategory);
    }

    /**
     * Creates a MobileAppCategory with a new object
     *
     * @param newMobileAppCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MobileAppCategory newMobileAppCategory, final ICallback<MobileAppCategory> callback) {
        send(HttpMethod.POST, callback, newMobileAppCategory);
    }

    /**
     * Creates a MobileAppCategory with a new object
     *
     * @param newMobileAppCategory the new object to create
     * @return the created MobileAppCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppCategory post(final MobileAppCategory newMobileAppCategory) throws ClientException {
        return send(HttpMethod.POST, newMobileAppCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMobileAppCategoryRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (MobileAppCategoryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMobileAppCategoryRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (MobileAppCategoryRequest)this;
     }

}

