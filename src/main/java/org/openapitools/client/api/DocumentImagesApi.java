package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.CreateFileResource;
import org.openapitools.client.model.DocumentImageResource;
import org.openapitools.client.model.FileResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-06T16:01:27.451+11:00[Australia/Sydney]")
public interface DocumentImagesApi extends ApiClient.Api {


  /**
   * Get a document image
   * Get information on a specific document image
   * @param profileId The identifier for the profile (required)
   * @param documentImageId The identifier for the document image (required)
   * @return DocumentImageResource
   */
  @RequestLine("GET /profiles/{profileId}/document_images/{documentImageId}")
  @Headers({
    "Accept: application/json",
  })
  DocumentImageResource profilesProfileIdDocumentImagesDocumentImageIdGet(@Param("profileId") String profileId, @Param("documentImageId") String documentImageId);

  /**
   * Get list of document images
   * Get list of document images uploaded on a profile
   * @param profileId The identifier for the profile (required)
   * @return List&lt;DocumentImageResource&gt;
   */
  @RequestLine("GET /profiles/{profileId}/document_images")
  @Headers({
    "Accept: application/json",
  })
  List<DocumentImageResource> profilesProfileIdDocumentImagesGet(@Param("profileId") String profileId);

  /**
   * Upload a new document image
   * This method allows you to submit a documnt image. It returns an &#x60;id&#x60; which can be used to reference the image in other data structures (typically as part of the document data structure)
   * @param profileId The identifier for the profile (required)
   * @param requestBody Request (optional)
   * @return DocumentImageResource
   */
  @RequestLine("POST /profiles/{profileId}/document_images")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DocumentImageResource profilesProfileIdDocumentImagesPost(@Param("profileId") String profileId, Map<String, Object> requestBody);

  /**
   * Get a file by ID
   * Request a file by ID
   * @param profileId The identifier for the profile (required)
   * @param fileId The identifier for the file (required)
   * @return FileResource
   */
  @RequestLine("GET /profiles/{profileId}/files/{fileId}")
  @Headers({
    "Accept: application/json",
  })
  FileResource profilesProfileIdFilesFileIdGet(@Param("profileId") String profileId, @Param("fileId") String fileId);

  /**
   * Upload a new file
   * This method allows you to submit a file
   * @param profileId The identifier for the profile (required)
   * @param createFileResource Request (optional)
   * @return FileResource
   */
  @RequestLine("POST /profiles/{profileId}/files")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FileResource profilesProfileIdFilesPost(@Param("profileId") String profileId, CreateFileResource createFileResource);
}
