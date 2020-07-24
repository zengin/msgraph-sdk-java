// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateRequest;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateRequest;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Push Notification Certificate Request Builder.
 */
public class ApplePushNotificationCertificateRequestBuilder extends BaseRequestBuilder implements IApplePushNotificationCertificateRequestBuilder {

    /**
     * The request builder for the ApplePushNotificationCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplePushNotificationCertificateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IApplePushNotificationCertificateRequest instance
     */
    public IApplePushNotificationCertificateRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IApplePushNotificationCertificateRequest instance
     */
    public IApplePushNotificationCertificateRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ApplePushNotificationCertificateRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequestBuilder downloadApplePushNotificationCertificateSigningRequest() {
        return new ApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.downloadApplePushNotificationCertificateSigningRequest"), getClient(), null);
    }
}

