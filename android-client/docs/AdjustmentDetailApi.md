# AdjustmentDetailApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustmentDetailCount**](AdjustmentDetailApi.md#adjustmentDetailCount) | **GET** /AdjustmentDetail/count | Count instances of the model matched by where from the data source.
[**adjustmentDetailCreate**](AdjustmentDetailApi.md#adjustmentDetailCreate) | **POST** /AdjustmentDetail | Create a new instance of the model and persist it into the data source.
[**adjustmentDetailFind**](AdjustmentDetailApi.md#adjustmentDetailFind) | **GET** /AdjustmentDetail | Find all instances of the model matched by filter from the data source.
[**adjustmentDetailFindById**](AdjustmentDetailApi.md#adjustmentDetailFindById) | **GET** /AdjustmentDetail/{id} | Find a model instance by {{id}} from the data source.
[**adjustmentDetailFindOne**](AdjustmentDetailApi.md#adjustmentDetailFindOne) | **GET** /AdjustmentDetail/findOne | Find first instance of the model matched by filter from the data source.
[**adjustmentDetailPrototypeGetAdjustment**](AdjustmentDetailApi.md#adjustmentDetailPrototypeGetAdjustment) | **GET** /AdjustmentDetail/{id}/adjustment | Fetches belongsTo relation adjustment.
[**adjustmentDetailPrototypeGetItemVariant**](AdjustmentDetailApi.md#adjustmentDetailPrototypeGetItemVariant) | **GET** /AdjustmentDetail/{id}/itemVariant | Fetches belongsTo relation itemVariant.
[**adjustmentDetailUpdateAll**](AdjustmentDetailApi.md#adjustmentDetailUpdateAll) | **POST** /AdjustmentDetail/update | Update instances of the model matched by {{where}} from the data source.


<a name="adjustmentDetailCount"></a>
# **adjustmentDetailCount**
> InlineResponse200 adjustmentDetailCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentDetailApi;

AdjustmentDetailApi apiInstance = new AdjustmentDetailApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.adjustmentDetailCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentDetailApi#adjustmentDetailCount");
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

<a name="adjustmentDetailCreate"></a>
# **adjustmentDetailCreate**
> AdjustmentDetail adjustmentDetailCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentDetailApi;

AdjustmentDetailApi apiInstance = new AdjustmentDetailApi();
AdjustmentDetail data = new AdjustmentDetail(); // AdjustmentDetail | Model instance data
try {
    AdjustmentDetail result = apiInstance.adjustmentDetailCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentDetailApi#adjustmentDetailCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**AdjustmentDetail**](AdjustmentDetail.md)| Model instance data | [optional]

### Return type

[**AdjustmentDetail**](AdjustmentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="adjustmentDetailFind"></a>
# **adjustmentDetailFind**
> List&lt;AdjustmentDetail&gt; adjustmentDetailFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentDetailApi;

AdjustmentDetailApi apiInstance = new AdjustmentDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<AdjustmentDetail> result = apiInstance.adjustmentDetailFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentDetailApi#adjustmentDetailFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;AdjustmentDetail&gt;**](AdjustmentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="adjustmentDetailFindById"></a>
# **adjustmentDetailFindById**
> AdjustmentDetail adjustmentDetailFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentDetailApi;

AdjustmentDetailApi apiInstance = new AdjustmentDetailApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    AdjustmentDetail result = apiInstance.adjustmentDetailFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentDetailApi#adjustmentDetailFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**AdjustmentDetail**](AdjustmentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="adjustmentDetailFindOne"></a>
# **adjustmentDetailFindOne**
> AdjustmentDetail adjustmentDetailFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentDetailApi;

AdjustmentDetailApi apiInstance = new AdjustmentDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    AdjustmentDetail result = apiInstance.adjustmentDetailFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentDetailApi#adjustmentDetailFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**AdjustmentDetail**](AdjustmentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="adjustmentDetailPrototypeGetAdjustment"></a>
# **adjustmentDetailPrototypeGetAdjustment**
> Adjustment adjustmentDetailPrototypeGetAdjustment(id, refresh)

Fetches belongsTo relation adjustment.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentDetailApi;

AdjustmentDetailApi apiInstance = new AdjustmentDetailApi();
String id = "id_example"; // String | AdjustmentDetail id
Boolean refresh = true; // Boolean | 
try {
    Adjustment result = apiInstance.adjustmentDetailPrototypeGetAdjustment(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentDetailApi#adjustmentDetailPrototypeGetAdjustment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| AdjustmentDetail id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Adjustment**](Adjustment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="adjustmentDetailPrototypeGetItemVariant"></a>
# **adjustmentDetailPrototypeGetItemVariant**
> ItemVariant adjustmentDetailPrototypeGetItemVariant(id, refresh)

Fetches belongsTo relation itemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentDetailApi;

AdjustmentDetailApi apiInstance = new AdjustmentDetailApi();
String id = "id_example"; // String | AdjustmentDetail id
Boolean refresh = true; // Boolean | 
try {
    ItemVariant result = apiInstance.adjustmentDetailPrototypeGetItemVariant(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentDetailApi#adjustmentDetailPrototypeGetItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| AdjustmentDetail id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="adjustmentDetailUpdateAll"></a>
# **adjustmentDetailUpdateAll**
> InlineResponse2002 adjustmentDetailUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.AdjustmentDetailApi;

AdjustmentDetailApi apiInstance = new AdjustmentDetailApi();
String where = "where_example"; // String | Criteria to match model instances
AdjustmentDetail data = new AdjustmentDetail(); // AdjustmentDetail | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.adjustmentDetailUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdjustmentDetailApi#adjustmentDetailUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**AdjustmentDetail**](AdjustmentDetail.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

