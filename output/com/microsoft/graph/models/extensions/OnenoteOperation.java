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
import com.microsoft.graph.models.extensions.OnenoteOperationError;
import com.microsoft.graph.models.extensions.Operation;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Operation.
 */
public class OnenoteOperation extends Operation implements IJsonBackedObject {


    /**
     * The Resource Location.
     * 
     */
    @SerializedName("resourceLocation")
    @Expose
    public String resourceLocation;

    /**
     * The Resource Id.
     * 
     */
    @SerializedName("resourceId")
    @Expose
    public String resourceId;

    /**
     * The Error.
     * 
     */
    @SerializedName("error")
    @Expose
    public OnenoteOperationError error;

    /**
     * The Percent Complete.
     * 
     */
    @SerializedName("percentComplete")
    @Expose
    public String percentComplete;


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
