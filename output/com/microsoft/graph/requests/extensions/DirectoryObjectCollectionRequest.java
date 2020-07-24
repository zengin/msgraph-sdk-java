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
 * The class for the Directory Object Collection Request.
 */
public class DirectoryObjectCollectionRequest extends BaseCollectionRequest<DirectoryObjectCollectionResponse, IDirectoryObjectCollectionPage> implements IDirectoryObjectCollectionRequest {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObjectCollectionResponse.class, IDirectoryObjectCollectionPage.class);
    }

    public void get(final ICallback<IDirectoryObjectCollectionPage> callback) {
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

    public IDirectoryObjectCollectionPage get() throws ClientException {
        final DirectoryObjectCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DirectoryObject newDirectoryObject, final ICallback<DirectoryObject> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DirectoryObjectRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDirectoryObject, callback);
    }

    public DirectoryObject post(final DirectoryObject newDirectoryObject) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DirectoryObjectRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDirectoryObject);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDirectoryObjectCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DirectoryObjectCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDirectoryObjectCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DirectoryObjectCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDirectoryObjectCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DirectoryObjectCollectionRequest)this;
    }

    public IDirectoryObjectCollectionPage buildFromResponse(final DirectoryObjectCollectionResponse response) {
        final IDirectoryObjectCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectoryObjectCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DirectoryObjectCollectionPage page = new DirectoryObjectCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}