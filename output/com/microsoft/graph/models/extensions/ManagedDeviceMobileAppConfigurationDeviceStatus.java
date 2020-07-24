// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ComplianceStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Device Status.
 */
public class ManagedDeviceMobileAppConfigurationDeviceStatus extends Entity implements IJsonBackedObject {


    /**
     * The Device Display Name.
     * Device name of the DevicePolicyStatus.
     */
    @SerializedName("deviceDisplayName")
    @Expose
    public String deviceDisplayName;

    /**
     * The User Name.
     * The User Name that is being reported
     */
    @SerializedName("userName")
    @Expose
    public String userName;

    /**
     * The Device Model.
     * The device model that is being reported
     */
    @SerializedName("deviceModel")
    @Expose
    public String deviceModel;

    /**
     * The Compliance Grace Period Expiration Date Time.
     * The DateTime when device compliance grace period expires
     */
    @SerializedName("complianceGracePeriodExpirationDateTime")
    @Expose
    public java.util.Calendar complianceGracePeriodExpirationDateTime;

    /**
     * The Status.
     * Compliance status of the policy report.
     */
    @SerializedName("status")
    @Expose
    public ComplianceStatus status;

    /**
     * The Last Reported Date Time.
     * Last modified date time of the policy report.
     */
    @SerializedName("lastReportedDateTime")
    @Expose
    public java.util.Calendar lastReportedDateTime;

    /**
     * The User Principal Name.
     * UserPrincipalName.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
