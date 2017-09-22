# LogStockItemApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logStockItemCount**](LogStockItemApi.md#logStockItemCount) | **GET** /LogStockItem/count | Count instances of the model matched by where from the data source.
[**logStockItemCreate**](LogStockItemApi.md#logStockItemCreate) | **POST** /LogStockItem | Create a new instance of the model and persist it into the data source.
[**logStockItemFind**](LogStockItemApi.md#logStockItemFind) | **GET** /LogStockItem | Find all instances of the model matched by filter from the data source.
[**logStockItemFindById**](LogStockItemApi.md#logStockItemFindById) | **GET** /LogStockItem/{id} | Find a model instance by {{id}} from the data source.
[**logStockItemFindOne**](LogStockItemApi.md#logStockItemFindOne) | **GET** /LogStockItem/findOne | Find first instance of the model matched by filter from the data source.
[**logStockItemPrototypeGetItemVariant**](LogStockItemApi.md#logStockItemPrototypeGetItemVariant) | **GET** /LogStockItem/{id}/itemVariant | Fetches belongsTo relation itemVariant.
[**logStockItemUpdateAll**](LogStockItemApi.md#logStockItemUpdateAll) | **POST** /LogStockItem/update | Update instances of the model matched by {{where}} from the data source.


<a name="logStockItemCount"></a>
# **logStockItemCount**
> InlineResponse200 logStockItemCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockItemApi;

LogStockItemApi apiInstance = new LogStockItemApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.logStockItemCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockItemApi#logStockItemCount");
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

<a name="logStockItemCreate"></a>
# **logStockItemCreate**
> LogStockItem logStockItemCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockItemApi;

LogStockItemApi apiInstance = new LogStockItemApi();
LogStockItem data = new LogStockItem(); // LogStockItem | Model instance data
try {
    LogStockItem result = apiInstance.logStockItemCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockItemApi#logStockItemCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**LogStockItem**](LogStockItem.md)| Model instance data | [optional]

### Return type

[**LogStockItem**](LogStockItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockItemFind"></a>
# **logStockItemFind**
> List&lt;LogStockItem&gt; logStockItemFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockItemApi;

LogStockItemApi apiInstance = new LogStockItemApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<LogStockItem> result = apiInstance.logStockItemFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockItemApi#logStockItemFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;LogStockItem&gt;**](LogStockItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockItemFindById"></a>
# **logStockItemFindById**
> LogStockItem logStockItemFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockItemApi;

LogStockItemApi apiInstance = new LogStockItemApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogStockItem result = apiInstance.logStockItemFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockItemApi#logStockItemFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogStockItem**](LogStockItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockItemFindOne"></a>
# **logStockItemFindOne**
> LogStockItem logStockItemFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockItemApi;

LogStockItemApi apiInstance = new LogStockItemApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogStockItem result = apiInstance.logStockItemFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockItemApi#logStockItemFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogStockItem**](LogStockItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockItemPrototypeGetItemVariant"></a>
# **logStockItemPrototypeGetItemVariant**
> ItemVariant logStockItemPrototypeGetItemVariant(id, refresh)

Fetches belongsTo relation itemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockItemApi;

LogStockItemApi apiInstance = new LogStockItemApi();
String id = "id_example"; // String | LogStockItem id
Boolean refresh = true; // Boolean | 
try {
    ItemVariant result = apiInstance.logStockItemPrototypeGetItemVariant(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockItemApi#logStockItemPrototypeGetItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| LogStockItem id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockItemUpdateAll"></a>
# **logStockItemUpdateAll**
> InlineResponse2002 logStockItemUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockItemApi;

LogStockItemApi apiInstance = new LogStockItemApi();
String where = "where_example"; // String | Criteria to match model instances
LogStockItem data = new LogStockItem(); // LogStockItem | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.logStockItemUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockItemApi#logStockItemUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**LogStockItem**](LogStockItem.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

