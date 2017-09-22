# BranchApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**branchCount**](BranchApi.md#branchCount) | **GET** /Branch/count | Count instances of the model matched by where from the data source.
[**branchCreate**](BranchApi.md#branchCreate) | **POST** /Branch | Create a new instance of the model and persist it into the data source.
[**branchDeleteById**](BranchApi.md#branchDeleteById) | **DELETE** /Branch/{id} | Delete a model instance by {{id}} from the data source.
[**branchFind**](BranchApi.md#branchFind) | **GET** /Branch | Find all instances of the model matched by filter from the data source.
[**branchFindById**](BranchApi.md#branchFindById) | **GET** /Branch/{id} | Find a model instance by {{id}} from the data source.
[**branchFindOne**](BranchApi.md#branchFindOne) | **GET** /Branch/findOne | Find first instance of the model matched by filter from the data source.
[**branchPrototypeCountDeliveryFrom**](BranchApi.md#branchPrototypeCountDeliveryFrom) | **GET** /Branch/{id}/deliveryFrom/count | Counts deliveryFrom of Branch.
[**branchPrototypeCountDeliveryTo**](BranchApi.md#branchPrototypeCountDeliveryTo) | **GET** /Branch/{id}/deliveryTo/count | Counts deliveryTo of Branch.
[**branchPrototypeCountUserInfo**](BranchApi.md#branchPrototypeCountUserInfo) | **GET** /Branch/{id}/userInfo/count | Counts userInfo of Branch.
[**branchPrototypeGetCompany**](BranchApi.md#branchPrototypeGetCompany) | **GET** /Branch/{id}/company | Fetches belongsTo relation company.
[**branchPrototypeGetDeliveryFrom**](BranchApi.md#branchPrototypeGetDeliveryFrom) | **GET** /Branch/{id}/deliveryFrom | Queries deliveryFrom of Branch.
[**branchPrototypeGetDeliveryTo**](BranchApi.md#branchPrototypeGetDeliveryTo) | **GET** /Branch/{id}/deliveryTo | Queries deliveryTo of Branch.
[**branchPrototypeGetUserInfo**](BranchApi.md#branchPrototypeGetUserInfo) | **GET** /Branch/{id}/userInfo | Queries userInfo of Branch.
[**branchUpdateAll**](BranchApi.md#branchUpdateAll) | **POST** /Branch/update | Update instances of the model matched by {{where}} from the data source.


<a name="branchCount"></a>
# **branchCount**
> InlineResponse200 branchCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.branchCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchCount");
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

<a name="branchCreate"></a>
# **branchCreate**
> Branch branchCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
Branch data = new Branch(); // Branch | Model instance data
try {
    Branch result = apiInstance.branchCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Branch**](Branch.md)| Model instance data | [optional]

### Return type

[**Branch**](Branch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="branchDeleteById"></a>
# **branchDeleteById**
> Object branchDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.branchDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchDeleteById");
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

<a name="branchFind"></a>
# **branchFind**
> List&lt;Branch&gt; branchFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Branch> result = apiInstance.branchFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Branch&gt;**](Branch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="branchFindById"></a>
# **branchFindById**
> Branch branchFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Branch result = apiInstance.branchFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Branch**](Branch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="branchFindOne"></a>
# **branchFindOne**
> Branch branchFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Branch result = apiInstance.branchFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Branch**](Branch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="branchPrototypeCountDeliveryFrom"></a>
# **branchPrototypeCountDeliveryFrom**
> InlineResponse200 branchPrototypeCountDeliveryFrom(id, where)

Counts deliveryFrom of Branch.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String id = "id_example"; // String | Branch id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.branchPrototypeCountDeliveryFrom(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchPrototypeCountDeliveryFrom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Branch id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="branchPrototypeCountDeliveryTo"></a>
# **branchPrototypeCountDeliveryTo**
> InlineResponse200 branchPrototypeCountDeliveryTo(id, where)

Counts deliveryTo of Branch.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String id = "id_example"; // String | Branch id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.branchPrototypeCountDeliveryTo(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchPrototypeCountDeliveryTo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Branch id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="branchPrototypeCountUserInfo"></a>
# **branchPrototypeCountUserInfo**
> InlineResponse200 branchPrototypeCountUserInfo(id, where)

Counts userInfo of Branch.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String id = "id_example"; // String | Branch id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.branchPrototypeCountUserInfo(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchPrototypeCountUserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Branch id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="branchPrototypeGetCompany"></a>
# **branchPrototypeGetCompany**
> Company branchPrototypeGetCompany(id, refresh)

Fetches belongsTo relation company.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String id = "id_example"; // String | Branch id
Boolean refresh = true; // Boolean | 
try {
    Company result = apiInstance.branchPrototypeGetCompany(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchPrototypeGetCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Branch id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="branchPrototypeGetDeliveryFrom"></a>
# **branchPrototypeGetDeliveryFrom**
> List&lt;Delivery&gt; branchPrototypeGetDeliveryFrom(id, filter)

Queries deliveryFrom of Branch.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String id = "id_example"; // String | Branch id
String filter = "filter_example"; // String | 
try {
    List<Delivery> result = apiInstance.branchPrototypeGetDeliveryFrom(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchPrototypeGetDeliveryFrom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Branch id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;Delivery&gt;**](Delivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="branchPrototypeGetDeliveryTo"></a>
# **branchPrototypeGetDeliveryTo**
> List&lt;Delivery&gt; branchPrototypeGetDeliveryTo(id, filter)

Queries deliveryTo of Branch.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String id = "id_example"; // String | Branch id
String filter = "filter_example"; // String | 
try {
    List<Delivery> result = apiInstance.branchPrototypeGetDeliveryTo(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchPrototypeGetDeliveryTo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Branch id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;Delivery&gt;**](Delivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="branchPrototypeGetUserInfo"></a>
# **branchPrototypeGetUserInfo**
> List&lt;UserInfo&gt; branchPrototypeGetUserInfo(id, filter)

Queries userInfo of Branch.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String id = "id_example"; // String | Branch id
String filter = "filter_example"; // String | 
try {
    List<UserInfo> result = apiInstance.branchPrototypeGetUserInfo(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchPrototypeGetUserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Branch id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;UserInfo&gt;**](UserInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="branchUpdateAll"></a>
# **branchUpdateAll**
> InlineResponse2002 branchUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.BranchApi;

BranchApi apiInstance = new BranchApi();
String where = "where_example"; // String | Criteria to match model instances
Branch data = new Branch(); // Branch | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.branchUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchApi#branchUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Branch**](Branch.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

