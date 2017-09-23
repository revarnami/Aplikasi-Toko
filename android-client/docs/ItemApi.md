# ItemApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemCount**](ItemApi.md#itemCount) | **GET** /Item/count | Count instances of the model matched by where from the data source.
[**itemCreateItem**](ItemApi.md#itemCreateItem) | **POST** /Item | Create Item, Item Variant, Item Variant Stock, Log Stock Item
[**itemCreateItemBulk**](ItemApi.md#itemCreateItemBulk) | **POST** /Item/createItemBulk | Create Item Bulk
[**itemDeleteItem**](ItemApi.md#itemDeleteItem) | **DELETE** /Item | Delete Item, Item Variant, Item Variant Stock
[**itemFind**](ItemApi.md#itemFind) | **GET** /Item | Find all instances of the model matched by filter from the data source.
[**itemFindById**](ItemApi.md#itemFindById) | **GET** /Item/{id} | Find a model instance by {{id}} from the data source.
[**itemFindOne**](ItemApi.md#itemFindOne) | **GET** /Item/findOne | Find first instance of the model matched by filter from the data source.
[**itemPrototypeCountItemVariant**](ItemApi.md#itemPrototypeCountItemVariant) | **GET** /Item/{id}/itemVariant/count | Counts itemVariant of Item.
[**itemPrototypeGetItemCategory**](ItemApi.md#itemPrototypeGetItemCategory) | **GET** /Item/{id}/itemCategory | Fetches belongsTo relation itemCategory.
[**itemPrototypeGetItemVariant**](ItemApi.md#itemPrototypeGetItemVariant) | **GET** /Item/{id}/itemVariant | Queries itemVariant of Item.
[**itemUpdateAll**](ItemApi.md#itemUpdateAll) | **POST** /Item/update | Update instances of the model matched by {{where}} from the data source.
[**itemUpdateItemBulk**](ItemApi.md#itemUpdateItemBulk) | **POST** /Item/updateItemBulk | Update Item Bulk


<a name="itemCount"></a>
# **itemCount**
> InlineResponse200 itemCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.itemCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemCount");
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

<a name="itemCreateItem"></a>
# **itemCreateItem**
> Object itemCreateItem(data)

Create Item, Item Variant, Item Variant Stock, Log Stock Item

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
Item data = new Item(); // Item | 
try {
    Object result = apiInstance.itemCreateItem(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemCreateItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Item**](Item.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemCreateItemBulk"></a>
# **itemCreateItemBulk**
> Object itemCreateItemBulk(data)

Create Item Bulk

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
List<Item> data = Arrays.asList(new Item()); // List<Item> | 
try {
    Object result = apiInstance.itemCreateItemBulk(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemCreateItemBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**List&lt;Item&gt;**](Item.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemDeleteItem"></a>
# **itemDeleteItem**
> Object itemDeleteItem(data)

Delete Item, Item Variant, Item Variant Stock

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
Item data = new Item(); // Item | 
try {
    Object result = apiInstance.itemDeleteItem(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemDeleteItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Item**](Item.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemFind"></a>
# **itemFind**
> List&lt;Item&gt; itemFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Item> result = apiInstance.itemFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Item&gt;**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemFindById"></a>
# **itemFindById**
> Item itemFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Item result = apiInstance.itemFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemFindOne"></a>
# **itemFindOne**
> Item itemFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Item result = apiInstance.itemFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemPrototypeCountItemVariant"></a>
# **itemPrototypeCountItemVariant**
> InlineResponse200 itemPrototypeCountItemVariant(id, where)

Counts itemVariant of Item.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
String id = "id_example"; // String | Item id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.itemPrototypeCountItemVariant(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemPrototypeCountItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Item id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemPrototypeGetItemCategory"></a>
# **itemPrototypeGetItemCategory**
> ItemCategory itemPrototypeGetItemCategory(id, refresh)

Fetches belongsTo relation itemCategory.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
String id = "id_example"; // String | Item id
Boolean refresh = true; // Boolean | 
try {
    ItemCategory result = apiInstance.itemPrototypeGetItemCategory(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemPrototypeGetItemCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Item id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemCategory**](ItemCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemPrototypeGetItemVariant"></a>
# **itemPrototypeGetItemVariant**
> List&lt;ItemVariant&gt; itemPrototypeGetItemVariant(id, filter)

Queries itemVariant of Item.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
String id = "id_example"; // String | Item id
String filter = "filter_example"; // String | 
try {
    List<ItemVariant> result = apiInstance.itemPrototypeGetItemVariant(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemPrototypeGetItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Item id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;ItemVariant&gt;**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemUpdateAll"></a>
# **itemUpdateAll**
> InlineResponse2002 itemUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
String where = "where_example"; // String | Criteria to match model instances
Item data = new Item(); // Item | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.itemUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Item**](Item.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemUpdateItemBulk"></a>
# **itemUpdateItemBulk**
> Object itemUpdateItemBulk(data)

Update Item Bulk

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemApi;

ItemApi apiInstance = new ItemApi();
List<Item> data = Arrays.asList(new Item()); // List<Item> | 
try {
    Object result = apiInstance.itemUpdateItemBulk(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemUpdateItemBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**List&lt;Item&gt;**](Item.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

