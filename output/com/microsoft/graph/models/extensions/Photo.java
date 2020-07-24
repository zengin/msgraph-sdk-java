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
 * The class for the Photo.
 */
public class Photo implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Camera Make.
     * 
     */
    @SerializedName("cameraMake")
    @Expose
    public String cameraMake;

    /**
     * The Camera Model.
     * 
     */
    @SerializedName("cameraModel")
    @Expose
    public String cameraModel;

    /**
     * The Exposure Denominator.
     * 
     */
    @SerializedName("exposureDenominator")
    @Expose
    public Double exposureDenominator;

    /**
     * The Exposure Numerator.
     * 
     */
    @SerializedName("exposureNumerator")
    @Expose
    public Double exposureNumerator;

    /**
     * The FNumber.
     * 
     */
    @SerializedName("fNumber")
    @Expose
    public Double fNumber;

    /**
     * The Focal Length.
     * 
     */
    @SerializedName("focalLength")
    @Expose
    public Double focalLength;

    /**
     * The Iso.
     * 
     */
    @SerializedName("iso")
    @Expose
    public Integer iso;

    /**
     * The Orientation.
     * 
     */
    @SerializedName("orientation")
    @Expose
    public Integer orientation;

    /**
     * The Taken Date Time.
     * 
     */
    @SerializedName("takenDateTime")
    @Expose
    public java.util.Calendar takenDateTime;


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