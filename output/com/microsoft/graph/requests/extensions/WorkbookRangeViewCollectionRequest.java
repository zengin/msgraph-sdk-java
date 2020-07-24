// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range View Collection Request.
 */
public class WorkbookRangeViewCollectionRequest extends BaseCollectionRequest<WorkbookRangeViewCollectionResponse, IWorkbookRangeViewCollectionPage> implements IWorkbookRangeViewCollectionRequest {

    /**
     * The request builder for this collection of WorkbookRangeView
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeViewCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeViewCollectionResponse.class, IWorkbookRangeViewCollectionPage.class);
    }

    public void get(final ICallback<IWorkbookRangeViewCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWorkbookRangeViewCollectionPage get() throws ClientException {
        final WorkbookRangeViewCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookRangeView newWorkbookRangeView, final ICallback<WorkbookRangeView> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookRangeViewRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWorkbookRangeView, callback);
    }

    public WorkbookRangeView post(final WorkbookRangeView newWorkbookRangeView) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookRangeViewRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWorkbookRangeView);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookRangeViewCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookRangeViewCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookRangeViewCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookRangeViewCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookRangeViewCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WorkbookRangeViewCollectionRequest)this;
    }

    public IWorkbookRangeViewCollectionPage buildFromResponse(final WorkbookRangeViewCollectionResponse response) {
        final IWorkbookRangeViewCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookRangeViewCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookRangeViewCollectionPage page = new WorkbookRangeViewCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}