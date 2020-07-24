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
import com.microsoft.graph.models.generated.MiracastChannel;
import com.microsoft.graph.models.generated.WelcomeScreenMeetingInformation;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Team General Configuration.
 */
public class Windows10TeamGeneralConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Azure Operational Insights Block Telemetry.
     * Indicates whether or not to Block Azure Operational Insights.
     */
    @SerializedName("azureOperationalInsightsBlockTelemetry")
    @Expose
    public Boolean azureOperationalInsightsBlockTelemetry;

    /**
     * The Azure Operational Insights Workspace Id.
     * The Azure Operational Insights workspace id.
     */
    @SerializedName("azureOperationalInsightsWorkspaceId")
    @Expose
    public String azureOperationalInsightsWorkspaceId;

    /**
     * The Azure Operational Insights Workspace Key.
     * The Azure Operational Insights Workspace key.
     */
    @SerializedName("azureOperationalInsightsWorkspaceKey")
    @Expose
    public String azureOperationalInsightsWorkspaceKey;

    /**
     * The Connect App Block Auto Launch.
     * Specifies whether to automatically launch the Connect app whenever a projection is initiated.
     */
    @SerializedName("connectAppBlockAutoLaunch")
    @Expose
    public Boolean connectAppBlockAutoLaunch;

    /**
     * The Maintenance Window Blocked.
     * Indicates whether or not to Block setting a maintenance window for device updates.
     */
    @SerializedName("maintenanceWindowBlocked")
    @Expose
    public Boolean maintenanceWindowBlocked;

    /**
     * The Maintenance Window Duration In Hours.
     * Maintenance window duration for device updates. Valid values 0 to 5
     */
    @SerializedName("maintenanceWindowDurationInHours")
    @Expose
    public Integer maintenanceWindowDurationInHours;

    /**
     * The Maintenance Window Start Time.
     * Maintenance window start time for device updates.
     */
    @SerializedName("maintenanceWindowStartTime")
    @Expose
    public com.microsoft.graph.models.extensions.TimeOfDay maintenanceWindowStartTime;

    /**
     * The Miracast Channel.
     * The channel.
     */
    @SerializedName("miracastChannel")
    @Expose
    public MiracastChannel miracastChannel;

    /**
     * The Miracast Blocked.
     * Indicates whether or not to Block wireless projection.
     */
    @SerializedName("miracastBlocked")
    @Expose
    public Boolean miracastBlocked;

    /**
     * The Miracast Require Pin.
     * Indicates whether or not to require a pin for wireless projection.
     */
    @SerializedName("miracastRequirePin")
    @Expose
    public Boolean miracastRequirePin;

    /**
     * The Settings Block My Meetings And Files.
     * Specifies whether to disable the "My meetings and files" feature in the Start menu, which shows the signed-in user's meetings and files from Office 365.
     */
    @SerializedName("settingsBlockMyMeetingsAndFiles")
    @Expose
    public Boolean settingsBlockMyMeetingsAndFiles;

    /**
     * The Settings Block Session Resume.
     * Specifies whether to allow the ability to resume a session when the session times out.
     */
    @SerializedName("settingsBlockSessionResume")
    @Expose
    public Boolean settingsBlockSessionResume;

    /**
     * The Settings Block Signin Suggestions.
     * Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.
     */
    @SerializedName("settingsBlockSigninSuggestions")
    @Expose
    public Boolean settingsBlockSigninSuggestions;

    /**
     * The Settings Default Volume.
     * Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to 100
     */
    @SerializedName("settingsDefaultVolume")
    @Expose
    public Integer settingsDefaultVolume;

    /**
     * The Settings Screen Timeout In Minutes.
     * Specifies the number of minutes until the Hub screen turns off.
     */
    @SerializedName("settingsScreenTimeoutInMinutes")
    @Expose
    public Integer settingsScreenTimeoutInMinutes;

    /**
     * The Settings Session Timeout In Minutes.
     * Specifies the number of minutes until the session times out.
     */
    @SerializedName("settingsSessionTimeoutInMinutes")
    @Expose
    public Integer settingsSessionTimeoutInMinutes;

    /**
     * The Settings Sleep Timeout In Minutes.
     * Specifies the number of minutes until the Hub enters sleep mode.
     */
    @SerializedName("settingsSleepTimeoutInMinutes")
    @Expose
    public Integer settingsSleepTimeoutInMinutes;

    /**
     * The Welcome Screen Block Automatic Wake Up.
     * Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.
     */
    @SerializedName("welcomeScreenBlockAutomaticWakeUp")
    @Expose
    public Boolean welcomeScreenBlockAutomaticWakeUp;

    /**
     * The Welcome Screen Background Image Url.
     * The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
     */
    @SerializedName("welcomeScreenBackgroundImageUrl")
    @Expose
    public String welcomeScreenBackgroundImageUrl;

    /**
     * The Welcome Screen Meeting Information.
     * The welcome screen meeting information shown.
     */
    @SerializedName("welcomeScreenMeetingInformation")
    @Expose
    public WelcomeScreenMeetingInformation welcomeScreenMeetingInformation;


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
