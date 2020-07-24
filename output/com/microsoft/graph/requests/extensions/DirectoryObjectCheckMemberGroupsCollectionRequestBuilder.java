// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;

import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Check Member Groups Collection Request Builder.
 */
public class DirectoryObjectCheckMemberGroupsCollectionRequestBuilder extends BaseActionRequestBuilder implements IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param groupIds the groupIds
     */
    public DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<String> groupIds) {
        super(requestUrl, client, requestOptions);
  	 if(groupIds!=null){
			bodyParams.put("groupIds", groupIds);
		}
      }

    public IDirectoryObjectCheckMemberGroupsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDirectoryObjectCheckMemberGroupsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DirectoryObjectCheckMemberGroupsCollectionRequest request = new DirectoryObjectCheckMemberGroupsCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("groupIds")) {
            request.body.groupIds = getParameter("groupIds");
        }
  
        return request;
    }
}