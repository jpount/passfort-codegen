package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.CheckResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface ChecksApi extends ApiClient.Api {


  /**
   * Manually approve a check
   * Generates a new check (checks are immutable and therefore not edited) from the specified check and sets the result to manually approved
   * @param profileId The identifier for the profile (required)
   * @param checkId The identifier for the specific check instance (required)
   * @return Object
   */
  @RequestLine("POST /profiles/{profileId}/checks/{checkId}/approve")
  @Headers({
    "Accept: application/json",
  })
  Object profilesProfileIdChecksCheckIdApprovePost(@Param("profileId") String profileId, @Param("checkId") String checkId);

  /**
   * Get results of a specific check
   * Returns the current status and result of an instructed check
   * @param profileId The identifier for the profile (required)
   * @param checkId The identifier for the specific check instance (required)
   * @return CheckResource
   */
  @RequestLine("GET /profiles/{profileId}/checks/{checkId}")
  @Headers({
    "Accept: application/json",
  })
  CheckResource profilesProfileIdChecksCheckIdGet(@Param("profileId") String profileId, @Param("checkId") String checkId);

  /**
   * Update the tasks associated with a check
   * Checks are immutable and their results cannot be edited. This endpoint will update the &#x60;task_ids&#x60; on a check, all other fields are ignored
   * @param profileId The identifier for the profile (required)
   * @param checkId The identifier for the specific check instance (required)
   * @param checkResource Request (optional)
   * @return CheckResource
   */
  @RequestLine("POST /profiles/{profileId}/checks/{checkId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CheckResource profilesProfileIdChecksCheckIdPost(@Param("profileId") String profileId, @Param("checkId") String checkId, CheckResource checkResource);

  /**
   * Manually reject a check
   * Generates a new check (checks are immutable and therefore not edited) from the specified check and sets the result to manually rejected
   * @param profileId The identifier for the profile (required)
   * @param checkId The identifier for the specific check instance (required)
   * @return Object
   */
  @RequestLine("POST /profiles/{profileId}/checks/{checkId}/reject")
  @Headers({
    "Accept: application/json",
  })
  Object profilesProfileIdChecksCheckIdRejectPost(@Param("profileId") String profileId, @Param("checkId") String checkId);

  /**
   * Get all checks run on a profile
   * Returns a list of checks associated with the profile
   * @param profileId The identifier for the profile (required)
   * @return List&lt;CheckResource&gt;
   */
  @RequestLine("GET /profiles/{profileId}/checks")
  @Headers({
    "Accept: application/json",
  })
  List<CheckResource> profilesProfileIdChecksGet(@Param("profileId") String profileId);

  /**
   * Run a check
   * Instruct a check on a profile
   * @param profileId The identifier for the profile (required)
   * @param checkResource Request (optional)
   * @return CheckResource
   */
  @RequestLine("POST /profiles/{profileId}/checks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CheckResource profilesProfileIdChecksPost(@Param("profileId") String profileId, CheckResource checkResource);
}
