# ItemVariantStockApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemVariantStockCount**](ItemVariantStockApi.md#itemVariantStockCount) | **GET** /ItemVariantStock/count | Count instances of the model matched by where from the data source.
[**itemVariantStockCreate**](ItemVariantStockApi.md#itemVariantStockCreate) | **POST** /ItemVariantStock | Create a new instance of the model and persist it into the data source.
[**itemVariantStockFind**](ItemVariantStockApi.md#itemVariantStockFind) | **GET** /ItemVariantStock | Find all instances of the model matched by filter from the data source.
[**itemVariantStockFindById**](ItemVariantStockApi.md#itemVariantStockFindById) | **GET** /ItemVariantStock/{id} | Find a model instance by {{id}} from the data source.
[**itemVariantStockFindOne**](ItemVariantStockApi.md#itemVariantStockFindOne) | **GET** /ItemVariantStock/findOne | Find first instance of the model matched by filter from the data source.
[**itemVariantStockPrototypeGetItemVariant**](ItemVariantStockApi.md#itemVariantStockPrototypeGetItemVariant) | **GET** /ItemVariantStock/{id}/itemVariant | Fetches belongsTo relation itemVariant.
[**itemVariantStockUpdateAll**](ItemVariantStockApi.md#itemVariantStockUpdateAll) | **POST** /ItemVariantStock/update | Update instances of the model matched by {{where}} from the data source.


<a name="itemVariantStockCount"></a>
# **itemVariantStockCount**
> InlineResponse200 itemVariantStockCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantStockApi;

ItemVariantStockApi apiInstance = new ItemVariantStockApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.itemVariantStockCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantStockApi#itemVariantStockCount");
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

<a name="itemVariantStockCreate"></a>
# **itemVariantStockCreate**
> ItemVariantStock itemVariantStockCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantStockApi;

ItemVariantStockApi apiInstance = new ItemVariantStockApi();
ItemVariantStock data = new ItemVariantStock(); // ItemVariantStock | Model instance data
try {
    ItemVariantStock result = apiInstance.itemVariantStockCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantStockApi#itemVariantStockCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ItemVariantStock**](ItemVariantStock.md)| Model instance data | [optional]

### Return type

[**ItemVariantStock**](ItemVariantStock.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantStockFind"></a>
# **itemVariantStockFind**
> List&lt;ItemVariantStock&gt; itemVariantStockFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantStockApi;

ItemVariantStockApi apiInstance = new ItemVariantStockApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<ItemVariantStock> result = apiInstance.itemVariantStockFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantStockApi#itemVariantStockFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;ItemVariantStock&gt;**](ItemVariantStock.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantStockFindById"></a>
# **itemVariantStockFindById**
> ItemVariantStock itemVariantStockFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantStockApi;

ItemVariantStockApi apiInstance = new ItemVariantStockApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ItemVariantStock result = apiInstance.itemVariantStockFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantStockApi#itemVariantStockFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ItemVariantStock**](ItemVariantStock.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantStockFindOne"></a>
# **itemVariantStockFindOne**
> ItemVariantStock itemVariantStockFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantStockApi;

ItemVariantStockApi apiInstance = new ItemVariantStockApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ItemVariantStock result = apiInstance.itemVariantStockFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantStockApi#itemVariantStockFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ItemVariantStock**](ItemVariantStock.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantStockPrototypeGetItemVariant"></a>
# **itemVariantStockPrototypeGetItemVariant**
> ItemVariant itemVariantStockPrototypeGetItemVariant(id, refresh)

Fetches belongsTo relation itemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantStockApi;

ItemVariantStockApi apiInstance = new ItemVariantStockApi();
String id = "id_example"; // String | ItemVariantStock id
Boolean refresh = true; // Boolean | 
try {
    ItemVariant result = apiInstance.itemVariantStockPrototypeGetItemVariant(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantStockApi#itemVariantStockPrototypeGetItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemVariantStock id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantStockUpdateAll"></a>
# **itemVariantStockUpdateAll**
> InlineResponse2002 itemVariantStockUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantStockApi;

ItemVariantStockApi apiInstance = new ItemVariantStockApi();
String where = "where_example"; // String | Criteria to match model instances
ItemVariantStock data = new ItemVariantStock(); // ItemVariantStock | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.itemVariantStockUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantStockApi#itemVariantStockUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**ItemVariantStock**](ItemVariantStock.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

