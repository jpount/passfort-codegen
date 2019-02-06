package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.TagResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagsApi
 */
public class TagsApiTest {

    private TagsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(TagsApi.class);
    }

    
    /**
     * Add tag
     *
     * Add a tag to a profile
     */
    @Test
    public void profilesProfileIdTagsPostTest() {
        String profileId = null;
        TagResource tagResource = null;
        // TagResource response = api.profilesProfileIdTagsPost(profileId, tagResource);

        // TODO: test validations
    }

    
    /**
     * Remove tag
     *
     * Remove a tag from a profile
     */
    @Test
    public void profilesProfileIdTagsTagIdDeleteTest() {
        String profileId = null;
        String tagId = null;
        // TagResource response = api.profilesProfileIdTagsTagIdDelete(profileId, tagId);

        // TODO: test validations
    }

    
    /**
     * Search tags
     *
     * Search for a tag
     */
    @Test
    public void tagsSearchTermGetTest() {
        String term = null;
        Integer limit = null;
        // List<TagResource> response = api.tagsSearchTermGet(term, limit);

        // TODO: test validations
    }

    /**
     * Search tags
     *
     * Search for a tag
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void tagsSearchTermGetTestQueryMap() {
        String term = null;
        TagsApi.TagsSearchTermGetQueryParams queryParams = new TagsApi.TagsSearchTermGetQueryParams()
            .limit(null);
        // List<TagResource> response = api.tagsSearchTermGet(term, queryParams);

    // TODO: test validations
    }
    
}
