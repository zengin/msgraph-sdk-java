// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidWorkProfileGeneralDeviceConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Work Profile General Device Configuration Request.
 */
public interface IAndroidWorkProfileGeneralDeviceConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidWorkProfileGeneralDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidWorkProfileGeneralDeviceConfiguration> callback);

    /**
     * Gets the AndroidWorkProfileGeneralDeviceConfiguration from the service
     *
     * @return the AndroidWorkProfileGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileGeneralDeviceConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidWorkProfileGeneralDeviceConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidWorkProfileGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidWorkProfileGeneralDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidWorkProfileGeneralDeviceConfiguration sourceAndroidWorkProfileGeneralDeviceConfiguration, final ICallback<AndroidWorkProfileGeneralDeviceConfiguration> callback);

    /**
     * Patches this AndroidWorkProfileGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidWorkProfileGeneralDeviceConfiguration the source object with updates
     * @return the updated AndroidWorkProfileGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileGeneralDeviceConfiguration patch(final AndroidWorkProfileGeneralDeviceConfiguration sourceAndroidWorkProfileGeneralDeviceConfiguration) throws ClientException;

    /**
     * Posts a AndroidWorkProfileGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidWorkProfileGeneralDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidWorkProfileGeneralDeviceConfiguration newAndroidWorkProfileGeneralDeviceConfiguration, final ICallback<AndroidWorkProfileGeneralDeviceConfiguration> callback);

    /**
     * Posts a AndroidWorkProfileGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidWorkProfileGeneralDeviceConfiguration the new object to create
     * @return the created AndroidWorkProfileGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileGeneralDeviceConfiguration post(final AndroidWorkProfileGeneralDeviceConfiguration newAndroidWorkProfileGeneralDeviceConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidWorkProfileGeneralDeviceConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidWorkProfileGeneralDeviceConfigurationRequest expand(final String value);

}

