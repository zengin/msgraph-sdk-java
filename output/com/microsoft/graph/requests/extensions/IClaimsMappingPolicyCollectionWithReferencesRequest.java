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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Claims Mapping Policy Collection With References Request.
 */
public interface IClaimsMappingPolicyCollectionWithReferencesRequest {

    void get(final ICallback<IClaimsMappingPolicyCollectionWithReferencesPage> callback);

    IClaimsMappingPolicyCollectionWithReferencesPage get() throws ClientException;

    IClaimsMappingPolicyCollectionWithReferencesRequest expand(final String value);
    
    IClaimsMappingPolicyCollectionWithReferencesRequest select(final String value);

    IClaimsMappingPolicyCollectionWithReferencesRequest top(final int value);

}
