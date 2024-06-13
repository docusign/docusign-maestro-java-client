
package com.docusign.maestro.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.maestro.client.ApiException;
import com.docusign.maestro.client.ApiClient;
import com.docusign.maestro.client.Configuration;
import com.docusign.maestro.model.*;
import com.docusign.maestro.client.Pair;
import com.docusign.maestro.client.ApiResponse;




/**
 * WorkflowTriggerApi class.
 *
 **/
public class WorkflowTriggerApi {
  private ApiClient apiClient;

 /**
  * WorkflowTriggerApi.
  *
  **/
  public WorkflowTriggerApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * WorkflowTriggerApi.
  *
  **/
  public WorkflowTriggerApi(ApiClient apiClient) {
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

  /// <summary>
  /// Creates a new workflow instance after authenticating with DS Account Server Creates a new workflow instance after authenticating with DS Account Server
  /// </summary>

 /**
  * TriggerWorkflowOptions Class.
  *
  **/
  public class TriggerWorkflowOptions
  {
  private String mtid = null;
  private String mtsec = null;
  
 /**
  * setMtid method.
  */
  public void setMtid(String mtid) {
    this.mtid = mtid;
  }

 /**
  * getMtid method.
  *
  * @return String
  */
  public String getMtid() {
    return this.mtid;
  }
  
 /**
  * setMtsec method.
  */
  public void setMtsec(String mtsec) {
    this.mtsec = mtsec;
  }

 /**
  * getMtsec method.
  *
  * @return String
  */
  public String getMtsec() {
    return this.mtsec;
  }
  }

   /**
   * Creates a new workflow instance after authenticating with DS Account Server.
   * Creates a new workflow instance after authenticating with DS Account Server
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @param body JSON payload that will be passed to the triggered workflow (required)
   * @return TriggerWorkflowViaPostResponse
   */ 
  public TriggerWorkflowViaPostResponse triggerWorkflow(String accountId, String workflowDefinitionId, TriggerPayload body) throws ApiException {
    return triggerWorkflow(accountId, workflowDefinitionId, body, null);
  }

  /**
   * Creates a new workflow instance after authenticating with DS Account Server.
   * Creates a new workflow instance after authenticating with DS Account Server
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @param body JSON payload that will be passed to the triggered workflow (required)
   * @param options for modifying the method behavior.
   * @return TriggerWorkflowViaPostResponse
   * @throws ApiException if fails to make API call
   */
  public TriggerWorkflowViaPostResponse triggerWorkflow(String accountId, String workflowDefinitionId, TriggerPayload body, WorkflowTriggerApi.TriggerWorkflowOptions options) throws ApiException {
    ApiResponse<TriggerWorkflowViaPostResponse> localVarResponse = triggerWorkflowWithHttpInfo(accountId, workflowDefinitionId, body, options);
    return localVarResponse.getData();
  }

  /**
   * Creates a new workflow instance after authenticating with DS Account Server
   * Creates a new workflow instance after authenticating with DS Account Server
   * @param accountId Account ID (required)
   * @param workflowDefinitionId Workflow Definition ID (required)
   * @param body JSON payload that will be passed to the triggered workflow (required)
   * @param options for modifying the method behavior.
   * @return TriggerWorkflowViaPostResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<TriggerWorkflowViaPostResponse > triggerWorkflowWithHttpInfo(String accountId, String workflowDefinitionId, TriggerPayload body, WorkflowTriggerApi.TriggerWorkflowOptions options) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling triggerWorkflow");
    }
    
    // verify the required parameter 'workflowDefinitionId' is set
    if (workflowDefinitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowDefinitionId' when calling triggerWorkflow");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling triggerWorkflow");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/workflow_definitions/{workflowDefinitionId}/trigger"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "workflowDefinitionId" + "\\}", apiClient.escapeString(workflowDefinitionId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("mtid", options.mtid));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("mtsec", options.mtsec));
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
    
    GenericType<TriggerWorkflowViaPostResponse> localVarReturnType = new GenericType<TriggerWorkflowViaPostResponse>() {};
    TriggerWorkflowViaPostResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<TriggerWorkflowViaPostResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
