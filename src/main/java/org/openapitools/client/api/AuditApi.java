package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.AuditItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface AuditApi extends ApiClient.Api {


  /**
   * Get all audits for a profile
   * This returns a list of audit items associated with the profile
   * @param profileId The identifier for the profile (required)
   * @return List&lt;AuditItem&gt;
   */
  @RequestLine("GET /profiles/{profileId}/audit-items")
  @Headers({
    "Accept: application/json",
  })
  List<AuditItem> profilesProfileIdAuditItemsGet(@Param("profileId") String profileId);
}
