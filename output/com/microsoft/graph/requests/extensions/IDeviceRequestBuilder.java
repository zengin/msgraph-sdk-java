// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceRequest;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Request Builder.
 */
public interface IDeviceRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceRequest instance
     */
    IDeviceRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceRequest instance
     */
    IDeviceRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf();

    IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder registeredOwners();

    IDirectoryObjectWithReferenceRequestBuilder registeredOwners(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder registeredUsers();

    IDirectoryObjectWithReferenceRequestBuilder registeredUsers(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf();

    IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id);

    IExtensionCollectionRequestBuilder extensions();

    IExtensionRequestBuilder extensions(final String id);

}
