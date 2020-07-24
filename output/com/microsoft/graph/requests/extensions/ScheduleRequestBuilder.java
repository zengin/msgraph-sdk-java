// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IScheduleRequest;
import com.microsoft.graph.requests.extensions.ScheduleRequest;
import com.microsoft.graph.requests.extensions.IShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.ShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.IOpenShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOpenShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffReasonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffReasonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffReasonRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffReasonRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchedulingGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchedulingGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchedulingGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.SchedulingGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ISwapShiftsChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISwapShiftsChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IOpenShiftChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOpenShiftChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IOfferShiftRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OfferShiftRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOfferShiftRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.OfferShiftRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITimeOffRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IScheduleShareRequestBuilder;
import com.microsoft.graph.requests.extensions.ScheduleShareRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Request Builder.
 */
public class ScheduleRequestBuilder extends BaseRequestBuilder implements IScheduleRequestBuilder {

    /**
     * The request builder for the Schedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ScheduleRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IScheduleRequest instance
     */
    public IScheduleRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IScheduleRequest instance
     */
    public IScheduleRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ScheduleRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IShiftCollectionRequestBuilder shifts() {
        return new ShiftCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("shifts"), getClient(), null);
    }

    public IShiftRequestBuilder shifts(final String id) {
        return new ShiftRequestBuilder(getRequestUrlWithAdditionalSegment("shifts") + "/" + id, getClient(), null);
    }
    public IOpenShiftCollectionRequestBuilder openShifts() {
        return new OpenShiftCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("openShifts"), getClient(), null);
    }

    public IOpenShiftRequestBuilder openShifts(final String id) {
        return new OpenShiftRequestBuilder(getRequestUrlWithAdditionalSegment("openShifts") + "/" + id, getClient(), null);
    }
    public ITimeOffCollectionRequestBuilder timesOff() {
        return new TimeOffCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("timesOff"), getClient(), null);
    }

    public ITimeOffRequestBuilder timesOff(final String id) {
        return new TimeOffRequestBuilder(getRequestUrlWithAdditionalSegment("timesOff") + "/" + id, getClient(), null);
    }
    public ITimeOffReasonCollectionRequestBuilder timeOffReasons() {
        return new TimeOffReasonCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("timeOffReasons"), getClient(), null);
    }

    public ITimeOffReasonRequestBuilder timeOffReasons(final String id) {
        return new TimeOffReasonRequestBuilder(getRequestUrlWithAdditionalSegment("timeOffReasons") + "/" + id, getClient(), null);
    }
    public ISchedulingGroupCollectionRequestBuilder schedulingGroups() {
        return new SchedulingGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("schedulingGroups"), getClient(), null);
    }

    public ISchedulingGroupRequestBuilder schedulingGroups(final String id) {
        return new SchedulingGroupRequestBuilder(getRequestUrlWithAdditionalSegment("schedulingGroups") + "/" + id, getClient(), null);
    }
    public ISwapShiftsChangeRequestCollectionRequestBuilder swapShiftsChangeRequests() {
        return new SwapShiftsChangeRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("swapShiftsChangeRequests"), getClient(), null);
    }

    public ISwapShiftsChangeRequestRequestBuilder swapShiftsChangeRequests(final String id) {
        return new SwapShiftsChangeRequestRequestBuilder(getRequestUrlWithAdditionalSegment("swapShiftsChangeRequests") + "/" + id, getClient(), null);
    }
    public IOpenShiftChangeRequestCollectionRequestBuilder openShiftChangeRequests() {
        return new OpenShiftChangeRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("openShiftChangeRequests"), getClient(), null);
    }

    public IOpenShiftChangeRequestRequestBuilder openShiftChangeRequests(final String id) {
        return new OpenShiftChangeRequestRequestBuilder(getRequestUrlWithAdditionalSegment("openShiftChangeRequests") + "/" + id, getClient(), null);
    }
    public IOfferShiftRequestCollectionRequestBuilder offerShiftRequests() {
        return new OfferShiftRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("offerShiftRequests"), getClient(), null);
    }

    public IOfferShiftRequestRequestBuilder offerShiftRequests(final String id) {
        return new OfferShiftRequestRequestBuilder(getRequestUrlWithAdditionalSegment("offerShiftRequests") + "/" + id, getClient(), null);
    }
    public ITimeOffRequestCollectionRequestBuilder timeOffRequests() {
        return new TimeOffRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("timeOffRequests"), getClient(), null);
    }

    public ITimeOffRequestRequestBuilder timeOffRequests(final String id) {
        return new TimeOffRequestRequestBuilder(getRequestUrlWithAdditionalSegment("timeOffRequests") + "/" + id, getClient(), null);
    }

    public IScheduleShareRequestBuilder share(final Boolean notifyTeam, final java.util.Calendar startDateTime, final java.util.Calendar endDateTime) {
        return new ScheduleShareRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.share"), getClient(), null, notifyTeam, startDateTime, endDateTime);
    }
}

