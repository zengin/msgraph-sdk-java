// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPolicyRootRequest;
import com.microsoft.graph.requests.extensions.IActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityBasedTimeoutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IHomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Policy Root Request Builder.
 */
public interface IPolicyRootRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IPolicyRootRequest instance
     */
    IPolicyRootRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPolicyRootRequest instance
     */
    IPolicyRootRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IActivityBasedTimeoutPolicyCollectionRequestBuilder activityBasedTimeoutPolicies();

    IActivityBasedTimeoutPolicyRequestBuilder activityBasedTimeoutPolicies(final String id);

    IClaimsMappingPolicyCollectionRequestBuilder claimsMappingPolicies();

    IClaimsMappingPolicyRequestBuilder claimsMappingPolicies(final String id);

    IHomeRealmDiscoveryPolicyCollectionRequestBuilder homeRealmDiscoveryPolicies();

    IHomeRealmDiscoveryPolicyRequestBuilder homeRealmDiscoveryPolicies(final String id);

    ITokenIssuancePolicyCollectionRequestBuilder tokenIssuancePolicies();

    ITokenIssuancePolicyRequestBuilder tokenIssuancePolicies(final String id);

    ITokenLifetimePolicyCollectionRequestBuilder tokenLifetimePolicies();

    ITokenLifetimePolicyRequestBuilder tokenLifetimePolicies(final String id);

}
