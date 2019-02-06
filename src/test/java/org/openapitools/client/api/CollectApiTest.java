package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.CollectionStep;
import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineResponse2001;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollectApi
 */
public class CollectApiTest {

    private CollectApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CollectApi.class);
    }

    
    /**
     * Create collect API key for multiple profiles
     *
     * Generates an API key for multiple profiles to use with the collect API
     */
    @Test
    public void apiKeysCollectPostTest() {
        InlineObject inlineObject = null;
        // InlineResponse2001 response = api.apiKeysCollectPost(inlineObject);

        // TODO: test validations
    }

    
    /**
     * Create collect API key
     *
     * Generates an API key for a single profile to use with the Collect API
     */
    @Test
    public void apiKeysCollectProfileIdPostTest() {
        String profileId = null;
        // InlineResponse2001 response = api.apiKeysCollectProfileIdPost(profileId);

        // TODO: test validations
    }

    
    /**
     * Get a list of collection steps
     *
     * Get a list of collection steps on a profile
     */
    @Test
    public void profilesProfileIdCollectionStepsGetTest() {
        String profileId = null;
        // List<CollectionStep> response = api.profilesProfileIdCollectionStepsGet(profileId);

        // TODO: test validations
    }

    
    /**
     * Update profile collection steps
     *
     * Replace the collection steps on a profile
     */
    @Test
    public void profilesProfileIdCollectionStepsPostTest() {
        String profileId = null;
        List<CollectionStep> collectionStep = null;
        // List<CollectionStep> response = api.profilesProfileIdCollectionStepsPost(profileId, collectionStep);

        // TODO: test validations
    }

    
}
