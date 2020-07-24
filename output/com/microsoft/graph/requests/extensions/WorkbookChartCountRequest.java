// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartCountRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartCountRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Count Request.
 */
public class WorkbookChartCountRequest extends BaseRequest implements IWorkbookChartCountRequest {

    /**
     * The request for this WorkbookChartCount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartCountRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Integer.class);
    }

    /**
     * Gets the Integer
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Integer> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Integer
     *
     * @return the Integer
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Integer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookChartCountRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookChartCountRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookChartCountRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookChartCountRequest)this;
    }

}
