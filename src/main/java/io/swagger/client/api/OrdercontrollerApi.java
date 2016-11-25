package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.Order;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-11T13:19:52.734+01:00") public class OrdercontrollerApi {
    private ApiClient apiClient;

    public OrdercontrollerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrdercontrollerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * createBooking
     *
     * @param order order
     * @return Order
     */
    public Order createBookingUsingPOST(Order order) throws ApiException {
        Object postBody = order;
        byte[] postBinaryBody = null;

        // verify the required parameter 'order' is set
        if (order == null) {
            throw new ApiException(400, "Missing the required parameter 'order' when calling createBookingUsingPOST");
        }

        // create path and map variables
        String path = "/api/order".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> queryParams = new ArrayList<Pair>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = { "application/json" };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = { "application/json" };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        TypeRef returnType = new TypeRef<Order>() {
        };
        return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams,
                accept, contentType, authNames, returnType);

    }

    /**
     * deleteBooking
     *
     * @param orderId orderId
     * @return Order
     */
    public Order deleteBookingUsingDELETE(Integer orderId) throws ApiException {
        Object postBody = null;
        byte[] postBinaryBody = null;

        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'orderId' when calling deleteBookingUsingDELETE");
        }

        // create path and map variables
        String path = "/api/order/delete/{orderId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

        // query params
        List<Pair> queryParams = new ArrayList<Pair>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = { "application/json" };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = { "application/json" };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        TypeRef returnType = new TypeRef<Order>() {
        };
        return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams,
                accept, contentType, authNames, returnType);

    }

    /**
     * getBooking
     *
     * @param orderId orderId
     * @return Order
     */
    public Order getBookingUsingGET(Integer orderId) throws ApiException {
        Object postBody = null;
        byte[] postBinaryBody = null;

        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException(400, "Missing the required parameter 'orderId' when calling getBookingUsingGET");
        }

        // create path and map variables
        String path = "/api/order/{orderId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

        // query params
        List<Pair> queryParams = new ArrayList<Pair>();
        Map<String, String> headerParams = new HashMap<String, String>();
        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = { "application/json" };
        final String accept = apiClient.selectHeaderAccept(accepts);

        final String[] contentTypes = { "application/json" };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {};

        TypeRef returnType = new TypeRef<Order>() {
        };
        return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
                contentType, authNames, returnType);

    }

}
