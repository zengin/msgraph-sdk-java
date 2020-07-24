// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IChatMessageHostedContentRequest;
import com.microsoft.graph.requests.extensions.ChatMessageHostedContentRequest;
import com.microsoft.graph.models.extensions.ChatMessageHostedContent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Hosted Content Request.
 */
public class ChatMessageHostedContentRequest extends BaseRequest implements IChatMessageHostedContentRequest {
	
    /**
     * The request for the ChatMessageHostedContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatMessageHostedContentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChatMessageHostedContent.class);
    }

    /**
     * Gets the ChatMessageHostedContent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ChatMessageHostedContent> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ChatMessageHostedContent from the service
     *
     * @return the ChatMessageHostedContent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChatMessageHostedContent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ChatMessageHostedContent> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ChatMessageHostedContent with a source
     *
     * @param sourceChatMessageHostedContent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ChatMessageHostedContent sourceChatMessageHostedContent, final ICallback<ChatMessageHostedContent> callback) {
        send(HttpMethod.PATCH, callback, sourceChatMessageHostedContent);
    }

    /**
     * Patches this ChatMessageHostedContent with a source
     *
     * @param sourceChatMessageHostedContent the source object with updates
     * @return the updated ChatMessageHostedContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChatMessageHostedContent patch(final ChatMessageHostedContent sourceChatMessageHostedContent) throws ClientException {
        return send(HttpMethod.PATCH, sourceChatMessageHostedContent);
    }

    /**
     * Creates a ChatMessageHostedContent with a new object
     *
     * @param newChatMessageHostedContent the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ChatMessageHostedContent newChatMessageHostedContent, final ICallback<ChatMessageHostedContent> callback) {
        send(HttpMethod.POST, callback, newChatMessageHostedContent);
    }

    /**
     * Creates a ChatMessageHostedContent with a new object
     *
     * @param newChatMessageHostedContent the new object to create
     * @return the created ChatMessageHostedContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChatMessageHostedContent post(final ChatMessageHostedContent newChatMessageHostedContent) throws ClientException {
        return send(HttpMethod.POST, newChatMessageHostedContent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IChatMessageHostedContentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ChatMessageHostedContentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IChatMessageHostedContentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ChatMessageHostedContentRequest)this;
     }

}
