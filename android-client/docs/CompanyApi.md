# CompanyApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companyCount**](CompanyApi.md#companyCount) | **GET** /Company/count | Count instances of the model matched by where from the data source.
[**companyCreate**](CompanyApi.md#companyCreate) | **POST** /Company | Create a new instance of the model and persist it into the data source.
[**companyCreateCompanyAndBranch**](CompanyApi.md#companyCreateCompanyAndBranch) | **POST** /Company/createCompanyAndBranch | Create Company, Branch
[**companyDeleteById**](CompanyApi.md#companyDeleteById) | **DELETE** /Company/{id} | Delete a model instance by {{id}} from the data source.
[**companyFind**](CompanyApi.md#companyFind) | **GET** /Company | Find all instances of the model matched by filter from the data source.
[**companyFindById**](CompanyApi.md#companyFindById) | **GET** /Company/{id} | Find a model instance by {{id}} from the data source.
[**companyFindOne**](CompanyApi.md#companyFindOne) | **GET** /Company/findOne | Find first instance of the model matched by filter from the data source.
[**companyPrototypeCountBranch**](CompanyApi.md#companyPrototypeCountBranch) | **GET** /Company/{id}/branch/count | Counts branch of Company.
[**companyPrototypeGetBranch**](CompanyApi.md#companyPrototypeGetBranch) | **GET** /Company/{id}/branch | Queries branch of Company.
[**companyUpdateAll**](CompanyApi.md#companyUpdateAll) | **POST** /Company/update | Update instances of the model matched by {{where}} from the data source.


<a name="companyCount"></a>
# **companyCount**
> InlineResponse200 companyCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyApi;

CompanyApi apiInstance = new CompanyApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.companyCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyCount");
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

<a name="companyCreate"></a>
# **companyCreate**
> Company companyCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyApi;

CompanyApi apiInstance = new CompanyApi();
Company data = new Company(); // Company | Model instance data
try {
    Company result = apiInstance.companyCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Company**](Company.md)| Model instance data | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyCreateCompanyAndBranch"></a>
# **companyCreateCompanyAndBranch**
> Object companyCreateCompanyAndBranch(request)

Create Company, Branch

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyApi;

CompanyApi apiInstance = new CompanyApi();
Object request = null; // Object | 
try {
    Object result = apiInstance.companyCreateCompanyAndBranch(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyCreateCompanyAndBranch");
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

<a name="companyDeleteById"></a>
# **companyDeleteById**
> Object companyDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyApi;

CompanyApi apiInstance = new CompanyApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.companyDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyDeleteById");
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

<a name="companyFind"></a>
# **companyFind**
> List&lt;Company&gt; companyFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyApi;

CompanyApi apiInstance = new CompanyApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Company> result = apiInstance.companyFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Company&gt;**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyFindById"></a>
# **companyFindById**
> Company companyFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyApi;

CompanyApi apiInstance = new CompanyApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Company result = apiInstance.companyFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyFindOne"></a>
# **companyFindOne**
> Company companyFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyApi;

CompanyApi apiInstance = new CompanyApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Company result = apiInstance.companyFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyPrototypeCountBranch"></a>
# **companyPrototypeCountBranch**
> InlineResponse200 companyPrototypeCountBranch(id, where)

Counts branch of Company.

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyApi;

CompanyApi apiInstance = new CompanyApi();
String id = "id_example"; // String | Company id
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.companyPrototypeCountBranch(id, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyPrototypeCountBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Company id |
 **where** | **String**| Criteria to match model instances | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyPrototypeGetBranch"></a>
# **companyPrototypeGetBranch**
> List&lt;Branch&gt; companyPrototypeGetBranch(id, filter)

Queries branch of Company.

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyApi;

CompanyApi apiInstance = new CompanyApi();
String id = "id_example"; // String | Company id
String filter = "filter_example"; // String | 
try {
    List<Branch> result = apiInstance.companyPrototypeGetBranch(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyPrototypeGetBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Company id |
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;Branch&gt;**](Branch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="companyUpdateAll"></a>
# **companyUpdateAll**
> InlineResponse2002 companyUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyApi;

CompanyApi apiInstance = new CompanyApi();
String where = "where_example"; // String | Criteria to match model instances
Company data = new Company(); // Company | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.companyUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#companyUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**Company**](Company.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

