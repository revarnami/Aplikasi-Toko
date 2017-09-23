# ReportApi

All URIs are relative to *https://192.168.100.88:3000/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportItemOut**](ReportApi.md#reportItemOut) | **GET** /Report/itemOut | Get Item Out Report By Branch
[**reportProfit**](ReportApi.md#reportProfit) | **GET** /Report/profit | Get Profit Report By Branch
[**reportReceivable**](ReportApi.md#reportReceivable) | **GET** /Report/receivable | Get receivable Report By Branch
[**reportReceivablePayment**](ReportApi.md#reportReceivablePayment) | **GET** /Report/receivablePayment | Get receivable payment Report By Branch
[**reportSale**](ReportApi.md#reportSale) | **GET** /Report/sale | Get Sale Report By Branch
[**reportSalesman**](ReportApi.md#reportSalesman) | **GET** /Report/salesman | Get Salesman Report By Branch
[**reportStockItem**](ReportApi.md#reportStockItem) | **GET** /Report/stockItem | Get stockItem Report By Branch


<a name="reportItemOut"></a>
# **reportItemOut**
> List&lt;ItemVariantOut&gt; reportItemOut(branchId, fromDate, toDate, itemVariantId, all)

Get Item Out Report By Branch

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportApi;

ReportApi apiInstance = new ReportApi();
Double branchId = 3.4D; // Double | 
String fromDate = "fromDate_example"; // String | 
String toDate = "toDate_example"; // String | 
Double itemVariantId = 3.4D; // Double | 
Boolean all = true; // Boolean | 
try {
    List<ItemVariantOut> result = apiInstance.reportItemOut(branchId, fromDate, toDate, itemVariantId, all);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportItemOut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **branchId** | **Double**|  | [optional]
 **fromDate** | **String**|  | [optional]
 **toDate** | **String**|  | [optional]
 **itemVariantId** | **Double**|  | [optional]
 **all** | **Boolean**|  | [optional]

### Return type

[**List&lt;ItemVariantOut&gt;**](ItemVariantOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="reportProfit"></a>
# **reportProfit**
> List&lt;SaleProfit&gt; reportProfit(branchId, fromDate, toDate)

Get Profit Report By Branch

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportApi;

ReportApi apiInstance = new ReportApi();
Double branchId = 3.4D; // Double | 
String fromDate = "fromDate_example"; // String | 
String toDate = "toDate_example"; // String | 
try {
    List<SaleProfit> result = apiInstance.reportProfit(branchId, fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportProfit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **branchId** | **Double**|  | [optional]
 **fromDate** | **String**|  | [optional]
 **toDate** | **String**|  | [optional]

### Return type

[**List&lt;SaleProfit&gt;**](SaleProfit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="reportReceivable"></a>
# **reportReceivable**
> List&lt;Customer&gt; reportReceivable(branchId)

Get receivable Report By Branch

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportApi;

ReportApi apiInstance = new ReportApi();
Double branchId = 3.4D; // Double | 
try {
    List<Customer> result = apiInstance.reportReceivable(branchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportReceivable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **branchId** | **Double**|  | [optional]

### Return type

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="reportReceivablePayment"></a>
# **reportReceivablePayment**
> List&lt;Sale&gt; reportReceivablePayment(branchId, fromDate, toDate)

Get receivable payment Report By Branch

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportApi;

ReportApi apiInstance = new ReportApi();
Double branchId = 3.4D; // Double | 
String fromDate = "fromDate_example"; // String | 
String toDate = "toDate_example"; // String | 
try {
    List<Sale> result = apiInstance.reportReceivablePayment(branchId, fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportReceivablePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **branchId** | **Double**|  | [optional]
 **fromDate** | **String**|  | [optional]
 **toDate** | **String**|  | [optional]

### Return type

[**List&lt;Sale&gt;**](Sale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="reportSale"></a>
# **reportSale**
> List&lt;Sale&gt; reportSale(branchId, fromDate, toDate, customerId, all)

Get Sale Report By Branch

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportApi;

ReportApi apiInstance = new ReportApi();
Double branchId = 3.4D; // Double | 
String fromDate = "fromDate_example"; // String | 
String toDate = "toDate_example"; // String | 
Double customerId = 3.4D; // Double | 
Boolean all = true; // Boolean | 
try {
    List<Sale> result = apiInstance.reportSale(branchId, fromDate, toDate, customerId, all);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportSale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **branchId** | **Double**|  | [optional]
 **fromDate** | **String**|  | [optional]
 **toDate** | **String**|  | [optional]
 **customerId** | **Double**|  | [optional]
 **all** | **Boolean**|  | [optional]

### Return type

[**List&lt;Sale&gt;**](Sale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="reportSalesman"></a>
# **reportSalesman**
> List&lt;Sale&gt; reportSalesman(branchId, fromDate, toDate, salesName, all)

Get Salesman Report By Branch

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportApi;

ReportApi apiInstance = new ReportApi();
Double branchId = 3.4D; // Double | 
String fromDate = "fromDate_example"; // String | 
String toDate = "toDate_example"; // String | 
String salesName = "salesName_example"; // String | 
Boolean all = true; // Boolean | 
try {
    List<Sale> result = apiInstance.reportSalesman(branchId, fromDate, toDate, salesName, all);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportSalesman");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **branchId** | **Double**|  | [optional]
 **fromDate** | **String**|  | [optional]
 **toDate** | **String**|  | [optional]
 **salesName** | **String**|  | [optional]
 **all** | **Boolean**|  | [optional]

### Return type

[**List&lt;Sale&gt;**](Sale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="reportStockItem"></a>
# **reportStockItem**
> List&lt;ItemVariant&gt; reportStockItem(branchId)

Get stockItem Report By Branch

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportApi;

ReportApi apiInstance = new ReportApi();
Double branchId = 3.4D; // Double | 
try {
    List<ItemVariant> result = apiInstance.reportStockItem(branchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportStockItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **branchId** | **Double**|  | [optional]

### Return type

[**List&lt;ItemVariant&gt;**](ItemVariant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

