# PurchaseApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**purchaseCount**](PurchaseApi.md#purchaseCount) | **GET** /Purchase/count | Count instances of the model matched by where from the data source.
[**purchaseCreatePurchase**](PurchaseApi.md#purchaseCreatePurchase) | **POST** /Purchase | Create Purchase, Purchase Detail, Log Purchase
[**purchaseDeletePurchase**](PurchaseApi.md#purchaseDeletePurchase) | **DELETE** /Purchase | Delete Purchase, Purchase Detail, Receivable (if exist)
[**purchaseFind**](PurchaseApi.md#purchaseFind) | **GET** /Purchase | Find all instances of the model matched by filter from the data source.
[**purchaseFindById**](PurchaseApi.md#purchaseFindById) | **GET** /Purchase/{id} | Find a model instance by {{id}} from the data source.
[**purchaseFindOne**](PurchaseApi.md#purchaseFindOne) | **GET** /Purchase/findOne | Find first instance of the model matched by filter from the data source.
[**purchasePrototypeCountPurchaseDetail**](PurchaseApi.md#purchasePrototypeCountPurchaseDetail) | **GET** /Purchase/{id}/purchaseDetail/count | Counts purchaseDetail of Purchase.
[**purchasePrototypeGetPurchaseDetail**](PurchaseApi.md#purchasePrototypeGetPurchaseDetail) | **GET** /Purchase/{id}/purchaseDetail | Queries purchaseDetail of Purchase.
[**purchaseUpdateAll**](PurchaseApi.md#purchaseUpdateAll) | **POST** /Purchase/update | Update instances of the model matched by {{where}} from the data source.


<a name="purchaseCount"></a>
# **purchaseCount**
> InlineResponse200 purchaseCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseApi;

PurchaseApi apiInstance = new PurchaseApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.purchaseCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseCount");
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

<a name="purchaseCreatePurchase"></a>
# **purchaseCreatePurchase**
> Object purchaseCreatePurchase(request)

Create Purchase, Purchase Detail, Log Purchase

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseApi;

PurchaseApi apiInstance = new PurchaseApi();
Object request = null; // Object | 
try {
    Object result = apiInstance.purchaseCreatePurchase(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseCreatePurchase");
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

<a name="purchaseDeletePurchase"></a>
# **purchaseDeletePurchase**
> Object purchaseDeletePurchase(data)

Delete Purchase, Purchase Detail, Receivable (if exist)

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseApi;

PurchaseApi apiInstance = new PurchaseApi();
Purchase data = new Purchase(); // Purchase | 
try {
    Object result = apiInstance.purchaseDeletePurchase(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseDeletePurchase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Purchase**](Purchase.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchaseFind"></a>
# **purchaseFind**
> List&lt;Purchase&gt; purchaseFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseApi;

PurchaseApi apiInstance = new PurchaseApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Purchase> result = apiInstance.purchaseFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Purchase&gt;**](Purchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchaseFindById"></a>
# **purchaseFindById**
> Purchase purchaseFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseApi;

PurchaseApi apiInstance = new PurchaseApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Purchase result = apiInstance.purchaseFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Purchase**](Purchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchaseFindOne"></a>
# **purchaseFindOne**
> Purchase purchaseFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseApi;

PurchaseApi apiInstance = new PurchaseApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Purchase result = apiInstance.purchaseFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Purchase**](Purchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchasePrototypeCountPurchaseDetail"></a>
# **purchasePrototypeCountPurchaseDetail**
> InlineResponse200 purchasePrototypeCountPurchaseDetail(id, where)

Counts purchaseDetail of Purchase.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseApi;

PurchaseApi apiInstance = new PurchaseApi();
String id = "id_example"; // String | Purchase id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.purchasePrototypeCountPurchaseDetail(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchasePrototypeCountPurchaseDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Purchase id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchasePrototypeGetPurchaseDetail"></a>
# **purchasePrototypeGetPurchaseDetail**
> List&lt;PurchaseDetail&gt; purchasePrototypeGetPurchaseDetail(id, filter)

Queries purchaseDetail of Purchase.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseApi;

PurchaseApi apiInstance = new PurchaseApi();
String id = "id_example"; // String | Purchase id
String filter = "filter_example"; // String | 
try {
    List<PurchaseDetail> result = apiInstance.purchasePrototypeGetPurchaseDetail(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchasePrototypeGetPurchaseDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Purchase id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;PurchaseDetail&gt;**](PurchaseDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="purchaseUpdateAll"></a>
# **purchaseUpdateAll**
> InlineResponse2002 purchaseUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.PurchaseApi;

PurchaseApi apiInstance = new PurchaseApi();
String where = "where_example"; // String | Criteria to match model instances
Purchase data = new Purchase(); // Purchase | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.purchaseUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PurchaseApi#purchaseUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Purchase**](Purchase.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

