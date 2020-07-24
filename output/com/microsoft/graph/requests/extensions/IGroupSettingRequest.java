// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupSetting;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Setting Request.
 */
public interface IGroupSettingRequest extends IHttpRequest {

    /**
     * Gets the GroupSetting from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<GroupSetting> callback);

    /**
     * Gets the GroupSetting from the service
     *
     * @return the GroupSetting from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupSetting get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<GroupSetting> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupSetting with a source
     *
     * @param sourceGroupSetting the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupSetting sourceGroupSetting, final ICallback<GroupSetting> callback);

    /**
     * Patches this GroupSetting with a source
     *
     * @param sourceGroupSetting the source object with updates
     * @return the updated GroupSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupSetting patch(final GroupSetting sourceGroupSetting) throws ClientException;

    /**
     * Posts a GroupSetting with a new object
     *
     * @param newGroupSetting the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupSetting newGroupSetting, final ICallback<GroupSetting> callback);

    /**
     * Posts a GroupSetting with a new object
     *
     * @param newGroupSetting the new object to create
     * @return the created GroupSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupSetting post(final GroupSetting newGroupSetting) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupSettingRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupSettingRequest expand(final String value);

}
