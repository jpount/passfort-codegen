package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.CheckResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChecksApi
 */
public class ChecksApiTest {

    private ChecksApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ChecksApi.class);
    }

    
    /**
     * Manually approve a check
     *
     * Generates a new check (checks are immutable and therefore not edited) from the specified check and sets the result to manually approved
     */
    @Test
    public void profilesProfileIdChecksCheckIdApprovePostTest() {
        String profileId = null;
        String checkId = null;
        // Object response = api.profilesProfileIdChecksCheckIdApprovePost(profileId, checkId);

        // TODO: test validations
    }

    
    /**
     * Get results of a specific check
     *
     * Returns the current status and result of an instructed check
     */
    @Test
    public void profilesProfileIdChecksCheckIdGetTest() {
        String profileId = null;
        String checkId = null;
        // CheckResource response = api.profilesProfileIdChecksCheckIdGet(profileId, checkId);

        // TODO: test validations
    }

    
    /**
     * Update the tasks associated with a check
     *
     * Checks are immutable and their results cannot be edited. This endpoint will update the &#x60;task_ids&#x60; on a check, all other fields are ignored
     */
    @Test
    public void profilesProfileIdChecksCheckIdPostTest() {
        String profileId = null;
        String checkId = null;
        CheckResource checkResource = null;
        // CheckResource response = api.profilesProfileIdChecksCheckIdPost(profileId, checkId, checkResource);

        // TODO: test validations
    }

    
    /**
     * Manually reject a check
     *
     * Generates a new check (checks are immutable and therefore not edited) from the specified check and sets the result to manually rejected
     */
    @Test
    public void profilesProfileIdChecksCheckIdRejectPostTest() {
        String profileId = null;
        String checkId = null;
        // Object response = api.profilesProfileIdChecksCheckIdRejectPost(profileId, checkId);

        // TODO: test validations
    }

    
    /**
     * Get all checks run on a profile
     *
     * Returns a list of checks associated with the profile
     */
    @Test
    public void profilesProfileIdChecksGetTest() {
        String profileId = null;
        // List<CheckResource> response = api.profilesProfileIdChecksGet(profileId);

        // TODO: test validations
    }

    
    /**
     * Run a check
     *
     * Instruct a check on a profile
     */
    @Test
    public void profilesProfileIdChecksPostTest() {
        String profileId = null;
        CheckResource checkResource = null;
        // CheckResource response = api.profilesProfileIdChecksPost(profileId, checkResource);

        // TODO: test validations
    }

    
}
