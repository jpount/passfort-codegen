package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.Document;
import org.openapitools.client.model.EntityData;
import org.openapitools.client.model.ProfileResource;
import org.openapitools.client.model.ProfileSearchResults;
import org.openapitools.client.model.ProfileStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface ProfilesApi extends ApiClient.Api {


  /**
   * Get list of profiles
   * This gets all profiles on your account. Query parameters can be used to filter the profiles.  This returns minimal information on each profile
   * @param q A query string. This allows profiles to be searched. PassFort allows searching over names and tags (optional)
   * @param limit The maximum number of profiles to return in the query. Can be used in conjunction with _offset_ to paginate results. Defaults to &#x60;50&#x60;, maximum value is &#x60;200&#x60; (optional)
   * @param offset The number of profiles to skip when returning. Can be used in conjunction with _limit_ to paginate results. Defaults to &#x60;0&#x60; (optional)
   * @param categories A comma seperated list of ProfileCategory to be included in response e.g. &#x60;CUSTOMER&#x60; (optional)
   * @return ProfileSearchResults
   */
  @RequestLine("GET /profiles?q={q}&limit={limit}&offset={offset}&categories={categories}")
  @Headers({
    "Accept: application/json",
  })
  ProfileSearchResults profilesGet(@Param("q") String q, @Param("limit") Integer limit, @Param("offset") Integer offset, @Param("categories") String categories);

  /**
   * Get list of profiles
   * This gets all profiles on your account. Query parameters can be used to filter the profiles.  This returns minimal information on each profile
   * Note, this is equivalent to the other <code>profilesGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ProfilesGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>q - A query string. This allows profiles to be searched. PassFort allows searching over names and tags (optional)</li>
   *   <li>limit - The maximum number of profiles to return in the query. Can be used in conjunction with _offset_ to paginate results. Defaults to &#x60;50&#x60;, maximum value is &#x60;200&#x60; (optional)</li>
   *   <li>offset - The number of profiles to skip when returning. Can be used in conjunction with _limit_ to paginate results. Defaults to &#x60;0&#x60; (optional)</li>
   *   <li>categories - A comma seperated list of ProfileCategory to be included in response e.g. &#x60;CUSTOMER&#x60; (optional)</li>
   *   </ul>
   * @return ProfileSearchResults
   */
  @RequestLine("GET /profiles?q={q}&limit={limit}&offset={offset}&categories={categories}")
  @Headers({
  "Accept: application/json",
  })
  ProfileSearchResults profilesGet(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>profilesGet</code> method in a fluent style.
   */
  public static class ProfilesGetQueryParams extends HashMap<String, Object> {
    public ProfilesGetQueryParams q(final String value) {
      put("q", EncodingUtils.encode(value));
      return this;
    }
    public ProfilesGetQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ProfilesGetQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
    public ProfilesGetQueryParams categories(final String value) {
      put("categories", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create a profile
   * Create a new profile. You will need specify the _role_ of the customer, which will define what rules apply to that customer
   * @param UNKNOWN_BASE_TYPE Request (optional)
   * @return ProfileResource
   */
  @RequestLine("POST /profiles")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  // TODO - JP CHANGED, WHAT WENT WRONG?
  ProfileResource profilesPost(ProfileResource ProfileResource);

  /**
   * Add a document
   * This is a convenience method to add a document to collected_data without having to &#x60;POST&#x60; the entirety of the collected_data
   * @param profileId The identifier for the profile (required)
   * @param document Request (optional)
   * @return Document
   */
  @RequestLine("POST /profiles/{profileId}/collected_data/documents")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Document profilesProfileIdCollectedDataDocumentsPost(@Param("profileId") String profileId, Document document);

  /**
   * Get collected data
   * Returns the data which has been collected from the user
   * @param profileId The identifier for the profile (required)
   * @return EntityData
   */
  @RequestLine("GET /profiles/{profileId}/collected_data")
  @Headers({
    "Accept: application/json",
  })
  EntityData profilesProfileIdCollectedDataGet(@Param("profileId") String profileId);

  /**
   * Update collected data
   * This allows you to update the collected data on the profile. This may be to either add more information collected from the customer, or to amend previously submitted information.  PassFort does **not** merge data submitted. New data will **replace** the profile&#39;s existing &#x60;collected_data&#x60;.  Note that updating data (e.g. amending a date of birth) may invalidate the results of your previously run checks. PassFort does not currently handle this for you, and you will need to explicitly detect and rerun these checks
   * @param profileId The identifier for the profile (required)
   * @param entityData Request (optional)
   * @return EntityData
   */
  @RequestLine("POST /profiles/{profileId}/collected_data")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EntityData profilesProfileIdCollectedDataPost(@Param("profileId") String profileId, EntityData entityData);

  /**
   * Get a profile
   * Returns detailed information a profile. This includes the collected data, details on the checks that have been run, and information on a profile&#39;s ongoing applications and tasks
   * @param profileId The identifier for the profile (required)
   * @return ProfileResource
   */
  @RequestLine("GET /profiles/{profileId}")
  @Headers({
    "Accept: application/json",
  })
  ProfileResource profilesProfileIdGet(@Param("profileId") String profileId);

  /**
   * Get profile status
   * This returns whether a profile has been suspended or banned
   * @param profileId The identifier for the profile (required)
   * @return ProfileStatus
   */
  @RequestLine("GET /profiles/{profileId}/status")
  @Headers({
    "Accept: application/json",
  })
  ProfileStatus profilesProfileIdStatusGet(@Param("profileId") String profileId);

  /**
   * Change profile status
   * Change the status of a profile
   * @param profileId The identifier for the profile (required)
   * @param body Request (optional)
   * @return ProfileStatus
   */
  @RequestLine("POST /profiles/{profileId}/status")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ProfileStatus profilesProfileIdStatusPost(@Param("profileId") String profileId, String body);
}
