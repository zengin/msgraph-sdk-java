// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.callrecords.models.generated.CallType;
import com.microsoft.graph.callrecords.models.generated.Modality;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.callrecords.models.extensions.Session;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.callrecords.requests.extensions.SessionCollectionResponse;
import com.microsoft.graph.callrecords.requests.extensions.SessionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record.
 */
public class CallRecord extends Entity implements IJsonBackedObject {


    /**
     * The Version.
     * 
     */
    @SerializedName("version")
    @Expose
    public Long version;

    /**
     * The Type.
     * 
     */
    @SerializedName("type")
    @Expose
    public CallType type;

    /**
     * The Modalities.
     * 
     */
    @SerializedName("modalities")
    @Expose
    public java.util.List<Modality> modalities;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The End Date Time.
     * 
     */
    @SerializedName("endDateTime")
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Organizer.
     * 
     */
    @SerializedName("organizer")
    @Expose
    public IdentitySet organizer;

    /**
     * The Participants.
     * 
     */
    @SerializedName("participants")
    @Expose
    public java.util.List<IdentitySet> participants;

    /**
     * The Join Web Url.
     * 
     */
    @SerializedName("joinWebUrl")
    @Expose
    public String joinWebUrl;

    /**
     * The Sessions.
     * 
     */
    public SessionCollectionPage sessions;


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


        if (json.has("sessions")) {
            final SessionCollectionResponse response = new SessionCollectionResponse();
            if (json.has("sessions@odata.nextLink")) {
                response.nextLink = json.get("sessions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sessions").toString(), JsonObject[].class);
            final Session[] array = new Session[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Session.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sessions = new SessionCollectionPage(response, null);
        }
    }
}