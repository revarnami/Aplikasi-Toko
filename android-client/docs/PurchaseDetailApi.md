# PurchaseDetailApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**purchaseDetailCount**](PurchaseDetailApi.md#purchaseDetailCount) | **GET** /PurchaseDetail/count | Count instances of the model matched by where from the data source.
[**purchaseDetailCreatePurchaseDetail**](PurchaseDetailApi.md#purchaseDetailCreatePurchaseDetail) | **POST** /PurchaseDetail | Create Purchase Detail, Log Purchase
[**purchaseDetailDeletePurchaseDetail**](PurchaseDetailApi.md#purchaseDetailDeletePurchaseDetail) | **DELETE** /PurchaseDetail | Delete Purchase Detail, Log Purchase
[**purchaseDetailFind**](PurchaseDetailApi.md#purchaseDetailFind) | **GET** /PurchaseDetail | Find all instances of the model matched by filter from the data source.
[**purchaseDetailFindById**](PurchaseDetailApi.md#purchaseDetailFindById) | **GET** /PurchaseDetail/{id} | Find a model instance by {{id}} from the data source.
[**purchaseDetailFindOne**](PurchaseDetailApi.md#purchaseDetailFindOne) | **GET** /PurchaseDetail/findOne | Find first instance of the model matched by filter from the data source.
[**purchaseDetailPrototypeGetItemVariant**](PurchaseDetailApi.md#purchaseDetailPrototypeGetItemVariant) | **GET** /PurchaseDetail/{id}/itemVariant | Fetches belongsTo relation itemVariant.
[**purchaseDetailPrototypeGetPurchase**](PurchaseDetailApi.md#purchaseDetailPrototypeGetPurchase) | **GET** /PurchaseDetail/{id}/purchase | Fetches belongsTo relation purchase.
[**purchaseDetailUpdateAll**](PurchaseDetailApi.md#purchaseDetailUpdateAll) | **POST** /PurchaseDetail/update | Update instances of the model matched by {{where}} from the data source.


<a name="purchaseDetailCount"></a>
# **purchaseDetailCount**
> InlineResponse200 purchaseDetailCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseDetailApi;

PurchaseDetailApi apiInstance = new PurchaseDetailApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.purchaseDetailCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseDetailApi#purchaseDetailCount");
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

<a name="purchaseDetailCreatePurchaseDetail"></a>
# **purchaseDetailCreatePurchaseDetail**
> Object purchaseDetailCreatePurchaseDetail(request)

Create Purchase Detail, Log Purchase

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseDetailApi;

PurchaseDetailApi apiInstance = new PurchaseDetailApi();
Object request = null; // Object | 
try {
    Object result = apiInstance.purchaseDetailCreatePurchaseDetail(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseDetailApi#purchaseDetailCreatePurchaseDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | **Object**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchaseDetailDeletePurchaseDetail"></a>
# **purchaseDetailDeletePurchaseDetail**
> Object purchaseDetailDeletePurchaseDetail(request)

Delete Purchase Detail, Log Purchase

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseDetailApi;

PurchaseDetailApi apiInstance = new PurchaseDetailApi();
Object request = null; // Object | 
try {
    Object result = apiInstance.purchaseDetailDeletePurchaseDetail(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseDetailApi#purchaseDetailDeletePurchaseDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | **Object**|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchaseDetailFind"></a>
# **purchaseDetailFind**
> List&lt;PurchaseDetail&gt; purchaseDetailFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseDetailApi;

PurchaseDetailApi apiInstance = new PurchaseDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<PurchaseDetail> result = apiInstance.purchaseDetailFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseDetailApi#purchaseDetailFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;PurchaseDetail&gt;**](PurchaseDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchaseDetailFindById"></a>
# **purchaseDetailFindById**
> PurchaseDetail purchaseDetailFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseDetailApi;

PurchaseDetailApi apiInstance = new PurchaseDetailApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    PurchaseDetail result = apiInstance.purchaseDetailFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseDetailApi#purchaseDetailFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**PurchaseDetail**](PurchaseDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchaseDetailFindOne"></a>
# **purchaseDetailFindOne**
> PurchaseDetail purchaseDetailFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseDetailApi;

PurchaseDetailApi apiInstance = new PurchaseDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    PurchaseDetail result = apiInstance.purchaseDetailFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseDetailApi#purchaseDetailFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**PurchaseDetail**](PurchaseDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchaseDetailPrototypeGetItemVariant"></a>
# **purchaseDetailPrototypeGetItemVariant**
> ItemVariant purchaseDetailPrototypeGetItemVariant(id, refresh)

Fetches belongsTo relation itemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseDetailApi;

PurchaseDetailApi apiInstance = new PurchaseDetailApi();
String id = "id_example"; // String | PurchaseDetail id
Boolean refresh = true; // Boolean | 
try {
    ItemVariant result = apiInstance.purchaseDetailPrototypeGetItemVariant(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseDetailApi#purchaseDetailPrototypeGetItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| PurchaseDetail id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchaseDetailPrototypeGetPurchase"></a>
# **purchaseDetailPrototypeGetPurchase**
> Purchase purchaseDetailPrototypeGetPurchase(id, refresh)

Fetches belongsTo relation purchase.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseDetailApi;

PurchaseDetailApi apiInstance = new PurchaseDetailApi();
String id = "id_example"; // String | PurchaseDetail id
Boolean refresh = true; // Boolean | 
try {
    Purchase result = apiInstance.purchaseDetailPrototypeGetPurchase(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseDetailApi#purchaseDetailPrototypeGetPurchase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| PurchaseDetail id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Purchase**](Purchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchaseDetailUpdateAll"></a>
# **purchaseDetailUpdateAll**
> InlineResponse2002 purchaseDetailUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseDetailApi;

PurchaseDetailApi apiInstance = new PurchaseDetailApi();
String where = "where_example"; // String | Criteria to match model instances
PurchaseDetail data = new PurchaseDetail(); // PurchaseDetail | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.purchaseDetailUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseDetailApi#purchaseDetailUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**PurchaseDetail**](PurchaseDetail.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

