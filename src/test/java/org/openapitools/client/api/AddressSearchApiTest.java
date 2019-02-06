package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.CountryCode;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.StructuredAddress;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressSearchApi
 */
public class AddressSearchApiTest {

    private AddressSearchApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AddressSearchApi.class);
    }

    
    /**
     * Request a formatted address
     *
     * Request a full formatted address of a result returned from /address/search. Note this endpoint uses PassFort credits, for full details contact your account representative.
     */
    @Test
    public void addressFormatGetTest() {
        String id = null;
        CountryCode countryCode = null;
        // StructuredAddress response = api.addressFormatGet(id, countryCode);

        // TODO: test validations
    }

    /**
     * Request a formatted address
     *
     * Request a full formatted address of a result returned from /address/search. Note this endpoint uses PassFort credits, for full details contact your account representative.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void addressFormatGetTestQueryMap() {
        AddressSearchApi.AddressFormatGetQueryParams queryParams = new AddressSearchApi.AddressFormatGetQueryParams()
            .id(null)
            .countryCode(null);
        // StructuredAddress response = api.addressFormatGet(queryParams);

    // TODO: test validations
    }
    
    /**
     * Search for formatted address by string
     *
     * This endpoint returns addresses from a free text search, the full formatted address can then be requested from /address/format/.
     */
    @Test
    public void addressSearchGetTest() {
        String address = null;
        CountryCode countryCode = null;
        Integer limit = null;
        // InlineResponse200 response = api.addressSearchGet(address, countryCode, limit);

        // TODO: test validations
    }

    /**
     * Search for formatted address by string
     *
     * This endpoint returns addresses from a free text search, the full formatted address can then be requested from /address/format/.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void addressSearchGetTestQueryMap() {
        AddressSearchApi.AddressSearchGetQueryParams queryParams = new AddressSearchApi.AddressSearchGetQueryParams()
            .address(null)
            .countryCode(null)
            .limit(null);
        // InlineResponse200 response = api.addressSearchGet(queryParams);

    // TODO: test validations
    }
    
}
