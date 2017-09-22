# SaleApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saleCount**](SaleApi.md#saleCount) | **GET** /Sale/count | Count instances of the model matched by where from the data source.
[**saleCreateSale**](SaleApi.md#saleCreateSale) | **POST** /Sale | Create Sale, Sale Detail, Log Sale
[**saleDeleteSale**](SaleApi.md#saleDeleteSale) | **DELETE** /Sale | Delete Sale, Sale Detail, Receivable (if exist)
[**saleFind**](SaleApi.md#saleFind) | **GET** /Sale | Find all instances of the model matched by filter from the data source.
[**saleFindById**](SaleApi.md#saleFindById) | **GET** /Sale/{id} | Find a model instance by {{id}} from the data source.
[**saleFindOne**](SaleApi.md#saleFindOne) | **GET** /Sale/findOne | Find first instance of the model matched by filter from the data source.
[**salePrototypeCountSaleDetail**](SaleApi.md#salePrototypeCountSaleDetail) | **GET** /Sale/{id}/saleDetail/count | Counts saleDetail of Sale.
[**salePrototypeGetCustomer**](SaleApi.md#salePrototypeGetCustomer) | **GET** /Sale/{id}/customer | Fetches belongsTo relation customer.
[**salePrototypeGetReceivable**](SaleApi.md#salePrototypeGetReceivable) | **GET** /Sale/{id}/receivable | Fetches hasOne relation receivable.
[**salePrototypeGetSaleDetail**](SaleApi.md#salePrototypeGetSaleDetail) | **GET** /Sale/{id}/saleDetail | Queries saleDetail of Sale.
[**saleUpdateAll**](SaleApi.md#saleUpdateAll) | **POST** /Sale/update | Update instances of the model matched by {{where}} from the data source.


<a name="saleCount"></a>
# **saleCount**
> InlineResponse200 saleCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleApi;

SaleApi apiInstance = new SaleApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.saleCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleApi#saleCount");
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

<a name="saleCreateSale"></a>
# **saleCreateSale**
> Object saleCreateSale(request)

Create Sale, Sale Detail, Log Sale

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleApi;

SaleApi apiInstance = new SaleApi();
Object request = null; // Object | 
try {
    Object result = apiInstance.saleCreateSale(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleApi#saleCreateSale");
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

<a name="saleDeleteSale"></a>
# **saleDeleteSale**
> Object saleDeleteSale(data)

Delete Sale, Sale Detail, Receivable (if exist)

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleApi;

SaleApi apiInstance = new SaleApi();
Sale data = new Sale(); // Sale | 
try {
    Object result = apiInstance.saleDeleteSale(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleApi#saleDeleteSale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Sale**](Sale.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="saleFind"></a>
# **saleFind**
> List&lt;Sale&gt; saleFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleApi;

SaleApi apiInstance = new SaleApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Sale> result = apiInstance.saleFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleApi#saleFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Sale&gt;**](Sale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="saleFindById"></a>
# **saleFindById**
> Sale saleFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleApi;

SaleApi apiInstance = new SaleApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Sale result = apiInstance.saleFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleApi#saleFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Sale**](Sale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="saleFindOne"></a>
# **saleFindOne**
> Sale saleFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleApi;

SaleApi apiInstance = new SaleApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Sale result = apiInstance.saleFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleApi#saleFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Sale**](Sale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="salePrototypeCountSaleDetail"></a>
# **salePrototypeCountSaleDetail**
> InlineResponse200 salePrototypeCountSaleDetail(id, where)

Counts saleDetail of Sale.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleApi;

SaleApi apiInstance = new SaleApi();
String id = "id_example"; // String | Sale id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.salePrototypeCountSaleDetail(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleApi#salePrototypeCountSaleDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Sale id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="salePrototypeGetCustomer"></a>
# **salePrototypeGetCustomer**
> Customer salePrototypeGetCustomer(id, refresh)

Fetches belongsTo relation customer.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleApi;

SaleApi apiInstance = new SaleApi();
String id = "id_example"; // String | Sale id
Boolean refresh = true; // Boolean | 
try {
    Customer result = apiInstance.salePrototypeGetCustomer(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleApi#salePrototypeGetCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Sale id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="salePrototypeGetReceivable"></a>
# **salePrototypeGetReceivable**
> Receivable salePrototypeGetReceivable(id, refresh)

Fetches hasOne relation receivable.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleApi;

SaleApi apiInstance = new SaleApi();
String id = "id_example"; // String | Sale id
Boolean refresh = true; // Boolean | 
try {
    Receivable result = apiInstance.salePrototypeGetReceivable(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleApi#salePrototypeGetReceivable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Sale id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Receivable**](Receivable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="salePrototypeGetSaleDetail"></a>
# **salePrototypeGetSaleDetail**
> List&lt;SaleDetail&gt; salePrototypeGetSaleDetail(id, filter)

Queries saleDetail of Sale.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleApi;

SaleApi apiInstance = new SaleApi();
String id = "id_example"; // String | Sale id
String filter = "filter_example"; // String | 
try {
    List<SaleDetail> result = apiInstance.salePrototypeGetSaleDetail(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleApi#salePrototypeGetSaleDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Sale id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;SaleDetail&gt;**](SaleDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="saleUpdateAll"></a>
# **saleUpdateAll**
> InlineResponse2002 saleUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.SaleApi;

SaleApi apiInstance = new SaleApi();
String where = "where_example"; // String | Criteria to match model instances
Sale data = new Sale(); // Sale | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.saleUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SaleApi#saleUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Sale**](Sale.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

