package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.ProductApplication;
import org.openapitools.client.model.ProductApplicationRevertDecision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface ApplicationsApi extends ApiClient.Api {


  /**
   * Get a product application
   * Returns the specified production application against a profile
   * @param profileId The identifier for the profile (required)
   * @param applicationId The identifier for the application (required)
   * @return ProductApplication
   */
  @RequestLine("GET /profiles/{profileId}/applications/{applicationId}")
  @Headers({
    "Accept: application/json",
  })
  ProductApplication profilesProfileIdApplicationsApplicationIdGet(@Param("profileId") String profileId, @Param("applicationId") String applicationId);

  /**
   * Update a product application
   * Update the status of a product application, e.g. to approve it
   * @param profileId The identifier for the profile (required)
   * @param applicationId The identifier for the application (required)
   * @param productApplication Request (optional)
   * @return ProductApplication
   */
  @RequestLine("POST /profiles/{profileId}/applications/{applicationId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ProductApplication profilesProfileIdApplicationsApplicationIdPost(@Param("profileId") String profileId, @Param("applicationId") String applicationId, ProductApplication productApplication);

  /**
   * Revert application decision
   * Recreate an application in case it was accidentally rejected or cancelled
   * @param profileId The identifier for the profile (required)
   * @param applicationId The identifier for the application (required)
   * @param productApplicationRevertDecision Request (optional)
   * @return ProductApplication
   */
  @RequestLine("POST /profiles/{profileId}/applications/{applicationId}/revert_decision")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ProductApplication profilesProfileIdApplicationsApplicationIdRevertDecisionPost(@Param("profileId") String profileId, @Param("applicationId") String applicationId, ProductApplicationRevertDecision productApplicationRevertDecision);

  /**
   * Get all product applications on profile
   * Returns a list of product applications associated with a profile
   * @param profileId The identifier for the profile (required)
   * @return List&lt;ProductApplication&gt;
   */
  @RequestLine("GET /profiles/{profileId}/applications")
  @Headers({
    "Accept: application/json",
  })
  List<ProductApplication> profilesProfileIdApplicationsGet(@Param("profileId") String profileId);

  /**
   * Create a product application
   * Create a new product application on a profile
   * @param profileId The identifier for the profile (required)
   * @param productApplication Request (optional)
   * @return ProductApplication
   */
  @RequestLine("POST /profiles/{profileId}/applications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ProductApplication profilesProfileIdApplicationsPost(@Param("profileId") String profileId, ProductApplication productApplication);
}
