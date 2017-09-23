# ItemVariantApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemVariantCount**](ItemVariantApi.md#itemVariantCount) | **GET** /ItemVariant/count | Count instances of the model matched by where from the data source.
[**itemVariantCreateItemVariant**](ItemVariantApi.md#itemVariantCreateItemVariant) | **POST** /ItemVariant | Create Item Variant, Item Variant Stock, Log Stock Item
[**itemVariantDeleteItemVariant**](ItemVariantApi.md#itemVariantDeleteItemVariant) | **DELETE** /ItemVariant | Delete Item Variant, Item Variant Stock
[**itemVariantFind**](ItemVariantApi.md#itemVariantFind) | **GET** /ItemVariant | Find all instances of the model matched by filter from the data source.
[**itemVariantFindById**](ItemVariantApi.md#itemVariantFindById) | **GET** /ItemVariant/{id} | Find a model instance by {{id}} from the data source.
[**itemVariantFindItemVariant**](ItemVariantApi.md#itemVariantFindItemVariant) | **GET** /ItemVariant/findItemVariant | Find Item Variant By itemSearch &amp; itemVariantSearch
[**itemVariantFindOne**](ItemVariantApi.md#itemVariantFindOne) | **GET** /ItemVariant/findOne | Find first instance of the model matched by filter from the data source.
[**itemVariantPrototypeCountAdjustmentDetail**](ItemVariantApi.md#itemVariantPrototypeCountAdjustmentDetail) | **GET** /ItemVariant/{id}/adjustmentDetail/count | Counts adjustmentDetail of ItemVariant.
[**itemVariantPrototypeCountDeliveryDetail**](ItemVariantApi.md#itemVariantPrototypeCountDeliveryDetail) | **GET** /ItemVariant/{id}/deliveryDetail/count | Counts deliveryDetail of ItemVariant.
[**itemVariantPrototypeCountPurchaseDetail**](ItemVariantApi.md#itemVariantPrototypeCountPurchaseDetail) | **GET** /ItemVariant/{id}/purchaseDetail/count | Counts purchaseDetail of ItemVariant.
[**itemVariantPrototypeCountSaleDetail**](ItemVariantApi.md#itemVariantPrototypeCountSaleDetail) | **GET** /ItemVariant/{id}/saleDetail/count | Counts saleDetail of ItemVariant.
[**itemVariantPrototypeGetAdjustmentDetail**](ItemVariantApi.md#itemVariantPrototypeGetAdjustmentDetail) | **GET** /ItemVariant/{id}/adjustmentDetail | Queries adjustmentDetail of ItemVariant.
[**itemVariantPrototypeGetDeliveryDetail**](ItemVariantApi.md#itemVariantPrototypeGetDeliveryDetail) | **GET** /ItemVariant/{id}/deliveryDetail | Queries deliveryDetail of ItemVariant.
[**itemVariantPrototypeGetItem**](ItemVariantApi.md#itemVariantPrototypeGetItem) | **GET** /ItemVariant/{id}/item | Fetches belongsTo relation item.
[**itemVariantPrototypeGetItemVariantStock**](ItemVariantApi.md#itemVariantPrototypeGetItemVariantStock) | **GET** /ItemVariant/{id}/itemVariantStock | Fetches hasOne relation itemVariantStock.
[**itemVariantPrototypeGetPurchaseDetail**](ItemVariantApi.md#itemVariantPrototypeGetPurchaseDetail) | **GET** /ItemVariant/{id}/purchaseDetail | Queries purchaseDetail of ItemVariant.
[**itemVariantPrototypeGetSaleDetail**](ItemVariantApi.md#itemVariantPrototypeGetSaleDetail) | **GET** /ItemVariant/{id}/saleDetail | Queries saleDetail of ItemVariant.
[**itemVariantUpdateAll**](ItemVariantApi.md#itemVariantUpdateAll) | **POST** /ItemVariant/update | Update instances of the model matched by {{where}} from the data source.
[**itemVariantUpdateItemVariant**](ItemVariantApi.md#itemVariantUpdateItemVariant) | **POST** /ItemVariant/updateItemVariant | Update Item Variant, Item Variant Stock, Log Stock Item


<a name="itemVariantCount"></a>
# **itemVariantCount**
> InlineResponse200 itemVariantCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.itemVariantCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantCount");
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

<a name="itemVariantCreateItemVariant"></a>
# **itemVariantCreateItemVariant**
> Object itemVariantCreateItemVariant(data)

Create Item Variant, Item Variant Stock, Log Stock Item

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
ItemVariant data = new ItemVariant(); // ItemVariant | 
try {
    Object result = apiInstance.itemVariantCreateItemVariant(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantCreateItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ItemVariant**](ItemVariant.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantDeleteItemVariant"></a>
# **itemVariantDeleteItemVariant**
> Object itemVariantDeleteItemVariant(data)

Delete Item Variant, Item Variant Stock

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
ItemVariant data = new ItemVariant(); // ItemVariant | 
try {
    Object result = apiInstance.itemVariantDeleteItemVariant(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantDeleteItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ItemVariant**](ItemVariant.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantFind"></a>
# **itemVariantFind**
> List&lt;ItemVariant&gt; itemVariantFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<ItemVariant> result = apiInstance.itemVariantFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;ItemVariant&gt;**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantFindById"></a>
# **itemVariantFindById**
> ItemVariant itemVariantFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ItemVariant result = apiInstance.itemVariantFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantFindItemVariant"></a>
# **itemVariantFindItemVariant**
> List&lt;ItemVariant&gt; itemVariantFindItemVariant(itemSearch, itemVariantSearch)

Find Item Variant By itemSearch &amp; itemVariantSearch

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String itemSearch = "itemSearch_example"; // String | 
String itemVariantSearch = "itemVariantSearch_example"; // String | 
try {
    List<ItemVariant> result = apiInstance.itemVariantFindItemVariant(itemSearch, itemVariantSearch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantFindItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemSearch** | **String**|  | [optional]
 **itemVariantSearch** | **String**|  | [optional]

### Return type

[**List&lt;ItemVariant&gt;**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantFindOne"></a>
# **itemVariantFindOne**
> ItemVariant itemVariantFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ItemVariant result = apiInstance.itemVariantFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantPrototypeCountAdjustmentDetail"></a>
# **itemVariantPrototypeCountAdjustmentDetail**
> InlineResponse200 itemVariantPrototypeCountAdjustmentDetail(id, where)

Counts adjustmentDetail of ItemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String id = "id_example"; // String | ItemVariant id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.itemVariantPrototypeCountAdjustmentDetail(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantPrototypeCountAdjustmentDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemVariant id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantPrototypeCountDeliveryDetail"></a>
# **itemVariantPrototypeCountDeliveryDetail**
> InlineResponse200 itemVariantPrototypeCountDeliveryDetail(id, where)

Counts deliveryDetail of ItemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String id = "id_example"; // String | ItemVariant id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.itemVariantPrototypeCountDeliveryDetail(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantPrototypeCountDeliveryDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemVariant id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantPrototypeCountPurchaseDetail"></a>
# **itemVariantPrototypeCountPurchaseDetail**
> InlineResponse200 itemVariantPrototypeCountPurchaseDetail(id, where)

Counts purchaseDetail of ItemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String id = "id_example"; // String | ItemVariant id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.itemVariantPrototypeCountPurchaseDetail(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantPrototypeCountPurchaseDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemVariant id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantPrototypeCountSaleDetail"></a>
# **itemVariantPrototypeCountSaleDetail**
> InlineResponse200 itemVariantPrototypeCountSaleDetail(id, where)

Counts saleDetail of ItemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String id = "id_example"; // String | ItemVariant id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.itemVariantPrototypeCountSaleDetail(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantPrototypeCountSaleDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemVariant id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantPrototypeGetAdjustmentDetail"></a>
# **itemVariantPrototypeGetAdjustmentDetail**
> List&lt;AdjustmentDetail&gt; itemVariantPrototypeGetAdjustmentDetail(id, filter)

Queries adjustmentDetail of ItemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String id = "id_example"; // String | ItemVariant id
String filter = "filter_example"; // String | 
try {
    List<AdjustmentDetail> result = apiInstance.itemVariantPrototypeGetAdjustmentDetail(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantPrototypeGetAdjustmentDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemVariant id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;AdjustmentDetail&gt;**](AdjustmentDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantPrototypeGetDeliveryDetail"></a>
# **itemVariantPrototypeGetDeliveryDetail**
> List&lt;DeliveryDetail&gt; itemVariantPrototypeGetDeliveryDetail(id, filter)

Queries deliveryDetail of ItemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String id = "id_example"; // String | ItemVariant id
String filter = "filter_example"; // String | 
try {
    List<DeliveryDetail> result = apiInstance.itemVariantPrototypeGetDeliveryDetail(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantPrototypeGetDeliveryDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemVariant id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;DeliveryDetail&gt;**](DeliveryDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantPrototypeGetItem"></a>
# **itemVariantPrototypeGetItem**
> Item itemVariantPrototypeGetItem(id, refresh)

Fetches belongsTo relation item.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String id = "id_example"; // String | ItemVariant id
Boolean refresh = true; // Boolean | 
try {
    Item result = apiInstance.itemVariantPrototypeGetItem(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantPrototypeGetItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemVariant id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantPrototypeGetItemVariantStock"></a>
# **itemVariantPrototypeGetItemVariantStock**
> ItemVariantStock itemVariantPrototypeGetItemVariantStock(id, refresh)

Fetches hasOne relation itemVariantStock.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String id = "id_example"; // String | ItemVariant id
Boolean refresh = true; // Boolean | 
try {
    ItemVariantStock result = apiInstance.itemVariantPrototypeGetItemVariantStock(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantPrototypeGetItemVariantStock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemVariant id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemVariantStock**](ItemVariantStock.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantPrototypeGetPurchaseDetail"></a>
# **itemVariantPrototypeGetPurchaseDetail**
> List&lt;PurchaseDetail&gt; itemVariantPrototypeGetPurchaseDetail(id, filter)

Queries purchaseDetail of ItemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String id = "id_example"; // String | ItemVariant id
String filter = "filter_example"; // String | 
try {
    List<PurchaseDetail> result = apiInstance.itemVariantPrototypeGetPurchaseDetail(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantPrototypeGetPurchaseDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemVariant id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;PurchaseDetail&gt;**](PurchaseDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantPrototypeGetSaleDetail"></a>
# **itemVariantPrototypeGetSaleDetail**
> List&lt;SaleDetail&gt; itemVariantPrototypeGetSaleDetail(id, filter)

Queries saleDetail of ItemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String id = "id_example"; // String | ItemVariant id
String filter = "filter_example"; // String | 
try {
    List<SaleDetail> result = apiInstance.itemVariantPrototypeGetSaleDetail(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantPrototypeGetSaleDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ItemVariant id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;SaleDetail&gt;**](SaleDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantUpdateAll"></a>
# **itemVariantUpdateAll**
> InlineResponse2002 itemVariantUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
String where = "where_example"; // String | Criteria to match model instances
ItemVariant data = new ItemVariant(); // ItemVariant | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.itemVariantUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**ItemVariant**](ItemVariant.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="itemVariantUpdateItemVariant"></a>
# **itemVariantUpdateItemVariant**
> Object itemVariantUpdateItemVariant(data)

Update Item Variant, Item Variant Stock, Log Stock Item

### Example
```java
// Import classes:
//import io.swagger.client.api.ItemVariantApi;

ItemVariantApi apiInstance = new ItemVariantApi();
ItemVariant data = new ItemVariant(); // ItemVariant | 
try {
    Object result = apiInstance.itemVariantUpdateItemVariant(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemVariantApi#itemVariantUpdateItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ItemVariant**](ItemVariant.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

