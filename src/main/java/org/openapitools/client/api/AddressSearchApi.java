package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.CountryCode;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.StructuredAddress;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface AddressSearchApi extends ApiClient.Api {


  /**
   * Request a formatted address
   * Request a full formatted address of a result returned from /address/search. Note this endpoint uses PassFort credits, for full details contact your account representative.
   * @param id The address ID taken from querying /address/search (required)
   * @param countryCode The three letter country code of the address (required)
   * @return StructuredAddress
   */
  @RequestLine("GET /address/format?id={id}&country_code={countryCode}")
  @Headers({
    "Accept: application/json",
  })
  StructuredAddress addressFormatGet(@Param("id") String id, @Param("countryCode") CountryCode countryCode);

  /**
   * Request a formatted address
   * Request a full formatted address of a result returned from /address/search. Note this endpoint uses PassFort credits, for full details contact your account representative.
   * Note, this is equivalent to the other <code>addressFormatGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddressFormatGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>id - The address ID taken from querying /address/search (required)</li>
   *   <li>countryCode - The three letter country code of the address (required)</li>
   *   </ul>
   * @return StructuredAddress
   */
  @RequestLine("GET /address/format?id={id}&country_code={countryCode}")
  @Headers({
  "Accept: application/json",
  })
  StructuredAddress addressFormatGet(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>addressFormatGet</code> method in a fluent style.
   */
  public static class AddressFormatGetQueryParams extends HashMap<String, Object> {
    public AddressFormatGetQueryParams id(final String value) {
      put("id", EncodingUtils.encode(value));
      return this;
    }
    public AddressFormatGetQueryParams countryCode(final CountryCode value) {
      put("country_code", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Search for formatted address by string
   * This endpoint returns addresses from a free text search, the full formatted address can then be requested from /address/format/.
   * @param address The free text of an address to search. Maximum length 200. (required)
   * @param countryCode The three letter country code of the address (required)
   * @param limit Number of results to return, default 7, maximum 100 (optional)
   * @return InlineResponse200
   */
  @RequestLine("GET /address/search?address={address}&country_code={countryCode}&limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  InlineResponse200 addressSearchGet(@Param("address") String address, @Param("countryCode") CountryCode countryCode, @Param("limit") Integer limit);

  /**
   * Search for formatted address by string
   * This endpoint returns addresses from a free text search, the full formatted address can then be requested from /address/format/.
   * Note, this is equivalent to the other <code>addressSearchGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddressSearchGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>address - The free text of an address to search. Maximum length 200. (required)</li>
   *   <li>countryCode - The three letter country code of the address (required)</li>
   *   <li>limit - Number of results to return, default 7, maximum 100 (optional)</li>
   *   </ul>
   * @return InlineResponse200
   */
  @RequestLine("GET /address/search?address={address}&country_code={countryCode}&limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  InlineResponse200 addressSearchGet(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>addressSearchGet</code> method in a fluent style.
   */
  public static class AddressSearchGetQueryParams extends HashMap<String, Object> {
    public AddressSearchGetQueryParams address(final String value) {
      put("address", EncodingUtils.encode(value));
      return this;
    }
    public AddressSearchGetQueryParams countryCode(final CountryCode value) {
      put("country_code", EncodingUtils.encode(value));
      return this;
    }
    public AddressSearchGetQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }
}
