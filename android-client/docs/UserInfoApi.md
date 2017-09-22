# UserInfoApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userInfoCount**](UserInfoApi.md#userInfoCount) | **GET** /UserInfo/count | Count instances of the model matched by where from the data source.
[**userInfoCreate**](UserInfoApi.md#userInfoCreate) | **POST** /UserInfo | Create a new instance of the model and persist it into the data source.
[**userInfoFind**](UserInfoApi.md#userInfoFind) | **GET** /UserInfo | Find all instances of the model matched by filter from the data source.
[**userInfoFindById**](UserInfoApi.md#userInfoFindById) | **GET** /UserInfo/{id} | Find a model instance by {{id}} from the data source.
[**userInfoFindOne**](UserInfoApi.md#userInfoFindOne) | **GET** /UserInfo/findOne | Find first instance of the model matched by filter from the data source.
[**userInfoPrototypeGetBranch**](UserInfoApi.md#userInfoPrototypeGetBranch) | **GET** /UserInfo/{id}/branch | Fetches belongsTo relation branch.
[**userInfoPrototypeGetUser**](UserInfoApi.md#userInfoPrototypeGetUser) | **GET** /UserInfo/{id}/user | Fetches belongsTo relation user.
[**userInfoUpdateAll**](UserInfoApi.md#userInfoUpdateAll) | **POST** /UserInfo/update | Update instances of the model matched by {{where}} from the data source.


<a name="userInfoCount"></a>
# **userInfoCount**
> InlineResponse200 userInfoCount(where)

Count instances of the model matched by where from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserInfoApi;

UserInfoApi apiInstance = new UserInfoApi();
String where = "where_example"; // String | Criteria to match model instances
try {
    InlineResponse200 result = apiInstance.userInfoCount(where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#userInfoCount");
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

<a name="userInfoCreate"></a>
# **userInfoCreate**
> UserInfo userInfoCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserInfoApi;

UserInfoApi apiInstance = new UserInfoApi();
UserInfo data = new UserInfo(); // UserInfo | Model instance data
try {
    UserInfo result = apiInstance.userInfoCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#userInfoCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UserInfo**](UserInfo.md)| Model instance data | [optional]

### Return type

[**UserInfo**](UserInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userInfoFind"></a>
# **userInfoFind**
> List&lt;UserInfo&gt; userInfoFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserInfoApi;

UserInfoApi apiInstance = new UserInfoApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<UserInfo> result = apiInstance.userInfoFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#userInfoFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;UserInfo&gt;**](UserInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userInfoFindById"></a>
# **userInfoFindById**
> UserInfo userInfoFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserInfoApi;

UserInfoApi apiInstance = new UserInfoApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    UserInfo result = apiInstance.userInfoFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#userInfoFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**UserInfo**](UserInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userInfoFindOne"></a>
# **userInfoFindOne**
> UserInfo userInfoFindOne(filter)

Find first instance of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserInfoApi;

UserInfoApi apiInstance = new UserInfoApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    UserInfo result = apiInstance.userInfoFindOne(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#userInfoFindOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**UserInfo**](UserInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userInfoPrototypeGetBranch"></a>
# **userInfoPrototypeGetBranch**
> Branch userInfoPrototypeGetBranch(id, refresh)

Fetches belongsTo relation branch.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserInfoApi;

UserInfoApi apiInstance = new UserInfoApi();
String id = "id_example"; // String | UserInfo id
Boolean refresh = true; // Boolean | 
try {
    Branch result = apiInstance.userInfoPrototypeGetBranch(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#userInfoPrototypeGetBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| UserInfo id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**Branch**](Branch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userInfoPrototypeGetUser"></a>
# **userInfoPrototypeGetUser**
> User userInfoPrototypeGetUser(id, refresh)

Fetches belongsTo relation user.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserInfoApi;

UserInfoApi apiInstance = new UserInfoApi();
String id = "id_example"; // String | UserInfo id
Boolean refresh = true; // Boolean | 
try {
    User result = apiInstance.userInfoPrototypeGetUser(id, refresh);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#userInfoPrototypeGetUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| UserInfo id |
 **refresh** | **Boolean**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="userInfoUpdateAll"></a>
# **userInfoUpdateAll**
> InlineResponse2002 userInfoUpdateAll(where, data)

Update instances of the model matched by {{where}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserInfoApi;

UserInfoApi apiInstance = new UserInfoApi();
String where = "where_example"; // String | Criteria to match model instances
UserInfo data = new UserInfo(); // UserInfo | An object of model property name/value pairs
try {
    InlineResponse2002 result = apiInstance.userInfoUpdateAll(where, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#userInfoUpdateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **where** | **String**| Criteria to match model instances | [optional]
 **data** | [**UserInfo**](UserInfo.md)| An object of model property name/value pairs | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

