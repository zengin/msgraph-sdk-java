// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRequest;
import com.microsoft.graph.requests.extensions.WorkbookRequest;
import com.microsoft.graph.requests.extensions.IWorkbookApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCommentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookCommentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCommentRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookCommentRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCreateSessionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookCreateSessionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCloseSessionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookCloseSessionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRefreshSessionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRefreshSessionRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Request Builder.
 */
public class WorkbookRequestBuilder extends BaseRequestBuilder implements IWorkbookRequestBuilder {

    /**
     * The request builder for the Workbook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookRequest instance
     */
    public IWorkbookRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookRequest instance
     */
    public IWorkbookRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookApplication
     *
     * @return the IWorkbookApplicationRequestBuilder instance
     */
    public IWorkbookApplicationRequestBuilder application() {
        return new WorkbookApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("application"), getClient(), null);
    }
    public IWorkbookNamedItemCollectionRequestBuilder names() {
        return new WorkbookNamedItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("names"), getClient(), null);
    }

    public IWorkbookNamedItemRequestBuilder names(final String id) {
        return new WorkbookNamedItemRequestBuilder(getRequestUrlWithAdditionalSegment("names") + "/" + id, getClient(), null);
    }
    public IWorkbookTableCollectionRequestBuilder tables() {
        return new WorkbookTableCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tables"), getClient(), null);
    }

    public IWorkbookTableRequestBuilder tables(final String id) {
        return new WorkbookTableRequestBuilder(getRequestUrlWithAdditionalSegment("tables") + "/" + id, getClient(), null);
    }
    public IWorkbookWorksheetCollectionRequestBuilder worksheets() {
        return new WorkbookWorksheetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("worksheets"), getClient(), null);
    }

    public IWorkbookWorksheetRequestBuilder worksheets(final String id) {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheets") + "/" + id, getClient(), null);
    }
    public IWorkbookCommentCollectionRequestBuilder comments() {
        return new WorkbookCommentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("comments"), getClient(), null);
    }

    public IWorkbookCommentRequestBuilder comments(final String id) {
        return new WorkbookCommentRequestBuilder(getRequestUrlWithAdditionalSegment("comments") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookFunctions
     *
     * @return the IWorkbookFunctionsRequestBuilder instance
     */
    public IWorkbookFunctionsRequestBuilder functions() {
        return new WorkbookFunctionsRequestBuilder(getRequestUrlWithAdditionalSegment("functions"), getClient(), null);
    }

    public IWorkbookCreateSessionRequestBuilder createSession(final Boolean persistChanges) {
        return new WorkbookCreateSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createSession"), getClient(), null, persistChanges);
    }

    public IWorkbookCloseSessionRequestBuilder closeSession() {
        return new WorkbookCloseSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.closeSession"), getClient(), null);
    }

    public IWorkbookRefreshSessionRequestBuilder refreshSession() {
        return new WorkbookRefreshSessionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.refreshSession"), getClient(), null);
    }
}
