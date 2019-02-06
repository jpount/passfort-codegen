package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Document;
import org.openapitools.client.model.EntityData;
import org.openapitools.client.model.ProfileResource;
import org.openapitools.client.model.ProfileSearchResults;
import org.openapitools.client.model.ProfileStatus;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfilesApi
 */
public class ProfilesApiTest {

    private ProfilesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ProfilesApi.class);
    }

    
    /**
     * Get list of profiles
     *
     * This gets all profiles on your account. Query parameters can be used to filter the profiles.  This returns minimal information on each profile
     */
    @Test
    public void profilesGetTest() {
        String q = null;
        Integer limit = null;
        Integer offset = null;
        String categories = null;
        // ProfileSearchResults response = api.profilesGet(q, limit, offset, categories);

        // TODO: test validations
    }

    /**
     * Get list of profiles
     *
     * This gets all profiles on your account. Query parameters can be used to filter the profiles.  This returns minimal information on each profile
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void profilesGetTestQueryMap() {
        ProfilesApi.ProfilesGetQueryParams queryParams = new ProfilesApi.ProfilesGetQueryParams()
            .q(null)
            .limit(null)
            .offset(null)
            .categories(null);
        // ProfileSearchResults response = api.profilesGet(queryParams);

    // TODO: test validations
    }
    
    /**
     * Create a profile
     *
     * Create a new profile. You will need specify the _role_ of the customer, which will define what rules apply to that customer
     */
    @Test
    public void profilesPostTest() {
        // TODO - JP CHANGED, WHAT WENT WRONG?
        ProfileResource newProfile = null;
        // ProfileResource response = api.profilesPost(newProfile);

        // TODO: test validations
    }

    
    /**
     * Add a document
     *
     * This is a convenience method to add a document to collected_data without having to &#x60;POST&#x60; the entirety of the collected_data
     */
    @Test
    public void profilesProfileIdCollectedDataDocumentsPostTest() {
        String profileId = null;
        Document document = null;
        // Document response = api.profilesProfileIdCollectedDataDocumentsPost(profileId, document);

        // TODO: test validations
    }

    
    /**
     * Get collected data
     *
     * Returns the data which has been collected from the user
     */
    @Test
    public void profilesProfileIdCollectedDataGetTest() {
        String profileId = null;
        // EntityData response = api.profilesProfileIdCollectedDataGet(profileId);

        // TODO: test validations
    }

    
    /**
     * Update collected data
     *
     * This allows you to update the collected data on the profile. This may be to either add more information collected from the customer, or to amend previously submitted information.  PassFort does **not** merge data submitted. New data will **replace** the profile&#39;s existing &#x60;collected_data&#x60;.  Note that updating data (e.g. amending a date of birth) may invalidate the results of your previously run checks. PassFort does not currently handle this for you, and you will need to explicitly detect and rerun these checks
     */
    @Test
    public void profilesProfileIdCollectedDataPostTest() {
        String profileId = null;
        EntityData entityData = null;
        // EntityData response = api.profilesProfileIdCollectedDataPost(profileId, entityData);

        // TODO: test validations
    }

    
    /**
     * Get a profile
     *
     * Returns detailed information a profile. This includes the collected data, details on the checks that have been run, and information on a profile&#39;s ongoing applications and tasks
     */
    @Test
    public void profilesProfileIdGetTest() {
        String profileId = null;
        // ProfileResource response = api.profilesProfileIdGet(profileId);

        // TODO: test validations
    }

    
    /**
     * Get profile status
     *
     * This returns whether a profile has been suspended or banned
     */
    @Test
    public void profilesProfileIdStatusGetTest() {
        String profileId = null;
        // ProfileStatus response = api.profilesProfileIdStatusGet(profileId);

        // TODO: test validations
    }

    
    /**
     * Change profile status
     *
     * Change the status of a profile
     */
    @Test
    public void profilesProfileIdStatusPostTest() {
        String profileId = null;
        String body = null;
        // ProfileStatus response = api.profilesProfileIdStatusPost(profileId, body);

        // TODO: test validations
    }

    
}
