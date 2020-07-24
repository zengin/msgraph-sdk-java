// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserWipeManagedAppRegistrationsByDeviceTagRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Wipe Managed App Registrations By Device Tag Request Builder.
 */
public interface IUserWipeManagedAppRegistrationsByDeviceTagRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IUserWipeManagedAppRegistrationsByDeviceTagRequest
     *
     * @return the IUserWipeManagedAppRegistrationsByDeviceTagRequest instance
     */
    IUserWipeManagedAppRegistrationsByDeviceTagRequest buildRequest();

    /**
     * Creates the IUserWipeManagedAppRegistrationsByDeviceTagRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IUserWipeManagedAppRegistrationsByDeviceTagRequest instance
     */
    IUserWipeManagedAppRegistrationsByDeviceTagRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
