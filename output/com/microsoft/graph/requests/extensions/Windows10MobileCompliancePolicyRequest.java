// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindows10MobileCompliancePolicyRequest;
import com.microsoft.graph.requests.extensions.Windows10MobileCompliancePolicyRequest;
import com.microsoft.graph.models.extensions.Windows10MobileCompliancePolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Mobile Compliance Policy Request.
 */
public class Windows10MobileCompliancePolicyRequest extends BaseRequest implements IWindows10MobileCompliancePolicyRequest {
	
    /**
     * The request for the Windows10MobileCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10MobileCompliancePolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10MobileCompliancePolicy.class);
    }

    /**
     * Gets the Windows10MobileCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows10MobileCompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10MobileCompliancePolicy from the service
     *
     * @return the Windows10MobileCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10MobileCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Windows10MobileCompliancePolicy> callback) {
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
     * Patches this Windows10MobileCompliancePolicy with a source
     *
     * @param sourceWindows10MobileCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10MobileCompliancePolicy sourceWindows10MobileCompliancePolicy, final ICallback<Windows10MobileCompliancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10MobileCompliancePolicy);
    }

    /**
     * Patches this Windows10MobileCompliancePolicy with a source
     *
     * @param sourceWindows10MobileCompliancePolicy the source object with updates
     * @return the updated Windows10MobileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10MobileCompliancePolicy patch(final Windows10MobileCompliancePolicy sourceWindows10MobileCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10MobileCompliancePolicy);
    }

    /**
     * Creates a Windows10MobileCompliancePolicy with a new object
     *
     * @param newWindows10MobileCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10MobileCompliancePolicy newWindows10MobileCompliancePolicy, final ICallback<Windows10MobileCompliancePolicy> callback) {
        send(HttpMethod.POST, callback, newWindows10MobileCompliancePolicy);
    }

    /**
     * Creates a Windows10MobileCompliancePolicy with a new object
     *
     * @param newWindows10MobileCompliancePolicy the new object to create
     * @return the created Windows10MobileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10MobileCompliancePolicy post(final Windows10MobileCompliancePolicy newWindows10MobileCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newWindows10MobileCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10MobileCompliancePolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows10MobileCompliancePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10MobileCompliancePolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows10MobileCompliancePolicyRequest)this;
     }

}

