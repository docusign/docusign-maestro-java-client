
package com.docusign.maestro.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.maestro.client.ApiException;
import com.docusign.maestro.client.ApiClient;
import com.docusign.maestro.client.Configuration;
import com.docusign.maestro.model.*;
import com.docusign.maestro.client.Pair;
import com.docusign.maestro.client.ApiResponse;




/**
 * WorkflowInstanceManagementApi class.
 *
 **/
public class WorkflowInstanceManagementApi {
  private ApiClient apiClient;

 /**
  * WorkflowInstanceManagementApi.
  *
  **/
  public WorkflowInstanceManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * WorkflowInstanceManagementApi.
  *
  **/
  public WorkflowInstanceManagementApi(ApiClient apiClient) {
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
   * Cancels a running workflow instance..
   * Cancels a running workflow instance.
   * @param accountId Account ID (required)
   * @param instanceId DS Workflow Instance Id (dacId) (required)
   * @return CancelResponse
   * @throws ApiException if fails to make API call
   */
  public CancelResponse cancelWorkflowInstance(String accountId, String instanceId) throws ApiException {
    ApiResponse<CancelResponse> localVarResponse = cancelWorkflowInstanceWithHttpInfo(accountId, instanceId);
    return localVarResponse.getData();
  }

  /**
   * Cancels a running workflow instance.
   * Cancels a running workflow instance.
   * @param accountId Account ID (required)
   * @param instanceId DS Workflow Instance Id (dacId) (required)
   * @return CancelResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CancelResponse > cancelWorkflowInstanceWithHttpInfo(String accountId, String instanceId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling cancelWorkflowInstance");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling cancelWorkflowInstance");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/management/instances/{instanceId}/cancel"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "instanceId" + "\\}", apiClient.escapeString(instanceId.toString()));

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
    
    GenericType<CancelResponse> localVarReturnType = new GenericType<CancelResponse>() {};
    CancelResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<CancelResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get List of Step Histories.
   * Returns a list of step history for a workflow instance
   * @param accountId Account ID (required)
   * @param instanceId DS Workflow Instance Id (dacId) (required)
   * @return java.util.List<WorkflowStepHistory>
   * @throws ApiException if fails to make API call
   */
  public java.util.List<WorkflowStepHistory> getWorkflowHistory(String accountId, String instanceId) throws ApiException {
    ApiResponse<java.util.List<WorkflowStepHistory>> localVarResponse = getWorkflowHistoryWithHttpInfo(accountId, instanceId);
    return localVarResponse.getData();
  }

  /**
   * Get List of Step Histories
   * Returns a list of step history for a workflow instance
   * @param accountId Account ID (required)
   * @param instanceId DS Workflow Instance Id (dacId) (required)
   * @return java.util.List<WorkflowStepHistory>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<java.util.List<WorkflowStepHistory> > getWorkflowHistoryWithHttpInfo(String accountId, String instanceId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWorkflowHistory");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling getWorkflowHistory");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/management/instances/{instanceId}/history"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "instanceId" + "\\}", apiClient.escapeString(instanceId.toString()));

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
    
    GenericType<java.util.List<WorkflowStepHistory>> localVarReturnType = new GenericType<java.util.List<WorkflowStepHistory>>() {};
    java.util.List<WorkflowStepHistory> localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<java.util.List<WorkflowStepHistory>>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get Workflow Instance Details.
   * Returns the details for a specific instance for a deployed workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @param instanceId DS Workflow Instance Id (dacId) (required)
   * @return WorkflowInstance
   * @throws ApiException if fails to make API call
   */
  public WorkflowInstance getWorkflowInstance(String accountId, String workflowDefinitionId, String instanceId) throws ApiException {
    ApiResponse<WorkflowInstance> localVarResponse = getWorkflowInstanceWithHttpInfo(accountId, workflowDefinitionId, instanceId);
    return localVarResponse.getData();
  }

  /**
   * Get Workflow Instance Details
   * Returns the details for a specific instance for a deployed workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @param instanceId DS Workflow Instance Id (dacId) (required)
   * @return WorkflowInstance
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WorkflowInstance > getWorkflowInstanceWithHttpInfo(String accountId, String workflowDefinitionId, String instanceId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWorkflowInstance");
    }
    
    // verify the required parameter 'workflowDefinitionId' is set
    if (workflowDefinitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowDefinitionId' when calling getWorkflowInstance");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling getWorkflowInstance");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/management/workflow_definitions/{workflowDefinitionId}/instances/{instanceId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workflowDefinitionId" + "\\}", apiClient.escapeString(workflowDefinitionId.toString()))
      .replaceAll("\\{" + "instanceId" + "\\}", apiClient.escapeString(instanceId.toString()));

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
    
    GenericType<WorkflowInstance> localVarReturnType = new GenericType<WorkflowInstance>() {};
    WorkflowInstance localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WorkflowInstance>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get List of Workflow Instances.
   * Returns the list of instances for a deployed workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @return java.util.List<WorkflowInstance>
   * @throws ApiException if fails to make API call
   */
  public java.util.List<WorkflowInstance> getWorkflowInstances(String accountId, String workflowDefinitionId) throws ApiException {
    ApiResponse<java.util.List<WorkflowInstance>> localVarResponse = getWorkflowInstancesWithHttpInfo(accountId, workflowDefinitionId);
    return localVarResponse.getData();
  }

  /**
   * Get List of Workflow Instances
   * Returns the list of instances for a deployed workflow definition.
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @return java.util.List<WorkflowInstance>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<java.util.List<WorkflowInstance> > getWorkflowInstancesWithHttpInfo(String accountId, String workflowDefinitionId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWorkflowInstances");
    }
    
    // verify the required parameter 'workflowDefinitionId' is set
    if (workflowDefinitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowDefinitionId' when calling getWorkflowInstances");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/management/workflow_definitions/{workflowDefinitionId}/instances"
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
    
    GenericType<java.util.List<WorkflowInstance>> localVarReturnType = new GenericType<java.util.List<WorkflowInstance>>() {};
    java.util.List<WorkflowInstance> localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<java.util.List<WorkflowInstance>>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
