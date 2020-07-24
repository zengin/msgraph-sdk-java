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
import com.microsoft.graph.models.extensions.DomainDnsRecord;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Srv Record.
 */
public class DomainDnsSrvRecord extends DomainDnsRecord implements IJsonBackedObject {


    /**
     * The Name Target.
     * 
     */
    @SerializedName("nameTarget")
    @Expose
    public String nameTarget;

    /**
     * The Port.
     * 
     */
    @SerializedName("port")
    @Expose
    public Integer port;

    /**
     * The Priority.
     * 
     */
    @SerializedName("priority")
    @Expose
    public Integer priority;

    /**
     * The Protocol.
     * 
     */
    @SerializedName("protocol")
    @Expose
    public String protocol;

    /**
     * The Service.
     * 
     */
    @SerializedName("service")
    @Expose
    public String service;

    /**
     * The Weight.
     * 
     */
    @SerializedName("weight")
    @Expose
    public Integer weight;


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
