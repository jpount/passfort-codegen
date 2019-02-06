package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.CollectionStep;
import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineResponse2001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface CollectApi extends ApiClient.Api {


  /**
   * Create collect API key for multiple profiles
   * Generates an API key for multiple profiles to use with the collect API
   * @param inlineObject  (optional)
   * @return InlineResponse2001
   */
  @RequestLine("POST /api_keys/collect")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  InlineResponse2001 apiKeysCollectPost(InlineObject inlineObject);

  /**
   * Create collect API key
   * Generates an API key for a single profile to use with the Collect API
   * @param profileId The identifier for the profile (required)
   * @return InlineResponse2001
   */
  @RequestLine("POST /api_keys/collect/{profileId}")
  @Headers({
    "Accept: application/json",
  })
  InlineResponse2001 apiKeysCollectProfileIdPost(@Param("profileId") String profileId);

  /**
   * Get a list of collection steps
   * Get a list of collection steps on a profile
   * @param profileId The identifier for the profile (required)
   * @return List&lt;CollectionStep&gt;
   */
  @RequestLine("GET /profiles/{profileId}/collection_steps")
  @Headers({
    "Accept: application/json",
  })
  List<CollectionStep> profilesProfileIdCollectionStepsGet(@Param("profileId") String profileId);

  /**
   * Update profile collection steps
   * Replace the collection steps on a profile
   * @param profileId The identifier for the profile (required)
   * @param collectionStep Request (optional)
   * @return List&lt;CollectionStep&gt;
   */
  @RequestLine("POST /profiles/{profileId}/collection_steps")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<CollectionStep> profilesProfileIdCollectionStepsPost(@Param("profileId") String profileId, List<CollectionStep> collectionStep);
}
