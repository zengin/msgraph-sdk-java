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
import com.microsoft.graph.models.extensions.WorkbookChartDataLabelFormat;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Data Labels.
 */
public class WorkbookChartDataLabels extends Entity implements IJsonBackedObject {


    /**
     * The Position.
     * 
     */
    @SerializedName("position")
    @Expose
    public String position;

    /**
     * The Separator.
     * 
     */
    @SerializedName("separator")
    @Expose
    public String separator;

    /**
     * The Show Bubble Size.
     * 
     */
    @SerializedName("showBubbleSize")
    @Expose
    public Boolean showBubbleSize;

    /**
     * The Show Category Name.
     * 
     */
    @SerializedName("showCategoryName")
    @Expose
    public Boolean showCategoryName;

    /**
     * The Show Legend Key.
     * 
     */
    @SerializedName("showLegendKey")
    @Expose
    public Boolean showLegendKey;

    /**
     * The Show Percentage.
     * 
     */
    @SerializedName("showPercentage")
    @Expose
    public Boolean showPercentage;

    /**
     * The Show Series Name.
     * 
     */
    @SerializedName("showSeriesName")
    @Expose
    public Boolean showSeriesName;

    /**
     * The Show Value.
     * 
     */
    @SerializedName("showValue")
    @Expose
    public Boolean showValue;

    /**
     * The Format.
     * 
     */
    @SerializedName("format")
    @Expose
    public WorkbookChartDataLabelFormat format;


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
