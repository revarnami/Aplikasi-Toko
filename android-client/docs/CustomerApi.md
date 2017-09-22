# CustomerApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCount**](CustomerApi.md#customerCount) | **GET** /Customer/count | Count instances of the model matched by where from the data source.
[**customerCreate**](CustomerApi.md#customerCreate) | **POST** /Customer | Create a new instance of the model and persist it into the data source.
[**customerDeleteById**](CustomerApi.md#customerDeleteById) | **DELETE** /Customer/{id} | Delete a model instance by {{id}} from the data source.
[**customerFind**](CustomerApi.md#customerFind) | **GET** /Customer | Find all instances of the model matched by filter from the data source.
[**customerFindById**](CustomerApi.md#customerFindById) | **GET** /Customer/{id} | Find a model instance by {{id}} from the data source.
[**customerFindCustomerSaleReceivable**](CustomerApi.md#customerFindCustomerSaleReceivable) | **GET** /Customer/findCustomerSaleReceivable | Find Customer, Sale (isDone &#x3D; 0, isReceivable &#x3D; 1), Receivable (isDone &#x3D; 0)
[**customerFindOne**](CustomerApi.md#customerFindOne) | **GET** /Customer/findOne | Find first instance of the model matched by filter from the data source.
[**customerPrototypeCountSale**](CustomerApi.md#customerPrototypeCountSale) | **GET** /Customer/{id}/sale/count | Counts sale of Customer.
[**customerPrototypeGetSale**](CustomerApi.md#customerPrototypeGetSale) | **GET** /Customer/{id}/sale | Queries sale of Customer.
[**customerUpdateAll**](CustomerApi.md#customerUpdateAll) | **POST** /Customer/update | Update instances of the model matched by {{where}} from the data source.


<a name="customerCount"></a>
# **customerCount**
> InlineResponse200 customerCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.customerCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerCount");
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

<a name="customerCreate"></a>
# **customerCreate**
> Customer customerCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
Customer data = new Customer(); // Customer | Model instance data
try {
    Customer result = apiInstance.customerCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Customer**](Customer.md)| Model instance data | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="customerDeleteById"></a>
# **customerDeleteById**
> Object customerDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.customerDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerDeleteById");
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

<a name="customerFind"></a>
# **customerFind**
> List&lt;Customer&gt; customerFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Customer> result = apiInstance.customerFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="customerFindById"></a>
# **customerFindById**
> Customer customerFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Customer result = apiInstance.customerFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="customerFindCustomerSaleReceivable"></a>
# **customerFindCustomerSaleReceivable**
> List&lt;Customer&gt; customerFindCustomerSaleReceivable()

Find Customer, Sale (isDone &#x3D; 0, isReceivable &#x3D; 1), Receivable (isDone &#x3D; 0)

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
try {
    List<Customer> result = apiInstance.customerFindCustomerSaleReceivable();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerFindCustomerSaleReceivable");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="customerFindOne"></a>
# **customerFindOne**
> Customer customerFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Customer result = apiInstance.customerFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="customerPrototypeCountSale"></a>
# **customerPrototypeCountSale**
> InlineResponse200 customerPrototypeCountSale(id, where)

Counts sale of Customer.

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String id = "id_example"; // String | Customer id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.customerPrototypeCountSale(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerPrototypeCountSale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Customer id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="customerPrototypeGetSale"></a>
# **customerPrototypeGetSale**
> List&lt;Sale&gt; customerPrototypeGetSale(id, filter)

Queries sale of Customer.

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String id = "id_example"; // String | Customer id
String filter = "filter_example"; // String | 
try {
    List<Sale> result = apiInstance.customerPrototypeGetSale(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerPrototypeGetSale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Customer id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;Sale&gt;**](Sale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="customerUpdateAll"></a>
# **customerUpdateAll**
> InlineResponse2002 customerUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String where = "where_example"; // String | Criteria to match model instances
Customer data = new Customer(); // Customer | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.customerUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Customer**](Customer.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

