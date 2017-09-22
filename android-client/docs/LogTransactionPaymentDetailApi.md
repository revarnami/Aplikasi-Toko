# LogTransactionPaymentDetailApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logTransactionPaymentDetailCount**](LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailCount) | **GET** /LogTransactionPaymentDetail/count | Count instances of the model matched by where from the data source.
[**logTransactionPaymentDetailCreate**](LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailCreate) | **POST** /LogTransactionPaymentDetail | Create a new instance of the model and persist it into the data source.
[**logTransactionPaymentDetailFind**](LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailFind) | **GET** /LogTransactionPaymentDetail | Find all instances of the model matched by filter from the data source.
[**logTransactionPaymentDetailFindById**](LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailFindById) | **GET** /LogTransactionPaymentDetail/{id} | Find a model instance by {{id}} from the data source.
[**logTransactionPaymentDetailFindOne**](LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailFindOne) | **GET** /LogTransactionPaymentDetail/findOne | Find first instance of the model matched by filter from the data source.
[**logTransactionPaymentDetailUpdateAll**](LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailUpdateAll) | **POST** /LogTransactionPaymentDetail/update | Update instances of the model matched by {{where}} from the data source.


<a name="logTransactionPaymentDetailCount"></a>
# **logTransactionPaymentDetailCount**
> InlineResponse200 logTransactionPaymentDetailCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionPaymentDetailApi;

LogTransactionPaymentDetailApi apiInstance = new LogTransactionPaymentDetailApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.logTransactionPaymentDetailCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionPaymentDetailApi#logTransactionPaymentDetailCount");
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

<a name="logTransactionPaymentDetailCreate"></a>
# **logTransactionPaymentDetailCreate**
> LogTransactionPaymentDetail logTransactionPaymentDetailCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionPaymentDetailApi;

LogTransactionPaymentDetailApi apiInstance = new LogTransactionPaymentDetailApi();
LogTransactionPaymentDetail data = new LogTransactionPaymentDetail(); // LogTransactionPaymentDetail | Model instance data
try {
    LogTransactionPaymentDetail result = apiInstance.logTransactionPaymentDetailCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionPaymentDetailApi#logTransactionPaymentDetailCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**LogTransactionPaymentDetail**](LogTransactionPaymentDetail.md)| Model instance data | [optional]

### Return type

[**LogTransactionPaymentDetail**](LogTransactionPaymentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logTransactionPaymentDetailFind"></a>
# **logTransactionPaymentDetailFind**
> List&lt;LogTransactionPaymentDetail&gt; logTransactionPaymentDetailFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionPaymentDetailApi;

LogTransactionPaymentDetailApi apiInstance = new LogTransactionPaymentDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<LogTransactionPaymentDetail> result = apiInstance.logTransactionPaymentDetailFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionPaymentDetailApi#logTransactionPaymentDetailFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;LogTransactionPaymentDetail&gt;**](LogTransactionPaymentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logTransactionPaymentDetailFindById"></a>
# **logTransactionPaymentDetailFindById**
> LogTransactionPaymentDetail logTransactionPaymentDetailFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionPaymentDetailApi;

LogTransactionPaymentDetailApi apiInstance = new LogTransactionPaymentDetailApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogTransactionPaymentDetail result = apiInstance.logTransactionPaymentDetailFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionPaymentDetailApi#logTransactionPaymentDetailFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogTransactionPaymentDetail**](LogTransactionPaymentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logTransactionPaymentDetailFindOne"></a>
# **logTransactionPaymentDetailFindOne**
> LogTransactionPaymentDetail logTransactionPaymentDetailFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionPaymentDetailApi;

LogTransactionPaymentDetailApi apiInstance = new LogTransactionPaymentDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    LogTransactionPaymentDetail result = apiInstance.logTransactionPaymentDetailFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionPaymentDetailApi#logTransactionPaymentDetailFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**LogTransactionPaymentDetail**](LogTransactionPaymentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="logTransactionPaymentDetailUpdateAll"></a>
# **logTransactionPaymentDetailUpdateAll**
> InlineResponse2002 logTransactionPaymentDetailUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.LogTransactionPaymentDetailApi;

LogTransactionPaymentDetailApi apiInstance = new LogTransactionPaymentDetailApi();
String where = "where_example"; // String | Criteria to match model instances
LogTransactionPaymentDetail data = new LogTransactionPaymentDetail(); // LogTransactionPaymentDetail | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.logTransactionPaymentDetailUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogTransactionPaymentDetailApi#logTransactionPaymentDetailUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**LogTransactionPaymentDetail**](LogTransactionPaymentDetail.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

