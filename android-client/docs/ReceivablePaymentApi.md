# ReceivablePaymentApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**receivablePaymentCount**](ReceivablePaymentApi.md#receivablePaymentCount) | **GET** /ReceivablePayment/count | Count instances of the model matched by where from the data source.
[**receivablePaymentCreateReceivablePayment**](ReceivablePaymentApi.md#receivablePaymentCreateReceivablePayment) | **POST** /ReceivablePayment | Create Receivable Payment, Receivable Payment Detail
[**receivablePaymentFind**](ReceivablePaymentApi.md#receivablePaymentFind) | **GET** /ReceivablePayment | Find all instances of the model matched by filter from the data source.
[**receivablePaymentFindById**](ReceivablePaymentApi.md#receivablePaymentFindById) | **GET** /ReceivablePayment/{id} | Find a model instance by {{id}} from the data source.
[**receivablePaymentFindOne**](ReceivablePaymentApi.md#receivablePaymentFindOne) | **GET** /ReceivablePayment/findOne | Find first instance of the model matched by filter from the data source.
[**receivablePaymentPrototypeCountReceivablePaymentDetail**](ReceivablePaymentApi.md#receivablePaymentPrototypeCountReceivablePaymentDetail) | **GET** /ReceivablePayment/{id}/receivablePaymentDetail/count | Counts receivablePaymentDetail of ReceivablePayment.
[**receivablePaymentPrototypeGetReceivablePaymentDetail**](ReceivablePaymentApi.md#receivablePaymentPrototypeGetReceivablePaymentDetail) | **GET** /ReceivablePayment/{id}/receivablePaymentDetail | Queries receivablePaymentDetail of ReceivablePayment.
[**receivablePaymentUpdateAll**](ReceivablePaymentApi.md#receivablePaymentUpdateAll) | **POST** /ReceivablePayment/update | Update instances of the model matched by {{where}} from the data source.


<a name="receivablePaymentCount"></a>
# **receivablePaymentCount**
> InlineResponse200 receivablePaymentCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentApi;

ReceivablePaymentApi apiInstance = new ReceivablePaymentApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.receivablePaymentCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentApi#receivablePaymentCount");
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

<a name="receivablePaymentCreateReceivablePayment"></a>
# **receivablePaymentCreateReceivablePayment**
> InlineResponse2003 receivablePaymentCreateReceivablePayment(request)

Create Receivable Payment, Receivable Payment Detail

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentApi;

ReceivablePaymentApi apiInstance = new ReceivablePaymentApi();
Object request = null; // Object | 
try {
    InlineResponse2003 result = apiInstance.receivablePaymentCreateReceivablePayment(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentApi#receivablePaymentCreateReceivablePayment");
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

<a name="receivablePaymentFind"></a>
# **receivablePaymentFind**
> List&lt;ReceivablePayment&gt; receivablePaymentFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentApi;

ReceivablePaymentApi apiInstance = new ReceivablePaymentApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<ReceivablePayment> result = apiInstance.receivablePaymentFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentApi#receivablePaymentFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;ReceivablePayment&gt;**](ReceivablePayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentFindById"></a>
# **receivablePaymentFindById**
> ReceivablePayment receivablePaymentFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentApi;

ReceivablePaymentApi apiInstance = new ReceivablePaymentApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ReceivablePayment result = apiInstance.receivablePaymentFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentApi#receivablePaymentFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ReceivablePayment**](ReceivablePayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentFindOne"></a>
# **receivablePaymentFindOne**
> ReceivablePayment receivablePaymentFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentApi;

ReceivablePaymentApi apiInstance = new ReceivablePaymentApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ReceivablePayment result = apiInstance.receivablePaymentFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentApi#receivablePaymentFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ReceivablePayment**](ReceivablePayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentPrototypeCountReceivablePaymentDetail"></a>
# **receivablePaymentPrototypeCountReceivablePaymentDetail**
> InlineResponse200 receivablePaymentPrototypeCountReceivablePaymentDetail(id, where)

Counts receivablePaymentDetail of ReceivablePayment.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentApi;

ReceivablePaymentApi apiInstance = new ReceivablePaymentApi();
String id = "id_example"; // String | ReceivablePayment id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.receivablePaymentPrototypeCountReceivablePaymentDetail(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentApi#receivablePaymentPrototypeCountReceivablePaymentDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ReceivablePayment id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentPrototypeGetReceivablePaymentDetail"></a>
# **receivablePaymentPrototypeGetReceivablePaymentDetail**
> List&lt;ReceivablePaymentDetail&gt; receivablePaymentPrototypeGetReceivablePaymentDetail(id, filter)

Queries receivablePaymentDetail of ReceivablePayment.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentApi;

ReceivablePaymentApi apiInstance = new ReceivablePaymentApi();
String id = "id_example"; // String | ReceivablePayment id
String filter = "filter_example"; // String | 
try {
    List<ReceivablePaymentDetail> result = apiInstance.receivablePaymentPrototypeGetReceivablePaymentDetail(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentApi#receivablePaymentPrototypeGetReceivablePaymentDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ReceivablePayment id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;ReceivablePaymentDetail&gt;**](ReceivablePaymentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentUpdateAll"></a>
# **receivablePaymentUpdateAll**
> InlineResponse2002 receivablePaymentUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentApi;

ReceivablePaymentApi apiInstance = new ReceivablePaymentApi();
String where = "where_example"; // String | Criteria to match model instances
ReceivablePayment data = new ReceivablePayment(); // ReceivablePayment | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.receivablePaymentUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentApi#receivablePaymentUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**ReceivablePayment**](ReceivablePayment.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

