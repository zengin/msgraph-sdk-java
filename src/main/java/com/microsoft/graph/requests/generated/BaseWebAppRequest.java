// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Web App Request.
 */
public class BaseWebAppRequest extends BaseRequest implements IBaseWebAppRequest {

    /**
     * The request for the WebApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWebAppRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WebApp> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WebApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WebApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WebApp from the service
     *
     * @return the WebApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WebApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this WebApp with a source
     *
     * @param sourceWebApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WebApp sourceWebApp, final ICallback<WebApp> callback) {
        send(HttpMethod.PATCH, callback, sourceWebApp);
    }

    /**
     * Patches this WebApp with a source
     *
     * @param sourceWebApp the source object with updates
     * @return the updated WebApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WebApp patch(final WebApp sourceWebApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceWebApp);
    }

    /**
     * Creates a WebApp with a new object
     *
     * @param newWebApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WebApp newWebApp, final ICallback<WebApp> callback) {
        send(HttpMethod.POST, callback, newWebApp);
    }

    /**
     * Creates a WebApp with a new object
     *
     * @param newWebApp the new object to create
     * @return the created WebApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WebApp post(final WebApp newWebApp) throws ClientException {
        return send(HttpMethod.POST, newWebApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWebAppRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WebAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWebAppRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WebAppRequest)this;
     }

}
