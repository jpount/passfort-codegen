package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ProductApplication;
import org.openapitools.client.model.ProductApplicationRevertDecision;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationsApi
 */
public class ApplicationsApiTest {

    private ApplicationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ApplicationsApi.class);
    }

    
    /**
     * Get a product application
     *
     * Returns the specified production application against a profile
     */
    @Test
    public void profilesProfileIdApplicationsApplicationIdGetTest() {
        String profileId = null;
        String applicationId = null;
        // ProductApplication response = api.profilesProfileIdApplicationsApplicationIdGet(profileId, applicationId);

        // TODO: test validations
    }

    
    /**
     * Update a product application
     *
     * Update the status of a product application, e.g. to approve it
     */
    @Test
    public void profilesProfileIdApplicationsApplicationIdPostTest() {
        String profileId = null;
        String applicationId = null;
        ProductApplication productApplication = null;
        // ProductApplication response = api.profilesProfileIdApplicationsApplicationIdPost(profileId, applicationId, productApplication);

        // TODO: test validations
    }

    
    /**
     * Revert application decision
     *
     * Recreate an application in case it was accidentally rejected or cancelled
     */
    @Test
    public void profilesProfileIdApplicationsApplicationIdRevertDecisionPostTest() {
        String profileId = null;
        String applicationId = null;
        ProductApplicationRevertDecision productApplicationRevertDecision = null;
        // ProductApplication response = api.profilesProfileIdApplicationsApplicationIdRevertDecisionPost(profileId, applicationId, productApplicationRevertDecision);

        // TODO: test validations
    }

    
    /**
     * Get all product applications on profile
     *
     * Returns a list of product applications associated with a profile
     */
    @Test
    public void profilesProfileIdApplicationsGetTest() {
        String profileId = null;
        // List<ProductApplication> response = api.profilesProfileIdApplicationsGet(profileId);

        // TODO: test validations
    }

    
    /**
     * Create a product application
     *
     * Create a new product application on a profile
     */
    @Test
    public void profilesProfileIdApplicationsPostTest() {
        String profileId = null;
        ProductApplication productApplication = null;
        // ProductApplication response = api.profilesProfileIdApplicationsPost(profileId, productApplication);

        // TODO: test validations
    }

    
}
