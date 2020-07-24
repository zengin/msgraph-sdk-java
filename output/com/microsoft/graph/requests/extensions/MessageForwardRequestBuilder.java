// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMessageForwardRequest;
import com.microsoft.graph.requests.extensions.MessageForwardRequest;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Forward Request Builder.
 */
public class MessageForwardRequestBuilder extends BaseActionRequestBuilder implements IMessageForwardRequestBuilder {

    /**
     * The request builder for this MessageForward
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param toRecipients the toRecipients
     * @param message the message
     * @param comment the comment
     */
    public MessageForwardRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<Recipient> toRecipients, final Message message, final String comment) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("toRecipients", toRecipients);
        bodyParams.put("message", message);
        bodyParams.put("comment", comment);
    }

    /**
     * Creates the IMessageForwardRequest
     *
     * @return the IMessageForwardRequest instance
     */
    public IMessageForwardRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMessageForwardRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMessageForwardRequest instance
     */
    public IMessageForwardRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MessageForwardRequest request = new MessageForwardRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("toRecipients")) {
            request.body.toRecipients = getParameter("toRecipients");
        }

        if (hasParameter("message")) {
            request.body.message = getParameter("message");
        }

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        return request;
    }
}
