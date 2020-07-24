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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Search Collection Page.
 */
public class DriveItemSearchCollectionPage extends BaseCollectionPage<DriveItem, IDriveItemSearchCollectionRequestBuilder> implements IDriveItemSearchCollectionPage {

    /**
     * A collection page for DriveItemSearch.
     *
     * @param response The serialized DriveItemSearchCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DriveItemSearchCollectionPage(final DriveItemSearchCollectionResponse response, final IDriveItemSearchCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}