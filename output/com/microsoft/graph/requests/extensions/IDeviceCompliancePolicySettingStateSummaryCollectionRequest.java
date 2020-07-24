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
 * The interface for the Device Compliance Policy Setting State Summary Collection Request.
 */
public interface IDeviceCompliancePolicySettingStateSummaryCollectionRequest {

    void get(final ICallback<IDeviceCompliancePolicySettingStateSummaryCollectionPage> callback);

    IDeviceCompliancePolicySettingStateSummaryCollectionPage get() throws ClientException;

    void post(final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary, final ICallback<DeviceCompliancePolicySettingStateSummary> callback);

    DeviceCompliancePolicySettingStateSummary post(final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceCompliancePolicySettingStateSummaryCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceCompliancePolicySettingStateSummaryCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceCompliancePolicySettingStateSummaryCollectionRequest top(final int value);

}