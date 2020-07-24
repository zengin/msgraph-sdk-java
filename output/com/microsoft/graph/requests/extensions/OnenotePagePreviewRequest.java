// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnenotePagePreview;
import com.microsoft.graph.requests.extensions.IOnenotePagePreviewRequest;
import com.microsoft.graph.requests.extensions.OnenotePagePreviewRequest;

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
 * The class for the Onenote Page Preview Request.
 */
public class OnenotePagePreviewRequest extends BaseRequest implements IOnenotePagePreviewRequest {

    /**
     * The request for this OnenotePagePreview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenotePagePreviewRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenotePagePreview.class);
    }

    /**
     * Gets the OnenotePagePreview
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<OnenotePagePreview> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnenotePagePreview
     *
     * @return the OnenotePagePreview
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public OnenotePagePreview get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOnenotePagePreviewRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (OnenotePagePreviewRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOnenotePagePreviewRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (OnenotePagePreviewRequest)this;
    }

}
