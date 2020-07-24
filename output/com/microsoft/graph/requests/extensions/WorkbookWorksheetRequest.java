// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequest;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequest;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Request.
 */
public class WorkbookWorksheetRequest extends BaseRequest implements IWorkbookWorksheetRequest {
	
    /**
     * The request for the WorkbookWorksheet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookWorksheet.class);
    }

    /**
     * Gets the WorkbookWorksheet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookWorksheet> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookWorksheet from the service
     *
     * @return the WorkbookWorksheet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookWorksheet get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WorkbookWorksheet> callback) {
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
     * Patches this WorkbookWorksheet with a source
     *
     * @param sourceWorkbookWorksheet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookWorksheet sourceWorkbookWorksheet, final ICallback<WorkbookWorksheet> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookWorksheet);
    }

    /**
     * Patches this WorkbookWorksheet with a source
     *
     * @param sourceWorkbookWorksheet the source object with updates
     * @return the updated WorkbookWorksheet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookWorksheet patch(final WorkbookWorksheet sourceWorkbookWorksheet) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookWorksheet);
    }

    /**
     * Creates a WorkbookWorksheet with a new object
     *
     * @param newWorkbookWorksheet the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookWorksheet newWorkbookWorksheet, final ICallback<WorkbookWorksheet> callback) {
        send(HttpMethod.POST, callback, newWorkbookWorksheet);
    }

    /**
     * Creates a WorkbookWorksheet with a new object
     *
     * @param newWorkbookWorksheet the new object to create
     * @return the created WorkbookWorksheet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookWorksheet post(final WorkbookWorksheet newWorkbookWorksheet) throws ClientException {
        return send(HttpMethod.POST, newWorkbookWorksheet);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookWorksheetRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookWorksheetRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookWorksheetRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookWorksheetRequest)this;
     }

}
