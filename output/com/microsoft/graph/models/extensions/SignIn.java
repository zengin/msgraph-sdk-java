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
import com.microsoft.graph.models.extensions.SignInStatus;
import com.microsoft.graph.models.extensions.DeviceDetail;
import com.microsoft.graph.models.extensions.SignInLocation;
import com.microsoft.graph.models.generated.ConditionalAccessStatus;
import com.microsoft.graph.models.extensions.AppliedConditionalAccessPolicy;
import com.microsoft.graph.models.generated.RiskDetail;
import com.microsoft.graph.models.generated.RiskLevel;
import com.microsoft.graph.models.generated.RiskState;
import com.microsoft.graph.models.generated.RiskEventType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sign In.
 */
public class SignIn extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The User Display Name.
     * 
     */
    @SerializedName("userDisplayName")
    @Expose
    public String userDisplayName;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The User Id.
     * 
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The App Id.
     * 
     */
    @SerializedName("appId")
    @Expose
    public String appId;

    /**
     * The App Display Name.
     * 
     */
    @SerializedName("appDisplayName")
    @Expose
    public String appDisplayName;

    /**
     * The Ip Address.
     * 
     */
    @SerializedName("ipAddress")
    @Expose
    public String ipAddress;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public SignInStatus status;

    /**
     * The Client App Used.
     * 
     */
    @SerializedName("clientAppUsed")
    @Expose
    public String clientAppUsed;

    /**
     * The Device Detail.
     * 
     */
    @SerializedName("deviceDetail")
    @Expose
    public DeviceDetail deviceDetail;

    /**
     * The Location.
     * 
     */
    @SerializedName("location")
    @Expose
    public SignInLocation location;

    /**
     * The Correlation Id.
     * 
     */
    @SerializedName("correlationId")
    @Expose
    public String correlationId;

    /**
     * The Conditional Access Status.
     * 
     */
    @SerializedName("conditionalAccessStatus")
    @Expose
    public ConditionalAccessStatus conditionalAccessStatus;

    /**
     * The Applied Conditional Access Policies.
     * 
     */
    @SerializedName("appliedConditionalAccessPolicies")
    @Expose
    public java.util.List<AppliedConditionalAccessPolicy> appliedConditionalAccessPolicies;

    /**
     * The Is Interactive.
     * 
     */
    @SerializedName("isInteractive")
    @Expose
    public Boolean isInteractive;

    /**
     * The Risk Detail.
     * 
     */
    @SerializedName("riskDetail")
    @Expose
    public RiskDetail riskDetail;

    /**
     * The Risk Level Aggregated.
     * 
     */
    @SerializedName("riskLevelAggregated")
    @Expose
    public RiskLevel riskLevelAggregated;

    /**
     * The Risk Level During Sign In.
     * 
     */
    @SerializedName("riskLevelDuringSignIn")
    @Expose
    public RiskLevel riskLevelDuringSignIn;

    /**
     * The Risk State.
     * 
     */
    @SerializedName("riskState")
    @Expose
    public RiskState riskState;

    /**
     * The Risk Event Types.
     * 
     */
    @SerializedName("riskEventTypes")
    @Expose
    public java.util.List<RiskEventType> riskEventTypes;

    /**
     * The Risk Event Types_v2.
     * 
     */
    @SerializedName("riskEventTypes_v2")
    @Expose
    public java.util.List<String> riskEventTypes_v2;

    /**
     * The Resource Display Name.
     * 
     */
    @SerializedName("resourceDisplayName")
    @Expose
    public String resourceDisplayName;

    /**
     * The Resource Id.
     * 
     */
    @SerializedName("resourceId")
    @Expose
    public String resourceId;


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