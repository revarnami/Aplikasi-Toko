# LogStockAdjustmentApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logStockAdjustmentCount**](LogStockAdjustmentApi.md#logStockAdjustmentCount) | **GET** /LogStockAdjustment/count | Count instances of the model matched by where from the data source.
[**logStockAdjustmentCreate**](LogStockAdjustmentApi.md#logStockAdjustmentCreate) | **POST** /LogStockAdjustment | Create a new instance of the model and persist it into the data source.
[**logStockAdjustmentFind**](LogStockAdjustmentApi.md#logStockAdjustmentFind) | **GET** /LogStockAdjustment | Find all instances of the model matched by filter from the data source.
[**logStockAdjustmentFindById**](LogStockAdjustmentApi.md#logStockAdjustmentFindById) | **GET** /LogStockAdjustment/{id} | Find a model instance by {{id}} from the data source.
[**logStockAdjustmentFindOne**](LogStockAdjustmentApi.md#logStockAdjustmentFindOne) | **GET** /LogStockAdjustment/findOne | Find first instance of the model matched by filter from the data source.
[**logStockAdjustmentPrototypeGetItemVariant**](LogStockAdjustmentApi.md#logStockAdjustmentPrototypeGetItemVariant) | **GET** /LogStockAdjustment/{id}/itemVariant | Fetches belongsTo relation itemVariant.
[**logStockAdjustmentUpdateAll**](LogStockAdjustmentApi.md#logStockAdjustmentUpdateAll) | **POST** /LogStockAdjustment/update | Update instances of the model matched by {{where}} from the data source.


<a name="logStockAdjustmentCount"></a>
# **logStockAdjustmentCount**
> InlineResponse200 logStockAdjustmentCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockAdjustmentApi;

LogStockAdjustmentApi apiInstance = new LogStockAdjustmentApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.logStockAdjustmentCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockAdjustmentApi#logStockAdjustmentCount");
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

<a name="logStockAdjustmentCreate"></a>
# **logStockAdjustmentCreate**
> LogStockAdjustment logStockAdjustmentCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockAdjustmentApi;

LogStockAdjustmentApi apiInstance = new LogStockAdjustmentApi();
LogStockAdjustment data = new LogStockAdjustment(); // LogStockAdjustment | Model instance data
try {
    LogStockAdjustment result = apiInstance.logStockAdjustmentCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockAdjustmentApi#logStockAdjustmentCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**LogStockAdjustment**](LogStockAdjustment.md)| Model instance data | [optional]

### Return type

[**LogStockAdjustment**](LogStockAdjustment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockAdjustmentFind"></a>
# **logStockAdjustmentFind**
> List&lt;LogStockAdjustment&gt; logStockAdjustmentFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockAdjustmentApi;

LogStockAdjustmentApi apiInstance = new LogStockAdjustmentApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<LogStockAdjustment> result = apiInstance.logStockAdjustmentFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockAdjustmentApi#logStockAdjustmentFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;LogStockAdjustment&gt;**](LogStockAdjustment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockAdjustmentFindById"></a>
# **logStockAdjustmentFindById**
> LogStockAdjustment logStockAdjustmentFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockAdjustmentApi;

LogStockAdjustmentApi apiInstance = new LogStockAdjustmentApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogStockAdjustment result = apiInstance.logStockAdjustmentFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockAdjustmentApi#logStockAdjustmentFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogStockAdjustment**](LogStockAdjustment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockAdjustmentFindOne"></a>
# **logStockAdjustmentFindOne**
> LogStockAdjustment logStockAdjustmentFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockAdjustmentApi;

LogStockAdjustmentApi apiInstance = new LogStockAdjustmentApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogStockAdjustment result = apiInstance.logStockAdjustmentFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockAdjustmentApi#logStockAdjustmentFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogStockAdjustment**](LogStockAdjustment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockAdjustmentPrototypeGetItemVariant"></a>
# **logStockAdjustmentPrototypeGetItemVariant**
> ItemVariant logStockAdjustmentPrototypeGetItemVariant(id, refresh)

Fetches belongsTo relation itemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockAdjustmentApi;

LogStockAdjustmentApi apiInstance = new LogStockAdjustmentApi();
String id = "id_example"; // String | LogStockAdjustment id
Boolean refresh = true; // Boolean | 
try {
    ItemVariant result = apiInstance.logStockAdjustmentPrototypeGetItemVariant(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockAdjustmentApi#logStockAdjustmentPrototypeGetItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| LogStockAdjustment id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockAdjustmentUpdateAll"></a>
# **logStockAdjustmentUpdateAll**
> InlineResponse2002 logStockAdjustmentUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockAdjustmentApi;

LogStockAdjustmentApi apiInstance = new LogStockAdjustmentApi();
String where = "where_example"; // String | Criteria to match model instances
LogStockAdjustment data = new LogStockAdjustment(); // LogStockAdjustment | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.logStockAdjustmentUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockAdjustmentApi#logStockAdjustmentUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**LogStockAdjustment**](LogStockAdjustment.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

