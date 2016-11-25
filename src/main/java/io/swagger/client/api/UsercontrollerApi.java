package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.User;
import java.util.*;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-11T13:19:52.734+01:00")
public class UsercontrollerApi {
  private ApiClient apiClient;

  public UsercontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsercontrollerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create user
   * This can only be done by the logged in user.
   * @param user Created user object
   * @return User
   */
  public User createUserUsingPOST (User user) throws ApiException {
    Object postBody = user;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'user' is set
     if (user == null) {
        throw new ApiException(400, "Missing the required parameter 'user' when calling createUserUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<User>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Creates list of users with given input array
   * 
   * @param users List of user object
   * @return User
   */
  public User createUsersWithArrayInputUsingPOST (List<User> users) throws ApiException {
    Object postBody = users;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'users' is set
     if (users == null) {
        throw new ApiException(400, "Missing the required parameter 'users' when calling createUsersWithArrayInputUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/user/createWithArray".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<User>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Creates list of users with given input array
   * 
   * @param users List of user object
   * @return String
   */
  public String createUsersWithListInputUsingPOST (List<User> users) throws ApiException {
    Object postBody = users;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'users' is set
     if (users == null) {
        throw new ApiException(400, "Missing the required parameter 'users' when calling createUsersWithListInputUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/user/createWithList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<String>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Logs user into the system
   * 
   * @param username The user name for login
   * @param password The password for login in clear text
   * @return String
   */
  public String loginUserUsingGET (String username, String password) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'username' is set
     if (username == null) {
        throw new ApiException(400, "Missing the required parameter 'username' when calling loginUserUsingGET");
     }
     
     // verify the required parameter 'password' is set
     if (password == null) {
        throw new ApiException(400, "Missing the required parameter 'password' when calling loginUserUsingGET");
     }
     
    // create path and map variables
    String path = "/api/user/login".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "username", username));
    
    queryParams.addAll(apiClient.parameterToPairs("", "password", password));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<String>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Logs out current logged in user session
   * 
   * @return String
   */
  public String logoutUserUsingGET () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/api/user/logout".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<String>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get user by user name
   * 
   * @param username The name that needs to be fetched. Use user1 for testing.
   * @return User
   */
  public User getUserByNameUsingGET (String username) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'username' is set
     if (username == null) {
        throw new ApiException(400, "Missing the required parameter 'username' when calling getUserByNameUsingGET");
     }
     
    // create path and map variables
    String path = "/api/user/{username}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<User>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Updated user
   * This can only be done by the logged in user.
   * @param username name that need to be deleted
   * @param user Updated user object
   * @return String
   */
  public String updateUserUsingPUT (String username, User user) throws ApiException {
    Object postBody = user;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'username' is set
     if (username == null) {
        throw new ApiException(400, "Missing the required parameter 'username' when calling updateUserUsingPUT");
     }
     
     // verify the required parameter 'user' is set
     if (user == null) {
        throw new ApiException(400, "Missing the required parameter 'user' when calling updateUserUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/user/{username}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<String>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Delete user
   * This can only be done by the logged in user.
   * @param username The name that needs to be deleted
   * @return String
   */
  public String deleteUserUsingDELETE (String username) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'username' is set
     if (username == null) {
        throw new ApiException(400, "Missing the required parameter 'username' when calling deleteUserUsingDELETE");
     }
     
    // create path and map variables
    String path = "/api/user/{username}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<String>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
