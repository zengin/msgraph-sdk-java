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
import com.microsoft.graph.models.extensions.AppListItem;
import com.microsoft.graph.models.generated.AppListType;
import com.microsoft.graph.models.generated.AndroidRequiredPasswordType;
import com.microsoft.graph.models.generated.WebBrowserCookieSettings;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android General Device Configuration.
 */
public class AndroidGeneralDeviceConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Apps Block Clipboard Sharing.
     * Indicates whether or not to block clipboard sharing to copy and paste between applications.
     */
    @SerializedName("appsBlockClipboardSharing")
    @Expose
    public Boolean appsBlockClipboardSharing;

    /**
     * The Apps Block Copy Paste.
     * Indicates whether or not to block copy and paste within applications.
     */
    @SerializedName("appsBlockCopyPaste")
    @Expose
    public Boolean appsBlockCopyPaste;

    /**
     * The Apps Block You Tube.
     * Indicates whether or not to block the YouTube app.
     */
    @SerializedName("appsBlockYouTube")
    @Expose
    public Boolean appsBlockYouTube;

    /**
     * The Bluetooth Blocked.
     * Indicates whether or not to block Bluetooth.
     */
    @SerializedName("bluetoothBlocked")
    @Expose
    public Boolean bluetoothBlocked;

    /**
     * The Camera Blocked.
     * Indicates whether or not to block the use of the camera.
     */
    @SerializedName("cameraBlocked")
    @Expose
    public Boolean cameraBlocked;

    /**
     * The Cellular Block Data Roaming.
     * Indicates whether or not to block data roaming.
     */
    @SerializedName("cellularBlockDataRoaming")
    @Expose
    public Boolean cellularBlockDataRoaming;

    /**
     * The Cellular Block Messaging.
     * Indicates whether or not to block SMS/MMS messaging.
     */
    @SerializedName("cellularBlockMessaging")
    @Expose
    public Boolean cellularBlockMessaging;

    /**
     * The Cellular Block Voice Roaming.
     * Indicates whether or not to block voice roaming.
     */
    @SerializedName("cellularBlockVoiceRoaming")
    @Expose
    public Boolean cellularBlockVoiceRoaming;

    /**
     * The Cellular Block Wi Fi Tethering.
     * Indicates whether or not to block syncing Wi-Fi tethering.
     */
    @SerializedName("cellularBlockWiFiTethering")
    @Expose
    public Boolean cellularBlockWiFiTethering;

    /**
     * The Compliant Apps List.
     * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     */
    @SerializedName("compliantAppsList")
    @Expose
    public java.util.List<AppListItem> compliantAppsList;

    /**
     * The Compliant App List Type.
     * Type of list that is in the CompliantAppsList.
     */
    @SerializedName("compliantAppListType")
    @Expose
    public AppListType compliantAppListType;

    /**
     * The Diagnostic Data Block Submission.
     * Indicates whether or not to block diagnostic data submission.
     */
    @SerializedName("diagnosticDataBlockSubmission")
    @Expose
    public Boolean diagnosticDataBlockSubmission;

    /**
     * The Location Services Blocked.
     * Indicates whether or not to block location services.
     */
    @SerializedName("locationServicesBlocked")
    @Expose
    public Boolean locationServicesBlocked;

    /**
     * The Google Account Block Auto Sync.
     * Indicates whether or not to block Google account auto sync.
     */
    @SerializedName("googleAccountBlockAutoSync")
    @Expose
    public Boolean googleAccountBlockAutoSync;

    /**
     * The Google Play Store Blocked.
     * Indicates whether or not to block the Google Play store.
     */
    @SerializedName("googlePlayStoreBlocked")
    @Expose
    public Boolean googlePlayStoreBlocked;

    /**
     * The Kiosk Mode Block Sleep Button.
     * Indicates whether or not to block the screen sleep button while in Kiosk Mode.
     */
    @SerializedName("kioskModeBlockSleepButton")
    @Expose
    public Boolean kioskModeBlockSleepButton;

    /**
     * The Kiosk Mode Block Volume Buttons.
     * Indicates whether or not to block the volume buttons while in Kiosk Mode.
     */
    @SerializedName("kioskModeBlockVolumeButtons")
    @Expose
    public Boolean kioskModeBlockVolumeButtons;

    /**
     * The Kiosk Mode Apps.
     * A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("kioskModeApps")
    @Expose
    public java.util.List<AppListItem> kioskModeApps;

    /**
     * The Nfc Blocked.
     * Indicates whether or not to block Near-Field Communication.
     */
    @SerializedName("nfcBlocked")
    @Expose
    public Boolean nfcBlocked;

    /**
     * The Password Block Fingerprint Unlock.
     * Indicates whether or not to block fingerprint unlock.
     */
    @SerializedName("passwordBlockFingerprintUnlock")
    @Expose
    public Boolean passwordBlockFingerprintUnlock;

    /**
     * The Password Block Trust Agents.
     * Indicates whether or not to block Smart Lock and other trust agents.
     */
    @SerializedName("passwordBlockTrustAgents")
    @Expose
    public Boolean passwordBlockTrustAgents;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires. Valid values 1 to 365
     */
    @SerializedName("passwordExpirationDays")
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Length.
     * Minimum length of passwords. Valid values 4 to 16
     */
    @SerializedName("passwordMinimumLength")
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity before the screen times out.
     */
    @SerializedName("passwordMinutesOfInactivityBeforeScreenTimeout")
    @Expose
    public Integer passwordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block. Valid values 0 to 24
     */
    @SerializedName("passwordPreviousPasswordBlockCount")
    @Expose
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Sign In Failure Count Before Factory Reset.
     * Number of sign in failures allowed before factory reset. Valid values 1 to 16
     */
    @SerializedName("passwordSignInFailureCountBeforeFactoryReset")
    @Expose
    public Integer passwordSignInFailureCountBeforeFactoryReset;

    /**
     * The Password Required Type.
     * Type of password that is required.
     */
    @SerializedName("passwordRequiredType")
    @Expose
    public AndroidRequiredPasswordType passwordRequiredType;

    /**
     * The Password Required.
     * Indicates whether or not to require a password.
     */
    @SerializedName("passwordRequired")
    @Expose
    public Boolean passwordRequired;

    /**
     * The Power Off Blocked.
     * Indicates whether or not to block powering off the device.
     */
    @SerializedName("powerOffBlocked")
    @Expose
    public Boolean powerOffBlocked;

    /**
     * The Factory Reset Blocked.
     * Indicates whether or not to block user performing a factory reset.
     */
    @SerializedName("factoryResetBlocked")
    @Expose
    public Boolean factoryResetBlocked;

    /**
     * The Screen Capture Blocked.
     * Indicates whether or not to block screenshots.
     */
    @SerializedName("screenCaptureBlocked")
    @Expose
    public Boolean screenCaptureBlocked;

    /**
     * The Device Sharing Allowed.
     * Indicates whether or not to allow device sharing mode.
     */
    @SerializedName("deviceSharingAllowed")
    @Expose
    public Boolean deviceSharingAllowed;

    /**
     * The Storage Block Google Backup.
     * Indicates whether or not to block Google Backup.
     */
    @SerializedName("storageBlockGoogleBackup")
    @Expose
    public Boolean storageBlockGoogleBackup;

    /**
     * The Storage Block Removable Storage.
     * Indicates whether or not to block removable storage usage.
     */
    @SerializedName("storageBlockRemovableStorage")
    @Expose
    public Boolean storageBlockRemovableStorage;

    /**
     * The Storage Require Device Encryption.
     * Indicates whether or not to require device encryption.
     */
    @SerializedName("storageRequireDeviceEncryption")
    @Expose
    public Boolean storageRequireDeviceEncryption;

    /**
     * The Storage Require Removable Storage Encryption.
     * Indicates whether or not to require removable storage encryption.
     */
    @SerializedName("storageRequireRemovableStorageEncryption")
    @Expose
    public Boolean storageRequireRemovableStorageEncryption;

    /**
     * The Voice Assistant Blocked.
     * Indicates whether or not to block the use of the Voice Assistant.
     */
    @SerializedName("voiceAssistantBlocked")
    @Expose
    public Boolean voiceAssistantBlocked;

    /**
     * The Voice Dialing Blocked.
     * Indicates whether or not to block voice dialing.
     */
    @SerializedName("voiceDialingBlocked")
    @Expose
    public Boolean voiceDialingBlocked;

    /**
     * The Web Browser Block Popups.
     * Indicates whether or not to block popups within the web browser.
     */
    @SerializedName("webBrowserBlockPopups")
    @Expose
    public Boolean webBrowserBlockPopups;

    /**
     * The Web Browser Block Autofill.
     * Indicates whether or not to block the web browser's auto fill feature.
     */
    @SerializedName("webBrowserBlockAutofill")
    @Expose
    public Boolean webBrowserBlockAutofill;

    /**
     * The Web Browser Block Java Script.
     * Indicates whether or not to block JavaScript within the web browser.
     */
    @SerializedName("webBrowserBlockJavaScript")
    @Expose
    public Boolean webBrowserBlockJavaScript;

    /**
     * The Web Browser Blocked.
     * Indicates whether or not to block the web browser.
     */
    @SerializedName("webBrowserBlocked")
    @Expose
    public Boolean webBrowserBlocked;

    /**
     * The Web Browser Cookie Settings.
     * Cookie settings within the web browser.
     */
    @SerializedName("webBrowserCookieSettings")
    @Expose
    public WebBrowserCookieSettings webBrowserCookieSettings;

    /**
     * The Wi Fi Blocked.
     * Indicates whether or not to block syncing Wi-Fi.
     */
    @SerializedName("wiFiBlocked")
    @Expose
    public Boolean wiFiBlocked;

    /**
     * The Apps Install Allow List.
     * List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("appsInstallAllowList")
    @Expose
    public java.util.List<AppListItem> appsInstallAllowList;

    /**
     * The Apps Launch Block List.
     * List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("appsLaunchBlockList")
    @Expose
    public java.util.List<AppListItem> appsLaunchBlockList;

    /**
     * The Apps Hide List.
     * List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("appsHideList")
    @Expose
    public java.util.List<AppListItem> appsHideList;

    /**
     * The Security Require Verify Apps.
     * Require the Android Verify apps feature is turned on.
     */
    @SerializedName("securityRequireVerifyApps")
    @Expose
    public Boolean securityRequireVerifyApps;


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
