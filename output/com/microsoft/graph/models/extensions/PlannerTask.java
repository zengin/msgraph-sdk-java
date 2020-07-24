// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.generated.PlannerPreviewType;
import com.microsoft.graph.models.extensions.PlannerAppliedCategories;
import com.microsoft.graph.models.extensions.PlannerAssignments;
import com.microsoft.graph.models.extensions.PlannerTaskDetails;
import com.microsoft.graph.models.extensions.PlannerAssignedToTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.PlannerProgressTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.PlannerBucketTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Task.
 */
public class PlannerTask extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * 
     */
    @SerializedName("createdBy")
    @Expose
    public IdentitySet createdBy;

    /**
     * The Plan Id.
     * 
     */
    @SerializedName("planId")
    @Expose
    public String planId;

    /**
     * The Bucket Id.
     * 
     */
    @SerializedName("bucketId")
    @Expose
    public String bucketId;

    /**
     * The Title.
     * 
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Order Hint.
     * 
     */
    @SerializedName("orderHint")
    @Expose
    public String orderHint;

    /**
     * The Assignee Priority.
     * 
     */
    @SerializedName("assigneePriority")
    @Expose
    public String assigneePriority;

    /**
     * The Percent Complete.
     * 
     */
    @SerializedName("percentComplete")
    @Expose
    public Integer percentComplete;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Due Date Time.
     * 
     */
    @SerializedName("dueDateTime")
    @Expose
    public java.util.Calendar dueDateTime;

    /**
     * The Has Description.
     * 
     */
    @SerializedName("hasDescription")
    @Expose
    public Boolean hasDescription;

    /**
     * The Preview Type.
     * 
     */
    @SerializedName("previewType")
    @Expose
    public PlannerPreviewType previewType;

    /**
     * The Completed Date Time.
     * 
     */
    @SerializedName("completedDateTime")
    @Expose
    public java.util.Calendar completedDateTime;

    /**
     * The Completed By.
     * 
     */
    @SerializedName("completedBy")
    @Expose
    public IdentitySet completedBy;

    /**
     * The Reference Count.
     * 
     */
    @SerializedName("referenceCount")
    @Expose
    public Integer referenceCount;

    /**
     * The Checklist Item Count.
     * 
     */
    @SerializedName("checklistItemCount")
    @Expose
    public Integer checklistItemCount;

    /**
     * The Active Checklist Item Count.
     * 
     */
    @SerializedName("activeChecklistItemCount")
    @Expose
    public Integer activeChecklistItemCount;

    /**
     * The Applied Categories.
     * 
     */
    @SerializedName("appliedCategories")
    @Expose
    public PlannerAppliedCategories appliedCategories;

    /**
     * The Assignments.
     * 
     */
    @SerializedName("assignments")
    @Expose
    public PlannerAssignments assignments;

    /**
     * The Conversation Thread Id.
     * 
     */
    @SerializedName("conversationThreadId")
    @Expose
    public String conversationThreadId;

    /**
     * The Details.
     * 
     */
    @SerializedName("details")
    @Expose
    public PlannerTaskDetails details;

    /**
     * The Assigned To Task Board Format.
     * 
     */
    @SerializedName("assignedToTaskBoardFormat")
    @Expose
    public PlannerAssignedToTaskBoardTaskFormat assignedToTaskBoardFormat;

    /**
     * The Progress Task Board Format.
     * 
     */
    @SerializedName("progressTaskBoardFormat")
    @Expose
    public PlannerProgressTaskBoardTaskFormat progressTaskBoardFormat;

    /**
     * The Bucket Task Board Format.
     * 
     */
    @SerializedName("bucketTaskBoardFormat")
    @Expose
    public PlannerBucketTaskBoardTaskFormat bucketTaskBoardFormat;


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

    }
}
