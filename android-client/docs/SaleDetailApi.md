# SaleDetailApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saleDetailCount**](SaleDetailApi.md#saleDetailCount) | **GET** /SaleDetail/count | Count instances of the model matched by where from the data source.
[**saleDetailCreateSaleDetail**](SaleDetailApi.md#saleDetailCreateSaleDetail) | **POST** /SaleDetail | Create Sale Detail, Log Sale
[**saleDetailDeleteSaleDetail**](SaleDetailApi.md#saleDetailDeleteSaleDetail) | **DELETE** /SaleDetail | Delete Sale Detail, Log Sale
[**saleDetailFind**](SaleDetailApi.md#saleDetailFind) | **GET** /SaleDetail | Find all instances of the model matched by filter from the data source.
[**saleDetailFindById**](SaleDetailApi.md#saleDetailFindById) | **GET** /SaleDetail/{id} | Find a model instance by {{id}} from the data source.
[**saleDetailFindOne**](SaleDetailApi.md#saleDetailFindOne) | **GET** /SaleDetail/findOne | Find first instance of the model matched by filter from the data source.
[**saleDetailPrototypeGetItemVariant**](SaleDetailApi.md#saleDetailPrototypeGetItemVariant) | **GET** /SaleDetail/{id}/itemVariant | Fetches belongsTo relation itemVariant.
[**saleDetailPrototypeGetSale**](SaleDetailApi.md#saleDetailPrototypeGetSale) | **GET** /SaleDetail/{id}/sale | Fetches belongsTo relation sale.
[**saleDetailUpdateAll**](SaleDetailApi.md#saleDetailUpdateAll) | **POST** /SaleDetail/update | Update instances of the model matched by {{where}} from the data source.


<a name="saleDetailCount"></a>
# **saleDetailCount**
> InlineResponse200 saleDetailCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleDetailApi;

SaleDetailApi apiInstance = new SaleDetailApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.saleDetailCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleDetailApi#saleDetailCount");
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

<a name="saleDetailCreateSaleDetail"></a>
# **saleDetailCreateSaleDetail**
> Object saleDetailCreateSaleDetail(request)

Create Sale Detail, Log Sale

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleDetailApi;

SaleDetailApi apiInstance = new SaleDetailApi();
Object request = null; // Object | 
try {
    Object result = apiInstance.saleDetailCreateSaleDetail(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleDetailApi#saleDetailCreateSaleDetail");
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

<a name="saleDetailDeleteSaleDetail"></a>
# **saleDetailDeleteSaleDetail**
> Object saleDetailDeleteSaleDetail(request)

Delete Sale Detail, Log Sale

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleDetailApi;

SaleDetailApi apiInstance = new SaleDetailApi();
Object request = null; // Object | 
try {
    Object result = apiInstance.saleDetailDeleteSaleDetail(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleDetailApi#saleDetailDeleteSaleDetail");
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

<a name="saleDetailFind"></a>
# **saleDetailFind**
> List&lt;SaleDetail&gt; saleDetailFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleDetailApi;

SaleDetailApi apiInstance = new SaleDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<SaleDetail> result = apiInstance.saleDetailFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleDetailApi#saleDetailFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;SaleDetail&gt;**](SaleDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="saleDetailFindById"></a>
# **saleDetailFindById**
> SaleDetail saleDetailFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleDetailApi;

SaleDetailApi apiInstance = new SaleDetailApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    SaleDetail result = apiInstance.saleDetailFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleDetailApi#saleDetailFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**SaleDetail**](SaleDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="saleDetailFindOne"></a>
# **saleDetailFindOne**
> SaleDetail saleDetailFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleDetailApi;

SaleDetailApi apiInstance = new SaleDetailApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    SaleDetail result = apiInstance.saleDetailFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleDetailApi#saleDetailFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**SaleDetail**](SaleDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="saleDetailPrototypeGetItemVariant"></a>
# **saleDetailPrototypeGetItemVariant**
> ItemVariant saleDetailPrototypeGetItemVariant(id, refresh)

Fetches belongsTo relation itemVariant.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleDetailApi;

SaleDetailApi apiInstance = new SaleDetailApi();
String id = "id_example"; // String | SaleDetail id
Boolean refresh = true; // Boolean | 
try {
    ItemVariant result = apiInstance.saleDetailPrototypeGetItemVariant(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleDetailApi#saleDetailPrototypeGetItemVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| SaleDetail id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**ItemVariant**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="saleDetailPrototypeGetSale"></a>
# **saleDetailPrototypeGetSale**
> Sale saleDetailPrototypeGetSale(id, refresh)

Fetches belongsTo relation sale.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleDetailApi;

SaleDetailApi apiInstance = new SaleDetailApi();
String id = "id_example"; // String | SaleDetail id
Boolean refresh = true; // Boolean | 
try {
    Sale result = apiInstance.saleDetailPrototypeGetSale(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleDetailApi#saleDetailPrototypeGetSale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| SaleDetail id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Sale**](Sale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="saleDetailUpdateAll"></a>
# **saleDetailUpdateAll**
> InlineResponse2002 saleDetailUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleDetailApi;

SaleDetailApi apiInstance = new SaleDetailApi();
String where = "where_example"; // String | Criteria to match model instances
SaleDetail data = new SaleDetail(); // SaleDetail | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.saleDetailUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleDetailApi#saleDetailUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**SaleDetail**](SaleDetail.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

