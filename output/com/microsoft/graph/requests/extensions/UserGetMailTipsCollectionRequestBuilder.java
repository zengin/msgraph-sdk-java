// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.models.generated.MailTipsType;
import java.util.EnumSet;

import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Mail Tips Collection Request Builder.
 */
public class UserGetMailTipsCollectionRequestBuilder extends BaseActionRequestBuilder implements IUserGetMailTipsCollectionRequestBuilder {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param emailAddresses the emailAddresses
     * @param mailTipsOptions the mailTipsOptions
     */
    public UserGetMailTipsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<String> emailAddresses, final EnumSet<MailTipsType> mailTipsOptions) {
        super(requestUrl, client, requestOptions);
  	 if(emailAddresses!=null){
			bodyParams.put("emailAddresses", emailAddresses);
		}
    	 if(mailTipsOptions!=null){
			bodyParams.put("mailTipsOptions", mailTipsOptions);
		}
      }

    public IUserGetMailTipsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IUserGetMailTipsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserGetMailTipsCollectionRequest request = new UserGetMailTipsCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("emailAddresses")) {
            request.body.emailAddresses = getParameter("emailAddresses");
        }
        if (hasParameter("mailTipsOptions")) {
            request.body.mailTipsOptions = getParameter("mailTipsOptions");
        }
  
        return request;
    }
}
