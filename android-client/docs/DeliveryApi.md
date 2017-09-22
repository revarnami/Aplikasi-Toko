# DeliveryApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deliveryCount**](DeliveryApi.md#deliveryCount) | **GET** /Delivery/count | Count instances of the model matched by where from the data source.
[**deliveryCreateDelivery**](DeliveryApi.md#deliveryCreateDelivery) | **POST** /Delivery | Create Delivery, Delivery Detail
[**deliveryFind**](DeliveryApi.md#deliveryFind) | **GET** /Delivery | Find all instances of the model matched by filter from the data source.
[**deliveryFindById**](DeliveryApi.md#deliveryFindById) | **GET** /Delivery/{id} | Find a model instance by {{id}} from the data source.
[**deliveryFindOne**](DeliveryApi.md#deliveryFindOne) | **GET** /Delivery/findOne | Find first instance of the model matched by filter from the data source.
[**deliveryPrototypeCountDeliveryDetail**](DeliveryApi.md#deliveryPrototypeCountDeliveryDetail) | **GET** /Delivery/{id}/deliveryDetail/count | Counts deliveryDetail of Delivery.
[**deliveryPrototypeGetBranchFromDetail**](DeliveryApi.md#deliveryPrototypeGetBranchFromDetail) | **GET** /Delivery/{id}/branchFromDetail | Fetches belongsTo relation branchFromDetail.
[**deliveryPrototypeGetBranchToDetail**](DeliveryApi.md#deliveryPrototypeGetBranchToDetail) | **GET** /Delivery/{id}/branchToDetail | Fetches belongsTo relation branchToDetail.
[**deliveryPrototypeGetDeliveryDetail**](DeliveryApi.md#deliveryPrototypeGetDeliveryDetail) | **GET** /Delivery/{id}/deliveryDetail | Queries deliveryDetail of Delivery.
[**deliveryUpdateAll**](DeliveryApi.md#deliveryUpdateAll) | **POST** /Delivery/update | Update instances of the model matched by {{where}} from the data source.


<a name="deliveryCount"></a>
# **deliveryCount**
> InlineResponse200 deliveryCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryApi;

DeliveryApi apiInstance = new DeliveryApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.deliveryCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#deliveryCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryCreateDelivery"></a>
# **deliveryCreateDelivery**
> InlineResponse2003 deliveryCreateDelivery(request)

Create Delivery, Delivery Detail

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryApi;

DeliveryApi apiInstance = new DeliveryApi();
Object request = null; // Object | 
try {
    InlineResponse2003 result = apiInstance.deliveryCreateDelivery(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#deliveryCreateDelivery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | **Object**|  | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryFind"></a>
# **deliveryFind**
> List&lt;Delivery&gt; deliveryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryApi;

DeliveryApi apiInstance = new DeliveryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Delivery> result = apiInstance.deliveryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#deliveryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Delivery&gt;**](Delivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryFindById"></a>
# **deliveryFindById**
> Delivery deliveryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryApi;

DeliveryApi apiInstance = new DeliveryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Delivery result = apiInstance.deliveryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#deliveryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Delivery**](Delivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryFindOne"></a>
# **deliveryFindOne**
> Delivery deliveryFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryApi;

DeliveryApi apiInstance = new DeliveryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Delivery result = apiInstance.deliveryFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#deliveryFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Delivery**](Delivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryPrototypeCountDeliveryDetail"></a>
# **deliveryPrototypeCountDeliveryDetail**
> InlineResponse200 deliveryPrototypeCountDeliveryDetail(id, where)

Counts deliveryDetail of Delivery.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryApi;

DeliveryApi apiInstance = new DeliveryApi();
String id = "id_example"; // String | Delivery id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.deliveryPrototypeCountDeliveryDetail(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#deliveryPrototypeCountDeliveryDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Delivery id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryPrototypeGetBranchFromDetail"></a>
# **deliveryPrototypeGetBranchFromDetail**
> Branch deliveryPrototypeGetBranchFromDetail(id, refresh)

Fetches belongsTo relation branchFromDetail.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryApi;

DeliveryApi apiInstance = new DeliveryApi();
String id = "id_example"; // String | Delivery id
Boolean refresh = true; // Boolean | 
try {
    Branch result = apiInstance.deliveryPrototypeGetBranchFromDetail(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#deliveryPrototypeGetBranchFromDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Delivery id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Branch**](Branch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryPrototypeGetBranchToDetail"></a>
# **deliveryPrototypeGetBranchToDetail**
> Branch deliveryPrototypeGetBranchToDetail(id, refresh)

Fetches belongsTo relation branchToDetail.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryApi;

DeliveryApi apiInstance = new DeliveryApi();
String id = "id_example"; // String | Delivery id
Boolean refresh = true; // Boolean | 
try {
    Branch result = apiInstance.deliveryPrototypeGetBranchToDetail(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#deliveryPrototypeGetBranchToDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Delivery id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Branch**](Branch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryPrototypeGetDeliveryDetail"></a>
# **deliveryPrototypeGetDeliveryDetail**
> List&lt;DeliveryDetail&gt; deliveryPrototypeGetDeliveryDetail(id, filter)

Queries deliveryDetail of Delivery.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryApi;

DeliveryApi apiInstance = new DeliveryApi();
String id = "id_example"; // String | Delivery id
String filter = "filter_example"; // String | 
try {
    List<DeliveryDetail> result = apiInstance.deliveryPrototypeGetDeliveryDetail(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#deliveryPrototypeGetDeliveryDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Delivery id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;DeliveryDetail&gt;**](DeliveryDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryUpdateAll"></a>
# **deliveryUpdateAll**
> InlineResponse2002 deliveryUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryApi;

DeliveryApi apiInstance = new DeliveryApi();
String where = "where_example"; // String | Criteria to match model instances
Delivery data = new Delivery(); // Delivery | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.deliveryUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryApi#deliveryUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Delivery**](Delivery.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

