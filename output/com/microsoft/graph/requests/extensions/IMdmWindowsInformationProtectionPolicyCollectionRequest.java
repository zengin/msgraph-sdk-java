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
 * The interface for the Mdm Windows Information Protection Policy Collection Request.
 */
public interface IMdmWindowsInformationProtectionPolicyCollectionRequest {

    void get(final ICallback<IMdmWindowsInformationProtectionPolicyCollectionPage> callback);

    IMdmWindowsInformationProtectionPolicyCollectionPage get() throws ClientException;

    void post(final MdmWindowsInformationProtectionPolicy newMdmWindowsInformationProtectionPolicy, final ICallback<MdmWindowsInformationProtectionPolicy> callback);

    MdmWindowsInformationProtectionPolicy post(final MdmWindowsInformationProtectionPolicy newMdmWindowsInformationProtectionPolicy) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMdmWindowsInformationProtectionPolicyCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMdmWindowsInformationProtectionPolicyCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IMdmWindowsInformationProtectionPolicyCollectionRequest top(final int value);

}
