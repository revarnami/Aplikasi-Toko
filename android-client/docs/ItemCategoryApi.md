# ItemCategoryApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemCategoryCount**](ItemCategoryApi.md#itemCategoryCount) | **GET** /ItemCategory/count | Count instances of the model matched by where from the data source.
[**itemCategoryCreate**](ItemCategoryApi.md#itemCategoryCreate) | **POST** /ItemCategory | Create a new instance of the model and persist it into the data source.
[**itemCategoryDeleteById**](ItemCategoryApi.md#itemCategoryDeleteById) | **DELETE** /ItemCategory/{id} | Delete a model instance by {{id}} from the data source.
[**itemCategoryFind**](ItemCategoryApi.md#itemCategoryFind) | **GET** /ItemCategory | Find all instances of the model matched by filter from the data source.
[**itemCategoryFindById**](ItemCategoryApi.md#itemCategoryFindById) | **GET** /ItemCategory/{id} | Find a model instance by {{id}} from the data source.
[**itemCategoryFindOne**](ItemCategoryApi.md#itemCategoryFindOne) | **GET** /ItemCategory/findOne | Find first instance of the model matched by filter from the data source.
[**itemCategoryPrototypeCountItem**](ItemCategoryApi.md#itemCategoryPrototypeCountItem) | **GET** /ItemCategory/{id}/item/count | Counts item of ItemCategory.
[**itemCategoryPrototypeGetItem**](ItemCategoryApi.md#itemCategoryPrototypeGetItem) | **GET** /ItemCategory/{id}/item | Queries item of ItemCategory.
[**itemCategoryUpdateAll**](ItemCategoryApi.md#itemCategoryUpdateAll) | **POST** /ItemCategory/update | Update instances of the model matched by {{where}} from the data source.


<a name="itemCategoryCount"></a>
# **itemCategoryCount**
> InlineResponse200 itemCategoryCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemCategoryApi;

ItemCategoryApi apiInstance = new ItemCategoryApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.itemCategoryCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#itemCategoryCount");
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

<a name="itemCategoryCreate"></a>
# **itemCategoryCreate**
> ItemCategory itemCategoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemCategoryApi;

ItemCategoryApi apiInstance = new ItemCategoryApi();
ItemCategory data = new ItemCategory(); // ItemCategory | Model instance data
try {
    ItemCategory result = apiInstance.itemCategoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#itemCategoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ItemCategory**](ItemCategory.md)| Model instance data | [optional]

### Return type

[**ItemCategory**](ItemCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemCategoryDeleteById"></a>
# **itemCategoryDeleteById**
> Object itemCategoryDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemCategoryApi;

ItemCategoryApi apiInstance = new ItemCategoryApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.itemCategoryDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#itemCategoryDeleteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemCategoryFind"></a>
# **itemCategoryFind**
> List&lt;ItemCategory&gt; itemCategoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemCategoryApi;

ItemCategoryApi apiInstance = new ItemCategoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<ItemCategory> result = apiInstance.itemCategoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#itemCategoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;ItemCategory&gt;**](ItemCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemCategoryFindById"></a>
# **itemCategoryFindById**
> ItemCategory itemCategoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemCategoryApi;

ItemCategoryApi apiInstance = new ItemCategoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ItemCategory result = apiInstance.itemCategoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#itemCategoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ItemCategory**](ItemCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemCategoryFindOne"></a>
# **itemCategoryFindOne**
> ItemCategory itemCategoryFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemCategoryApi;

ItemCategoryApi apiInstance = new ItemCategoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ItemCategory result = apiInstance.itemCategoryFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#itemCategoryFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ItemCategory**](ItemCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemCategoryPrototypeCountItem"></a>
# **itemCategoryPrototypeCountItem**
> InlineResponse200 itemCategoryPrototypeCountItem(id, where)

Counts item of ItemCategory.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemCategoryApi;

ItemCategoryApi apiInstance = new ItemCategoryApi();
String id = "id_example"; // String | ItemCategory id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.itemCategoryPrototypeCountItem(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#itemCategoryPrototypeCountItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemCategory id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemCategoryPrototypeGetItem"></a>
# **itemCategoryPrototypeGetItem**
> List&lt;Item&gt; itemCategoryPrototypeGetItem(id, filter)

Queries item of ItemCategory.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemCategoryApi;

ItemCategoryApi apiInstance = new ItemCategoryApi();
String id = "id_example"; // String | ItemCategory id
String filter = "filter_example"; // String | 
try {
    List<Item> result = apiInstance.itemCategoryPrototypeGetItem(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#itemCategoryPrototypeGetItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemCategory id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemCategoryUpdateAll"></a>
# **itemCategoryUpdateAll**
> InlineResponse2002 itemCategoryUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemCategoryApi;

ItemCategoryApi apiInstance = new ItemCategoryApi();
String where = "where_example"; // String | Criteria to match model instances
ItemCategory data = new ItemCategory(); // ItemCategory | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.itemCategoryUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCategoryApi#itemCategoryUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**ItemCategory**](ItemCategory.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

