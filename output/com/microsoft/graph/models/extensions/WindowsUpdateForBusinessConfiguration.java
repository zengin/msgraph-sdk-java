// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsDeliveryOptimizationMode;
import com.microsoft.graph.models.generated.PrereleaseFeatures;
import com.microsoft.graph.models.generated.AutomaticUpdateMode;
import com.microsoft.graph.models.extensions.WindowsUpdateInstallScheduleType;
import com.microsoft.graph.models.generated.WindowsUpdateType;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update For Business Configuration.
 */
public class WindowsUpdateForBusinessConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Delivery Optimization Mode.
     * Delivery Optimization Mode
     */
    @SerializedName("deliveryOptimizationMode")
    @Expose
    public WindowsDeliveryOptimizationMode deliveryOptimizationMode;

    /**
     * The Prerelease Features.
     * The pre-release features.
     */
    @SerializedName("prereleaseFeatures")
    @Expose
    public PrereleaseFeatures prereleaseFeatures;

    /**
     * The Automatic Update Mode.
     * Automatic update mode.
     */
    @SerializedName("automaticUpdateMode")
    @Expose
    public AutomaticUpdateMode automaticUpdateMode;

    /**
     * The Microsoft Update Service Allowed.
     * Allow Microsoft Update Service
     */
    @SerializedName("microsoftUpdateServiceAllowed")
    @Expose
    public Boolean microsoftUpdateServiceAllowed;

    /**
     * The Drivers Excluded.
     * Exclude Windows update Drivers
     */
    @SerializedName("driversExcluded")
    @Expose
    public Boolean driversExcluded;

    /**
     * The Installation Schedule.
     * Installation schedule
     */
    @SerializedName("installationSchedule")
    @Expose
    public WindowsUpdateInstallScheduleType installationSchedule;

    /**
     * The Quality Updates Deferral Period In Days.
     * Defer Quality Updates by these many days
     */
    @SerializedName("qualityUpdatesDeferralPeriodInDays")
    @Expose
    public Integer qualityUpdatesDeferralPeriodInDays;

    /**
     * The Feature Updates Deferral Period In Days.
     * Defer Feature Updates by these many days
     */
    @SerializedName("featureUpdatesDeferralPeriodInDays")
    @Expose
    public Integer featureUpdatesDeferralPeriodInDays;

    /**
     * The Quality Updates Paused.
     * Pause Quality Updates
     */
    @SerializedName("qualityUpdatesPaused")
    @Expose
    public Boolean qualityUpdatesPaused;

    /**
     * The Feature Updates Paused.
     * Pause Feature Updates
     */
    @SerializedName("featureUpdatesPaused")
    @Expose
    public Boolean featureUpdatesPaused;

    /**
     * The Quality Updates Pause Expiry Date Time.
     * Quality Updates Pause Expiry datetime
     */
    @SerializedName("qualityUpdatesPauseExpiryDateTime")
    @Expose
    public java.util.Calendar qualityUpdatesPauseExpiryDateTime;

    /**
     * The Feature Updates Pause Expiry Date Time.
     * Feature Updates Pause Expiry datetime
     */
    @SerializedName("featureUpdatesPauseExpiryDateTime")
    @Expose
    public java.util.Calendar featureUpdatesPauseExpiryDateTime;

    /**
     * The Business Ready Updates Only.
     * Determines which branch devices will receive their updates from
     */
    @SerializedName("businessReadyUpdatesOnly")
    @Expose
    public WindowsUpdateType businessReadyUpdatesOnly;


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
