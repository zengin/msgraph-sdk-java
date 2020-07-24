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
import com.microsoft.graph.models.generated.WindowsHelloForBusinessPinUsage;
import com.microsoft.graph.models.generated.Enablement;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Windows Hello For Business Configuration.
 */
public class DeviceEnrollmentWindowsHelloForBusinessConfiguration extends DeviceEnrollmentConfiguration implements IJsonBackedObject {


    /**
     * The Pin Minimum Length.
     * Controls the minimum number of characters required for the Windows Hello for Business PIN.  This value must be between 4 and 127, inclusive, and less than or equal to the value set for the maximum PIN.
     */
    @SerializedName("pinMinimumLength")
    @Expose
    public Integer pinMinimumLength;

    /**
     * The Pin Maximum Length.
     * Controls the maximum number of characters allowed for the Windows Hello for Business PIN. This value must be between 4 and 127, inclusive. This value must be greater than or equal to the value set for the minimum PIN.
     */
    @SerializedName("pinMaximumLength")
    @Expose
    public Integer pinMaximumLength;

    /**
     * The Pin Uppercase Characters Usage.
     * Controls the ability to use uppercase letters in the Windows Hello for Business PIN.  Allowed permits the use of uppercase letter(s), whereas Required ensures they are present. If set to Not Allowed, uppercase letters will not be permitted.
     */
    @SerializedName("pinUppercaseCharactersUsage")
    @Expose
    public WindowsHelloForBusinessPinUsage pinUppercaseCharactersUsage;

    /**
     * The Pin Lowercase Characters Usage.
     * Controls the ability to use lowercase letters in the Windows Hello for Business PIN.  Allowed permits the use of lowercase letter(s), whereas Required ensures they are present. If set to Not Allowed, lowercase letters will not be permitted.
     */
    @SerializedName("pinLowercaseCharactersUsage")
    @Expose
    public WindowsHelloForBusinessPinUsage pinLowercaseCharactersUsage;

    /**
     * The Pin Special Characters Usage.
     * Controls the ability to use special characters in the Windows Hello for Business PIN.  Allowed permits the use of special character(s), whereas Required ensures they are present. If set to Not Allowed, special character(s) will not be permitted.
     */
    @SerializedName("pinSpecialCharactersUsage")
    @Expose
    public WindowsHelloForBusinessPinUsage pinSpecialCharactersUsage;

    /**
     * The State.
     * Controls whether to allow the device to be configured for Windows Hello for Business. If set to disabled, the user cannot provision Windows Hello for Business except on Azure Active Directory joined mobile phones if otherwise required. If set to Not Configured, Intune will not override client defaults.
     */
    @SerializedName("state")
    @Expose
    public Enablement state;

    /**
     * The Security Device Required.
     * Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     */
    @SerializedName("securityDeviceRequired")
    @Expose
    public Boolean securityDeviceRequired;

    /**
     * The Unlock With Biometrics Enabled.
     * Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     */
    @SerializedName("unlockWithBiometricsEnabled")
    @Expose
    public Boolean unlockWithBiometricsEnabled;

    /**
     * The Remote Passport Enabled.
     * Controls the use of Remote Windows Hello for Business. Remote Windows Hello for Business provides the ability for a portable, registered device to be usable as a companion for desktop authentication. The desktop must be Azure AD joined and the companion device must have a Windows Hello for Business PIN.
     */
    @SerializedName("remotePassportEnabled")
    @Expose
    public Boolean remotePassportEnabled;

    /**
     * The Pin Previous Block Count.
     * Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset.
     */
    @SerializedName("pinPreviousBlockCount")
    @Expose
    public Integer pinPreviousBlockCount;

    /**
     * The Pin Expiration In Days.
     * Controls the period of time (in days) that a PIN can be used before the system requires the user to change it. This must be set between 0 and 730, inclusive. If set to 0, the user's PIN will never expire
     */
    @SerializedName("pinExpirationInDays")
    @Expose
    public Integer pinExpirationInDays;

    /**
     * The Enhanced Biometrics State.
     * Controls the ability to use the anti-spoofing features for facial recognition on devices which support it. If set to disabled, anti-spoofing features are not allowed. If set to Not Configured, the user can choose whether they want to use anti-spoofing.
     */
    @SerializedName("enhancedBiometricsState")
    @Expose
    public Enablement enhancedBiometricsState;


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
