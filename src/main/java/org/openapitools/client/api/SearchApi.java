package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.CountryCode;
import org.openapitools.client.model.InlineResponse2002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface SearchApi extends ApiClient.Api {


  /**
   * Search companies
   * Search a provider for company details
   * @param country The country to search within (required)
   * @param query The string to search. For Companies House and BREX by kompany this can be company number or name. DueDil and Bureau van Dijk only support search by name (required)
   * @param state The state to search within. This is required for US companies (optional)
   * @param provider DEPRECATED: Specify the provider to use for search. Search provider is now determined by your Company Registry Check configuration. (optional)
   * @return InlineResponse2002
   */
  @RequestLine("GET /search/companies?country={country}&state={state}&query={query}&provider={provider}")
  @Headers({
    "Accept: application/json",
  })
  InlineResponse2002 searchCompaniesGet(@Param("country") CountryCode country, @Param("query") String query, @Param("state") String state, @Param("provider") String provider);

  /**
   * Search companies
   * Search a provider for company details
   * Note, this is equivalent to the other <code>searchCompaniesGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchCompaniesGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>country - The country to search within (required)</li>
   *   <li>state - The state to search within. This is required for US companies (optional)</li>
   *   <li>query - The string to search. For Companies House and BREX by kompany this can be company number or name. DueDil and Bureau van Dijk only support search by name (required)</li>
   *   <li>provider - DEPRECATED: Specify the provider to use for search. Search provider is now determined by your Company Registry Check configuration. (optional)</li>
   *   </ul>
   * @return InlineResponse2002
   */
  @RequestLine("GET /search/companies?country={country}&state={state}&query={query}&provider={provider}")
  @Headers({
  "Accept: application/json",
  })
  InlineResponse2002 searchCompaniesGet(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>searchCompaniesGet</code> method in a fluent style.
   */
  public static class SearchCompaniesGetQueryParams extends HashMap<String, Object> {
    public SearchCompaniesGetQueryParams country(final CountryCode value) {
      put("country", EncodingUtils.encode(value));
      return this;
    }
    public SearchCompaniesGetQueryParams state(final String value) {
      put("state", EncodingUtils.encode(value));
      return this;
    }
    public SearchCompaniesGetQueryParams query(final String value) {
      put("query", EncodingUtils.encode(value));
      return this;
    }
    public SearchCompaniesGetQueryParams provider(final String value) {
      put("provider", EncodingUtils.encode(value));
      return this;
    }
  }
}
