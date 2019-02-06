package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.InlineResponse2003;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OtherApi
 */
public class OtherApiTest {

    private OtherApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(OtherApi.class);
    }

    
    /**
     * Who Am I
     *
     * Details about current API key
     */
    @Test
    public void whoamiGetTest() {
        // InlineResponse2003 response = api.whoamiGet();

        // TODO: test validations
    }

    
}
