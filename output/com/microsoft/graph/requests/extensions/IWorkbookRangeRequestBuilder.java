// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRequest;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeSortRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeClearRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeDeleteRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeInsertRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeMergeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeUnmergeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeBoundingRectRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeCellRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnsAfterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnsAfterRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnsBeforeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnsBeforeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeEntireColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeEntireRowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeIntersectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeLastCellRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeLastColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeLastRowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeOffsetRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeResizedRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowsAboveRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowsAboveRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowsBelowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeRowsBelowRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeUsedRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeUsedRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookRangeVisibleViewRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Request Builder.
 */
public interface IWorkbookRangeRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookRangeRequest instance
     */
    IWorkbookRangeRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookRangeRequest instance
     */
    IWorkbookRangeRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    /**
     * Gets the request builder for WorkbookRangeFormat
     *
     * @return the IWorkbookRangeFormatRequestBuilder instance
     */
    IWorkbookRangeFormatRequestBuilder format();

    /**
     * Gets the request builder for WorkbookRangeSort
     *
     * @return the IWorkbookRangeSortRequestBuilder instance
     */
    IWorkbookRangeSortRequestBuilder sort();

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    IWorkbookWorksheetRequestBuilder worksheet();
    IWorkbookRangeClearRequestBuilder clear(final String applyTo);
    IWorkbookRangeDeleteRequestBuilder delete(final String shift);
    IWorkbookRangeInsertRequestBuilder insert(final String shift);
    IWorkbookRangeMergeRequestBuilder merge(final Boolean across);
    IWorkbookRangeUnmergeRequestBuilder unmerge();
    IWorkbookRangeBoundingRectRequestBuilder boundingRect(final String anotherRange);
    IWorkbookRangeCellRequestBuilder cell(final Integer row, final Integer column);
    IWorkbookRangeColumnRequestBuilder column(final Integer column);
    IWorkbookRangeColumnsAfterRequestBuilder columnsAfter();
    IWorkbookRangeColumnsAfterRequestBuilder columnsAfter(final Integer count);
    IWorkbookRangeColumnsBeforeRequestBuilder columnsBefore();
    IWorkbookRangeColumnsBeforeRequestBuilder columnsBefore(final Integer count);
    IWorkbookRangeEntireColumnRequestBuilder entireColumn();
    IWorkbookRangeEntireRowRequestBuilder entireRow();
    IWorkbookRangeIntersectionRequestBuilder intersection(final String anotherRange);
    IWorkbookRangeLastCellRequestBuilder lastCell();
    IWorkbookRangeLastColumnRequestBuilder lastColumn();
    IWorkbookRangeLastRowRequestBuilder lastRow();
    IWorkbookRangeOffsetRangeRequestBuilder offsetRange(final Integer rowOffset, final Integer columnOffset);
    IWorkbookRangeResizedRangeRequestBuilder resizedRange(final Integer deltaRows, final Integer deltaColumns);
    IWorkbookRangeRowRequestBuilder row(final Integer row);
    IWorkbookRangeRowsAboveRequestBuilder rowsAbove();
    IWorkbookRangeRowsAboveRequestBuilder rowsAbove(final Integer count);
    IWorkbookRangeRowsBelowRequestBuilder rowsBelow();
    IWorkbookRangeRowsBelowRequestBuilder rowsBelow(final Integer count);
    IWorkbookRangeUsedRangeRequestBuilder usedRange();
    IWorkbookRangeUsedRangeRequestBuilder usedRange(final Boolean valuesOnly);
    IWorkbookRangeVisibleViewRequestBuilder visibleView();

}
