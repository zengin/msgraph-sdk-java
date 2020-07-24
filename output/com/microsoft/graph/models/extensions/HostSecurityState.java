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


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Security State.
 */
public class HostSecurityState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Fqdn.
     * 
     */
    @SerializedName("fqdn")
    @Expose
    public String fqdn;

    /**
     * The Is Azure Ad Joined.
     * 
     */
    @SerializedName("isAzureAdJoined")
    @Expose
    public Boolean isAzureAdJoined;

    /**
     * The Is Azure Ad Registered.
     * 
     */
    @SerializedName("isAzureAdRegistered")
    @Expose
    public Boolean isAzureAdRegistered;

    /**
     * The Is Hybrid Azure Domain Joined.
     * 
     */
    @SerializedName("isHybridAzureDomainJoined")
    @Expose
    public Boolean isHybridAzureDomainJoined;

    /**
     * The Net Bios Name.
     * 
     */
    @SerializedName("netBiosName")
    @Expose
    public String netBiosName;

    /**
     * The Os.
     * 
     */
    @SerializedName("os")
    @Expose
    public String os;

    /**
     * The Private Ip Address.
     * 
     */
    @SerializedName("privateIpAddress")
    @Expose
    public String privateIpAddress;

    /**
     * The Public Ip Address.
     * 
     */
    @SerializedName("publicIpAddress")
    @Expose
    public String publicIpAddress;

    /**
     * The Risk Score.
     * 
     */
    @SerializedName("riskScore")
    @Expose
    public String riskScore;


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
