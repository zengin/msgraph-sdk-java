// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationUpgradeRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams App Installation Upgrade Request Builder.
 */
public interface ITeamsAppInstallationUpgradeRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ITeamsAppInstallationUpgradeRequest
     *
     * @return the ITeamsAppInstallationUpgradeRequest instance
     */
    ITeamsAppInstallationUpgradeRequest buildRequest();

    /**
     * Creates the ITeamsAppInstallationUpgradeRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ITeamsAppInstallationUpgradeRequest instance
     */
    ITeamsAppInstallationUpgradeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}