# LogStockDeliveryApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logStockDeliveryCount**](LogStockDeliveryApi.md#logStockDeliveryCount) | **GET** /LogStockDelivery/count | Count instances of the model matched by where from the data source.
[**logStockDeliveryCreate**](LogStockDeliveryApi.md#logStockDeliveryCreate) | **POST** /LogStockDelivery | Create a new instance of the model and persist it into the data source.
[**logStockDeliveryFind**](LogStockDeliveryApi.md#logStockDeliveryFind) | **GET** /LogStockDelivery | Find all instances of the model matched by filter from the data source.
[**logStockDeliveryFindById**](LogStockDeliveryApi.md#logStockDeliveryFindById) | **GET** /LogStockDelivery/{id} | Find a model instance by {{id}} from the data source.
[**logStockDeliveryFindOne**](LogStockDeliveryApi.md#logStockDeliveryFindOne) | **GET** /LogStockDelivery/findOne | Find first instance of the model matched by filter from the data source.
[**logStockDeliveryPrototypeGetItemVariant**](LogStockDeliveryApi.md#logStockDeliveryPrototypeGetItemVariant) | **GET** /LogStockDelivery/{id}/itemVariant | Fetches belongsTo relation itemVariant.
[**logStockDeliveryUpdateAll**](LogStockDeliveryApi.md#logStockDeliveryUpdateAll) | **POST** /LogStockDelivery/update | Update instances of the model matched by {{where}} from the data source.


<a name="logStockDeliveryCount"></a>
# **logStockDeliveryCount**
> InlineResponse200 logStockDeliveryCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockDeliveryApi;

LogStockDeliveryApi apiInstance = new LogStockDeliveryApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.logStockDeliveryCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockDeliveryApi#logStockDeliveryCount");
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

<a name="logStockDeliveryCreate"></a>
# **logStockDeliveryCreate**
> LogStockDelivery logStockDeliveryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockDeliveryApi;

LogStockDeliveryApi apiInstance = new LogStockDeliveryApi();
LogStockDelivery data = new LogStockDelivery(); // LogStockDelivery | Model instance data
try {
    LogStockDelivery result = apiInstance.logStockDeliveryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockDeliveryApi#logStockDeliveryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**LogStockDelivery**](LogStockDelivery.md)| Model instance data | [optional]

### Return type

[**LogStockDelivery**](LogStockDelivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockDeliveryFind"></a>
# **logStockDeliveryFind**
> List&lt;LogStockDelivery&gt; logStockDeliveryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockDeliveryApi;

LogStockDeliveryApi apiInstance = new LogStockDeliveryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<LogStockDelivery> result = apiInstance.logStockDeliveryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockDeliveryApi#logStockDeliveryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;LogStockDelivery&gt;**](LogStockDelivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockDeliveryFindById"></a>
# **logStockDeliveryFindById**
> LogStockDelivery logStockDeliveryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockDeliveryApi;

LogStockDeliveryApi apiInstance = new LogStockDeliveryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogStockDelivery result = apiInstance.logStockDeliveryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockDeliveryApi#logStockDeliveryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogStockDelivery**](LogStockDelivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockDeliveryFindOne"></a>
# **logStockDeliveryFindOne**
> LogStockDelivery logStockDeliveryFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockDeliveryApi;

LogStockDeliveryApi apiInstance = new LogStockDeliveryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogStockDelivery result = apiInstance.logStockDeliveryFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockDeliveryApi#logStockDeliveryFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogStockDelivery**](LogStockDelivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockDeliveryPrototypeGetItemVariant"></a>
# **logStockDeliveryPrototypeGetItemVariant**
> ItemVariant logStockDeliveryPrototypeGetItemVariant(id, refresh)

Fetches belongsTo relation itemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockDeliveryApi;

LogStockDeliveryApi apiInstance = new LogStockDeliveryApi();
String id = "id_example"; // String | LogStockDelivery id
Boolean refresh = true; // Boolean | 
try {
    ItemVariant result = apiInstance.logStockDeliveryPrototypeGetItemVariant(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockDeliveryApi#logStockDeliveryPrototypeGetItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| LogStockDelivery id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockDeliveryUpdateAll"></a>
# **logStockDeliveryUpdateAll**
> InlineResponse2002 logStockDeliveryUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockDeliveryApi;

LogStockDeliveryApi apiInstance = new LogStockDeliveryApi();
String where = "where_example"; // String | Criteria to match model instances
LogStockDelivery data = new LogStockDelivery(); // LogStockDelivery | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.logStockDeliveryUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockDeliveryApi#logStockDeliveryUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**LogStockDelivery**](LogStockDelivery.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

