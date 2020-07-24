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
import com.microsoft.graph.models.extensions.ShiftItem;
import com.microsoft.graph.models.extensions.ChangeTrackedEntity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shift.
 */
public class Shift extends ChangeTrackedEntity implements IJsonBackedObject {


    /**
     * The Shared Shift.
     * 
     */
    @SerializedName("sharedShift")
    @Expose
    public ShiftItem sharedShift;

    /**
     * The Draft Shift.
     * 
     */
    @SerializedName("draftShift")
    @Expose
    public ShiftItem draftShift;

    /**
     * The User Id.
     * 
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The Scheduling Group Id.
     * 
     */
    @SerializedName("schedulingGroupId")
    @Expose
    public String schedulingGroupId;


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
