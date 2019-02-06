package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.InlineResponse2003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface OtherApi extends ApiClient.Api {


  /**
   * Who Am I
   * Details about current API key
   * @return InlineResponse2003
   */
  @RequestLine("GET /whoami")
  @Headers({
    "Accept: application/json",
  })
  InlineResponse2003 whoamiGet();
}
