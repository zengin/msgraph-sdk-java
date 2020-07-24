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
import com.microsoft.graph.models.generated.MobileThreatPartnerTenantState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile Threat Defense Connector.
 */
public class MobileThreatDefenseConnector extends Entity implements IJsonBackedObject {


    /**
     * The Last Heartbeat Date Time.
     * DateTime of last Heartbeat recieved from the Data Sync Partner
     */
    @SerializedName("lastHeartbeatDateTime")
    @Expose
    public java.util.Calendar lastHeartbeatDateTime;

    /**
     * The Partner State.
     * Data Sync Partner state for this account
     */
    @SerializedName("partnerState")
    @Expose
    public MobileThreatPartnerTenantState partnerState;

    /**
     * The Android Enabled.
     * For Android, set whether data from the data sync partner should be used during compliance evaluations
     */
    @SerializedName("androidEnabled")
    @Expose
    public Boolean androidEnabled;

    /**
     * The Ios Enabled.
     * For IOS, get or set whether data from the data sync partner should be used during compliance evaluations
     */
    @SerializedName("iosEnabled")
    @Expose
    public Boolean iosEnabled;

    /**
     * The Android Device Blocked On Missing Partner Data.
     * For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     */
    @SerializedName("androidDeviceBlockedOnMissingPartnerData")
    @Expose
    public Boolean androidDeviceBlockedOnMissingPartnerData;

    /**
     * The Ios Device Blocked On Missing Partner Data.
     * For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     */
    @SerializedName("iosDeviceBlockedOnMissingPartnerData")
    @Expose
    public Boolean iosDeviceBlockedOnMissingPartnerData;

    /**
     * The Partner Unsupported Os Version Blocked.
     * Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Data Sync Partner
     */
    @SerializedName("partnerUnsupportedOsVersionBlocked")
    @Expose
    public Boolean partnerUnsupportedOsVersionBlocked;

    /**
     * The Partner Unresponsiveness Threshold In Days.
     * Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
     */
    @SerializedName("partnerUnresponsivenessThresholdInDays")
    @Expose
    public Integer partnerUnresponsivenessThresholdInDays;


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
