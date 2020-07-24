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
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.generated.ChatMessageType;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.ChatMessageAttachment;
import com.microsoft.graph.models.extensions.ChatMessageMention;
import com.microsoft.graph.models.generated.ChatMessageImportance;
import com.microsoft.graph.models.extensions.ChatMessagePolicyViolation;
import com.microsoft.graph.models.extensions.ChatMessageReaction;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.models.extensions.ChatMessageHostedContent;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionResponse;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionPage;
import com.microsoft.graph.requests.extensions.ChatMessageHostedContentCollectionResponse;
import com.microsoft.graph.requests.extensions.ChatMessageHostedContentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message.
 */
public class ChatMessage extends Entity implements IJsonBackedObject {


    /**
     * The Reply To Id.
     * 
     */
    @SerializedName("replyToId")
    @Expose
    public String replyToId;

    /**
     * The From.
     * 
     */
    @SerializedName("from")
    @Expose
    public IdentitySet from;

    /**
     * The Etag.
     * 
     */
    @SerializedName("etag")
    @Expose
    public String etag;

    /**
     * The Message Type.
     * 
     */
    @SerializedName("messageType")
    @Expose
    public ChatMessageType messageType;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Deleted Date Time.
     * 
     */
    @SerializedName("deletedDateTime")
    @Expose
    public java.util.Calendar deletedDateTime;

    /**
     * The Subject.
     * 
     */
    @SerializedName("subject")
    @Expose
    public String subject;

    /**
     * The Body.
     * 
     */
    @SerializedName("body")
    @Expose
    public ItemBody body;

    /**
     * The Summary.
     * 
     */
    @SerializedName("summary")
    @Expose
    public String summary;

    /**
     * The Attachments.
     * 
     */
    @SerializedName("attachments")
    @Expose
    public java.util.List<ChatMessageAttachment> attachments;

    /**
     * The Mentions.
     * 
     */
    @SerializedName("mentions")
    @Expose
    public java.util.List<ChatMessageMention> mentions;

    /**
     * The Importance.
     * 
     */
    @SerializedName("importance")
    @Expose
    public ChatMessageImportance importance;

    /**
     * The Policy Violation.
     * 
     */
    @SerializedName("policyViolation")
    @Expose
    public ChatMessagePolicyViolation policyViolation;

    /**
     * The Reactions.
     * 
     */
    @SerializedName("reactions")
    @Expose
    public java.util.List<ChatMessageReaction> reactions;

    /**
     * The Locale.
     * 
     */
    @SerializedName("locale")
    @Expose
    public String locale;

    /**
     * The Web Url.
     * 
     */
    @SerializedName("webUrl")
    @Expose
    public String webUrl;

    /**
     * The Replies.
     * 
     */
    public ChatMessageCollectionPage replies;

    /**
     * The Hosted Contents.
     * 
     */
    public ChatMessageHostedContentCollectionPage hostedContents;


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


        if (json.has("replies")) {
            final ChatMessageCollectionResponse response = new ChatMessageCollectionResponse();
            if (json.has("replies@odata.nextLink")) {
                response.nextLink = json.get("replies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("replies").toString(), JsonObject[].class);
            final ChatMessage[] array = new ChatMessage[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ChatMessage.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            replies = new ChatMessageCollectionPage(response, null);
        }

        if (json.has("hostedContents")) {
            final ChatMessageHostedContentCollectionResponse response = new ChatMessageHostedContentCollectionResponse();
            if (json.has("hostedContents@odata.nextLink")) {
                response.nextLink = json.get("hostedContents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("hostedContents").toString(), JsonObject[].class);
            final ChatMessageHostedContent[] array = new ChatMessageHostedContent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ChatMessageHostedContent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            hostedContents = new ChatMessageHostedContentCollectionPage(response, null);
        }
    }
}
