// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Request.
 */
public class WorkbookFunctionsRequest extends BaseRequest implements IWorkbookFunctionsRequest {
	
    /**
     * The request for the WorkbookFunctions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookFunctions.class);
    }

    /**
     * Gets the WorkbookFunctions from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookFunctions> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookFunctions from the service
     *
     * @return the WorkbookFunctions from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFunctions get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WorkbookFunctions> callback) {
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
     * Patches this WorkbookFunctions with a source
     *
     * @param sourceWorkbookFunctions the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookFunctions sourceWorkbookFunctions, final ICallback<WorkbookFunctions> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookFunctions);
    }

    /**
     * Patches this WorkbookFunctions with a source
     *
     * @param sourceWorkbookFunctions the source object with updates
     * @return the updated WorkbookFunctions
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFunctions patch(final WorkbookFunctions sourceWorkbookFunctions) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookFunctions);
    }

    /**
     * Creates a WorkbookFunctions with a new object
     *
     * @param newWorkbookFunctions the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookFunctions newWorkbookFunctions, final ICallback<WorkbookFunctions> callback) {
        send(HttpMethod.POST, callback, newWorkbookFunctions);
    }

    /**
     * Creates a WorkbookFunctions with a new object
     *
     * @param newWorkbookFunctions the new object to create
     * @return the created WorkbookFunctions
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookFunctions post(final WorkbookFunctions newWorkbookFunctions) throws ClientException {
        return send(HttpMethod.POST, newWorkbookFunctions);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookFunctionsRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookFunctionsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookFunctionsRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookFunctionsRequest)this;
     }

}

