package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.AuditItem;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuditApi
 */
public class AuditApiTest {

    private AuditApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AuditApi.class);
    }

    
    /**
     * Get all audits for a profile
     *
     * This returns a list of audit items associated with the profile
     */
    @Test
    public void profilesProfileIdAuditItemsGetTest() {
        String profileId = null;
        // List<AuditItem> response = api.profilesProfileIdAuditItemsGet(profileId);

        // TODO: test validations
    }

    
}
