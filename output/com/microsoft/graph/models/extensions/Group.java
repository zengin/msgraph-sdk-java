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
import com.microsoft.graph.models.extensions.AssignedLabel;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.LicenseProcessingState;
import com.microsoft.graph.models.extensions.OnPremisesProvisioningError;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.GroupSetting;
import com.microsoft.graph.models.extensions.Conversation;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicy;
import com.microsoft.graph.models.extensions.PlannerGroup;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionPage;
import com.microsoft.graph.requests.extensions.ConversationCollectionResponse;
import com.microsoft.graph.requests.extensions.ConversationCollectionPage;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionResponse;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionPage;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionResponse;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionPage;
import com.microsoft.graph.requests.extensions.EventCollectionResponse;
import com.microsoft.graph.requests.extensions.EventCollectionPage;
import com.microsoft.graph.requests.extensions.DriveCollectionResponse;
import com.microsoft.graph.requests.extensions.DriveCollectionPage;
import com.microsoft.graph.requests.extensions.SiteCollectionResponse;
import com.microsoft.graph.requests.extensions.SiteCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionResponse;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group.
 */
public class Group extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Assigned Labels.
     * 
     */
    @SerializedName("assignedLabels")
    @Expose
    public java.util.List<AssignedLabel> assignedLabels;

    /**
     * The Assigned Licenses.
     * 
     */
    @SerializedName("assignedLicenses")
    @Expose
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Classification.
     * 
     */
    @SerializedName("classification")
    @Expose
    public String classification;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Expiration Date Time.
     * 
     */
    @SerializedName("expirationDateTime")
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Has Members With License Errors.
     * 
     */
    @SerializedName("hasMembersWithLicenseErrors")
    @Expose
    public Boolean hasMembersWithLicenseErrors;

    /**
     * The Group Types.
     * 
     */
    @SerializedName("groupTypes")
    @Expose
    public java.util.List<String> groupTypes;

    /**
     * The License Processing State.
     * 
     */
    @SerializedName("licenseProcessingState")
    @Expose
    public LicenseProcessingState licenseProcessingState;

    /**
     * The Mail.
     * 
     */
    @SerializedName("mail")
    @Expose
    public String mail;

    /**
     * The Mail Enabled.
     * 
     */
    @SerializedName("mailEnabled")
    @Expose
    public Boolean mailEnabled;

    /**
     * The Mail Nickname.
     * 
     */
    @SerializedName("mailNickname")
    @Expose
    public String mailNickname;

    /**
     * The Membership Rule.
     * 
     */
    @SerializedName("membershipRule")
    @Expose
    public String membershipRule;

    /**
     * The Membership Rule Processing State.
     * 
     */
    @SerializedName("membershipRuleProcessingState")
    @Expose
    public String membershipRuleProcessingState;

    /**
     * The On Premises Domain Name.
     * 
     */
    @SerializedName("onPremisesDomainName")
    @Expose
    public String onPremisesDomainName;

    /**
     * The On Premises Last Sync Date Time.
     * 
     */
    @SerializedName("onPremisesLastSyncDateTime")
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Net Bios Name.
     * 
     */
    @SerializedName("onPremisesNetBiosName")
    @Expose
    public String onPremisesNetBiosName;

    /**
     * The On Premises Provisioning Errors.
     * 
     */
    @SerializedName("onPremisesProvisioningErrors")
    @Expose
    public java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;

    /**
     * The On Premises Sam Account Name.
     * 
     */
    @SerializedName("onPremisesSamAccountName")
    @Expose
    public String onPremisesSamAccountName;

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
     * The Preferred Data Location.
     * 
     */
    @SerializedName("preferredDataLocation")
    @Expose
    public String preferredDataLocation;

    /**
     * The Preferred Language.
     * 
     */
    @SerializedName("preferredLanguage")
    @Expose
    public String preferredLanguage;

    /**
     * The Proxy Addresses.
     * 
     */
    @SerializedName("proxyAddresses")
    @Expose
    public java.util.List<String> proxyAddresses;

    /**
     * The Renewed Date Time.
     * 
     */
    @SerializedName("renewedDateTime")
    @Expose
    public java.util.Calendar renewedDateTime;

    /**
     * The Security Enabled.
     * 
     */
    @SerializedName("securityEnabled")
    @Expose
    public Boolean securityEnabled;

    /**
     * The Security Identifier.
     * 
     */
    @SerializedName("securityIdentifier")
    @Expose
    public String securityIdentifier;

    /**
     * The Theme.
     * 
     */
    @SerializedName("theme")
    @Expose
    public String theme;

    /**
     * The Visibility.
     * 
     */
    @SerializedName("visibility")
    @Expose
    public String visibility;

    /**
     * The Allow External Senders.
     * 
     */
    @SerializedName("allowExternalSenders")
    @Expose
    public Boolean allowExternalSenders;

    /**
     * The Auto Subscribe New Members.
     * 
     */
    @SerializedName("autoSubscribeNewMembers")
    @Expose
    public Boolean autoSubscribeNewMembers;

    /**
     * The Is Subscribed By Mail.
     * 
     */
    @SerializedName("isSubscribedByMail")
    @Expose
    public Boolean isSubscribedByMail;

    /**
     * The Unseen Count.
     * 
     */
    @SerializedName("unseenCount")
    @Expose
    public Integer unseenCount;

    /**
     * The Hide From Outlook Clients.
     * 
     */
    @SerializedName("hideFromOutlookClients")
    @Expose
    public Boolean hideFromOutlookClients;

    /**
     * The Hide From Address Lists.
     * 
     */
    @SerializedName("hideFromAddressLists")
    @Expose
    public Boolean hideFromAddressLists;

    /**
     * The Is Archived.
     * 
     */
    @SerializedName("isArchived")
    @Expose
    public Boolean isArchived;

    /**
     * The App Role Assignments.
     * 
     */
    public AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Members.
     * 
     */
    public DirectoryObjectCollectionPage members;

    /**
     * The Member Of.
     * 
     */
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Members With License Errors.
     * 
     */
    public DirectoryObjectCollectionPage membersWithLicenseErrors;

    /**
     * The Transitive Members.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMembers;

    /**
     * The Transitive Member Of.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Created On Behalf Of.
     * 
     */
    @SerializedName("createdOnBehalfOf")
    @Expose
    public DirectoryObject createdOnBehalfOf;

    /**
     * The Owners.
     * 
     */
    public DirectoryObjectCollectionPage owners;

    /**
     * The Settings.
     * 
     */
    public GroupSettingCollectionPage settings;

    /**
     * The Conversations.
     * 
     */
    public ConversationCollectionPage conversations;

    /**
     * The Photos.
     * 
     */
    public ProfilePhotoCollectionPage photos;

    /**
     * The Accepted Senders.
     * 
     */
    public DirectoryObjectCollectionPage acceptedSenders;

    /**
     * The Rejected Senders.
     * 
     */
    public DirectoryObjectCollectionPage rejectedSenders;

    /**
     * The Threads.
     * 
     */
    public ConversationThreadCollectionPage threads;

    /**
     * The Calendar.
     * 
     */
    @SerializedName("calendar")
    @Expose
    public Calendar calendar;

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
     * The Photo.
     * 
     */
    @SerializedName("photo")
    @Expose
    public ProfilePhoto photo;

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
     * The Sites.
     * 
     */
    public SiteCollectionPage sites;

    /**
     * The Extensions.
     * 
     */
    public ExtensionCollectionPage extensions;

    /**
     * The Group Lifecycle Policies.
     * 
     */
    public GroupLifecyclePolicyCollectionPage groupLifecyclePolicies;

    /**
     * The Planner.
     * 
     */
    @SerializedName("planner")
    @Expose
    public PlannerGroup planner;

    /**
     * The Onenote.
     * 
     */
    @SerializedName("onenote")
    @Expose
    public Onenote onenote;

    /**
     * The Team.
     * 
     */
    @SerializedName("team")
    @Expose
    public Team team;


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

        if (json.has("members")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("members@odata.nextLink")) {
                response.nextLink = json.get("members@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("members").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            members = new DirectoryObjectCollectionPage(response, null);
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

        if (json.has("membersWithLicenseErrors")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("membersWithLicenseErrors@odata.nextLink")) {
                response.nextLink = json.get("membersWithLicenseErrors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("membersWithLicenseErrors").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            membersWithLicenseErrors = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("transitiveMembers")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("transitiveMembers@odata.nextLink")) {
                response.nextLink = json.get("transitiveMembers@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("transitiveMembers").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            transitiveMembers = new DirectoryObjectCollectionPage(response, null);
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

        if (json.has("owners")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("owners@odata.nextLink")) {
                response.nextLink = json.get("owners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("owners").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            owners = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("settings")) {
            final GroupSettingCollectionResponse response = new GroupSettingCollectionResponse();
            if (json.has("settings@odata.nextLink")) {
                response.nextLink = json.get("settings@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("settings").toString(), JsonObject[].class);
            final GroupSetting[] array = new GroupSetting[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupSetting.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            settings = new GroupSettingCollectionPage(response, null);
        }

        if (json.has("conversations")) {
            final ConversationCollectionResponse response = new ConversationCollectionResponse();
            if (json.has("conversations@odata.nextLink")) {
                response.nextLink = json.get("conversations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("conversations").toString(), JsonObject[].class);
            final Conversation[] array = new Conversation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Conversation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            conversations = new ConversationCollectionPage(response, null);
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

        if (json.has("acceptedSenders")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("acceptedSenders@odata.nextLink")) {
                response.nextLink = json.get("acceptedSenders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("acceptedSenders").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            acceptedSenders = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("rejectedSenders")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("rejectedSenders@odata.nextLink")) {
                response.nextLink = json.get("rejectedSenders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("rejectedSenders").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            rejectedSenders = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("threads")) {
            final ConversationThreadCollectionResponse response = new ConversationThreadCollectionResponse();
            if (json.has("threads@odata.nextLink")) {
                response.nextLink = json.get("threads@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("threads").toString(), JsonObject[].class);
            final ConversationThread[] array = new ConversationThread[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ConversationThread.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            threads = new ConversationThreadCollectionPage(response, null);
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

        if (json.has("sites")) {
            final SiteCollectionResponse response = new SiteCollectionResponse();
            if (json.has("sites@odata.nextLink")) {
                response.nextLink = json.get("sites@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sites").toString(), JsonObject[].class);
            final Site[] array = new Site[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Site.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sites = new SiteCollectionPage(response, null);
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

        if (json.has("groupLifecyclePolicies")) {
            final GroupLifecyclePolicyCollectionResponse response = new GroupLifecyclePolicyCollectionResponse();
            if (json.has("groupLifecyclePolicies@odata.nextLink")) {
                response.nextLink = json.get("groupLifecyclePolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groupLifecyclePolicies").toString(), JsonObject[].class);
            final GroupLifecyclePolicy[] array = new GroupLifecyclePolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupLifecyclePolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groupLifecyclePolicies = new GroupLifecyclePolicyCollectionPage(response, null);
        }
    }
}
