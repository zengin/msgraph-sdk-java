// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IParticipantRequest;
import com.microsoft.graph.requests.extensions.ParticipantRequest;
import com.microsoft.graph.requests.extensions.IParticipantMuteRequestBuilder;
import com.microsoft.graph.requests.extensions.ParticipantMuteRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Request Builder.
 */
public class ParticipantRequestBuilder extends BaseRequestBuilder implements IParticipantRequestBuilder {

    /**
     * The request builder for the Participant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ParticipantRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IParticipantRequest instance
     */
    public IParticipantRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IParticipantRequest instance
     */
    public IParticipantRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ParticipantRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IParticipantMuteRequestBuilder mute(final String clientContext) {
        return new ParticipantMuteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mute"), getClient(), null, clientContext);
    }
}
