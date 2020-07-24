// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Audio;
import com.microsoft.graph.models.extensions.Deleted;
import com.microsoft.graph.models.extensions.File;
import com.microsoft.graph.models.extensions.FileSystemInfo;
import com.microsoft.graph.models.extensions.Folder;
import com.microsoft.graph.models.extensions.Image;
import com.microsoft.graph.models.extensions.GeoCoordinates;
import com.microsoft.graph.models.extensions.PendingOperations;
import com.microsoft.graph.models.extensions.Photo;
import com.microsoft.graph.models.extensions.PublicationFacet;
import com.microsoft.graph.models.extensions.RemoteItem;
import com.microsoft.graph.models.extensions.Root;
import com.microsoft.graph.models.extensions.SearchResult;
import com.microsoft.graph.models.extensions.Shared;
import com.microsoft.graph.models.extensions.SharepointIds;
import com.microsoft.graph.models.extensions.SpecialFolder;
import com.microsoft.graph.models.extensions.Video;
import com.microsoft.graph.models.extensions.Workbook;
import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.ListItem;
import com.microsoft.graph.models.extensions.Permission;
import com.microsoft.graph.models.extensions.Subscription;
import com.microsoft.graph.models.extensions.ThumbnailSet;
import com.microsoft.graph.models.extensions.DriveItemVersion;
import com.microsoft.graph.models.extensions.BaseItem;
import com.microsoft.graph.requests.extensions.DriveItemCollectionResponse;
import com.microsoft.graph.requests.extensions.DriveItemCollectionPage;
import com.microsoft.graph.requests.extensions.PermissionCollectionResponse;
import com.microsoft.graph.requests.extensions.PermissionCollectionPage;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionResponse;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionPage;
import com.microsoft.graph.requests.extensions.ThumbnailSetCollectionResponse;
import com.microsoft.graph.requests.extensions.ThumbnailSetCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemVersionCollectionResponse;
import com.microsoft.graph.requests.extensions.DriveItemVersionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item.
 */
public class DriveItem extends BaseItem implements IJsonBackedObject {


    /**
     * The Audio.
     * 
     */
    @SerializedName("audio")
    @Expose
    public Audio audio;

    /**
     * The CTag.
     * 
     */
    @SerializedName("cTag")
    @Expose
    public String cTag;

    /**
     * The Deleted.
     * 
     */
    @SerializedName("deleted")
    @Expose
    public Deleted deleted;

    /**
     * The File.
     * 
     */
    @SerializedName("file")
    @Expose
    public File file;

    /**
     * The File System Info.
     * 
     */
    @SerializedName("fileSystemInfo")
    @Expose
    public FileSystemInfo fileSystemInfo;

    /**
     * The Folder.
     * 
     */
    @SerializedName("folder")
    @Expose
    public Folder folder;

    /**
     * The Image.
     * 
     */
    @SerializedName("image")
    @Expose
    public Image image;

    /**
     * The Location.
     * 
     */
    @SerializedName("location")
    @Expose
    public GeoCoordinates location;

    /**
     * The Package.
     * 
     */
    @SerializedName("package")
    @Expose
    public com.microsoft.graph.models.extensions.Package msgraphpackage;

    /**
     * The Pending Operations.
     * 
     */
    @SerializedName("pendingOperations")
    @Expose
    public PendingOperations pendingOperations;

    /**
     * The Photo.
     * 
     */
    @SerializedName("photo")
    @Expose
    public Photo photo;

    /**
     * The Publication.
     * 
     */
    @SerializedName("publication")
    @Expose
    public PublicationFacet publication;

    /**
     * The Remote Item.
     * 
     */
    @SerializedName("remoteItem")
    @Expose
    public RemoteItem remoteItem;

    /**
     * The Root.
     * 
     */
    @SerializedName("root")
    @Expose
    public Root root;

    /**
     * The Search Result.
     * 
     */
    @SerializedName("searchResult")
    @Expose
    public SearchResult searchResult;

    /**
     * The Shared.
     * 
     */
    @SerializedName("shared")
    @Expose
    public Shared shared;

    /**
     * The Sharepoint Ids.
     * 
     */
    @SerializedName("sharepointIds")
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The Size.
     * 
     */
    @SerializedName("size")
    @Expose
    public Long size;

    /**
     * The Special Folder.
     * 
     */
    @SerializedName("specialFolder")
    @Expose
    public SpecialFolder specialFolder;

    /**
     * The Video.
     * 
     */
    @SerializedName("video")
    @Expose
    public Video video;

    /**
     * The Web Dav Url.
     * 
     */
    @SerializedName("webDavUrl")
    @Expose
    public String webDavUrl;

    /**
     * The Workbook.
     * 
     */
    @SerializedName("workbook")
    @Expose
    public Workbook workbook;

    /**
     * The Analytics.
     * 
     */
    @SerializedName("analytics")
    @Expose
    public ItemAnalytics analytics;

    /**
     * The Children.
     * 
     */
    public DriveItemCollectionPage children;

    /**
     * The List Item.
     * 
     */
    @SerializedName("listItem")
    @Expose
    public ListItem listItem;

    /**
     * The Permissions.
     * 
     */
    public PermissionCollectionPage permissions;

    /**
     * The Subscriptions.
     * 
     */
    public SubscriptionCollectionPage subscriptions;

    /**
     * The Thumbnails.
     * 
     */
    public ThumbnailSetCollectionPage thumbnails;

    /**
     * The Versions.
     * 
     */
    public DriveItemVersionCollectionPage versions;


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


        if (json.has("children")) {
            final DriveItemCollectionResponse response = new DriveItemCollectionResponse();
            if (json.has("children@odata.nextLink")) {
                response.nextLink = json.get("children@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("children").toString(), JsonObject[].class);
            final DriveItem[] array = new DriveItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DriveItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            children = new DriveItemCollectionPage(response, null);
        }

        if (json.has("permissions")) {
            final PermissionCollectionResponse response = new PermissionCollectionResponse();
            if (json.has("permissions@odata.nextLink")) {
                response.nextLink = json.get("permissions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("permissions").toString(), JsonObject[].class);
            final Permission[] array = new Permission[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Permission.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            permissions = new PermissionCollectionPage(response, null);
        }

        if (json.has("subscriptions")) {
            final SubscriptionCollectionResponse response = new SubscriptionCollectionResponse();
            if (json.has("subscriptions@odata.nextLink")) {
                response.nextLink = json.get("subscriptions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("subscriptions").toString(), JsonObject[].class);
            final Subscription[] array = new Subscription[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Subscription.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            subscriptions = new SubscriptionCollectionPage(response, null);
        }

        if (json.has("thumbnails")) {
            final ThumbnailSetCollectionResponse response = new ThumbnailSetCollectionResponse();
            if (json.has("thumbnails@odata.nextLink")) {
                response.nextLink = json.get("thumbnails@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("thumbnails").toString(), JsonObject[].class);
            final ThumbnailSet[] array = new ThumbnailSet[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ThumbnailSet.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            thumbnails = new ThumbnailSetCollectionPage(response, null);
        }

        if (json.has("versions")) {
            final DriveItemVersionCollectionResponse response = new DriveItemVersionCollectionResponse();
            if (json.has("versions@odata.nextLink")) {
                response.nextLink = json.get("versions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("versions").toString(), JsonObject[].class);
            final DriveItemVersion[] array = new DriveItemVersion[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DriveItemVersion.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            versions = new DriveItemVersionCollectionPage(response, null);
        }
    }
}
