# LogTransactionSaleApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logTransactionSaleCount**](LogTransactionSaleApi.md#logTransactionSaleCount) | **GET** /LogTransactionSale/count | Count instances of the model matched by where from the data source.
[**logTransactionSaleCreate**](LogTransactionSaleApi.md#logTransactionSaleCreate) | **POST** /LogTransactionSale | Create a new instance of the model and persist it into the data source.
[**logTransactionSaleFind**](LogTransactionSaleApi.md#logTransactionSaleFind) | **GET** /LogTransactionSale | Find all instances of the model matched by filter from the data source.
[**logTransactionSaleFindById**](LogTransactionSaleApi.md#logTransactionSaleFindById) | **GET** /LogTransactionSale/{id} | Find a model instance by {{id}} from the data source.
[**logTransactionSaleFindOne**](LogTransactionSaleApi.md#logTransactionSaleFindOne) | **GET** /LogTransactionSale/findOne | Find first instance of the model matched by filter from the data source.
[**logTransactionSaleUpdateAll**](LogTransactionSaleApi.md#logTransactionSaleUpdateAll) | **POST** /LogTransactionSale/update | Update instances of the model matched by {{where}} from the data source.


<a name="logTransactionSaleCount"></a>
# **logTransactionSaleCount**
> InlineResponse200 logTransactionSaleCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionSaleApi;

LogTransactionSaleApi apiInstance = new LogTransactionSaleApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.logTransactionSaleCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionSaleApi#logTransactionSaleCount");
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

<a name="logTransactionSaleCreate"></a>
# **logTransactionSaleCreate**
> LogTransactionSale logTransactionSaleCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionSaleApi;

LogTransactionSaleApi apiInstance = new LogTransactionSaleApi();
LogTransactionSale data = new LogTransactionSale(); // LogTransactionSale | Model instance data
try {
    LogTransactionSale result = apiInstance.logTransactionSaleCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionSaleApi#logTransactionSaleCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**LogTransactionSale**](LogTransactionSale.md)| Model instance data | [optional]

### Return type

[**LogTransactionSale**](LogTransactionSale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logTransactionSaleFind"></a>
# **logTransactionSaleFind**
> List&lt;LogTransactionSale&gt; logTransactionSaleFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionSaleApi;

LogTransactionSaleApi apiInstance = new LogTransactionSaleApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<LogTransactionSale> result = apiInstance.logTransactionSaleFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionSaleApi#logTransactionSaleFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;LogTransactionSale&gt;**](LogTransactionSale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logTransactionSaleFindById"></a>
# **logTransactionSaleFindById**
> LogTransactionSale logTransactionSaleFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionSaleApi;

LogTransactionSaleApi apiInstance = new LogTransactionSaleApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogTransactionSale result = apiInstance.logTransactionSaleFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionSaleApi#logTransactionSaleFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogTransactionSale**](LogTransactionSale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logTransactionSaleFindOne"></a>
# **logTransactionSaleFindOne**
> LogTransactionSale logTransactionSaleFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionSaleApi;

LogTransactionSaleApi apiInstance = new LogTransactionSaleApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogTransactionSale result = apiInstance.logTransactionSaleFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionSaleApi#logTransactionSaleFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogTransactionSale**](LogTransactionSale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logTransactionSaleUpdateAll"></a>
# **logTransactionSaleUpdateAll**
> InlineResponse2002 logTransactionSaleUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionSaleApi;

LogTransactionSaleApi apiInstance = new LogTransactionSaleApi();
String where = "where_example"; // String | Criteria to match model instances
LogTransactionSale data = new LogTransactionSale(); // LogTransactionSale | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.logTransactionSaleUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionSaleApi#logTransactionSaleUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**LogTransactionSale**](LogTransactionSale.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

