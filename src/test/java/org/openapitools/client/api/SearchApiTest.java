package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.CountryCode;
import org.openapitools.client.model.InlineResponse2002;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
public class SearchApiTest {

    private SearchApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SearchApi.class);
    }

    
    /**
     * Search companies
     *
     * Search a provider for company details
     */
    @Test
    public void searchCompaniesGetTest() {
        CountryCode country = null;
        String query = null;
        String state = null;
        String provider = null;
        // InlineResponse2002 response = api.searchCompaniesGet(country, query, state, provider);

        // TODO: test validations
    }

    /**
     * Search companies
     *
     * Search a provider for company details
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void searchCompaniesGetTestQueryMap() {
        SearchApi.SearchCompaniesGetQueryParams queryParams = new SearchApi.SearchCompaniesGetQueryParams()
            .country(null)
            .state(null)
            .query(null)
            .provider(null);
        // InlineResponse2002 response = api.searchCompaniesGet(queryParams);

    // TODO: test validations
    }
    
}
