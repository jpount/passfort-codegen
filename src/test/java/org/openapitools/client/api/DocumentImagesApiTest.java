package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.CreateFileResource;
import org.openapitools.client.model.DocumentImageResource;
import org.openapitools.client.model.FileResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentImagesApi
 */
public class DocumentImagesApiTest {

    private DocumentImagesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DocumentImagesApi.class);
    }

    
    /**
     * Get a document image
     *
     * Get information on a specific document image
     */
    @Test
    public void profilesProfileIdDocumentImagesDocumentImageIdGetTest() {
        String profileId = null;
        String documentImageId = null;
        // DocumentImageResource response = api.profilesProfileIdDocumentImagesDocumentImageIdGet(profileId, documentImageId);

        // TODO: test validations
    }

    
    /**
     * Get list of document images
     *
     * Get list of document images uploaded on a profile
     */
    @Test
    public void profilesProfileIdDocumentImagesGetTest() {
        String profileId = null;
        // List<DocumentImageResource> response = api.profilesProfileIdDocumentImagesGet(profileId);

        // TODO: test validations
    }

    
    /**
     * Upload a new document image
     *
     * This method allows you to submit a documnt image. It returns an &#x60;id&#x60; which can be used to reference the image in other data structures (typically as part of the document data structure)
     */
    @Test
    public void profilesProfileIdDocumentImagesPostTest() {
        String profileId = null;
        Map<String, Object> requestBody = null;
        // DocumentImageResource response = api.profilesProfileIdDocumentImagesPost(profileId, requestBody);

        // TODO: test validations
    }

    
    /**
     * Get a file by ID
     *
     * Request a file by ID
     */
    @Test
    public void profilesProfileIdFilesFileIdGetTest() {
        String profileId = null;
        String fileId = null;
        // FileResource response = api.profilesProfileIdFilesFileIdGet(profileId, fileId);

        // TODO: test validations
    }

    
    /**
     * Upload a new file
     *
     * This method allows you to submit a file
     */
    @Test
    public void profilesProfileIdFilesPostTest() {
        String profileId = null;
        CreateFileResource createFileResource = null;
        // FileResource response = api.profilesProfileIdFilesPost(profileId, createFileResource);

        // TODO: test validations
    }

    
}
