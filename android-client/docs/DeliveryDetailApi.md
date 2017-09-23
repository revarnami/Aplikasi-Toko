# DeliveryDetailApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deliveryDetailCount**](DeliveryDetailApi.md#deliveryDetailCount) | **GET** /DeliveryDetail/count | Count instances of the model matched by where from the data source.
[**deliveryDetailCreate**](DeliveryDetailApi.md#deliveryDetailCreate) | **POST** /DeliveryDetail | Create a new instance of the model and persist it into the data source.
[**deliveryDetailFind**](DeliveryDetailApi.md#deliveryDetailFind) | **GET** /DeliveryDetail | Find all instances of the model matched by filter from the data source.
[**deliveryDetailFindById**](DeliveryDetailApi.md#deliveryDetailFindById) | **GET** /DeliveryDetail/{id} | Find a model instance by {{id}} from the data source.
[**deliveryDetailFindOne**](DeliveryDetailApi.md#deliveryDetailFindOne) | **GET** /DeliveryDetail/findOne | Find first instance of the model matched by filter from the data source.
[**deliveryDetailPrototypeGetDelivery**](DeliveryDetailApi.md#deliveryDetailPrototypeGetDelivery) | **GET** /DeliveryDetail/{id}/delivery | Fetches belongsTo relation delivery.
[**deliveryDetailPrototypeGetItemVariant**](DeliveryDetailApi.md#deliveryDetailPrototypeGetItemVariant) | **GET** /DeliveryDetail/{id}/itemVariant | Fetches belongsTo relation itemVariant.
[**deliveryDetailUpdateAll**](DeliveryDetailApi.md#deliveryDetailUpdateAll) | **POST** /DeliveryDetail/update | Update instances of the model matched by {{where}} from the data source.


<a name="deliveryDetailCount"></a>
# **deliveryDetailCount**
> InlineResponse200 deliveryDetailCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryDetailApi;

DeliveryDetailApi apiInstance = new DeliveryDetailApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.deliveryDetailCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryDetailApi#deliveryDetailCount");
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

<a name="deliveryDetailCreate"></a>
# **deliveryDetailCreate**
> DeliveryDetail deliveryDetailCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryDetailApi;

DeliveryDetailApi apiInstance = new DeliveryDetailApi();
DeliveryDetail data = new DeliveryDetail(); // DeliveryDetail | Model instance data
try {
    DeliveryDetail result = apiInstance.deliveryDetailCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryDetailApi#deliveryDetailCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**DeliveryDetail**](DeliveryDetail.md)| Model instance data | [optional]

### Return type

[**DeliveryDetail**](DeliveryDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryDetailFind"></a>
# **deliveryDetailFind**
> List&lt;DeliveryDetail&gt; deliveryDetailFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryDetailApi;

DeliveryDetailApi apiInstance = new DeliveryDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<DeliveryDetail> result = apiInstance.deliveryDetailFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryDetailApi#deliveryDetailFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;DeliveryDetail&gt;**](DeliveryDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryDetailFindById"></a>
# **deliveryDetailFindById**
> DeliveryDetail deliveryDetailFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryDetailApi;

DeliveryDetailApi apiInstance = new DeliveryDetailApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    DeliveryDetail result = apiInstance.deliveryDetailFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryDetailApi#deliveryDetailFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**DeliveryDetail**](DeliveryDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryDetailFindOne"></a>
# **deliveryDetailFindOne**
> DeliveryDetail deliveryDetailFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryDetailApi;

DeliveryDetailApi apiInstance = new DeliveryDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    DeliveryDetail result = apiInstance.deliveryDetailFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryDetailApi#deliveryDetailFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**DeliveryDetail**](DeliveryDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryDetailPrototypeGetDelivery"></a>
# **deliveryDetailPrototypeGetDelivery**
> Delivery deliveryDetailPrototypeGetDelivery(id, refresh)

Fetches belongsTo relation delivery.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryDetailApi;

DeliveryDetailApi apiInstance = new DeliveryDetailApi();
String id = "id_example"; // String | DeliveryDetail id
Boolean refresh = true; // Boolean | 
try {
    Delivery result = apiInstance.deliveryDetailPrototypeGetDelivery(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryDetailApi#deliveryDetailPrototypeGetDelivery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| DeliveryDetail id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Delivery**](Delivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryDetailPrototypeGetItemVariant"></a>
# **deliveryDetailPrototypeGetItemVariant**
> ItemVariant deliveryDetailPrototypeGetItemVariant(id, refresh)

Fetches belongsTo relation itemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryDetailApi;

DeliveryDetailApi apiInstance = new DeliveryDetailApi();
String id = "id_example"; // String | DeliveryDetail id
Boolean refresh = true; // Boolean | 
try {
    ItemVariant result = apiInstance.deliveryDetailPrototypeGetItemVariant(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryDetailApi#deliveryDetailPrototypeGetItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| DeliveryDetail id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="deliveryDetailUpdateAll"></a>
# **deliveryDetailUpdateAll**
> InlineResponse2002 deliveryDetailUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.DeliveryDetailApi;

DeliveryDetailApi apiInstance = new DeliveryDetailApi();
String where = "where_example"; // String | Criteria to match model instances
DeliveryDetail data = new DeliveryDetail(); // DeliveryDetail | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.deliveryDetailUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryDetailApi#deliveryDetailUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**DeliveryDetail**](DeliveryDetail.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

