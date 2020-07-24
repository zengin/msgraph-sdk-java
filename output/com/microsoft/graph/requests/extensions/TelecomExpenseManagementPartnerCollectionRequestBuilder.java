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
 * The class for the Telecom Expense Management Partner Collection Request Builder.
 */
public class TelecomExpenseManagementPartnerCollectionRequestBuilder extends BaseRequestBuilder implements ITelecomExpenseManagementPartnerCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TelecomExpenseManagementPartnerCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ITelecomExpenseManagementPartnerCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ITelecomExpenseManagementPartnerCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TelecomExpenseManagementPartnerCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITelecomExpenseManagementPartnerRequestBuilder byId(final String id) {
        return new TelecomExpenseManagementPartnerRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}