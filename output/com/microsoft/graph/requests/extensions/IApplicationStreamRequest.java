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

import java.io.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Application Stream Request.
 */
public interface IApplicationStreamRequest extends IHttpStreamRequest {

    /**
     * Gets the contents of this stream
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<InputStream> callback);

    /**
     * Gets the contents of this stream
     *
     * @return the stream that the caller needs to close
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    InputStream get() throws ClientException;

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
     * @param callback the callback to be called after success or failure
     */
    void put(final byte[] fileContents, final ICallback<Application> callback);

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
     * @return the result of the upload
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Application put(final byte[] fileContents) throws ClientException;
}
