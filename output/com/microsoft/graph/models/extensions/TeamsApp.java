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
import com.microsoft.graph.models.generated.TeamsAppDistributionMethod;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App.
 */
public class TeamsApp extends Entity implements IJsonBackedObject {


    /**
     * The External Id.
     * 
     */
    @SerializedName("externalId")
    @Expose
    public String externalId;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Distribution Method.
     * 
     */
    @SerializedName("distributionMethod")
    @Expose
    public TeamsAppDistributionMethod distributionMethod;

    /**
     * The App Definitions.
     * 
     */
    public TeamsAppDefinitionCollectionPage appDefinitions;


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


        if (json.has("appDefinitions")) {
            final TeamsAppDefinitionCollectionResponse response = new TeamsAppDefinitionCollectionResponse();
            if (json.has("appDefinitions@odata.nextLink")) {
                response.nextLink = json.get("appDefinitions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("appDefinitions").toString(), JsonObject[].class);
            final TeamsAppDefinition[] array = new TeamsAppDefinition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TeamsAppDefinition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            appDefinitions = new TeamsAppDefinitionCollectionPage(response, null);
        }
    }
}
