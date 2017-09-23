# ReceivableApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**receivableCount**](ReceivableApi.md#receivableCount) | **GET** /Receivable/count | Count instances of the model matched by where from the data source.
[**receivableCreate**](ReceivableApi.md#receivableCreate) | **POST** /Receivable | Create a new instance of the model and persist it into the data source.
[**receivableFind**](ReceivableApi.md#receivableFind) | **GET** /Receivable | Find all instances of the model matched by filter from the data source.
[**receivableFindById**](ReceivableApi.md#receivableFindById) | **GET** /Receivable/{id} | Find a model instance by {{id}} from the data source.
[**receivableFindOne**](ReceivableApi.md#receivableFindOne) | **GET** /Receivable/findOne | Find first instance of the model matched by filter from the data source.
[**receivablePrototypeCountReceivablePaymentDetail**](ReceivableApi.md#receivablePrototypeCountReceivablePaymentDetail) | **GET** /Receivable/{id}/receivablePaymentDetail/count | Counts receivablePaymentDetail of Receivable.
[**receivablePrototypeGetReceivablePaymentDetail**](ReceivableApi.md#receivablePrototypeGetReceivablePaymentDetail) | **GET** /Receivable/{id}/receivablePaymentDetail | Queries receivablePaymentDetail of Receivable.
[**receivablePrototypeGetSale**](ReceivableApi.md#receivablePrototypeGetSale) | **GET** /Receivable/{id}/sale | Fetches belongsTo relation sale.
[**receivableUpdateAll**](ReceivableApi.md#receivableUpdateAll) | **POST** /Receivable/update | Update instances of the model matched by {{where}} from the data source.


<a name="receivableCount"></a>
# **receivableCount**
> InlineResponse200 receivableCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivableApi;

ReceivableApi apiInstance = new ReceivableApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.receivableCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivableApi#receivableCount");
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

<a name="receivableCreate"></a>
# **receivableCreate**
> Receivable receivableCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivableApi;

ReceivableApi apiInstance = new ReceivableApi();
Receivable data = new Receivable(); // Receivable | Model instance data
try {
    Receivable result = apiInstance.receivableCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivableApi#receivableCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Receivable**](Receivable.md)| Model instance data | [optional]

### Return type

[**Receivable**](Receivable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivableFind"></a>
# **receivableFind**
> List&lt;Receivable&gt; receivableFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivableApi;

ReceivableApi apiInstance = new ReceivableApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Receivable> result = apiInstance.receivableFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivableApi#receivableFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Receivable&gt;**](Receivable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivableFindById"></a>
# **receivableFindById**
> Receivable receivableFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivableApi;

ReceivableApi apiInstance = new ReceivableApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Receivable result = apiInstance.receivableFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivableApi#receivableFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Receivable**](Receivable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivableFindOne"></a>
# **receivableFindOne**
> Receivable receivableFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivableApi;

ReceivableApi apiInstance = new ReceivableApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Receivable result = apiInstance.receivableFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivableApi#receivableFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Receivable**](Receivable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePrototypeCountReceivablePaymentDetail"></a>
# **receivablePrototypeCountReceivablePaymentDetail**
> InlineResponse200 receivablePrototypeCountReceivablePaymentDetail(id, where)

Counts receivablePaymentDetail of Receivable.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivableApi;

ReceivableApi apiInstance = new ReceivableApi();
String id = "id_example"; // String | Receivable id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.receivablePrototypeCountReceivablePaymentDetail(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivableApi#receivablePrototypeCountReceivablePaymentDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Receivable id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePrototypeGetReceivablePaymentDetail"></a>
# **receivablePrototypeGetReceivablePaymentDetail**
> List&lt;ReceivablePaymentDetail&gt; receivablePrototypeGetReceivablePaymentDetail(id, filter)

Queries receivablePaymentDetail of Receivable.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivableApi;

ReceivableApi apiInstance = new ReceivableApi();
String id = "id_example"; // String | Receivable id
String filter = "filter_example"; // String | 
try {
    List<ReceivablePaymentDetail> result = apiInstance.receivablePrototypeGetReceivablePaymentDetail(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivableApi#receivablePrototypeGetReceivablePaymentDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Receivable id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;ReceivablePaymentDetail&gt;**](ReceivablePaymentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivablePrototypeGetSale"></a>
# **receivablePrototypeGetSale**
> Sale receivablePrototypeGetSale(id, refresh)

Fetches belongsTo relation sale.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivableApi;

ReceivableApi apiInstance = new ReceivableApi();
String id = "id_example"; // String | Receivable id
Boolean refresh = true; // Boolean | 
try {
    Sale result = apiInstance.receivablePrototypeGetSale(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivableApi#receivablePrototypeGetSale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Receivable id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Sale**](Sale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="receivableUpdateAll"></a>
# **receivableUpdateAll**
> InlineResponse2002 receivableUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ReceivableApi;

ReceivableApi apiInstance = new ReceivableApi();
String where = "where_example"; // String | Criteria to match model instances
Receivable data = new Receivable(); // Receivable | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.receivableUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceivableApi#receivableUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Receivable**](Receivable.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

