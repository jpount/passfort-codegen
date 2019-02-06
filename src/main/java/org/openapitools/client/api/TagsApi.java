package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.TagResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface TagsApi extends ApiClient.Api {


  /**
   * Add tag
   * Add a tag to a profile
   * @param profileId The identifier for the profile (required)
   * @param tagResource Request (optional)
   * @return TagResource
   */
  @RequestLine("POST /profiles/{profileId}/tags")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TagResource profilesProfileIdTagsPost(@Param("profileId") String profileId, TagResource tagResource);

  /**
   * Remove tag
   * Remove a tag from a profile
   * @param profileId The identifier for the profile (required)
   * @param tagId The id of the tag to be removed (required)
   * @return TagResource
   */
  @RequestLine("DELETE /profiles/{profileId}/tags/{tagId}")
  @Headers({
    "Accept: application/json",
  })
  TagResource profilesProfileIdTagsTagIdDelete(@Param("profileId") String profileId, @Param("tagId") String tagId);

  /**
   * Search tags
   * Search for a tag
   * @param term A search term to find all similarly named tags (required)
   * @param limit Number of results to return, returns all results by default. (optional)
   * @return List&lt;TagResource&gt;
   */
  @RequestLine("GET /tags/search/{term}?limit={limit}")
  @Headers({
    "Accept: application/json",
  })
  List<TagResource> tagsSearchTermGet(@Param("term") String term, @Param("limit") Integer limit);

  /**
   * Search tags
   * Search for a tag
   * Note, this is equivalent to the other <code>tagsSearchTermGet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TagsSearchTermGetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param term A search term to find all similarly named tags (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - Number of results to return, returns all results by default. (optional)</li>
   *   </ul>
   * @return List&lt;TagResource&gt;
   */
  @RequestLine("GET /tags/search/{term}?limit={limit}")
  @Headers({
  "Accept: application/json",
  })
  List<TagResource> tagsSearchTermGet(@Param("term") String term, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>tagsSearchTermGet</code> method in a fluent style.
   */
  public static class TagsSearchTermGetQueryParams extends HashMap<String, Object> {
    public TagsSearchTermGetQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
  }
}
