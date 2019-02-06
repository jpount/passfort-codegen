package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.CreateNoteResource;
import org.openapitools.client.model.NoteResource;
import org.openapitools.client.model.TaskResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface TasksApi extends ApiClient.Api {


  /**
   * Get all tasks on a profile
   * Returns a list of tasks associated with a profile
   * @param profileId The identifier for the profile (required)
   * @return List&lt;TaskResource&gt;
   */
  @RequestLine("GET /profiles/{profileId}/tasks")
  @Headers({
    "Accept: application/json",
  })
  List<TaskResource> profilesProfileIdTasksGet(@Param("profileId") String profileId);

  /**
   * Add a task to a profile
   * As mentioned above, products have a default set of tasks which are automatically created when a user applies. However, if you want to add a task on a case by case basis, you can use this endpoint
   * @param profileId The identifier for the profile (required)
   * @param taskResource Request (optional)
   * @return TaskResource
   */
  @RequestLine("POST /profiles/{profileId}/tasks")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TaskResource profilesProfileIdTasksPost(@Param("profileId") String profileId, TaskResource taskResource);

  /**
   * Get a task
   * Returns the specified task against a profile
   * @param profileId The identifier for the profile (required)
   * @param taskId The identifier for the task (required)
   * @return TaskResource
   */
  @RequestLine("GET /profiles/{profileId}/tasks/{taskId}")
  @Headers({
    "Accept: application/json",
  })
  TaskResource profilesProfileIdTasksTaskIdGet(@Param("profileId") String profileId, @Param("taskId") String taskId);

  /**
   * Get notes on a task
   * Get notes associated with a task on a profile
   * @param profileId The identifier for the profile (required)
   * @param taskId The identifier for the task (required)
   * @return List&lt;NoteResource&gt;
   */
  @RequestLine("GET /profiles/{profileId}/tasks/{taskId}/notes")
  @Headers({
    "Accept: application/json",
  })
  List<NoteResource> profilesProfileIdTasksTaskIdNotesGet(@Param("profileId") String profileId, @Param("taskId") String taskId);

  /**
   * Delete a note
   * Remove a note from a task (will not be removed from audit log)
   * @param profileId The identifier for the profile (required)
   * @param taskId The identifier for the task (required)
   * @param noteId The identifier for the note (required)
   * @return Object
   */
  @RequestLine("DELETE /profiles/{profileId}/tasks/{taskId}/notes/{noteId}")
  @Headers({
    "Accept: application/json",
  })
  Object profilesProfileIdTasksTaskIdNotesNoteIdDelete(@Param("profileId") String profileId, @Param("taskId") String taskId, @Param("noteId") String noteId);

  /**
   * Add a note to a task
   * Add a note to a task on a profile
   * @param profileId The identifier for the profile (required)
   * @param taskId The identifier for the task (required)
   * @param createNoteResource Request (optional)
   * @return NoteResource
   */
  @RequestLine("POST /profiles/{profileId}/tasks/{taskId}/notes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NoteResource profilesProfileIdTasksTaskIdNotesPost(@Param("profileId") String profileId, @Param("taskId") String taskId, CreateNoteResource createNoteResource);

  /**
   * Complete a task
   * Update the &#x60;is_complete&#x60; and &#x60;check_ids&#x60; fields on a task. All other fields are ignored
   * @param profileId The identifier for the profile (required)
   * @param taskId The identifier for the task (required)
   * @param taskResource Request (optional)
   * @return TaskResource
   */
  @RequestLine("POST /profiles/{profileId}/tasks/{taskId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TaskResource profilesProfileIdTasksTaskIdPost(@Param("profileId") String profileId, @Param("taskId") String taskId, TaskResource taskResource);
}
