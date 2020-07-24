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
 * The interface for the Workbook Chart Series Collection Request Builder.
 */
public interface IWorkbookChartSeriesCollectionRequestBuilder extends IRequestBuilder {

    IWorkbookChartSeriesCollectionRequest buildRequest();

    IWorkbookChartSeriesCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWorkbookChartSeriesRequestBuilder byId(final String id);

    IWorkbookChartSeriesItemAtRequestBuilder itemAt(final Integer index);
    IWorkbookChartSeriesCountRequestBuilder count();
}