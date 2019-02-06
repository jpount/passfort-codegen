package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.EventResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface EventsApi extends ApiClient.Api {


  /**
   * Update multiple events
   * Update multiple profile events (for example mark them as a mismatch)
   * @param profileId The identifier for the profile (required)
   * @param eventResource Request (optional)
   * @return List&lt;EventResource&gt;
   */
  @RequestLine("POST /profiles/{profileId}/events/bulk_update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<EventResource> profilesProfileIdEventsBulkUpdatePost(@Param("profileId") String profileId, List<EventResource> eventResource);

  /**
   * Get a profile event by ID
   * Get details on a profile event
   * @param profileId The identifier for the profile (required)
   * @param eventId The identifier for the event (required)
   * @return EventResource
   */
  @RequestLine("GET /profiles/{profileId}/events/{eventId}")
  @Headers({
    "Accept: application/json",
  })
  EventResource profilesProfileIdEventsEventIdGet(@Param("profileId") String profileId, @Param("eventId") String eventId);

  /**
   * Update a profile event
   * Update profile event (for example mark it as a mismatch)
   * @param profileId The identifier for the profile (required)
   * @param eventId The identifier for the event (required)
   * @param eventResource Request (optional)
   * @return EventResource
   */
  @RequestLine("POST /profiles/{profileId}/events/{eventId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EventResource profilesProfileIdEventsEventIdPost(@Param("profileId") String profileId, @Param("eventId") String eventId, EventResource eventResource);

  /**
   * Get a list of profile events
   * Retrieve a list of all events on a profile
   * @param profileId The identifier for the profile (required)
   * @return List&lt;EventResource&gt;
   */
  @RequestLine("GET /profiles/{profileId}/events")
  @Headers({
    "Accept: application/json",
  })
  List<EventResource> profilesProfileIdEventsGet(@Param("profileId") String profileId);

  /**
   * Create a new profile event
   * Create new event on a profile
   * @param profileId The identifier for the profile (required)
   * @param UNKNOWN_BASE_TYPE Request (optional)
   * @return EventResource
   */
  @RequestLine("POST /profiles/{profileId}/events")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  // TODO - JP CHANGED, WHAT WENT WRONG?
  EventResource profilesProfileIdEventsPost(@Param("profileId") String profileId, EventResource eventResource);
}
