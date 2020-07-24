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
 * The class for the List Item Version Collection Request.
 */
public class ListItemVersionCollectionRequest extends BaseCollectionRequest<ListItemVersionCollectionResponse, IListItemVersionCollectionPage> implements IListItemVersionCollectionRequest {

    /**
     * The request builder for this collection of ListItemVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListItemVersionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ListItemVersionCollectionResponse.class, IListItemVersionCollectionPage.class);
    }

    public void get(final ICallback<IListItemVersionCollectionPage> callback) {
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

    public IListItemVersionCollectionPage get() throws ClientException {
        final ListItemVersionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ListItemVersion newListItemVersion, final ICallback<ListItemVersion> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ListItemVersionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newListItemVersion, callback);
    }

    public ListItemVersion post(final ListItemVersion newListItemVersion) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ListItemVersionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newListItemVersion);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IListItemVersionCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ListItemVersionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IListItemVersionCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ListItemVersionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IListItemVersionCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ListItemVersionCollectionRequest)this;
    }

    public IListItemVersionCollectionPage buildFromResponse(final ListItemVersionCollectionResponse response) {
        final IListItemVersionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ListItemVersionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ListItemVersionCollectionPage page = new ListItemVersionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
