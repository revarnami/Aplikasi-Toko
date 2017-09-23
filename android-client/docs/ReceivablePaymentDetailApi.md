# ReceivablePaymentDetailApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**receivablePaymentDetailCount**](ReceivablePaymentDetailApi.md#receivablePaymentDetailCount) | **GET** /ReceivablePaymentDetail/count | Count instances of the model matched by where from the data source.
[**receivablePaymentDetailCreate**](ReceivablePaymentDetailApi.md#receivablePaymentDetailCreate) | **POST** /ReceivablePaymentDetail | Create a new instance of the model and persist it into the data source.
[**receivablePaymentDetailDeletePaymentDetail**](ReceivablePaymentDetailApi.md#receivablePaymentDetailDeletePaymentDetail) | **DELETE** /ReceivablePaymentDetail | Delete Payment Detail
[**receivablePaymentDetailFind**](ReceivablePaymentDetailApi.md#receivablePaymentDetailFind) | **GET** /ReceivablePaymentDetail | Find all instances of the model matched by filter from the data source.
[**receivablePaymentDetailFindById**](ReceivablePaymentDetailApi.md#receivablePaymentDetailFindById) | **GET** /ReceivablePaymentDetail/{id} | Find a model instance by {{id}} from the data source.
[**receivablePaymentDetailFindOne**](ReceivablePaymentDetailApi.md#receivablePaymentDetailFindOne) | **GET** /ReceivablePaymentDetail/findOne | Find first instance of the model matched by filter from the data source.
[**receivablePaymentDetailPrototypeGetReceivable**](ReceivablePaymentDetailApi.md#receivablePaymentDetailPrototypeGetReceivable) | **GET** /ReceivablePaymentDetail/{id}/receivable | Fetches belongsTo relation receivable.
[**receivablePaymentDetailPrototypeGetReceivablePayment**](ReceivablePaymentDetailApi.md#receivablePaymentDetailPrototypeGetReceivablePayment) | **GET** /ReceivablePaymentDetail/{id}/receivablePayment | Fetches belongsTo relation receivablePayment.
[**receivablePaymentDetailUpdateAll**](ReceivablePaymentDetailApi.md#receivablePaymentDetailUpdateAll) | **POST** /ReceivablePaymentDetail/update | Update instances of the model matched by {{where}} from the data source.


<a name="receivablePaymentDetailCount"></a>
# **receivablePaymentDetailCount**
> InlineResponse200 receivablePaymentDetailCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentDetailApi;

ReceivablePaymentDetailApi apiInstance = new ReceivablePaymentDetailApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.receivablePaymentDetailCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentDetailApi#receivablePaymentDetailCount");
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

<a name="receivablePaymentDetailCreate"></a>
# **receivablePaymentDetailCreate**
> ReceivablePaymentDetail receivablePaymentDetailCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentDetailApi;

ReceivablePaymentDetailApi apiInstance = new ReceivablePaymentDetailApi();
ReceivablePaymentDetail data = new ReceivablePaymentDetail(); // ReceivablePaymentDetail | Model instance data
try {
    ReceivablePaymentDetail result = apiInstance.receivablePaymentDetailCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentDetailApi#receivablePaymentDetailCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ReceivablePaymentDetail**](ReceivablePaymentDetail.md)| Model instance data | [optional]

### Return type

[**ReceivablePaymentDetail**](ReceivablePaymentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentDetailDeletePaymentDetail"></a>
# **receivablePaymentDetailDeletePaymentDetail**
> Object receivablePaymentDetailDeletePaymentDetail(data)

Delete Payment Detail

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentDetailApi;

ReceivablePaymentDetailApi apiInstance = new ReceivablePaymentDetailApi();
ReceivablePaymentDetail data = new ReceivablePaymentDetail(); // ReceivablePaymentDetail | 
try {
    Object result = apiInstance.receivablePaymentDetailDeletePaymentDetail(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentDetailApi#receivablePaymentDetailDeletePaymentDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ReceivablePaymentDetail**](ReceivablePaymentDetail.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentDetailFind"></a>
# **receivablePaymentDetailFind**
> List&lt;ReceivablePaymentDetail&gt; receivablePaymentDetailFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentDetailApi;

ReceivablePaymentDetailApi apiInstance = new ReceivablePaymentDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<ReceivablePaymentDetail> result = apiInstance.receivablePaymentDetailFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentDetailApi#receivablePaymentDetailFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;ReceivablePaymentDetail&gt;**](ReceivablePaymentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentDetailFindById"></a>
# **receivablePaymentDetailFindById**
> ReceivablePaymentDetail receivablePaymentDetailFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentDetailApi;

ReceivablePaymentDetailApi apiInstance = new ReceivablePaymentDetailApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ReceivablePaymentDetail result = apiInstance.receivablePaymentDetailFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentDetailApi#receivablePaymentDetailFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ReceivablePaymentDetail**](ReceivablePaymentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentDetailFindOne"></a>
# **receivablePaymentDetailFindOne**
> ReceivablePaymentDetail receivablePaymentDetailFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentDetailApi;

ReceivablePaymentDetailApi apiInstance = new ReceivablePaymentDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ReceivablePaymentDetail result = apiInstance.receivablePaymentDetailFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentDetailApi#receivablePaymentDetailFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ReceivablePaymentDetail**](ReceivablePaymentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentDetailPrototypeGetReceivable"></a>
# **receivablePaymentDetailPrototypeGetReceivable**
> Receivable receivablePaymentDetailPrototypeGetReceivable(id, refresh)

Fetches belongsTo relation receivable.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentDetailApi;

ReceivablePaymentDetailApi apiInstance = new ReceivablePaymentDetailApi();
String id = "id_example"; // String | ReceivablePaymentDetail id
Boolean refresh = true; // Boolean | 
try {
    Receivable result = apiInstance.receivablePaymentDetailPrototypeGetReceivable(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentDetailApi#receivablePaymentDetailPrototypeGetReceivable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ReceivablePaymentDetail id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Receivable**](Receivable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentDetailPrototypeGetReceivablePayment"></a>
# **receivablePaymentDetailPrototypeGetReceivablePayment**
> ReceivablePayment receivablePaymentDetailPrototypeGetReceivablePayment(id, refresh)

Fetches belongsTo relation receivablePayment.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentDetailApi;

ReceivablePaymentDetailApi apiInstance = new ReceivablePaymentDetailApi();
String id = "id_example"; // String | ReceivablePaymentDetail id
Boolean refresh = true; // Boolean | 
try {
    ReceivablePayment result = apiInstance.receivablePaymentDetailPrototypeGetReceivablePayment(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentDetailApi#receivablePaymentDetailPrototypeGetReceivablePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ReceivablePaymentDetail id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ReceivablePayment**](ReceivablePayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePaymentDetailUpdateAll"></a>
# **receivablePaymentDetailUpdateAll**
> InlineResponse2002 receivablePaymentDetailUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivablePaymentDetailApi;

ReceivablePaymentDetailApi apiInstance = new ReceivablePaymentDetailApi();
String where = "where_example"; // String | Criteria to match model instances
ReceivablePaymentDetail data = new ReceivablePaymentDetail(); // ReceivablePaymentDetail | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.receivablePaymentDetailUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivablePaymentDetailApi#receivablePaymentDetailUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**ReceivablePaymentDetail**](ReceivablePaymentDetail.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

