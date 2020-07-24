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
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.AssignedPlan;
import com.microsoft.graph.models.extensions.ObjectIdentity;
import com.microsoft.graph.models.extensions.LicenseAssignmentState;
import com.microsoft.graph.models.extensions.OnPremisesExtensionAttributes;
import com.microsoft.graph.models.extensions.OnPremisesProvisioningError;
import com.microsoft.graph.models.extensions.PasswordProfile;
import com.microsoft.graph.models.extensions.ProvisionedPlan;
import com.microsoft.graph.models.extensions.MailboxSettings;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import com.microsoft.graph.models.extensions.LicenseDetails;
import com.microsoft.graph.models.extensions.OutlookUser;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.CalendarGroup;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.Person;
import com.microsoft.graph.models.extensions.Contact;
import com.microsoft.graph.models.extensions.ContactFolder;
import com.microsoft.graph.models.extensions.InferenceClassification;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.models.extensions.PlannerUser;
import com.microsoft.graph.models.extensions.OfficeGraphInsights;
import com.microsoft.graph.models.extensions.UserSettings;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.models.extensions.UserActivity;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionResponse;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionPage;
import com.microsoft.graph.requests.extensions.LicenseDetailsCollectionResponse;
import com.microsoft.graph.requests.extensions.LicenseDetailsCollectionPage;
import com.microsoft.graph.requests.extensions.MessageCollectionResponse;
import com.microsoft.graph.requests.extensions.MessageCollectionPage;
import com.microsoft.graph.requests.extensions.MailFolderCollectionResponse;
import com.microsoft.graph.requests.extensions.MailFolderCollectionPage;
import com.microsoft.graph.requests.extensions.CalendarCollectionResponse;
import com.microsoft.graph.requests.extensions.CalendarCollectionPage;
import com.microsoft.graph.requests.extensions.CalendarGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.CalendarGroupCollectionPage;
import com.microsoft.graph.requests.extensions.EventCollectionResponse;
import com.microsoft.graph.requests.extensions.EventCollectionPage;
import com.microsoft.graph.requests.extensions.PersonCollectionResponse;
import com.microsoft.graph.requests.extensions.PersonCollectionPage;
import com.microsoft.graph.requests.extensions.ContactCollectionResponse;
import com.microsoft.graph.requests.extensions.ContactCollectionPage;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionResponse;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionPage;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionResponse;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionPage;
import com.microsoft.graph.requests.extensions.DriveCollectionResponse;
import com.microsoft.graph.requests.extensions.DriveCollectionPage;
import com.microsoft.graph.requests.extensions.SiteCollectionResponse;
import com.microsoft.graph.requests.extensions.SiteCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionResponse;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.extensions.UserActivityCollectionResponse;
import com.microsoft.graph.requests.extensions.UserActivityCollectionPage;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionResponse;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionPage;
import com.microsoft.graph.requests.extensions.TeamCollectionResponse;
import com.microsoft.graph.requests.extensions.TeamCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User.
 */
public class User extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Account Enabled.
     * 
     */
    @SerializedName("accountEnabled")
    @Expose
    public Boolean accountEnabled;

    /**
     * The Age Group.
     * 
     */
    @SerializedName("ageGroup")
    @Expose
    public String ageGroup;

    /**
     * The Assigned Licenses.
     * 
     */
    @SerializedName("assignedLicenses")
    @Expose
    public java.util.List<AssignedLicense> assignedLicenses;

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
     * The Company Name.
     * 
     */
    @SerializedName("companyName")
    @Expose
    public String companyName;

    /**
     * The Consent Provided For Minor.
     * 
     */
    @SerializedName("consentProvidedForMinor")
    @Expose
    public String consentProvidedForMinor;

    /**
     * The Country.
     * 
     */
    @SerializedName("country")
    @Expose
    public String country;

    /**
     * The Creation Type.
     * 
     */
    @SerializedName("creationType")
    @Expose
    public String creationType;

    /**
     * The Department.
     * 
     */
    @SerializedName("department")
    @Expose
    public String department;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Employee Id.
     * 
     */
    @SerializedName("employeeId")
    @Expose
    public String employeeId;

    /**
     * The External User State.
     * 
     */
    @SerializedName("externalUserState")
    @Expose
    public String externalUserState;

    /**
     * The External User State Change Date Time.
     * 
     */
    @SerializedName("externalUserStateChangeDateTime")
    @Expose
    public java.util.Calendar externalUserStateChangeDateTime;

    /**
     * The Fax Number.
     * 
     */
    @SerializedName("faxNumber")
    @Expose
    public String faxNumber;

    /**
     * The Given Name.
     * 
     */
    @SerializedName("givenName")
    @Expose
    public String givenName;

    /**
     * The Identities.
     * 
     */
    @SerializedName("identities")
    @Expose
    public java.util.List<ObjectIdentity> identities;

    /**
     * The Im Addresses.
     * 
     */
    @SerializedName("imAddresses")
    @Expose
    public java.util.List<String> imAddresses;

    /**
     * The Is Resource Account.
     * 
     */
    @SerializedName("isResourceAccount")
    @Expose
    public Boolean isResourceAccount;

    /**
     * The Job Title.
     * 
     */
    @SerializedName("jobTitle")
    @Expose
    public String jobTitle;

    /**
     * The Last Password Change Date Time.
     * 
     */
    @SerializedName("lastPasswordChangeDateTime")
    @Expose
    public java.util.Calendar lastPasswordChangeDateTime;

    /**
     * The Legal Age Group Classification.
     * 
     */
    @SerializedName("legalAgeGroupClassification")
    @Expose
    public String legalAgeGroupClassification;

    /**
     * The License Assignment States.
     * 
     */
    @SerializedName("licenseAssignmentStates")
    @Expose
    public java.util.List<LicenseAssignmentState> licenseAssignmentStates;

    /**
     * The Mail.
     * 
     */
    @SerializedName("mail")
    @Expose
    public String mail;

    /**
     * The Mail Nickname.
     * 
     */
    @SerializedName("mailNickname")
    @Expose
    public String mailNickname;

    /**
     * The Mobile Phone.
     * 
     */
    @SerializedName("mobilePhone")
    @Expose
    public String mobilePhone;

    /**
     * The On Premises Distinguished Name.
     * 
     */
    @SerializedName("onPremisesDistinguishedName")
    @Expose
    public String onPremisesDistinguishedName;

    /**
     * The On Premises Extension Attributes.
     * 
     */
    @SerializedName("onPremisesExtensionAttributes")
    @Expose
    public OnPremisesExtensionAttributes onPremisesExtensionAttributes;

    /**
     * The On Premises Immutable Id.
     * 
     */
    @SerializedName("onPremisesImmutableId")
    @Expose
    public String onPremisesImmutableId;

    /**
     * The On Premises Last Sync Date Time.
     * 
     */
    @SerializedName("onPremisesLastSyncDateTime")
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Provisioning Errors.
     * 
     */
    @SerializedName("onPremisesProvisioningErrors")
    @Expose
    public java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;

    /**
     * The On Premises Security Identifier.
     * 
     */
    @SerializedName("onPremisesSecurityIdentifier")
    @Expose
    public String onPremisesSecurityIdentifier;

    /**
     * The On Premises Sync Enabled.
     * 
     */
    @SerializedName("onPremisesSyncEnabled")
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The On Premises Domain Name.
     * 
     */
    @SerializedName("onPremisesDomainName")
    @Expose
    public String onPremisesDomainName;

    /**
     * The On Premises Sam Account Name.
     * 
     */
    @SerializedName("onPremisesSamAccountName")
    @Expose
    public String onPremisesSamAccountName;

    /**
     * The On Premises User Principal Name.
     * 
     */
    @SerializedName("onPremisesUserPrincipalName")
    @Expose
    public String onPremisesUserPrincipalName;

    /**
     * The Other Mails.
     * 
     */
    @SerializedName("otherMails")
    @Expose
    public java.util.List<String> otherMails;

    /**
     * The Password Policies.
     * 
     */
    @SerializedName("passwordPolicies")
    @Expose
    public String passwordPolicies;

    /**
     * The Password Profile.
     * 
     */
    @SerializedName("passwordProfile")
    @Expose
    public PasswordProfile passwordProfile;

    /**
     * The Office Location.
     * 
     */
    @SerializedName("officeLocation")
    @Expose
    public String officeLocation;

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
     * The Provisioned Plans.
     * 
     */
    @SerializedName("provisionedPlans")
    @Expose
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Proxy Addresses.
     * 
     */
    @SerializedName("proxyAddresses")
    @Expose
    public java.util.List<String> proxyAddresses;

    /**
     * The Show In Address List.
     * 
     */
    @SerializedName("showInAddressList")
    @Expose
    public Boolean showInAddressList;

    /**
     * The Sign In Sessions Valid From Date Time.
     * 
     */
    @SerializedName("signInSessionsValidFromDateTime")
    @Expose
    public java.util.Calendar signInSessionsValidFromDateTime;

    /**
     * The State.
     * 
     */
    @SerializedName("state")
    @Expose
    public String state;

    /**
     * The Street Address.
     * 
     */
    @SerializedName("streetAddress")
    @Expose
    public String streetAddress;

    /**
     * The Surname.
     * 
     */
    @SerializedName("surname")
    @Expose
    public String surname;

    /**
     * The Usage Location.
     * 
     */
    @SerializedName("usageLocation")
    @Expose
    public String usageLocation;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The User Type.
     * 
     */
    @SerializedName("userType")
    @Expose
    public String userType;

    /**
     * The Mailbox Settings.
     * 
     */
    @SerializedName("mailboxSettings")
    @Expose
    public MailboxSettings mailboxSettings;

    /**
     * The Device Enrollment Limit.
     * The limit on the maximum number of devices that the user is permitted to enroll. Allowed values are 5 or 1000.
     */
    @SerializedName("deviceEnrollmentLimit")
    @Expose
    public Integer deviceEnrollmentLimit;

    /**
     * The About Me.
     * 
     */
    @SerializedName("aboutMe")
    @Expose
    public String aboutMe;

    /**
     * The Birthday.
     * 
     */
    @SerializedName("birthday")
    @Expose
    public java.util.Calendar birthday;

    /**
     * The Hire Date.
     * 
     */
    @SerializedName("hireDate")
    @Expose
    public java.util.Calendar hireDate;

    /**
     * The Interests.
     * 
     */
    @SerializedName("interests")
    @Expose
    public java.util.List<String> interests;

    /**
     * The My Site.
     * 
     */
    @SerializedName("mySite")
    @Expose
    public String mySite;

    /**
     * The Past Projects.
     * 
     */
    @SerializedName("pastProjects")
    @Expose
    public java.util.List<String> pastProjects;

    /**
     * The Preferred Name.
     * 
     */
    @SerializedName("preferredName")
    @Expose
    public String preferredName;

    /**
     * The Responsibilities.
     * 
     */
    @SerializedName("responsibilities")
    @Expose
    public java.util.List<String> responsibilities;

    /**
     * The Schools.
     * 
     */
    @SerializedName("schools")
    @Expose
    public java.util.List<String> schools;

    /**
     * The Skills.
     * 
     */
    @SerializedName("skills")
    @Expose
    public java.util.List<String> skills;

    /**
     * The App Role Assignments.
     * 
     */
    public AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Owned Devices.
     * 
     */
    public DirectoryObjectCollectionPage ownedDevices;

    /**
     * The Registered Devices.
     * 
     */
    public DirectoryObjectCollectionPage registeredDevices;

    /**
     * The Manager.
     * 
     */
    @SerializedName("manager")
    @Expose
    public DirectoryObject manager;

    /**
     * The Direct Reports.
     * 
     */
    public DirectoryObjectCollectionPage directReports;

    /**
     * The Member Of.
     * 
     */
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Created Objects.
     * 
     */
    public DirectoryObjectCollectionPage createdObjects;

    /**
     * The Oauth2Permission Grants.
     * 
     */
    public OAuth2PermissionGrantCollectionPage oauth2PermissionGrants;

    /**
     * The Owned Objects.
     * 
     */
    public DirectoryObjectCollectionPage ownedObjects;

    /**
     * The License Details.
     * 
     */
    public LicenseDetailsCollectionPage licenseDetails;

    /**
     * The Transitive Member Of.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Outlook.
     * 
     */
    @SerializedName("outlook")
    @Expose
    public OutlookUser outlook;

    /**
     * The Messages.
     * 
     */
    public MessageCollectionPage messages;

    /**
     * The Mail Folders.
     * 
     */
    public MailFolderCollectionPage mailFolders;

    /**
     * The Calendar.
     * 
     */
    @SerializedName("calendar")
    @Expose
    public Calendar calendar;

    /**
     * The Calendars.
     * 
     */
    public CalendarCollectionPage calendars;

    /**
     * The Calendar Groups.
     * 
     */
    public CalendarGroupCollectionPage calendarGroups;

    /**
     * The Calendar View.
     * 
     */
    public EventCollectionPage calendarView;

    /**
     * The Events.
     * 
     */
    public EventCollectionPage events;

    /**
     * The People.
     * 
     */
    public PersonCollectionPage people;

    /**
     * The Contacts.
     * 
     */
    public ContactCollectionPage contacts;

    /**
     * The Contact Folders.
     * 
     */
    public ContactFolderCollectionPage contactFolders;

    /**
     * The Inference Classification.
     * 
     */
    @SerializedName("inferenceClassification")
    @Expose
    public InferenceClassification inferenceClassification;

    /**
     * The Photo.
     * 
     */
    @SerializedName("photo")
    @Expose
    public ProfilePhoto photo;

    /**
     * The Photos.
     * 
     */
    public ProfilePhotoCollectionPage photos;

    /**
     * The Drive.
     * 
     */
    @SerializedName("drive")
    @Expose
    public Drive drive;

    /**
     * The Drives.
     * 
     */
    public DriveCollectionPage drives;

    /**
     * The Followed Sites.
     * 
     */
    public SiteCollectionPage followedSites;

    /**
     * The Extensions.
     * 
     */
    public ExtensionCollectionPage extensions;

    /**
     * The Managed Devices.
     * The managed devices associated with the user.
     */
    public ManagedDeviceCollectionPage managedDevices;

    /**
     * The Managed App Registrations.
     * Zero or more managed app registrations that belong to the user.
     */
    public ManagedAppRegistrationCollectionPage managedAppRegistrations;

    /**
     * The Device Management Troubleshooting Events.
     * The list of troubleshooting events for this user.
     */
    public DeviceManagementTroubleshootingEventCollectionPage deviceManagementTroubleshootingEvents;

    /**
     * The Planner.
     * 
     */
    @SerializedName("planner")
    @Expose
    public PlannerUser planner;

    /**
     * The Insights.
     * 
     */
    @SerializedName("insights")
    @Expose
    public OfficeGraphInsights insights;

    /**
     * The Settings.
     * 
     */
    @SerializedName("settings")
    @Expose
    public UserSettings settings;

    /**
     * The Onenote.
     * 
     */
    @SerializedName("onenote")
    @Expose
    public Onenote onenote;

    /**
     * The Activities.
     * 
     */
    public UserActivityCollectionPage activities;

    /**
     * The Online Meetings.
     * 
     */
    public OnlineMeetingCollectionPage onlineMeetings;

    /**
     * The Joined Teams.
     * 
     */
    public TeamCollectionPage joinedTeams;


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


        if (json.has("appRoleAssignments")) {
            final AppRoleAssignmentCollectionResponse response = new AppRoleAssignmentCollectionResponse();
            if (json.has("appRoleAssignments@odata.nextLink")) {
                response.nextLink = json.get("appRoleAssignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("appRoleAssignments").toString(), JsonObject[].class);
            final AppRoleAssignment[] array = new AppRoleAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AppRoleAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            appRoleAssignments = new AppRoleAssignmentCollectionPage(response, null);
        }

        if (json.has("ownedDevices")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("ownedDevices@odata.nextLink")) {
                response.nextLink = json.get("ownedDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("ownedDevices").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            ownedDevices = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("registeredDevices")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("registeredDevices@odata.nextLink")) {
                response.nextLink = json.get("registeredDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("registeredDevices").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            registeredDevices = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("directReports")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("directReports@odata.nextLink")) {
                response.nextLink = json.get("directReports@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("directReports").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            directReports = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("memberOf")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("memberOf@odata.nextLink")) {
                response.nextLink = json.get("memberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("memberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            memberOf = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("createdObjects")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("createdObjects@odata.nextLink")) {
                response.nextLink = json.get("createdObjects@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("createdObjects").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            createdObjects = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("oauth2PermissionGrants")) {
            final OAuth2PermissionGrantCollectionResponse response = new OAuth2PermissionGrantCollectionResponse();
            if (json.has("oauth2PermissionGrants@odata.nextLink")) {
                response.nextLink = json.get("oauth2PermissionGrants@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("oauth2PermissionGrants").toString(), JsonObject[].class);
            final OAuth2PermissionGrant[] array = new OAuth2PermissionGrant[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OAuth2PermissionGrant.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            oauth2PermissionGrants = new OAuth2PermissionGrantCollectionPage(response, null);
        }

        if (json.has("ownedObjects")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("ownedObjects@odata.nextLink")) {
                response.nextLink = json.get("ownedObjects@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("ownedObjects").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            ownedObjects = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("licenseDetails")) {
            final LicenseDetailsCollectionResponse response = new LicenseDetailsCollectionResponse();
            if (json.has("licenseDetails@odata.nextLink")) {
                response.nextLink = json.get("licenseDetails@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("licenseDetails").toString(), JsonObject[].class);
            final LicenseDetails[] array = new LicenseDetails[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), LicenseDetails.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            licenseDetails = new LicenseDetailsCollectionPage(response, null);
        }

        if (json.has("transitiveMemberOf")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("transitiveMemberOf@odata.nextLink")) {
                response.nextLink = json.get("transitiveMemberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("transitiveMemberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            transitiveMemberOf = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("messages")) {
            final MessageCollectionResponse response = new MessageCollectionResponse();
            if (json.has("messages@odata.nextLink")) {
                response.nextLink = json.get("messages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("messages").toString(), JsonObject[].class);
            final Message[] array = new Message[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Message.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            messages = new MessageCollectionPage(response, null);
        }

        if (json.has("mailFolders")) {
            final MailFolderCollectionResponse response = new MailFolderCollectionResponse();
            if (json.has("mailFolders@odata.nextLink")) {
                response.nextLink = json.get("mailFolders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("mailFolders").toString(), JsonObject[].class);
            final MailFolder[] array = new MailFolder[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MailFolder.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            mailFolders = new MailFolderCollectionPage(response, null);
        }

        if (json.has("calendars")) {
            final CalendarCollectionResponse response = new CalendarCollectionResponse();
            if (json.has("calendars@odata.nextLink")) {
                response.nextLink = json.get("calendars@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendars").toString(), JsonObject[].class);
            final Calendar[] array = new Calendar[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Calendar.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendars = new CalendarCollectionPage(response, null);
        }

        if (json.has("calendarGroups")) {
            final CalendarGroupCollectionResponse response = new CalendarGroupCollectionResponse();
            if (json.has("calendarGroups@odata.nextLink")) {
                response.nextLink = json.get("calendarGroups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendarGroups").toString(), JsonObject[].class);
            final CalendarGroup[] array = new CalendarGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CalendarGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendarGroups = new CalendarGroupCollectionPage(response, null);
        }

        if (json.has("calendarView")) {
            final EventCollectionResponse response = new EventCollectionResponse();
            if (json.has("calendarView@odata.nextLink")) {
                response.nextLink = json.get("calendarView@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendarView").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendarView = new EventCollectionPage(response, null);
        }

        if (json.has("events")) {
            final EventCollectionResponse response = new EventCollectionResponse();
            if (json.has("events@odata.nextLink")) {
                response.nextLink = json.get("events@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("events").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            events = new EventCollectionPage(response, null);
        }

        if (json.has("people")) {
            final PersonCollectionResponse response = new PersonCollectionResponse();
            if (json.has("people@odata.nextLink")) {
                response.nextLink = json.get("people@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("people").toString(), JsonObject[].class);
            final Person[] array = new Person[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Person.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            people = new PersonCollectionPage(response, null);
        }

        if (json.has("contacts")) {
            final ContactCollectionResponse response = new ContactCollectionResponse();
            if (json.has("contacts@odata.nextLink")) {
                response.nextLink = json.get("contacts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("contacts").toString(), JsonObject[].class);
            final Contact[] array = new Contact[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Contact.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            contacts = new ContactCollectionPage(response, null);
        }

        if (json.has("contactFolders")) {
            final ContactFolderCollectionResponse response = new ContactFolderCollectionResponse();
            if (json.has("contactFolders@odata.nextLink")) {
                response.nextLink = json.get("contactFolders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("contactFolders").toString(), JsonObject[].class);
            final ContactFolder[] array = new ContactFolder[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ContactFolder.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            contactFolders = new ContactFolderCollectionPage(response, null);
        }

        if (json.has("photos")) {
            final ProfilePhotoCollectionResponse response = new ProfilePhotoCollectionResponse();
            if (json.has("photos@odata.nextLink")) {
                response.nextLink = json.get("photos@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("photos").toString(), JsonObject[].class);
            final ProfilePhoto[] array = new ProfilePhoto[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ProfilePhoto.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            photos = new ProfilePhotoCollectionPage(response, null);
        }

        if (json.has("drives")) {
            final DriveCollectionResponse response = new DriveCollectionResponse();
            if (json.has("drives@odata.nextLink")) {
                response.nextLink = json.get("drives@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("drives").toString(), JsonObject[].class);
            final Drive[] array = new Drive[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Drive.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            drives = new DriveCollectionPage(response, null);
        }

        if (json.has("followedSites")) {
            final SiteCollectionResponse response = new SiteCollectionResponse();
            if (json.has("followedSites@odata.nextLink")) {
                response.nextLink = json.get("followedSites@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("followedSites").toString(), JsonObject[].class);
            final Site[] array = new Site[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Site.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            followedSites = new SiteCollectionPage(response, null);
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

        if (json.has("managedDevices")) {
            final ManagedDeviceCollectionResponse response = new ManagedDeviceCollectionResponse();
            if (json.has("managedDevices@odata.nextLink")) {
                response.nextLink = json.get("managedDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedDevices").toString(), JsonObject[].class);
            final ManagedDevice[] array = new ManagedDevice[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDevice.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedDevices = new ManagedDeviceCollectionPage(response, null);
        }

        if (json.has("managedAppRegistrations")) {
            final ManagedAppRegistrationCollectionResponse response = new ManagedAppRegistrationCollectionResponse();
            if (json.has("managedAppRegistrations@odata.nextLink")) {
                response.nextLink = json.get("managedAppRegistrations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedAppRegistrations").toString(), JsonObject[].class);
            final ManagedAppRegistration[] array = new ManagedAppRegistration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedAppRegistration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedAppRegistrations = new ManagedAppRegistrationCollectionPage(response, null);
        }

        if (json.has("deviceManagementTroubleshootingEvents")) {
            final DeviceManagementTroubleshootingEventCollectionResponse response = new DeviceManagementTroubleshootingEventCollectionResponse();
            if (json.has("deviceManagementTroubleshootingEvents@odata.nextLink")) {
                response.nextLink = json.get("deviceManagementTroubleshootingEvents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceManagementTroubleshootingEvents").toString(), JsonObject[].class);
            final DeviceManagementTroubleshootingEvent[] array = new DeviceManagementTroubleshootingEvent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementTroubleshootingEvent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceManagementTroubleshootingEvents = new DeviceManagementTroubleshootingEventCollectionPage(response, null);
        }

        if (json.has("activities")) {
            final UserActivityCollectionResponse response = new UserActivityCollectionResponse();
            if (json.has("activities@odata.nextLink")) {
                response.nextLink = json.get("activities@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("activities").toString(), JsonObject[].class);
            final UserActivity[] array = new UserActivity[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserActivity.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            activities = new UserActivityCollectionPage(response, null);
        }

        if (json.has("onlineMeetings")) {
            final OnlineMeetingCollectionResponse response = new OnlineMeetingCollectionResponse();
            if (json.has("onlineMeetings@odata.nextLink")) {
                response.nextLink = json.get("onlineMeetings@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("onlineMeetings").toString(), JsonObject[].class);
            final OnlineMeeting[] array = new OnlineMeeting[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnlineMeeting.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            onlineMeetings = new OnlineMeetingCollectionPage(response, null);
        }

        if (json.has("joinedTeams")) {
            final TeamCollectionResponse response = new TeamCollectionResponse();
            if (json.has("joinedTeams@odata.nextLink")) {
                response.nextLink = json.get("joinedTeams@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("joinedTeams").toString(), JsonObject[].class);
            final Team[] array = new Team[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Team.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            joinedTeams = new TeamCollectionPage(response, null);
        }
    }
}
