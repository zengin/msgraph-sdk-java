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
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Inference Classification Override Collection Request.
 */
public class InferenceClassificationOverrideCollectionRequest extends BaseCollectionRequest<InferenceClassificationOverrideCollectionResponse, IInferenceClassificationOverrideCollectionPage> implements IInferenceClassificationOverrideCollectionRequest {

    /**
     * The request builder for this collection of InferenceClassificationOverride
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InferenceClassificationOverrideCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, InferenceClassificationOverrideCollectionResponse.class, IInferenceClassificationOverrideCollectionPage.class);
    }

    public void get(final ICallback<IInferenceClassificationOverrideCollectionPage> callback) {
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

    public IInferenceClassificationOverrideCollectionPage get() throws ClientException {
        final InferenceClassificationOverrideCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final InferenceClassificationOverride newInferenceClassificationOverride, final ICallback<InferenceClassificationOverride> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new InferenceClassificationOverrideRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newInferenceClassificationOverride, callback);
    }

    public InferenceClassificationOverride post(final InferenceClassificationOverride newInferenceClassificationOverride) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new InferenceClassificationOverrideRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newInferenceClassificationOverride);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IInferenceClassificationOverrideCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (InferenceClassificationOverrideCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IInferenceClassificationOverrideCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (InferenceClassificationOverrideCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IInferenceClassificationOverrideCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (InferenceClassificationOverrideCollectionRequest)this;
    }

    public IInferenceClassificationOverrideCollectionPage buildFromResponse(final InferenceClassificationOverrideCollectionResponse response) {
        final IInferenceClassificationOverrideCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new InferenceClassificationOverrideCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final InferenceClassificationOverrideCollectionPage page = new InferenceClassificationOverrideCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
