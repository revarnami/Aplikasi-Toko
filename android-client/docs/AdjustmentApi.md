# AdjustmentApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustmentCount**](AdjustmentApi.md#adjustmentCount) | **GET** /Adjustment/count | Count instances of the model matched by where from the data source.
[**adjustmentCreateAdjustment**](AdjustmentApi.md#adjustmentCreateAdjustment) | **POST** /Adjustment | Create Adjustment, Adjustment Detail
[**adjustmentFind**](AdjustmentApi.md#adjustmentFind) | **GET** /Adjustment | Find all instances of the model matched by filter from the data source.
[**adjustmentFindById**](AdjustmentApi.md#adjustmentFindById) | **GET** /Adjustment/{id} | Find a model instance by {{id}} from the data source.
[**adjustmentFindOne**](AdjustmentApi.md#adjustmentFindOne) | **GET** /Adjustment/findOne | Find first instance of the model matched by filter from the data source.
[**adjustmentPrototypeCountAdjustmentDetail**](AdjustmentApi.md#adjustmentPrototypeCountAdjustmentDetail) | **GET** /Adjustment/{id}/adjustmentDetail/count | Counts adjustmentDetail of Adjustment.
[**adjustmentPrototypeGetAdjustmentDetail**](AdjustmentApi.md#adjustmentPrototypeGetAdjustmentDetail) | **GET** /Adjustment/{id}/adjustmentDetail | Queries adjustmentDetail of Adjustment.
[**adjustmentUpdateAll**](AdjustmentApi.md#adjustmentUpdateAll) | **POST** /Adjustment/update | Update instances of the model matched by {{where}} from the data source.


<a name="adjustmentCount"></a>
# **adjustmentCount**
> InlineResponse200 adjustmentCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentApi;

AdjustmentApi apiInstance = new AdjustmentApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.adjustmentCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentApi#adjustmentCount");
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

<a name="adjustmentCreateAdjustment"></a>
# **adjustmentCreateAdjustment**
> InlineResponse2003 adjustmentCreateAdjustment(request)

Create Adjustment, Adjustment Detail

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentApi;

AdjustmentApi apiInstance = new AdjustmentApi();
Object request = null; // Object | 
try {
    InlineResponse2003 result = apiInstance.adjustmentCreateAdjustment(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentApi#adjustmentCreateAdjustment");
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

<a name="adjustmentFind"></a>
# **adjustmentFind**
> List&lt;Adjustment&gt; adjustmentFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentApi;

AdjustmentApi apiInstance = new AdjustmentApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Adjustment> result = apiInstance.adjustmentFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentApi#adjustmentFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Adjustment&gt;**](Adjustment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="adjustmentFindById"></a>
# **adjustmentFindById**
> Adjustment adjustmentFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentApi;

AdjustmentApi apiInstance = new AdjustmentApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Adjustment result = apiInstance.adjustmentFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentApi#adjustmentFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Adjustment**](Adjustment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="adjustmentFindOne"></a>
# **adjustmentFindOne**
> Adjustment adjustmentFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentApi;

AdjustmentApi apiInstance = new AdjustmentApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Adjustment result = apiInstance.adjustmentFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentApi#adjustmentFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Adjustment**](Adjustment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="adjustmentPrototypeCountAdjustmentDetail"></a>
# **adjustmentPrototypeCountAdjustmentDetail**
> InlineResponse200 adjustmentPrototypeCountAdjustmentDetail(id, where)

Counts adjustmentDetail of Adjustment.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentApi;

AdjustmentApi apiInstance = new AdjustmentApi();
String id = "id_example"; // String | Adjustment id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.adjustmentPrototypeCountAdjustmentDetail(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentApi#adjustmentPrototypeCountAdjustmentDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Adjustment id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="adjustmentPrototypeGetAdjustmentDetail"></a>
# **adjustmentPrototypeGetAdjustmentDetail**
> List&lt;AdjustmentDetail&gt; adjustmentPrototypeGetAdjustmentDetail(id, filter)

Queries adjustmentDetail of Adjustment.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentApi;

AdjustmentApi apiInstance = new AdjustmentApi();
String id = "id_example"; // String | Adjustment id
String filter = "filter_example"; // String | 
try {
    List<AdjustmentDetail> result = apiInstance.adjustmentPrototypeGetAdjustmentDetail(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentApi#adjustmentPrototypeGetAdjustmentDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Adjustment id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;AdjustmentDetail&gt;**](AdjustmentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="adjustmentUpdateAll"></a>
# **adjustmentUpdateAll**
> InlineResponse2002 adjustmentUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentApi;

AdjustmentApi apiInstance = new AdjustmentApi();
String where = "where_example"; // String | Criteria to match model instances
Adjustment data = new Adjustment(); // Adjustment | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.adjustmentUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentApi#adjustmentUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Adjustment**](Adjustment.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

