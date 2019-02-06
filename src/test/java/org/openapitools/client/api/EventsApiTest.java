package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.EventResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
public class EventsApiTest {

    private EventsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(EventsApi.class);
    }

    
    /**
     * Update multiple events
     *
     * Update multiple profile events (for example mark them as a mismatch)
     */
    @Test
    public void profilesProfileIdEventsBulkUpdatePostTest() {
        String profileId = null;
        List<EventResource> eventResource = null;
        // List<EventResource> response = api.profilesProfileIdEventsBulkUpdatePost(profileId, eventResource);

        // TODO: test validations
    }

    
    /**
     * Get a profile event by ID
     *
     * Get details on a profile event
     */
    @Test
    public void profilesProfileIdEventsEventIdGetTest() {
        String profileId = null;
        String eventId = null;
        // EventResource response = api.profilesProfileIdEventsEventIdGet(profileId, eventId);

        // TODO: test validations
    }

    
    /**
     * Update a profile event
     *
     * Update profile event (for example mark it as a mismatch)
     */
    @Test
    public void profilesProfileIdEventsEventIdPostTest() {
        String profileId = null;
        String eventId = null;
        EventResource eventResource = null;
        // EventResource response = api.profilesProfileIdEventsEventIdPost(profileId, eventId, eventResource);

        // TODO: test validations
    }

    
    /**
     * Get a list of profile events
     *
     * Retrieve a list of all events on a profile
     */
    @Test
    public void profilesProfileIdEventsGetTest() {
        String profileId = null;
        // List<EventResource> response = api.profilesProfileIdEventsGet(profileId);

        // TODO: test validations
    }

    
    /**
     * Create a new profile event
     *
     * Create new event on a profile
     */
    @Test
    public void profilesProfileIdEventsPostTest() {
        String profileId = null;
        // TODO - JP CHANGED, WHAT WENT WRONG?        
        EventResource newEvent = null;
        // EventResource response = api.profilesProfileIdEventsPost(profileId, newEvent);

        // TODO: test validations
    }

    
}
