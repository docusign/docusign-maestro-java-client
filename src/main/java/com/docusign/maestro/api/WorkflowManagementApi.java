
package com.docusign.maestro.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.maestro.client.ApiException;
import com.docusign.maestro.client.ApiClient;
import com.docusign.maestro.client.Configuration;
import com.docusign.maestro.model.*;
import com.docusign.maestro.client.Pair;
import com.docusign.maestro.client.ApiResponse;




/**
 * WorkflowManagementApi class.
 *
 **/
public class WorkflowManagementApi {
  private ApiClient apiClient;

 /**
  * WorkflowManagementApi.
  *
  **/
  public WorkflowManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * WorkflowManagementApi.
  *
  **/
  public WorkflowManagementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

 /**
  * getApiClient Method.
  *
  * @return ApiClient
  **/
  public ApiClient getApiClient() {
    return apiClient;
  }

 /**
  * setApiClient Method.
  *
  **/
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Creates a new workflow definition..
   * Creates a new workflow definition.
   * @param accountId Account ID (required)
   * @param body Request Body to create a new workflow definition. (required)
   * @return NewOrUpdatedWorkflowDefinitionResponse
   * @throws ApiException if fails to make API call
   */
  public NewOrUpdatedWorkflowDefinitionResponse createWorkflowDefinition(String accountId, CreateOrUpdateWorkflowDefinitionRequestBody body) throws ApiException {
    ApiResponse<NewOrUpdatedWorkflowDefinitionResponse> localVarResponse = createWorkflowDefinitionWithHttpInfo(accountId, body);
    return localVarResponse.getData();
  }

  /**
   * Creates a new workflow definition.
   * Creates a new workflow definition.
   * @param accountId Account ID (required)
   * @param body Request Body to create a new workflow definition. (required)
   * @return NewOrUpdatedWorkflowDefinitionResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NewOrUpdatedWorkflowDefinitionResponse > createWorkflowDefinitionWithHttpInfo(String accountId, CreateOrUpdateWorkflowDefinitionRequestBody body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createWorkflowDefinition");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "aow-manage/v1.0/management/accounts/{accountId}/workflowDefinitions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<NewOrUpdatedWorkflowDefinitionResponse> localVarReturnType = new GenericType<NewOrUpdatedWorkflowDefinitionResponse>() {};
    NewOrUpdatedWorkflowDefinitionResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NewOrUpdatedWorkflowDefinitionResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes a workflow definition..
   * Deletes a workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @return WorkflowDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public WorkflowDeleteResponse deleteWorkflowDefinition(String accountId, String workflowDefinitionId) throws ApiException {
    ApiResponse<WorkflowDeleteResponse> localVarResponse = deleteWorkflowDefinitionWithHttpInfo(accountId, workflowDefinitionId);
    return localVarResponse.getData();
  }

  /**
   * Deletes a workflow definition.
   * Deletes a workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @return WorkflowDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkflowDeleteResponse > deleteWorkflowDefinitionWithHttpInfo(String accountId, String workflowDefinitionId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteWorkflowDefinition");
    }
    
    // verify the required parameter 'workflowDefinitionId' is set
    if (workflowDefinitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowDefinitionId' when calling deleteWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "aow-manage/v1.0/management/accounts/{accountId}/workflowDefinitions/{workflowDefinitionId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workflowDefinitionId" + "\\}", apiClient.escapeString(workflowDefinitionId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<WorkflowDeleteResponse> localVarReturnType = new GenericType<WorkflowDeleteResponse>() {};
    WorkflowDeleteResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkflowDeleteResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Get Workflow Definition Returns a workflow definition.
  /// </summary>

 /**
  * GetWorkflowDefinitionOptions Class.
  *
  **/
  public class GetWorkflowDefinitionOptions
  {
  private String lastDeployedId = null;
  
 /**
  * setLastDeployedId method.
  */
  public void setLastDeployedId(String lastDeployedId) {
    this.lastDeployedId = lastDeployedId;
  }

 /**
  * getLastDeployedId method.
  *
  * @return String
  */
  public String getLastDeployedId() {
    return this.lastDeployedId;
  }
  }

   /**
   * Get Workflow Definition.
   * Returns a workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @return WorkflowDefinitionWithId
   */ 
  public WorkflowDefinitionWithId getWorkflowDefinition(String accountId, String workflowDefinitionId) throws ApiException {
    return getWorkflowDefinition(accountId, workflowDefinitionId, null);
  }

  /**
   * Get Workflow Definition.
   * Returns a workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @param options for modifying the method behavior.
   * @return WorkflowDefinitionWithId
   * @throws ApiException if fails to make API call
   */
  public WorkflowDefinitionWithId getWorkflowDefinition(String accountId, String workflowDefinitionId, WorkflowManagementApi.GetWorkflowDefinitionOptions options) throws ApiException {
    ApiResponse<WorkflowDefinitionWithId> localVarResponse = getWorkflowDefinitionWithHttpInfo(accountId, workflowDefinitionId, options);
    return localVarResponse.getData();
  }

  /**
   * Get Workflow Definition
   * Returns a workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @param options for modifying the method behavior.
   * @return WorkflowDefinitionWithId
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkflowDefinitionWithId > getWorkflowDefinitionWithHttpInfo(String accountId, String workflowDefinitionId, WorkflowManagementApi.GetWorkflowDefinitionOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWorkflowDefinition");
    }
    
    // verify the required parameter 'workflowDefinitionId' is set
    if (workflowDefinitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowDefinitionId' when calling getWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "aow-manage/v1.0/management/accounts/{accountId}/workflowDefinitions/{workflowDefinitionId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workflowDefinitionId" + "\\}", apiClient.escapeString(workflowDefinitionId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("lastDeployedId", options.lastDeployedId));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<WorkflowDefinitionWithId> localVarReturnType = new GenericType<WorkflowDefinitionWithId>() {};
    WorkflowDefinitionWithId localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkflowDefinitionWithId>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets configuration instances.
   * Returns a list of configuration instances for a workflow definition
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @return GetConfigurationInstancesResponse
   * @throws ApiException if fails to make API call
   */
  public GetConfigurationInstancesResponse getWorkflowDefinitionConfigInstances(String accountId, String workflowDefinitionId) throws ApiException {
    ApiResponse<GetConfigurationInstancesResponse> localVarResponse = getWorkflowDefinitionConfigInstancesWithHttpInfo(accountId, workflowDefinitionId);
    return localVarResponse.getData();
  }

  /**
   * Gets configuration instances
   * Returns a list of configuration instances for a workflow definition
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @return GetConfigurationInstancesResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetConfigurationInstancesResponse > getWorkflowDefinitionConfigInstancesWithHttpInfo(String accountId, String workflowDefinitionId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWorkflowDefinitionConfigInstances");
    }
    
    // verify the required parameter 'workflowDefinitionId' is set
    if (workflowDefinitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowDefinitionId' when calling getWorkflowDefinitionConfigInstances");
    }
    
    // create path and map variables
    String localVarPath = "aow-manage/v1.0/management/accounts/{accountId}/workflowDefinitions/{workflowDefinitionId}/configInstances"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workflowDefinitionId" + "\\}", apiClient.escapeString(workflowDefinitionId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<GetConfigurationInstancesResponse> localVarReturnType = new GenericType<GetConfigurationInstancesResponse>() {};
    GetConfigurationInstancesResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<GetConfigurationInstancesResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Get Workflow Definitions metadata Returns a list of workflow definitions&#39; metadata.
  /// </summary>

 /**
  * GetWorkflowDefinitionsOptions Class.
  *
  **/
  public class GetWorkflowDefinitionsOptions
  {
  private String status = null;
  
 /**
  * setStatus method.
  */
  public void setStatus(String status) {
    this.status = status;
  }

 /**
  * getStatus method.
  *
  * @return String
  */
  public String getStatus() {
    return this.status;
  }
  }

   /**
   * Get Workflow Definitions metadata.
   * Returns a list of workflow definitions&#39; metadata.
   * @param accountId Account ID (required)
   * @return WorkflowDefinitionList
   */ 
  public WorkflowDefinitionList getWorkflowDefinitions(String accountId) throws ApiException {
    return getWorkflowDefinitions(accountId, null);
  }

  /**
   * Get Workflow Definitions metadata.
   * Returns a list of workflow definitions&#39; metadata.
   * @param accountId Account ID (required)
   * @param options for modifying the method behavior.
   * @return WorkflowDefinitionList
   * @throws ApiException if fails to make API call
   */
  public WorkflowDefinitionList getWorkflowDefinitions(String accountId, WorkflowManagementApi.GetWorkflowDefinitionsOptions options) throws ApiException {
    ApiResponse<WorkflowDefinitionList> localVarResponse = getWorkflowDefinitionsWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Get Workflow Definitions metadata
   * Returns a list of workflow definitions&#39; metadata.
   * @param accountId Account ID (required)
   * @param options for modifying the method behavior.
   * @return WorkflowDefinitionList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkflowDefinitionList > getWorkflowDefinitionsWithHttpInfo(String accountId, WorkflowManagementApi.GetWorkflowDefinitionsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWorkflowDefinitions");
    }
    
    // create path and map variables
    String localVarPath = "aow-manage/v1.0/management/accounts/{accountId}/workflowDefinitions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<WorkflowDefinitionList> localVarReturnType = new GenericType<WorkflowDefinitionList>() {};
    WorkflowDefinitionList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkflowDefinitionList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Publishes or unpublishes a workflow definition..
   * Publishes or unpublishes a workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @param body Request Body to publish or unpublish a workflow definition. (required)
   * @return DeployResponse
   * @throws ApiException if fails to make API call
   */
  public DeployResponse publishOrUnPublishWorkflowDefinition(String accountId, String workflowDefinitionId, DeployRequest body) throws ApiException {
    ApiResponse<DeployResponse> localVarResponse = publishOrUnPublishWorkflowDefinitionWithHttpInfo(accountId, workflowDefinitionId, body);
    return localVarResponse.getData();
  }

  /**
   * Publishes or unpublishes a workflow definition.
   * Publishes or unpublishes a workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @param body Request Body to publish or unpublish a workflow definition. (required)
   * @return DeployResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DeployResponse > publishOrUnPublishWorkflowDefinitionWithHttpInfo(String accountId, String workflowDefinitionId, DeployRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling publishOrUnPublishWorkflowDefinition");
    }
    
    // verify the required parameter 'workflowDefinitionId' is set
    if (workflowDefinitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowDefinitionId' when calling publishOrUnPublishWorkflowDefinition");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling publishOrUnPublishWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "aow-manage/v1.0/management/accounts/{accountId}/workflowDefinitions/{workflowDefinitionId}/publish"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workflowDefinitionId" + "\\}", apiClient.escapeString(workflowDefinitionId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<DeployResponse> localVarReturnType = new GenericType<DeployResponse>() {};
    DeployResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DeployResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates a workflow definition..
   * Updates a workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @param body Request Body to update a workflow definition. (required)
   * @return NewOrUpdatedWorkflowDefinitionResponse
   * @throws ApiException if fails to make API call
   */
  public NewOrUpdatedWorkflowDefinitionResponse updateWorkflowDefinition(String accountId, String workflowDefinitionId, CreateOrUpdateWorkflowDefinitionRequestBody body) throws ApiException {
    ApiResponse<NewOrUpdatedWorkflowDefinitionResponse> localVarResponse = updateWorkflowDefinitionWithHttpInfo(accountId, workflowDefinitionId, body);
    return localVarResponse.getData();
  }

  /**
   * Updates a workflow definition.
   * Updates a workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @param body Request Body to update a workflow definition. (required)
   * @return NewOrUpdatedWorkflowDefinitionResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<NewOrUpdatedWorkflowDefinitionResponse > updateWorkflowDefinitionWithHttpInfo(String accountId, String workflowDefinitionId, CreateOrUpdateWorkflowDefinitionRequestBody body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateWorkflowDefinition");
    }
    
    // verify the required parameter 'workflowDefinitionId' is set
    if (workflowDefinitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowDefinitionId' when calling updateWorkflowDefinition");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "aow-manage/v1.0/management/accounts/{accountId}/workflowDefinitions/{workflowDefinitionId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workflowDefinitionId" + "\\}", apiClient.escapeString(workflowDefinitionId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<NewOrUpdatedWorkflowDefinitionResponse> localVarReturnType = new GenericType<NewOrUpdatedWorkflowDefinitionResponse>() {};
    NewOrUpdatedWorkflowDefinitionResponse localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<NewOrUpdatedWorkflowDefinitionResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
