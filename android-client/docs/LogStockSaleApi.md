# LogStockSaleApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logStockSaleCount**](LogStockSaleApi.md#logStockSaleCount) | **GET** /LogStockSale/count | Count instances of the model matched by where from the data source.
[**logStockSaleCreate**](LogStockSaleApi.md#logStockSaleCreate) | **POST** /LogStockSale | Create a new instance of the model and persist it into the data source.
[**logStockSaleFind**](LogStockSaleApi.md#logStockSaleFind) | **GET** /LogStockSale | Find all instances of the model matched by filter from the data source.
[**logStockSaleFindById**](LogStockSaleApi.md#logStockSaleFindById) | **GET** /LogStockSale/{id} | Find a model instance by {{id}} from the data source.
[**logStockSaleFindOne**](LogStockSaleApi.md#logStockSaleFindOne) | **GET** /LogStockSale/findOne | Find first instance of the model matched by filter from the data source.
[**logStockSalePrototypeGetItemVariant**](LogStockSaleApi.md#logStockSalePrototypeGetItemVariant) | **GET** /LogStockSale/{id}/itemVariant | Fetches belongsTo relation itemVariant.
[**logStockSaleUpdateAll**](LogStockSaleApi.md#logStockSaleUpdateAll) | **POST** /LogStockSale/update | Update instances of the model matched by {{where}} from the data source.


<a name="logStockSaleCount"></a>
# **logStockSaleCount**
> InlineResponse200 logStockSaleCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockSaleApi;

LogStockSaleApi apiInstance = new LogStockSaleApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.logStockSaleCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockSaleApi#logStockSaleCount");
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

<a name="logStockSaleCreate"></a>
# **logStockSaleCreate**
> LogStockSale logStockSaleCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockSaleApi;

LogStockSaleApi apiInstance = new LogStockSaleApi();
LogStockSale data = new LogStockSale(); // LogStockSale | Model instance data
try {
    LogStockSale result = apiInstance.logStockSaleCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockSaleApi#logStockSaleCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**LogStockSale**](LogStockSale.md)| Model instance data | [optional]

### Return type

[**LogStockSale**](LogStockSale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockSaleFind"></a>
# **logStockSaleFind**
> List&lt;LogStockSale&gt; logStockSaleFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockSaleApi;

LogStockSaleApi apiInstance = new LogStockSaleApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<LogStockSale> result = apiInstance.logStockSaleFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockSaleApi#logStockSaleFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;LogStockSale&gt;**](LogStockSale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockSaleFindById"></a>
# **logStockSaleFindById**
> LogStockSale logStockSaleFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockSaleApi;

LogStockSaleApi apiInstance = new LogStockSaleApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogStockSale result = apiInstance.logStockSaleFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockSaleApi#logStockSaleFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogStockSale**](LogStockSale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockSaleFindOne"></a>
# **logStockSaleFindOne**
> LogStockSale logStockSaleFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockSaleApi;

LogStockSaleApi apiInstance = new LogStockSaleApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogStockSale result = apiInstance.logStockSaleFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockSaleApi#logStockSaleFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogStockSale**](LogStockSale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockSalePrototypeGetItemVariant"></a>
# **logStockSalePrototypeGetItemVariant**
> ItemVariant logStockSalePrototypeGetItemVariant(id, refresh)

Fetches belongsTo relation itemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockSaleApi;

LogStockSaleApi apiInstance = new LogStockSaleApi();
String id = "id_example"; // String | LogStockSale id
Boolean refresh = true; // Boolean | 
try {
    ItemVariant result = apiInstance.logStockSalePrototypeGetItemVariant(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockSaleApi#logStockSalePrototypeGetItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| LogStockSale id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockSaleUpdateAll"></a>
# **logStockSaleUpdateAll**
> InlineResponse2002 logStockSaleUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockSaleApi;

LogStockSaleApi apiInstance = new LogStockSaleApi();
String where = "where_example"; // String | Criteria to match model instances
LogStockSale data = new LogStockSale(); // LogStockSale | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.logStockSaleUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockSaleApi#logStockSaleUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**LogStockSale**](LogStockSale.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

