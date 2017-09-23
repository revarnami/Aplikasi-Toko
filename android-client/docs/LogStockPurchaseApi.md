# LogStockPurchaseApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logStockPurchaseCount**](LogStockPurchaseApi.md#logStockPurchaseCount) | **GET** /LogStockPurchase/count | Count instances of the model matched by where from the data source.
[**logStockPurchaseCreate**](LogStockPurchaseApi.md#logStockPurchaseCreate) | **POST** /LogStockPurchase | Create a new instance of the model and persist it into the data source.
[**logStockPurchaseFind**](LogStockPurchaseApi.md#logStockPurchaseFind) | **GET** /LogStockPurchase | Find all instances of the model matched by filter from the data source.
[**logStockPurchaseFindById**](LogStockPurchaseApi.md#logStockPurchaseFindById) | **GET** /LogStockPurchase/{id} | Find a model instance by {{id}} from the data source.
[**logStockPurchaseFindOne**](LogStockPurchaseApi.md#logStockPurchaseFindOne) | **GET** /LogStockPurchase/findOne | Find first instance of the model matched by filter from the data source.
[**logStockPurchasePrototypeGetItemVariant**](LogStockPurchaseApi.md#logStockPurchasePrototypeGetItemVariant) | **GET** /LogStockPurchase/{id}/itemVariant | Fetches belongsTo relation itemVariant.
[**logStockPurchaseUpdateAll**](LogStockPurchaseApi.md#logStockPurchaseUpdateAll) | **POST** /LogStockPurchase/update | Update instances of the model matched by {{where}} from the data source.


<a name="logStockPurchaseCount"></a>
# **logStockPurchaseCount**
> InlineResponse200 logStockPurchaseCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockPurchaseApi;

LogStockPurchaseApi apiInstance = new LogStockPurchaseApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.logStockPurchaseCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockPurchaseApi#logStockPurchaseCount");
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

<a name="logStockPurchaseCreate"></a>
# **logStockPurchaseCreate**
> LogStockPurchase logStockPurchaseCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockPurchaseApi;

LogStockPurchaseApi apiInstance = new LogStockPurchaseApi();
LogStockPurchase data = new LogStockPurchase(); // LogStockPurchase | Model instance data
try {
    LogStockPurchase result = apiInstance.logStockPurchaseCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockPurchaseApi#logStockPurchaseCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**LogStockPurchase**](LogStockPurchase.md)| Model instance data | [optional]

### Return type

[**LogStockPurchase**](LogStockPurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockPurchaseFind"></a>
# **logStockPurchaseFind**
> List&lt;LogStockPurchase&gt; logStockPurchaseFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockPurchaseApi;

LogStockPurchaseApi apiInstance = new LogStockPurchaseApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<LogStockPurchase> result = apiInstance.logStockPurchaseFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockPurchaseApi#logStockPurchaseFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;LogStockPurchase&gt;**](LogStockPurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockPurchaseFindById"></a>
# **logStockPurchaseFindById**
> LogStockPurchase logStockPurchaseFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockPurchaseApi;

LogStockPurchaseApi apiInstance = new LogStockPurchaseApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogStockPurchase result = apiInstance.logStockPurchaseFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockPurchaseApi#logStockPurchaseFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogStockPurchase**](LogStockPurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockPurchaseFindOne"></a>
# **logStockPurchaseFindOne**
> LogStockPurchase logStockPurchaseFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockPurchaseApi;

LogStockPurchaseApi apiInstance = new LogStockPurchaseApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogStockPurchase result = apiInstance.logStockPurchaseFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockPurchaseApi#logStockPurchaseFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogStockPurchase**](LogStockPurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockPurchasePrototypeGetItemVariant"></a>
# **logStockPurchasePrototypeGetItemVariant**
> ItemVariant logStockPurchasePrototypeGetItemVariant(id, refresh)

Fetches belongsTo relation itemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockPurchaseApi;

LogStockPurchaseApi apiInstance = new LogStockPurchaseApi();
String id = "id_example"; // String | LogStockPurchase id
Boolean refresh = true; // Boolean | 
try {
    ItemVariant result = apiInstance.logStockPurchasePrototypeGetItemVariant(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockPurchaseApi#logStockPurchasePrototypeGetItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| LogStockPurchase id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logStockPurchaseUpdateAll"></a>
# **logStockPurchaseUpdateAll**
> InlineResponse2002 logStockPurchaseUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogStockPurchaseApi;

LogStockPurchaseApi apiInstance = new LogStockPurchaseApi();
String where = "where_example"; // String | Criteria to match model instances
LogStockPurchase data = new LogStockPurchase(); // LogStockPurchase | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.logStockPurchaseUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogStockPurchaseApi#logStockPurchaseUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**LogStockPurchase**](LogStockPurchase.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

