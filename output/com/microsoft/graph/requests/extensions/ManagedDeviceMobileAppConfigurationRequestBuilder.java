// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationRequest;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationAssignment;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationAssignRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationAssignRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Request Builder.
 */
public class ManagedDeviceMobileAppConfigurationRequestBuilder extends BaseRequestBuilder implements IManagedDeviceMobileAppConfigurationRequestBuilder {

    /**
     * The request builder for the ManagedDeviceMobileAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagedDeviceMobileAppConfigurationRequest instance
     */
    public IManagedDeviceMobileAppConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IManagedDeviceMobileAppConfigurationRequest instance
     */
    public IManagedDeviceMobileAppConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ManagedDeviceMobileAppConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new ManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationAssignmentRequestBuilder assignments(final String id) {
        return new ManagedDeviceMobileAppConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id) {
        return new ManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }
    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder userStatuses() {
        return new ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationUserStatusRequestBuilder userStatuses(final String id) {
        return new ManagedDeviceMobileAppConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedDeviceMobileAppConfigurationDeviceSummary
     *
     * @return the IManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder instance
     */
    public IManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder deviceStatusSummary() {
        return new ManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusSummary"), getClient(), null);
    }

    /**
     * Gets the request builder for ManagedDeviceMobileAppConfigurationUserSummary
     *
     * @return the IManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder instance
     */
    public IManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder userStatusSummary() {
        return new ManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusSummary"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationAssignRequestBuilder assign(final java.util.List<ManagedDeviceMobileAppConfigurationAssignment> assignments) {
        return new ManagedDeviceMobileAppConfigurationAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }
}
