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
import com.microsoft.graph.models.extensions.AssignedPlan;
import com.microsoft.graph.models.extensions.PrivacyProfile;
import com.microsoft.graph.models.extensions.ProvisionedPlan;
import com.microsoft.graph.models.extensions.VerifiedDomain;
import com.microsoft.graph.models.generated.MdmAuthority;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionResponse;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization.
 */
public class Organization extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Assigned Plans.
     * 
     */
    @SerializedName("assignedPlans")
    @Expose
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     * 
     */
    @SerializedName("businessPhones")
    @Expose
    public java.util.List<String> businessPhones;

    /**
     * The City.
     * 
     */
    @SerializedName("city")
    @Expose
    public String city;

    /**
     * The Country.
     * 
     */
    @SerializedName("country")
    @Expose
    public String country;

    /**
     * The Country Letter Code.
     * 
     */
    @SerializedName("countryLetterCode")
    @Expose
    public String countryLetterCode;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Marketing Notification Emails.
     * 
     */
    @SerializedName("marketingNotificationEmails")
    @Expose
    public java.util.List<String> marketingNotificationEmails;

    /**
     * The On Premises Last Sync Date Time.
     * 
     */
    @SerializedName("onPremisesLastSyncDateTime")
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Sync Enabled.
     * 
     */
    @SerializedName("onPremisesSyncEnabled")
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Postal Code.
     * 
     */
    @SerializedName("postalCode")
    @Expose
    public String postalCode;

    /**
     * The Preferred Language.
     * 
     */
    @SerializedName("preferredLanguage")
    @Expose
    public String preferredLanguage;

    /**
     * The Privacy Profile.
     * 
     */
    @SerializedName("privacyProfile")
    @Expose
    public PrivacyProfile privacyProfile;

    /**
     * The Provisioned Plans.
     * 
     */
    @SerializedName("provisionedPlans")
    @Expose
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Security Compliance Notification Mails.
     * 
     */
    @SerializedName("securityComplianceNotificationMails")
    @Expose
    public java.util.List<String> securityComplianceNotificationMails;

    /**
     * The Security Compliance Notification Phones.
     * 
     */
    @SerializedName("securityComplianceNotificationPhones")
    @Expose
    public java.util.List<String> securityComplianceNotificationPhones;

    /**
     * The State.
     * 
     */
    @SerializedName("state")
    @Expose
    public String state;

    /**
     * The Street.
     * 
     */
    @SerializedName("street")
    @Expose
    public String street;

    /**
     * The Technical Notification Mails.
     * 
     */
    @SerializedName("technicalNotificationMails")
    @Expose
    public java.util.List<String> technicalNotificationMails;

    /**
     * The Verified Domains.
     * 
     */
    @SerializedName("verifiedDomains")
    @Expose
    public java.util.List<VerifiedDomain> verifiedDomains;

    /**
     * The Mobile Device Management Authority.
     * Mobile device management authority.
     */
    @SerializedName("mobileDeviceManagementAuthority")
    @Expose
    public MdmAuthority mobileDeviceManagementAuthority;

    /**
     * The Certificate Based Auth Configuration.
     * 
     */
    public CertificateBasedAuthConfigurationCollectionPage certificateBasedAuthConfiguration;

    /**
     * The Extensions.
     * 
     */
    public ExtensionCollectionPage extensions;


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


        if (json.has("certificateBasedAuthConfiguration")) {
            final CertificateBasedAuthConfigurationCollectionResponse response = new CertificateBasedAuthConfigurationCollectionResponse();
            if (json.has("certificateBasedAuthConfiguration@odata.nextLink")) {
                response.nextLink = json.get("certificateBasedAuthConfiguration@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("certificateBasedAuthConfiguration").toString(), JsonObject[].class);
            final CertificateBasedAuthConfiguration[] array = new CertificateBasedAuthConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CertificateBasedAuthConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            certificateBasedAuthConfiguration = new CertificateBasedAuthConfigurationCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final ExtensionCollectionResponse response = new ExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }
    }
}
