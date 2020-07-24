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
 * The class for the Enrollment Configuration Assignment Collection Request.
 */
public class EnrollmentConfigurationAssignmentCollectionRequest extends BaseCollectionRequest<EnrollmentConfigurationAssignmentCollectionResponse, IEnrollmentConfigurationAssignmentCollectionPage> implements IEnrollmentConfigurationAssignmentCollectionRequest {

    /**
     * The request builder for this collection of EnrollmentConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EnrollmentConfigurationAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EnrollmentConfigurationAssignmentCollectionResponse.class, IEnrollmentConfigurationAssignmentCollectionPage.class);
    }

    public void get(final ICallback<IEnrollmentConfigurationAssignmentCollectionPage> callback) {
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

    public IEnrollmentConfigurationAssignmentCollectionPage get() throws ClientException {
        final EnrollmentConfigurationAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final EnrollmentConfigurationAssignment newEnrollmentConfigurationAssignment, final ICallback<EnrollmentConfigurationAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EnrollmentConfigurationAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newEnrollmentConfigurationAssignment, callback);
    }

    public EnrollmentConfigurationAssignment post(final EnrollmentConfigurationAssignment newEnrollmentConfigurationAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EnrollmentConfigurationAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newEnrollmentConfigurationAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEnrollmentConfigurationAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EnrollmentConfigurationAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEnrollmentConfigurationAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EnrollmentConfigurationAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEnrollmentConfigurationAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EnrollmentConfigurationAssignmentCollectionRequest)this;
    }

    public IEnrollmentConfigurationAssignmentCollectionPage buildFromResponse(final EnrollmentConfigurationAssignmentCollectionResponse response) {
        final IEnrollmentConfigurationAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EnrollmentConfigurationAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EnrollmentConfigurationAssignmentCollectionPage page = new EnrollmentConfigurationAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
