package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.CreateNoteResource;
import org.openapitools.client.model.NoteResource;
import org.openapitools.client.model.TaskResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TasksApi
 */
public class TasksApiTest {

    private TasksApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(TasksApi.class);
    }

    
    /**
     * Get all tasks on a profile
     *
     * Returns a list of tasks associated with a profile
     */
    @Test
    public void profilesProfileIdTasksGetTest() {
        String profileId = null;
        // List<TaskResource> response = api.profilesProfileIdTasksGet(profileId);

        // TODO: test validations
    }

    
    /**
     * Add a task to a profile
     *
     * As mentioned above, products have a default set of tasks which are automatically created when a user applies. However, if you want to add a task on a case by case basis, you can use this endpoint
     */
    @Test
    public void profilesProfileIdTasksPostTest() {
        String profileId = null;
        TaskResource taskResource = null;
        // TaskResource response = api.profilesProfileIdTasksPost(profileId, taskResource);

        // TODO: test validations
    }

    
    /**
     * Get a task
     *
     * Returns the specified task against a profile
     */
    @Test
    public void profilesProfileIdTasksTaskIdGetTest() {
        String profileId = null;
        String taskId = null;
        // TaskResource response = api.profilesProfileIdTasksTaskIdGet(profileId, taskId);

        // TODO: test validations
    }

    
    /**
     * Get notes on a task
     *
     * Get notes associated with a task on a profile
     */
    @Test
    public void profilesProfileIdTasksTaskIdNotesGetTest() {
        String profileId = null;
        String taskId = null;
        // List<NoteResource> response = api.profilesProfileIdTasksTaskIdNotesGet(profileId, taskId);

        // TODO: test validations
    }

    
    /**
     * Delete a note
     *
     * Remove a note from a task (will not be removed from audit log)
     */
    @Test
    public void profilesProfileIdTasksTaskIdNotesNoteIdDeleteTest() {
        String profileId = null;
        String taskId = null;
        String noteId = null;
        // Object response = api.profilesProfileIdTasksTaskIdNotesNoteIdDelete(profileId, taskId, noteId);

        // TODO: test validations
    }

    
    /**
     * Add a note to a task
     *
     * Add a note to a task on a profile
     */
    @Test
    public void profilesProfileIdTasksTaskIdNotesPostTest() {
        String profileId = null;
        String taskId = null;
        CreateNoteResource createNoteResource = null;
        // NoteResource response = api.profilesProfileIdTasksTaskIdNotesPost(profileId, taskId, createNoteResource);

        // TODO: test validations
    }

    
    /**
     * Complete a task
     *
     * Update the &#x60;is_complete&#x60; and &#x60;check_ids&#x60; fields on a task. All other fields are ignored
     */
    @Test
    public void profilesProfileIdTasksTaskIdPostTest() {
        String profileId = null;
        String taskId = null;
        TaskResource taskResource = null;
        // TaskResource response = api.profilesProfileIdTasksTaskIdPost(profileId, taskId, taskResource);

        // TODO: test validations
    }

    
}
