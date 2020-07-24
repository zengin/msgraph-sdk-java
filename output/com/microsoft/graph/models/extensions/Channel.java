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
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.models.extensions.TeamsTab;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionResponse;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionPage;
import com.microsoft.graph.requests.extensions.TeamsTabCollectionResponse;
import com.microsoft.graph.requests.extensions.TeamsTabCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel.
 */
public class Channel extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Email.
     * 
     */
    @SerializedName("email")
    @Expose
    public String email;

    /**
     * The Web Url.
     * 
     */
    @SerializedName("webUrl")
    @Expose
    public String webUrl;

    /**
     * The Messages.
     * 
     */
    public ChatMessageCollectionPage messages;

    /**
     * The Tabs.
     * 
     */
    public TeamsTabCollectionPage tabs;

    /**
     * The Files Folder.
     * 
     */
    @SerializedName("filesFolder")
    @Expose
    public DriveItem filesFolder;


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


        if (json.has("messages")) {
            final ChatMessageCollectionResponse response = new ChatMessageCollectionResponse();
            if (json.has("messages@odata.nextLink")) {
                response.nextLink = json.get("messages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("messages").toString(), JsonObject[].class);
            final ChatMessage[] array = new ChatMessage[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ChatMessage.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            messages = new ChatMessageCollectionPage(response, null);
        }

        if (json.has("tabs")) {
            final TeamsTabCollectionResponse response = new TeamsTabCollectionResponse();
            if (json.has("tabs@odata.nextLink")) {
                response.nextLink = json.get("tabs@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tabs").toString(), JsonObject[].class);
            final TeamsTab[] array = new TeamsTab[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TeamsTab.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tabs = new TeamsTabCollectionPage(response, null);
        }
    }
}
