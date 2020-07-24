// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallRequest;
import com.microsoft.graph.requests.extensions.IParticipantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IParticipantRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsOperationRequestBuilder;
import com.microsoft.graph.models.extensions.MediaConfig;
import com.microsoft.graph.models.generated.Modality;
import com.microsoft.graph.requests.extensions.ICallAnswerRequestBuilder;
import com.microsoft.graph.models.generated.ScreenSharingRole;
import com.microsoft.graph.requests.extensions.ICallChangeScreenSharingRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallKeepAliveRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallMuteRequestBuilder;
import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.requests.extensions.ICallPlayPromptRequestBuilder;
import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.requests.extensions.ICallRecordResponseRequestBuilder;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.requests.extensions.ICallRedirectRequestBuilder;
import com.microsoft.graph.models.generated.RejectReason;
import com.microsoft.graph.requests.extensions.ICallRejectRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallSubscribeToToneRequestBuilder;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.requests.extensions.ICallTransferRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallUnmuteRequestBuilder;
import com.microsoft.graph.models.generated.RecordingStatus;
import com.microsoft.graph.requests.extensions.ICallUpdateRecordingStatusRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Call Request Builder.
 */
public interface ICallRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ICallRequest instance
     */
    ICallRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ICallRequest instance
     */
    ICallRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IParticipantCollectionRequestBuilder participants();

    IParticipantRequestBuilder participants(final String id);

    ICommsOperationCollectionRequestBuilder operations();

    ICommsOperationRequestBuilder operations(final String id);
    ICallAnswerRequestBuilder answer(final String callbackUri, final MediaConfig mediaConfig, final java.util.List<Modality> acceptedModalities);
    ICallChangeScreenSharingRoleRequestBuilder changeScreenSharingRole(final ScreenSharingRole role);
    ICallKeepAliveRequestBuilder keepAlive();
    ICallMuteRequestBuilder mute(final String clientContext);
    ICallPlayPromptRequestBuilder playPrompt(final java.util.List<Prompt> prompts, final String clientContext);
    ICallRecordResponseRequestBuilder recordResponse(final java.util.List<Prompt> prompts, final Boolean bargeInAllowed, final Integer initialSilenceTimeoutInSeconds, final Integer maxSilenceTimeoutInSeconds, final Integer maxRecordDurationInSeconds, final Boolean playBeep, final java.util.List<String> stopTones, final String clientContext);
    ICallRedirectRequestBuilder redirect(final java.util.List<InvitationParticipantInfo> targets, final Integer timeout, final String callbackUri);
    ICallRejectRequestBuilder reject(final RejectReason reason, final String callbackUri);
    ICallSubscribeToToneRequestBuilder subscribeToTone(final String clientContext);
    ICallTransferRequestBuilder transfer(final InvitationParticipantInfo transferTarget);
    ICallUnmuteRequestBuilder unmute(final String clientContext);
    ICallUpdateRecordingStatusRequestBuilder updateRecordingStatus(final RecordingStatus status, final String clientContext);

}
