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
import com.microsoft.graph.models.extensions.ItemActionStat;
import com.microsoft.graph.models.extensions.IncompleteData;
import com.microsoft.graph.models.extensions.ItemActivity;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ItemActivityCollectionResponse;
import com.microsoft.graph.requests.extensions.ItemActivityCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Stat.
 */
public class ItemActivityStat extends Entity implements IJsonBackedObject {


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
     * The Access.
     * 
     */
    @SerializedName("access")
    @Expose
    public ItemActionStat access;

    /**
     * The Create.
     * 
     */
    @SerializedName("create")
    @Expose
    public ItemActionStat create;

    /**
     * The Delete.
     * 
     */
    @SerializedName("delete")
    @Expose
    public ItemActionStat delete;

    /**
     * The Edit.
     * 
     */
    @SerializedName("edit")
    @Expose
    public ItemActionStat edit;

    /**
     * The Move.
     * 
     */
    @SerializedName("move")
    @Expose
    public ItemActionStat move;

    /**
     * The Is Trending.
     * 
     */
    @SerializedName("isTrending")
    @Expose
    public Boolean isTrending;

    /**
     * The Incomplete Data.
     * 
     */
    @SerializedName("incompleteData")
    @Expose
    public IncompleteData incompleteData;

    /**
     * The Activities.
     * 
     */
    public ItemActivityCollectionPage activities;


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


        if (json.has("activities")) {
            final ItemActivityCollectionResponse response = new ItemActivityCollectionResponse();
            if (json.has("activities@odata.nextLink")) {
                response.nextLink = json.get("activities@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("activities").toString(), JsonObject[].class);
            final ItemActivity[] array = new ItemActivity[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ItemActivity.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            activities = new ItemActivityCollectionPage(response, null);
        }
    }
}