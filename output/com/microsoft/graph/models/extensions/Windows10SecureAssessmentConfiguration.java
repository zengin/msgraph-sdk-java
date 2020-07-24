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
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Secure Assessment Configuration.
 */
public class Windows10SecureAssessmentConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Launch Uri.
     * Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http[s]://msdn.microsoft.com/).
     */
    @SerializedName("launchUri")
    @Expose
    public String launchUri;

    /**
     * The Configuration Account.
     * The account used to configure the Windows device for taking the test. The user can be a domain account (domain&#92;user), an AAD account (username@tenant.com) or a local account (username).
     */
    @SerializedName("configurationAccount")
    @Expose
    public String configurationAccount;

    /**
     * The Allow Printing.
     * Indicates whether or not to allow the app from printing during the test.
     */
    @SerializedName("allowPrinting")
    @Expose
    public Boolean allowPrinting;

    /**
     * The Allow Screen Capture.
     * Indicates whether or not to allow screen capture capability during a test.
     */
    @SerializedName("allowScreenCapture")
    @Expose
    public Boolean allowScreenCapture;

    /**
     * The Allow Text Suggestion.
     * Indicates whether or not to allow text suggestions during the test.
     */
    @SerializedName("allowTextSuggestion")
    @Expose
    public Boolean allowTextSuggestion;


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