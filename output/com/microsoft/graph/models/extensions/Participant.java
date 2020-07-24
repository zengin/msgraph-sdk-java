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
import com.microsoft.graph.models.extensions.ParticipantInfo;
import com.microsoft.graph.models.extensions.RecordingInfo;
import com.microsoft.graph.models.extensions.MediaStream;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant.
 */
public class Participant extends Entity implements IJsonBackedObject {


    /**
     * The Info.
     * 
     */
    @SerializedName("info")
    @Expose
    public ParticipantInfo info;

    /**
     * The Recording Info.
     * 
     */
    @SerializedName("recordingInfo")
    @Expose
    public RecordingInfo recordingInfo;

    /**
     * The Media Streams.
     * 
     */
    @SerializedName("mediaStreams")
    @Expose
    public java.util.List<MediaStream> mediaStreams;

    /**
     * The Is Muted.
     * 
     */
    @SerializedName("isMuted")
    @Expose
    public Boolean isMuted;

    /**
     * The Is In Lobby.
     * 
     */
    @SerializedName("isInLobby")
    @Expose
    public Boolean isInLobby;


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
