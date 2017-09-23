# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AdjustmentApi;

public class AdjustmentApiExample {

    public static void main(String[] args) {
        AdjustmentApi apiInstance = new AdjustmentApi();
        String where = "where_example"; // String | Criteria to match model instances
        try {
            InlineResponse200 result = apiInstance.adjustmentCount(where);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdjustmentApi#adjustmentCount");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://192.168.100.88:3000/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdjustmentApi* | [**adjustmentCount**](docs/AdjustmentApi.md#adjustmentCount) | **GET** /Adjustment/count | Count instances of the model matched by where from the data source.
*AdjustmentApi* | [**adjustmentCreateAdjustment**](docs/AdjustmentApi.md#adjustmentCreateAdjustment) | **POST** /Adjustment | Create Adjustment, Adjustment Detail
*AdjustmentApi* | [**adjustmentFind**](docs/AdjustmentApi.md#adjustmentFind) | **GET** /Adjustment | Find all instances of the model matched by filter from the data source.
*AdjustmentApi* | [**adjustmentFindById**](docs/AdjustmentApi.md#adjustmentFindById) | **GET** /Adjustment/{id} | Find a model instance by {{id}} from the data source.
*AdjustmentApi* | [**adjustmentFindOne**](docs/AdjustmentApi.md#adjustmentFindOne) | **GET** /Adjustment/findOne | Find first instance of the model matched by filter from the data source.
*AdjustmentApi* | [**adjustmentPrototypeCountAdjustmentDetail**](docs/AdjustmentApi.md#adjustmentPrototypeCountAdjustmentDetail) | **GET** /Adjustment/{id}/adjustmentDetail/count | Counts adjustmentDetail of Adjustment.
*AdjustmentApi* | [**adjustmentPrototypeGetAdjustmentDetail**](docs/AdjustmentApi.md#adjustmentPrototypeGetAdjustmentDetail) | **GET** /Adjustment/{id}/adjustmentDetail | Queries adjustmentDetail of Adjustment.
*AdjustmentApi* | [**adjustmentUpdateAll**](docs/AdjustmentApi.md#adjustmentUpdateAll) | **POST** /Adjustment/update | Update instances of the model matched by {{where}} from the data source.
*AdjustmentDetailApi* | [**adjustmentDetailCount**](docs/AdjustmentDetailApi.md#adjustmentDetailCount) | **GET** /AdjustmentDetail/count | Count instances of the model matched by where from the data source.
*AdjustmentDetailApi* | [**adjustmentDetailCreate**](docs/AdjustmentDetailApi.md#adjustmentDetailCreate) | **POST** /AdjustmentDetail | Create a new instance of the model and persist it into the data source.
*AdjustmentDetailApi* | [**adjustmentDetailFind**](docs/AdjustmentDetailApi.md#adjustmentDetailFind) | **GET** /AdjustmentDetail | Find all instances of the model matched by filter from the data source.
*AdjustmentDetailApi* | [**adjustmentDetailFindById**](docs/AdjustmentDetailApi.md#adjustmentDetailFindById) | **GET** /AdjustmentDetail/{id} | Find a model instance by {{id}} from the data source.
*AdjustmentDetailApi* | [**adjustmentDetailFindOne**](docs/AdjustmentDetailApi.md#adjustmentDetailFindOne) | **GET** /AdjustmentDetail/findOne | Find first instance of the model matched by filter from the data source.
*AdjustmentDetailApi* | [**adjustmentDetailPrototypeGetAdjustment**](docs/AdjustmentDetailApi.md#adjustmentDetailPrototypeGetAdjustment) | **GET** /AdjustmentDetail/{id}/adjustment | Fetches belongsTo relation adjustment.
*AdjustmentDetailApi* | [**adjustmentDetailPrototypeGetItemVariant**](docs/AdjustmentDetailApi.md#adjustmentDetailPrototypeGetItemVariant) | **GET** /AdjustmentDetail/{id}/itemVariant | Fetches belongsTo relation itemVariant.
*AdjustmentDetailApi* | [**adjustmentDetailUpdateAll**](docs/AdjustmentDetailApi.md#adjustmentDetailUpdateAll) | **POST** /AdjustmentDetail/update | Update instances of the model matched by {{where}} from the data source.
*BranchApi* | [**branchCount**](docs/BranchApi.md#branchCount) | **GET** /Branch/count | Count instances of the model matched by where from the data source.
*BranchApi* | [**branchCreate**](docs/BranchApi.md#branchCreate) | **POST** /Branch | Create a new instance of the model and persist it into the data source.
*BranchApi* | [**branchDeleteById**](docs/BranchApi.md#branchDeleteById) | **DELETE** /Branch/{id} | Delete a model instance by {{id}} from the data source.
*BranchApi* | [**branchFind**](docs/BranchApi.md#branchFind) | **GET** /Branch | Find all instances of the model matched by filter from the data source.
*BranchApi* | [**branchFindById**](docs/BranchApi.md#branchFindById) | **GET** /Branch/{id} | Find a model instance by {{id}} from the data source.
*BranchApi* | [**branchFindOne**](docs/BranchApi.md#branchFindOne) | **GET** /Branch/findOne | Find first instance of the model matched by filter from the data source.
*BranchApi* | [**branchPrototypeCountDeliveryFrom**](docs/BranchApi.md#branchPrototypeCountDeliveryFrom) | **GET** /Branch/{id}/deliveryFrom/count | Counts deliveryFrom of Branch.
*BranchApi* | [**branchPrototypeCountDeliveryTo**](docs/BranchApi.md#branchPrototypeCountDeliveryTo) | **GET** /Branch/{id}/deliveryTo/count | Counts deliveryTo of Branch.
*BranchApi* | [**branchPrototypeCountUserInfo**](docs/BranchApi.md#branchPrototypeCountUserInfo) | **GET** /Branch/{id}/userInfo/count | Counts userInfo of Branch.
*BranchApi* | [**branchPrototypeGetCompany**](docs/BranchApi.md#branchPrototypeGetCompany) | **GET** /Branch/{id}/company | Fetches belongsTo relation company.
*BranchApi* | [**branchPrototypeGetDeliveryFrom**](docs/BranchApi.md#branchPrototypeGetDeliveryFrom) | **GET** /Branch/{id}/deliveryFrom | Queries deliveryFrom of Branch.
*BranchApi* | [**branchPrototypeGetDeliveryTo**](docs/BranchApi.md#branchPrototypeGetDeliveryTo) | **GET** /Branch/{id}/deliveryTo | Queries deliveryTo of Branch.
*BranchApi* | [**branchPrototypeGetUserInfo**](docs/BranchApi.md#branchPrototypeGetUserInfo) | **GET** /Branch/{id}/userInfo | Queries userInfo of Branch.
*BranchApi* | [**branchUpdateAll**](docs/BranchApi.md#branchUpdateAll) | **POST** /Branch/update | Update instances of the model matched by {{where}} from the data source.
*CompanyApi* | [**companyCount**](docs/CompanyApi.md#companyCount) | **GET** /Company/count | Count instances of the model matched by where from the data source.
*CompanyApi* | [**companyCreate**](docs/CompanyApi.md#companyCreate) | **POST** /Company | Create a new instance of the model and persist it into the data source.
*CompanyApi* | [**companyCreateCompanyAndBranch**](docs/CompanyApi.md#companyCreateCompanyAndBranch) | **POST** /Company/createCompanyAndBranch | Create Company, Branch
*CompanyApi* | [**companyDeleteById**](docs/CompanyApi.md#companyDeleteById) | **DELETE** /Company/{id} | Delete a model instance by {{id}} from the data source.
*CompanyApi* | [**companyFind**](docs/CompanyApi.md#companyFind) | **GET** /Company | Find all instances of the model matched by filter from the data source.
*CompanyApi* | [**companyFindById**](docs/CompanyApi.md#companyFindById) | **GET** /Company/{id} | Find a model instance by {{id}} from the data source.
*CompanyApi* | [**companyFindOne**](docs/CompanyApi.md#companyFindOne) | **GET** /Company/findOne | Find first instance of the model matched by filter from the data source.
*CompanyApi* | [**companyPrototypeCountBranch**](docs/CompanyApi.md#companyPrototypeCountBranch) | **GET** /Company/{id}/branch/count | Counts branch of Company.
*CompanyApi* | [**companyPrototypeGetBranch**](docs/CompanyApi.md#companyPrototypeGetBranch) | **GET** /Company/{id}/branch | Queries branch of Company.
*CompanyApi* | [**companyUpdateAll**](docs/CompanyApi.md#companyUpdateAll) | **POST** /Company/update | Update instances of the model matched by {{where}} from the data source.
*CustomerApi* | [**customerCount**](docs/CustomerApi.md#customerCount) | **GET** /Customer/count | Count instances of the model matched by where from the data source.
*CustomerApi* | [**customerCreate**](docs/CustomerApi.md#customerCreate) | **POST** /Customer | Create a new instance of the model and persist it into the data source.
*CustomerApi* | [**customerDeleteById**](docs/CustomerApi.md#customerDeleteById) | **DELETE** /Customer/{id} | Delete a model instance by {{id}} from the data source.
*CustomerApi* | [**customerFind**](docs/CustomerApi.md#customerFind) | **GET** /Customer | Find all instances of the model matched by filter from the data source.
*CustomerApi* | [**customerFindById**](docs/CustomerApi.md#customerFindById) | **GET** /Customer/{id} | Find a model instance by {{id}} from the data source.
*CustomerApi* | [**customerFindCustomerSaleReceivable**](docs/CustomerApi.md#customerFindCustomerSaleReceivable) | **GET** /Customer/findCustomerSaleReceivable | Find Customer, Sale (isDone &#x3D; 0, isReceivable &#x3D; 1), Receivable (isDone &#x3D; 0)
*CustomerApi* | [**customerFindOne**](docs/CustomerApi.md#customerFindOne) | **GET** /Customer/findOne | Find first instance of the model matched by filter from the data source.
*CustomerApi* | [**customerPrototypeCountSale**](docs/CustomerApi.md#customerPrototypeCountSale) | **GET** /Customer/{id}/sale/count | Counts sale of Customer.
*CustomerApi* | [**customerPrototypeGetSale**](docs/CustomerApi.md#customerPrototypeGetSale) | **GET** /Customer/{id}/sale | Queries sale of Customer.
*CustomerApi* | [**customerUpdateAll**](docs/CustomerApi.md#customerUpdateAll) | **POST** /Customer/update | Update instances of the model matched by {{where}} from the data source.
*DeliveryApi* | [**deliveryCount**](docs/DeliveryApi.md#deliveryCount) | **GET** /Delivery/count | Count instances of the model matched by where from the data source.
*DeliveryApi* | [**deliveryCreateDelivery**](docs/DeliveryApi.md#deliveryCreateDelivery) | **POST** /Delivery | Create Delivery, Delivery Detail
*DeliveryApi* | [**deliveryFind**](docs/DeliveryApi.md#deliveryFind) | **GET** /Delivery | Find all instances of the model matched by filter from the data source.
*DeliveryApi* | [**deliveryFindById**](docs/DeliveryApi.md#deliveryFindById) | **GET** /Delivery/{id} | Find a model instance by {{id}} from the data source.
*DeliveryApi* | [**deliveryFindOne**](docs/DeliveryApi.md#deliveryFindOne) | **GET** /Delivery/findOne | Find first instance of the model matched by filter from the data source.
*DeliveryApi* | [**deliveryPrototypeCountDeliveryDetail**](docs/DeliveryApi.md#deliveryPrototypeCountDeliveryDetail) | **GET** /Delivery/{id}/deliveryDetail/count | Counts deliveryDetail of Delivery.
*DeliveryApi* | [**deliveryPrototypeGetBranchFromDetail**](docs/DeliveryApi.md#deliveryPrototypeGetBranchFromDetail) | **GET** /Delivery/{id}/branchFromDetail | Fetches belongsTo relation branchFromDetail.
*DeliveryApi* | [**deliveryPrototypeGetBranchToDetail**](docs/DeliveryApi.md#deliveryPrototypeGetBranchToDetail) | **GET** /Delivery/{id}/branchToDetail | Fetches belongsTo relation branchToDetail.
*DeliveryApi* | [**deliveryPrototypeGetDeliveryDetail**](docs/DeliveryApi.md#deliveryPrototypeGetDeliveryDetail) | **GET** /Delivery/{id}/deliveryDetail | Queries deliveryDetail of Delivery.
*DeliveryApi* | [**deliveryUpdateAll**](docs/DeliveryApi.md#deliveryUpdateAll) | **POST** /Delivery/update | Update instances of the model matched by {{where}} from the data source.
*DeliveryDetailApi* | [**deliveryDetailCount**](docs/DeliveryDetailApi.md#deliveryDetailCount) | **GET** /DeliveryDetail/count | Count instances of the model matched by where from the data source.
*DeliveryDetailApi* | [**deliveryDetailCreate**](docs/DeliveryDetailApi.md#deliveryDetailCreate) | **POST** /DeliveryDetail | Create a new instance of the model and persist it into the data source.
*DeliveryDetailApi* | [**deliveryDetailFind**](docs/DeliveryDetailApi.md#deliveryDetailFind) | **GET** /DeliveryDetail | Find all instances of the model matched by filter from the data source.
*DeliveryDetailApi* | [**deliveryDetailFindById**](docs/DeliveryDetailApi.md#deliveryDetailFindById) | **GET** /DeliveryDetail/{id} | Find a model instance by {{id}} from the data source.
*DeliveryDetailApi* | [**deliveryDetailFindOne**](docs/DeliveryDetailApi.md#deliveryDetailFindOne) | **GET** /DeliveryDetail/findOne | Find first instance of the model matched by filter from the data source.
*DeliveryDetailApi* | [**deliveryDetailPrototypeGetDelivery**](docs/DeliveryDetailApi.md#deliveryDetailPrototypeGetDelivery) | **GET** /DeliveryDetail/{id}/delivery | Fetches belongsTo relation delivery.
*DeliveryDetailApi* | [**deliveryDetailPrototypeGetItemVariant**](docs/DeliveryDetailApi.md#deliveryDetailPrototypeGetItemVariant) | **GET** /DeliveryDetail/{id}/itemVariant | Fetches belongsTo relation itemVariant.
*DeliveryDetailApi* | [**deliveryDetailUpdateAll**](docs/DeliveryDetailApi.md#deliveryDetailUpdateAll) | **POST** /DeliveryDetail/update | Update instances of the model matched by {{where}} from the data source.
*ItemApi* | [**itemCount**](docs/ItemApi.md#itemCount) | **GET** /Item/count | Count instances of the model matched by where from the data source.
*ItemApi* | [**itemCreateItem**](docs/ItemApi.md#itemCreateItem) | **POST** /Item | Create Item, Item Variant, Item Variant Stock, Log Stock Item
*ItemApi* | [**itemCreateItemBulk**](docs/ItemApi.md#itemCreateItemBulk) | **POST** /Item/createItemBulk | Create Item Bulk
*ItemApi* | [**itemDeleteItem**](docs/ItemApi.md#itemDeleteItem) | **DELETE** /Item | Delete Item, Item Variant, Item Variant Stock
*ItemApi* | [**itemFind**](docs/ItemApi.md#itemFind) | **GET** /Item | Find all instances of the model matched by filter from the data source.
*ItemApi* | [**itemFindById**](docs/ItemApi.md#itemFindById) | **GET** /Item/{id} | Find a model instance by {{id}} from the data source.
*ItemApi* | [**itemFindOne**](docs/ItemApi.md#itemFindOne) | **GET** /Item/findOne | Find first instance of the model matched by filter from the data source.
*ItemApi* | [**itemPrototypeCountItemVariant**](docs/ItemApi.md#itemPrototypeCountItemVariant) | **GET** /Item/{id}/itemVariant/count | Counts itemVariant of Item.
*ItemApi* | [**itemPrototypeGetItemCategory**](docs/ItemApi.md#itemPrototypeGetItemCategory) | **GET** /Item/{id}/itemCategory | Fetches belongsTo relation itemCategory.
*ItemApi* | [**itemPrototypeGetItemVariant**](docs/ItemApi.md#itemPrototypeGetItemVariant) | **GET** /Item/{id}/itemVariant | Queries itemVariant of Item.
*ItemApi* | [**itemUpdateAll**](docs/ItemApi.md#itemUpdateAll) | **POST** /Item/update | Update instances of the model matched by {{where}} from the data source.
*ItemApi* | [**itemUpdateItemBulk**](docs/ItemApi.md#itemUpdateItemBulk) | **POST** /Item/updateItemBulk | Update Item Bulk
*ItemCategoryApi* | [**itemCategoryCount**](docs/ItemCategoryApi.md#itemCategoryCount) | **GET** /ItemCategory/count | Count instances of the model matched by where from the data source.
*ItemCategoryApi* | [**itemCategoryCreate**](docs/ItemCategoryApi.md#itemCategoryCreate) | **POST** /ItemCategory | Create a new instance of the model and persist it into the data source.
*ItemCategoryApi* | [**itemCategoryDeleteById**](docs/ItemCategoryApi.md#itemCategoryDeleteById) | **DELETE** /ItemCategory/{id} | Delete a model instance by {{id}} from the data source.
*ItemCategoryApi* | [**itemCategoryFind**](docs/ItemCategoryApi.md#itemCategoryFind) | **GET** /ItemCategory | Find all instances of the model matched by filter from the data source.
*ItemCategoryApi* | [**itemCategoryFindById**](docs/ItemCategoryApi.md#itemCategoryFindById) | **GET** /ItemCategory/{id} | Find a model instance by {{id}} from the data source.
*ItemCategoryApi* | [**itemCategoryFindOne**](docs/ItemCategoryApi.md#itemCategoryFindOne) | **GET** /ItemCategory/findOne | Find first instance of the model matched by filter from the data source.
*ItemCategoryApi* | [**itemCategoryPrototypeCountItem**](docs/ItemCategoryApi.md#itemCategoryPrototypeCountItem) | **GET** /ItemCategory/{id}/item/count | Counts item of ItemCategory.
*ItemCategoryApi* | [**itemCategoryPrototypeGetItem**](docs/ItemCategoryApi.md#itemCategoryPrototypeGetItem) | **GET** /ItemCategory/{id}/item | Queries item of ItemCategory.
*ItemCategoryApi* | [**itemCategoryUpdateAll**](docs/ItemCategoryApi.md#itemCategoryUpdateAll) | **POST** /ItemCategory/update | Update instances of the model matched by {{where}} from the data source.
*ItemVariantApi* | [**itemVariantCount**](docs/ItemVariantApi.md#itemVariantCount) | **GET** /ItemVariant/count | Count instances of the model matched by where from the data source.
*ItemVariantApi* | [**itemVariantCreateItemVariant**](docs/ItemVariantApi.md#itemVariantCreateItemVariant) | **POST** /ItemVariant | Create Item Variant, Item Variant Stock, Log Stock Item
*ItemVariantApi* | [**itemVariantDeleteItemVariant**](docs/ItemVariantApi.md#itemVariantDeleteItemVariant) | **DELETE** /ItemVariant | Delete Item Variant, Item Variant Stock
*ItemVariantApi* | [**itemVariantFind**](docs/ItemVariantApi.md#itemVariantFind) | **GET** /ItemVariant | Find all instances of the model matched by filter from the data source.
*ItemVariantApi* | [**itemVariantFindById**](docs/ItemVariantApi.md#itemVariantFindById) | **GET** /ItemVariant/{id} | Find a model instance by {{id}} from the data source.
*ItemVariantApi* | [**itemVariantFindItemVariant**](docs/ItemVariantApi.md#itemVariantFindItemVariant) | **GET** /ItemVariant/findItemVariant | Find Item Variant By itemSearch &amp; itemVariantSearch
*ItemVariantApi* | [**itemVariantFindOne**](docs/ItemVariantApi.md#itemVariantFindOne) | **GET** /ItemVariant/findOne | Find first instance of the model matched by filter from the data source.
*ItemVariantApi* | [**itemVariantPrototypeCountAdjustmentDetail**](docs/ItemVariantApi.md#itemVariantPrototypeCountAdjustmentDetail) | **GET** /ItemVariant/{id}/adjustmentDetail/count | Counts adjustmentDetail of ItemVariant.
*ItemVariantApi* | [**itemVariantPrototypeCountDeliveryDetail**](docs/ItemVariantApi.md#itemVariantPrototypeCountDeliveryDetail) | **GET** /ItemVariant/{id}/deliveryDetail/count | Counts deliveryDetail of ItemVariant.
*ItemVariantApi* | [**itemVariantPrototypeCountPurchaseDetail**](docs/ItemVariantApi.md#itemVariantPrototypeCountPurchaseDetail) | **GET** /ItemVariant/{id}/purchaseDetail/count | Counts purchaseDetail of ItemVariant.
*ItemVariantApi* | [**itemVariantPrototypeCountSaleDetail**](docs/ItemVariantApi.md#itemVariantPrototypeCountSaleDetail) | **GET** /ItemVariant/{id}/saleDetail/count | Counts saleDetail of ItemVariant.
*ItemVariantApi* | [**itemVariantPrototypeGetAdjustmentDetail**](docs/ItemVariantApi.md#itemVariantPrototypeGetAdjustmentDetail) | **GET** /ItemVariant/{id}/adjustmentDetail | Queries adjustmentDetail of ItemVariant.
*ItemVariantApi* | [**itemVariantPrototypeGetDeliveryDetail**](docs/ItemVariantApi.md#itemVariantPrototypeGetDeliveryDetail) | **GET** /ItemVariant/{id}/deliveryDetail | Queries deliveryDetail of ItemVariant.
*ItemVariantApi* | [**itemVariantPrototypeGetItem**](docs/ItemVariantApi.md#itemVariantPrototypeGetItem) | **GET** /ItemVariant/{id}/item | Fetches belongsTo relation item.
*ItemVariantApi* | [**itemVariantPrototypeGetItemVariantStock**](docs/ItemVariantApi.md#itemVariantPrototypeGetItemVariantStock) | **GET** /ItemVariant/{id}/itemVariantStock | Fetches hasOne relation itemVariantStock.
*ItemVariantApi* | [**itemVariantPrototypeGetPurchaseDetail**](docs/ItemVariantApi.md#itemVariantPrototypeGetPurchaseDetail) | **GET** /ItemVariant/{id}/purchaseDetail | Queries purchaseDetail of ItemVariant.
*ItemVariantApi* | [**itemVariantPrototypeGetSaleDetail**](docs/ItemVariantApi.md#itemVariantPrototypeGetSaleDetail) | **GET** /ItemVariant/{id}/saleDetail | Queries saleDetail of ItemVariant.
*ItemVariantApi* | [**itemVariantUpdateAll**](docs/ItemVariantApi.md#itemVariantUpdateAll) | **POST** /ItemVariant/update | Update instances of the model matched by {{where}} from the data source.
*ItemVariantApi* | [**itemVariantUpdateItemVariant**](docs/ItemVariantApi.md#itemVariantUpdateItemVariant) | **POST** /ItemVariant/updateItemVariant | Update Item Variant, Item Variant Stock, Log Stock Item
*ItemVariantStockApi* | [**itemVariantStockCount**](docs/ItemVariantStockApi.md#itemVariantStockCount) | **GET** /ItemVariantStock/count | Count instances of the model matched by where from the data source.
*ItemVariantStockApi* | [**itemVariantStockCreate**](docs/ItemVariantStockApi.md#itemVariantStockCreate) | **POST** /ItemVariantStock | Create a new instance of the model and persist it into the data source.
*ItemVariantStockApi* | [**itemVariantStockFind**](docs/ItemVariantStockApi.md#itemVariantStockFind) | **GET** /ItemVariantStock | Find all instances of the model matched by filter from the data source.
*ItemVariantStockApi* | [**itemVariantStockFindById**](docs/ItemVariantStockApi.md#itemVariantStockFindById) | **GET** /ItemVariantStock/{id} | Find a model instance by {{id}} from the data source.
*ItemVariantStockApi* | [**itemVariantStockFindOne**](docs/ItemVariantStockApi.md#itemVariantStockFindOne) | **GET** /ItemVariantStock/findOne | Find first instance of the model matched by filter from the data source.
*ItemVariantStockApi* | [**itemVariantStockPrototypeGetItemVariant**](docs/ItemVariantStockApi.md#itemVariantStockPrototypeGetItemVariant) | **GET** /ItemVariantStock/{id}/itemVariant | Fetches belongsTo relation itemVariant.
*ItemVariantStockApi* | [**itemVariantStockUpdateAll**](docs/ItemVariantStockApi.md#itemVariantStockUpdateAll) | **POST** /ItemVariantStock/update | Update instances of the model matched by {{where}} from the data source.
*LogStockAdjustmentApi* | [**logStockAdjustmentCount**](docs/LogStockAdjustmentApi.md#logStockAdjustmentCount) | **GET** /LogStockAdjustment/count | Count instances of the model matched by where from the data source.
*LogStockAdjustmentApi* | [**logStockAdjustmentCreate**](docs/LogStockAdjustmentApi.md#logStockAdjustmentCreate) | **POST** /LogStockAdjustment | Create a new instance of the model and persist it into the data source.
*LogStockAdjustmentApi* | [**logStockAdjustmentFind**](docs/LogStockAdjustmentApi.md#logStockAdjustmentFind) | **GET** /LogStockAdjustment | Find all instances of the model matched by filter from the data source.
*LogStockAdjustmentApi* | [**logStockAdjustmentFindById**](docs/LogStockAdjustmentApi.md#logStockAdjustmentFindById) | **GET** /LogStockAdjustment/{id} | Find a model instance by {{id}} from the data source.
*LogStockAdjustmentApi* | [**logStockAdjustmentFindOne**](docs/LogStockAdjustmentApi.md#logStockAdjustmentFindOne) | **GET** /LogStockAdjustment/findOne | Find first instance of the model matched by filter from the data source.
*LogStockAdjustmentApi* | [**logStockAdjustmentPrototypeGetItemVariant**](docs/LogStockAdjustmentApi.md#logStockAdjustmentPrototypeGetItemVariant) | **GET** /LogStockAdjustment/{id}/itemVariant | Fetches belongsTo relation itemVariant.
*LogStockAdjustmentApi* | [**logStockAdjustmentUpdateAll**](docs/LogStockAdjustmentApi.md#logStockAdjustmentUpdateAll) | **POST** /LogStockAdjustment/update | Update instances of the model matched by {{where}} from the data source.
*LogStockDeliveryApi* | [**logStockDeliveryCount**](docs/LogStockDeliveryApi.md#logStockDeliveryCount) | **GET** /LogStockDelivery/count | Count instances of the model matched by where from the data source.
*LogStockDeliveryApi* | [**logStockDeliveryCreate**](docs/LogStockDeliveryApi.md#logStockDeliveryCreate) | **POST** /LogStockDelivery | Create a new instance of the model and persist it into the data source.
*LogStockDeliveryApi* | [**logStockDeliveryFind**](docs/LogStockDeliveryApi.md#logStockDeliveryFind) | **GET** /LogStockDelivery | Find all instances of the model matched by filter from the data source.
*LogStockDeliveryApi* | [**logStockDeliveryFindById**](docs/LogStockDeliveryApi.md#logStockDeliveryFindById) | **GET** /LogStockDelivery/{id} | Find a model instance by {{id}} from the data source.
*LogStockDeliveryApi* | [**logStockDeliveryFindOne**](docs/LogStockDeliveryApi.md#logStockDeliveryFindOne) | **GET** /LogStockDelivery/findOne | Find first instance of the model matched by filter from the data source.
*LogStockDeliveryApi* | [**logStockDeliveryPrototypeGetItemVariant**](docs/LogStockDeliveryApi.md#logStockDeliveryPrototypeGetItemVariant) | **GET** /LogStockDelivery/{id}/itemVariant | Fetches belongsTo relation itemVariant.
*LogStockDeliveryApi* | [**logStockDeliveryUpdateAll**](docs/LogStockDeliveryApi.md#logStockDeliveryUpdateAll) | **POST** /LogStockDelivery/update | Update instances of the model matched by {{where}} from the data source.
*LogStockItemApi* | [**logStockItemCount**](docs/LogStockItemApi.md#logStockItemCount) | **GET** /LogStockItem/count | Count instances of the model matched by where from the data source.
*LogStockItemApi* | [**logStockItemCreate**](docs/LogStockItemApi.md#logStockItemCreate) | **POST** /LogStockItem | Create a new instance of the model and persist it into the data source.
*LogStockItemApi* | [**logStockItemFind**](docs/LogStockItemApi.md#logStockItemFind) | **GET** /LogStockItem | Find all instances of the model matched by filter from the data source.
*LogStockItemApi* | [**logStockItemFindById**](docs/LogStockItemApi.md#logStockItemFindById) | **GET** /LogStockItem/{id} | Find a model instance by {{id}} from the data source.
*LogStockItemApi* | [**logStockItemFindOne**](docs/LogStockItemApi.md#logStockItemFindOne) | **GET** /LogStockItem/findOne | Find first instance of the model matched by filter from the data source.
*LogStockItemApi* | [**logStockItemPrototypeGetItemVariant**](docs/LogStockItemApi.md#logStockItemPrototypeGetItemVariant) | **GET** /LogStockItem/{id}/itemVariant | Fetches belongsTo relation itemVariant.
*LogStockItemApi* | [**logStockItemUpdateAll**](docs/LogStockItemApi.md#logStockItemUpdateAll) | **POST** /LogStockItem/update | Update instances of the model matched by {{where}} from the data source.
*LogStockPurchaseApi* | [**logStockPurchaseCount**](docs/LogStockPurchaseApi.md#logStockPurchaseCount) | **GET** /LogStockPurchase/count | Count instances of the model matched by where from the data source.
*LogStockPurchaseApi* | [**logStockPurchaseCreate**](docs/LogStockPurchaseApi.md#logStockPurchaseCreate) | **POST** /LogStockPurchase | Create a new instance of the model and persist it into the data source.
*LogStockPurchaseApi* | [**logStockPurchaseFind**](docs/LogStockPurchaseApi.md#logStockPurchaseFind) | **GET** /LogStockPurchase | Find all instances of the model matched by filter from the data source.
*LogStockPurchaseApi* | [**logStockPurchaseFindById**](docs/LogStockPurchaseApi.md#logStockPurchaseFindById) | **GET** /LogStockPurchase/{id} | Find a model instance by {{id}} from the data source.
*LogStockPurchaseApi* | [**logStockPurchaseFindOne**](docs/LogStockPurchaseApi.md#logStockPurchaseFindOne) | **GET** /LogStockPurchase/findOne | Find first instance of the model matched by filter from the data source.
*LogStockPurchaseApi* | [**logStockPurchasePrototypeGetItemVariant**](docs/LogStockPurchaseApi.md#logStockPurchasePrototypeGetItemVariant) | **GET** /LogStockPurchase/{id}/itemVariant | Fetches belongsTo relation itemVariant.
*LogStockPurchaseApi* | [**logStockPurchaseUpdateAll**](docs/LogStockPurchaseApi.md#logStockPurchaseUpdateAll) | **POST** /LogStockPurchase/update | Update instances of the model matched by {{where}} from the data source.
*LogStockSaleApi* | [**logStockSaleCount**](docs/LogStockSaleApi.md#logStockSaleCount) | **GET** /LogStockSale/count | Count instances of the model matched by where from the data source.
*LogStockSaleApi* | [**logStockSaleCreate**](docs/LogStockSaleApi.md#logStockSaleCreate) | **POST** /LogStockSale | Create a new instance of the model and persist it into the data source.
*LogStockSaleApi* | [**logStockSaleFind**](docs/LogStockSaleApi.md#logStockSaleFind) | **GET** /LogStockSale | Find all instances of the model matched by filter from the data source.
*LogStockSaleApi* | [**logStockSaleFindById**](docs/LogStockSaleApi.md#logStockSaleFindById) | **GET** /LogStockSale/{id} | Find a model instance by {{id}} from the data source.
*LogStockSaleApi* | [**logStockSaleFindOne**](docs/LogStockSaleApi.md#logStockSaleFindOne) | **GET** /LogStockSale/findOne | Find first instance of the model matched by filter from the data source.
*LogStockSaleApi* | [**logStockSalePrototypeGetItemVariant**](docs/LogStockSaleApi.md#logStockSalePrototypeGetItemVariant) | **GET** /LogStockSale/{id}/itemVariant | Fetches belongsTo relation itemVariant.
*LogStockSaleApi* | [**logStockSaleUpdateAll**](docs/LogStockSaleApi.md#logStockSaleUpdateAll) | **POST** /LogStockSale/update | Update instances of the model matched by {{where}} from the data source.
*LogTransactionPaymentDetailApi* | [**logTransactionPaymentDetailCount**](docs/LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailCount) | **GET** /LogTransactionPaymentDetail/count | Count instances of the model matched by where from the data source.
*LogTransactionPaymentDetailApi* | [**logTransactionPaymentDetailCreate**](docs/LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailCreate) | **POST** /LogTransactionPaymentDetail | Create a new instance of the model and persist it into the data source.
*LogTransactionPaymentDetailApi* | [**logTransactionPaymentDetailFind**](docs/LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailFind) | **GET** /LogTransactionPaymentDetail | Find all instances of the model matched by filter from the data source.
*LogTransactionPaymentDetailApi* | [**logTransactionPaymentDetailFindById**](docs/LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailFindById) | **GET** /LogTransactionPaymentDetail/{id} | Find a model instance by {{id}} from the data source.
*LogTransactionPaymentDetailApi* | [**logTransactionPaymentDetailFindOne**](docs/LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailFindOne) | **GET** /LogTransactionPaymentDetail/findOne | Find first instance of the model matched by filter from the data source.
*LogTransactionPaymentDetailApi* | [**logTransactionPaymentDetailUpdateAll**](docs/LogTransactionPaymentDetailApi.md#logTransactionPaymentDetailUpdateAll) | **POST** /LogTransactionPaymentDetail/update | Update instances of the model matched by {{where}} from the data source.
*LogTransactionSaleApi* | [**logTransactionSaleCount**](docs/LogTransactionSaleApi.md#logTransactionSaleCount) | **GET** /LogTransactionSale/count | Count instances of the model matched by where from the data source.
*LogTransactionSaleApi* | [**logTransactionSaleCreate**](docs/LogTransactionSaleApi.md#logTransactionSaleCreate) | **POST** /LogTransactionSale | Create a new instance of the model and persist it into the data source.
*LogTransactionSaleApi* | [**logTransactionSaleFind**](docs/LogTransactionSaleApi.md#logTransactionSaleFind) | **GET** /LogTransactionSale | Find all instances of the model matched by filter from the data source.
*LogTransactionSaleApi* | [**logTransactionSaleFindById**](docs/LogTransactionSaleApi.md#logTransactionSaleFindById) | **GET** /LogTransactionSale/{id} | Find a model instance by {{id}} from the data source.
*LogTransactionSaleApi* | [**logTransactionSaleFindOne**](docs/LogTransactionSaleApi.md#logTransactionSaleFindOne) | **GET** /LogTransactionSale/findOne | Find first instance of the model matched by filter from the data source.
*LogTransactionSaleApi* | [**logTransactionSaleUpdateAll**](docs/LogTransactionSaleApi.md#logTransactionSaleUpdateAll) | **POST** /LogTransactionSale/update | Update instances of the model matched by {{where}} from the data source.
*PurchaseApi* | [**purchaseCount**](docs/PurchaseApi.md#purchaseCount) | **GET** /Purchase/count | Count instances of the model matched by where from the data source.
*PurchaseApi* | [**purchaseCreatePurchase**](docs/PurchaseApi.md#purchaseCreatePurchase) | **POST** /Purchase | Create Purchase, Purchase Detail, Log Purchase
*PurchaseApi* | [**purchaseDeletePurchase**](docs/PurchaseApi.md#purchaseDeletePurchase) | **DELETE** /Purchase | Delete Purchase, Purchase Detail, Receivable (if exist)
*PurchaseApi* | [**purchaseFind**](docs/PurchaseApi.md#purchaseFind) | **GET** /Purchase | Find all instances of the model matched by filter from the data source.
*PurchaseApi* | [**purchaseFindById**](docs/PurchaseApi.md#purchaseFindById) | **GET** /Purchase/{id} | Find a model instance by {{id}} from the data source.
*PurchaseApi* | [**purchaseFindOne**](docs/PurchaseApi.md#purchaseFindOne) | **GET** /Purchase/findOne | Find first instance of the model matched by filter from the data source.
*PurchaseApi* | [**purchasePrototypeCountPurchaseDetail**](docs/PurchaseApi.md#purchasePrototypeCountPurchaseDetail) | **GET** /Purchase/{id}/purchaseDetail/count | Counts purchaseDetail of Purchase.
*PurchaseApi* | [**purchasePrototypeGetPurchaseDetail**](docs/PurchaseApi.md#purchasePrototypeGetPurchaseDetail) | **GET** /Purchase/{id}/purchaseDetail | Queries purchaseDetail of Purchase.
*PurchaseApi* | [**purchaseUpdateAll**](docs/PurchaseApi.md#purchaseUpdateAll) | **POST** /Purchase/update | Update instances of the model matched by {{where}} from the data source.
*PurchaseDetailApi* | [**purchaseDetailCount**](docs/PurchaseDetailApi.md#purchaseDetailCount) | **GET** /PurchaseDetail/count | Count instances of the model matched by where from the data source.
*PurchaseDetailApi* | [**purchaseDetailCreatePurchaseDetail**](docs/PurchaseDetailApi.md#purchaseDetailCreatePurchaseDetail) | **POST** /PurchaseDetail | Create Purchase Detail, Log Purchase
*PurchaseDetailApi* | [**purchaseDetailDeletePurchaseDetail**](docs/PurchaseDetailApi.md#purchaseDetailDeletePurchaseDetail) | **DELETE** /PurchaseDetail | Delete Purchase Detail, Log Purchase
*PurchaseDetailApi* | [**purchaseDetailFind**](docs/PurchaseDetailApi.md#purchaseDetailFind) | **GET** /PurchaseDetail | Find all instances of the model matched by filter from the data source.
*PurchaseDetailApi* | [**purchaseDetailFindById**](docs/PurchaseDetailApi.md#purchaseDetailFindById) | **GET** /PurchaseDetail/{id} | Find a model instance by {{id}} from the data source.
*PurchaseDetailApi* | [**purchaseDetailFindOne**](docs/PurchaseDetailApi.md#purchaseDetailFindOne) | **GET** /PurchaseDetail/findOne | Find first instance of the model matched by filter from the data source.
*PurchaseDetailApi* | [**purchaseDetailPrototypeGetItemVariant**](docs/PurchaseDetailApi.md#purchaseDetailPrototypeGetItemVariant) | **GET** /PurchaseDetail/{id}/itemVariant | Fetches belongsTo relation itemVariant.
*PurchaseDetailApi* | [**purchaseDetailPrototypeGetPurchase**](docs/PurchaseDetailApi.md#purchaseDetailPrototypeGetPurchase) | **GET** /PurchaseDetail/{id}/purchase | Fetches belongsTo relation purchase.
*PurchaseDetailApi* | [**purchaseDetailUpdateAll**](docs/PurchaseDetailApi.md#purchaseDetailUpdateAll) | **POST** /PurchaseDetail/update | Update instances of the model matched by {{where}} from the data source.
*ReceivableApi* | [**receivableCount**](docs/ReceivableApi.md#receivableCount) | **GET** /Receivable/count | Count instances of the model matched by where from the data source.
*ReceivableApi* | [**receivableCreate**](docs/ReceivableApi.md#receivableCreate) | **POST** /Receivable | Create a new instance of the model and persist it into the data source.
*ReceivableApi* | [**receivableFind**](docs/ReceivableApi.md#receivableFind) | **GET** /Receivable | Find all instances of the model matched by filter from the data source.
*ReceivableApi* | [**receivableFindById**](docs/ReceivableApi.md#receivableFindById) | **GET** /Receivable/{id} | Find a model instance by {{id}} from the data source.
*ReceivableApi* | [**receivableFindOne**](docs/ReceivableApi.md#receivableFindOne) | **GET** /Receivable/findOne | Find first instance of the model matched by filter from the data source.
*ReceivableApi* | [**receivablePrototypeCountReceivablePaymentDetail**](docs/ReceivableApi.md#receivablePrototypeCountReceivablePaymentDetail) | **GET** /Receivable/{id}/receivablePaymentDetail/count | Counts receivablePaymentDetail of Receivable.
*ReceivableApi* | [**receivablePrototypeGetReceivablePaymentDetail**](docs/ReceivableApi.md#receivablePrototypeGetReceivablePaymentDetail) | **GET** /Receivable/{id}/receivablePaymentDetail | Queries receivablePaymentDetail of Receivable.
*ReceivableApi* | [**receivablePrototypeGetSale**](docs/ReceivableApi.md#receivablePrototypeGetSale) | **GET** /Receivable/{id}/sale | Fetches belongsTo relation sale.
*ReceivableApi* | [**receivableUpdateAll**](docs/ReceivableApi.md#receivableUpdateAll) | **POST** /Receivable/update | Update instances of the model matched by {{where}} from the data source.
*ReceivablePaymentApi* | [**receivablePaymentCount**](docs/ReceivablePaymentApi.md#receivablePaymentCount) | **GET** /ReceivablePayment/count | Count instances of the model matched by where from the data source.
*ReceivablePaymentApi* | [**receivablePaymentCreateReceivablePayment**](docs/ReceivablePaymentApi.md#receivablePaymentCreateReceivablePayment) | **POST** /ReceivablePayment | Create Receivable Payment, Receivable Payment Detail
*ReceivablePaymentApi* | [**receivablePaymentFind**](docs/ReceivablePaymentApi.md#receivablePaymentFind) | **GET** /ReceivablePayment | Find all instances of the model matched by filter from the data source.
*ReceivablePaymentApi* | [**receivablePaymentFindById**](docs/ReceivablePaymentApi.md#receivablePaymentFindById) | **GET** /ReceivablePayment/{id} | Find a model instance by {{id}} from the data source.
*ReceivablePaymentApi* | [**receivablePaymentFindOne**](docs/ReceivablePaymentApi.md#receivablePaymentFindOne) | **GET** /ReceivablePayment/findOne | Find first instance of the model matched by filter from the data source.
*ReceivablePaymentApi* | [**receivablePaymentPrototypeCountReceivablePaymentDetail**](docs/ReceivablePaymentApi.md#receivablePaymentPrototypeCountReceivablePaymentDetail) | **GET** /ReceivablePayment/{id}/receivablePaymentDetail/count | Counts receivablePaymentDetail of ReceivablePayment.
*ReceivablePaymentApi* | [**receivablePaymentPrototypeGetReceivablePaymentDetail**](docs/ReceivablePaymentApi.md#receivablePaymentPrototypeGetReceivablePaymentDetail) | **GET** /ReceivablePayment/{id}/receivablePaymentDetail | Queries receivablePaymentDetail of ReceivablePayment.
*ReceivablePaymentApi* | [**receivablePaymentUpdateAll**](docs/ReceivablePaymentApi.md#receivablePaymentUpdateAll) | **POST** /ReceivablePayment/update | Update instances of the model matched by {{where}} from the data source.
*ReceivablePaymentDetailApi* | [**receivablePaymentDetailCount**](docs/ReceivablePaymentDetailApi.md#receivablePaymentDetailCount) | **GET** /ReceivablePaymentDetail/count | Count instances of the model matched by where from the data source.
*ReceivablePaymentDetailApi* | [**receivablePaymentDetailCreate**](docs/ReceivablePaymentDetailApi.md#receivablePaymentDetailCreate) | **POST** /ReceivablePaymentDetail | Create a new instance of the model and persist it into the data source.
*ReceivablePaymentDetailApi* | [**receivablePaymentDetailDeletePaymentDetail**](docs/ReceivablePaymentDetailApi.md#receivablePaymentDetailDeletePaymentDetail) | **DELETE** /ReceivablePaymentDetail | Delete Payment Detail
*ReceivablePaymentDetailApi* | [**receivablePaymentDetailFind**](docs/ReceivablePaymentDetailApi.md#receivablePaymentDetailFind) | **GET** /ReceivablePaymentDetail | Find all instances of the model matched by filter from the data source.
*ReceivablePaymentDetailApi* | [**receivablePaymentDetailFindById**](docs/ReceivablePaymentDetailApi.md#receivablePaymentDetailFindById) | **GET** /ReceivablePaymentDetail/{id} | Find a model instance by {{id}} from the data source.
*ReceivablePaymentDetailApi* | [**receivablePaymentDetailFindOne**](docs/ReceivablePaymentDetailApi.md#receivablePaymentDetailFindOne) | **GET** /ReceivablePaymentDetail/findOne | Find first instance of the model matched by filter from the data source.
*ReceivablePaymentDetailApi* | [**receivablePaymentDetailPrototypeGetReceivable**](docs/ReceivablePaymentDetailApi.md#receivablePaymentDetailPrototypeGetReceivable) | **GET** /ReceivablePaymentDetail/{id}/receivable | Fetches belongsTo relation receivable.
*ReceivablePaymentDetailApi* | [**receivablePaymentDetailPrototypeGetReceivablePayment**](docs/ReceivablePaymentDetailApi.md#receivablePaymentDetailPrototypeGetReceivablePayment) | **GET** /ReceivablePaymentDetail/{id}/receivablePayment | Fetches belongsTo relation receivablePayment.
*ReceivablePaymentDetailApi* | [**receivablePaymentDetailUpdateAll**](docs/ReceivablePaymentDetailApi.md#receivablePaymentDetailUpdateAll) | **POST** /ReceivablePaymentDetail/update | Update instances of the model matched by {{where}} from the data source.
*ReportApi* | [**reportItemOut**](docs/ReportApi.md#reportItemOut) | **GET** /Report/itemOut | Get Item Out Report By Branch
*ReportApi* | [**reportProfit**](docs/ReportApi.md#reportProfit) | **GET** /Report/profit | Get Profit Report By Branch
*ReportApi* | [**reportReceivable**](docs/ReportApi.md#reportReceivable) | **GET** /Report/receivable | Get receivable Report By Branch
*ReportApi* | [**reportReceivablePayment**](docs/ReportApi.md#reportReceivablePayment) | **GET** /Report/receivablePayment | Get receivable payment Report By Branch
*ReportApi* | [**reportSale**](docs/ReportApi.md#reportSale) | **GET** /Report/sale | Get Sale Report By Branch
*ReportApi* | [**reportSalesman**](docs/ReportApi.md#reportSalesman) | **GET** /Report/salesman | Get Salesman Report By Branch
*ReportApi* | [**reportStockItem**](docs/ReportApi.md#reportStockItem) | **GET** /Report/stockItem | Get stockItem Report By Branch
*SaleApi* | [**saleCount**](docs/SaleApi.md#saleCount) | **GET** /Sale/count | Count instances of the model matched by where from the data source.
*SaleApi* | [**saleCreateSale**](docs/SaleApi.md#saleCreateSale) | **POST** /Sale | Create Sale, Sale Detail, Log Sale
*SaleApi* | [**saleDeleteSale**](docs/SaleApi.md#saleDeleteSale) | **DELETE** /Sale | Delete Sale, Sale Detail, Receivable (if exist)
*SaleApi* | [**saleFind**](docs/SaleApi.md#saleFind) | **GET** /Sale | Find all instances of the model matched by filter from the data source.
*SaleApi* | [**saleFindById**](docs/SaleApi.md#saleFindById) | **GET** /Sale/{id} | Find a model instance by {{id}} from the data source.
*SaleApi* | [**saleFindOne**](docs/SaleApi.md#saleFindOne) | **GET** /Sale/findOne | Find first instance of the model matched by filter from the data source.
*SaleApi* | [**salePrototypeCountSaleDetail**](docs/SaleApi.md#salePrototypeCountSaleDetail) | **GET** /Sale/{id}/saleDetail/count | Counts saleDetail of Sale.
*SaleApi* | [**salePrototypeGetCustomer**](docs/SaleApi.md#salePrototypeGetCustomer) | **GET** /Sale/{id}/customer | Fetches belongsTo relation customer.
*SaleApi* | [**salePrototypeGetReceivable**](docs/SaleApi.md#salePrototypeGetReceivable) | **GET** /Sale/{id}/receivable | Fetches hasOne relation receivable.
*SaleApi* | [**salePrototypeGetSaleDetail**](docs/SaleApi.md#salePrototypeGetSaleDetail) | **GET** /Sale/{id}/saleDetail | Queries saleDetail of Sale.
*SaleApi* | [**saleUpdateAll**](docs/SaleApi.md#saleUpdateAll) | **POST** /Sale/update | Update instances of the model matched by {{where}} from the data source.
*SaleDetailApi* | [**saleDetailCount**](docs/SaleDetailApi.md#saleDetailCount) | **GET** /SaleDetail/count | Count instances of the model matched by where from the data source.
*SaleDetailApi* | [**saleDetailCreateSaleDetail**](docs/SaleDetailApi.md#saleDetailCreateSaleDetail) | **POST** /SaleDetail | Create Sale Detail, Log Sale
*SaleDetailApi* | [**saleDetailDeleteSaleDetail**](docs/SaleDetailApi.md#saleDetailDeleteSaleDetail) | **DELETE** /SaleDetail | Delete Sale Detail, Log Sale
*SaleDetailApi* | [**saleDetailFind**](docs/SaleDetailApi.md#saleDetailFind) | **GET** /SaleDetail | Find all instances of the model matched by filter from the data source.
*SaleDetailApi* | [**saleDetailFindById**](docs/SaleDetailApi.md#saleDetailFindById) | **GET** /SaleDetail/{id} | Find a model instance by {{id}} from the data source.
*SaleDetailApi* | [**saleDetailFindOne**](docs/SaleDetailApi.md#saleDetailFindOne) | **GET** /SaleDetail/findOne | Find first instance of the model matched by filter from the data source.
*SaleDetailApi* | [**saleDetailPrototypeGetItemVariant**](docs/SaleDetailApi.md#saleDetailPrototypeGetItemVariant) | **GET** /SaleDetail/{id}/itemVariant | Fetches belongsTo relation itemVariant.
*SaleDetailApi* | [**saleDetailPrototypeGetSale**](docs/SaleDetailApi.md#saleDetailPrototypeGetSale) | **GET** /SaleDetail/{id}/sale | Fetches belongsTo relation sale.
*SaleDetailApi* | [**saleDetailUpdateAll**](docs/SaleDetailApi.md#saleDetailUpdateAll) | **POST** /SaleDetail/update | Update instances of the model matched by {{where}} from the data source.
*UserApi* | [**userChangePassword**](docs/UserApi.md#userChangePassword) | **POST** /Users/change-password | Change a user&#39;s password.
*UserApi* | [**userConfirm**](docs/UserApi.md#userConfirm) | **GET** /Users/confirm | Confirm a user registration with email verification token.
*UserApi* | [**userCount**](docs/UserApi.md#userCount) | **GET** /Users/count | Count instances of the model matched by where from the data source.
*UserApi* | [**userCreate**](docs/UserApi.md#userCreate) | **POST** /Users | Create a new instance of the model and persist it into the data source.
*UserApi* | [**userCreateChangeStreamGetUsersChangeStream**](docs/UserApi.md#userCreateChangeStreamGetUsersChangeStream) | **GET** /Users/change-stream | Create a change stream.
*UserApi* | [**userCreateChangeStreamPostUsersChangeStream**](docs/UserApi.md#userCreateChangeStreamPostUsersChangeStream) | **POST** /Users/change-stream | Create a change stream.
*UserApi* | [**userDeleteById**](docs/UserApi.md#userDeleteById) | **DELETE** /Users/{id} | Delete a model instance by {{id}} from the data source.
*UserApi* | [**userExistsGetUsersidExists**](docs/UserApi.md#userExistsGetUsersidExists) | **GET** /Users/{id}/exists | Check whether a model instance exists in the data source.
*UserApi* | [**userExistsHeadUsersid**](docs/UserApi.md#userExistsHeadUsersid) | **HEAD** /Users/{id} | Check whether a model instance exists in the data source.
*UserApi* | [**userFind**](docs/UserApi.md#userFind) | **GET** /Users | Find all instances of the model matched by filter from the data source.
*UserApi* | [**userFindById**](docs/UserApi.md#userFindById) | **GET** /Users/{id} | Find a model instance by {{id}} from the data source.
*UserApi* | [**userFindOne**](docs/UserApi.md#userFindOne) | **GET** /Users/findOne | Find first instance of the model matched by filter from the data source.
*UserApi* | [**userLogin**](docs/UserApi.md#userLogin) | **POST** /Users/login | Login a user with username/email and password.
*UserApi* | [**userLogout**](docs/UserApi.md#userLogout) | **POST** /Users/logout | Logout a user with access token.
*UserApi* | [**userPatchOrCreate**](docs/UserApi.md#userPatchOrCreate) | **PATCH** /Users | Patch an existing model instance or insert a new one into the data source.
*UserApi* | [**userPrototypeCountAccessTokens**](docs/UserApi.md#userPrototypeCountAccessTokens) | **GET** /Users/{id}/accessTokens/count | Counts accessTokens of User.
*UserApi* | [**userPrototypeCreateAccessTokens**](docs/UserApi.md#userPrototypeCreateAccessTokens) | **POST** /Users/{id}/accessTokens | Creates a new instance in accessTokens of this model.
*UserApi* | [**userPrototypeCreateUserInfo**](docs/UserApi.md#userPrototypeCreateUserInfo) | **POST** /Users/{id}/userInfo | Creates a new instance in userInfo of this model.
*UserApi* | [**userPrototypeDeleteAccessTokens**](docs/UserApi.md#userPrototypeDeleteAccessTokens) | **DELETE** /Users/{id}/accessTokens | Deletes all accessTokens of this model.
*UserApi* | [**userPrototypeDestroyByIdAccessTokens**](docs/UserApi.md#userPrototypeDestroyByIdAccessTokens) | **DELETE** /Users/{id}/accessTokens/{fk} | Delete a related item by id for accessTokens.
*UserApi* | [**userPrototypeDestroyUserInfo**](docs/UserApi.md#userPrototypeDestroyUserInfo) | **DELETE** /Users/{id}/userInfo | Deletes userInfo of this model.
*UserApi* | [**userPrototypeFindByIdAccessTokens**](docs/UserApi.md#userPrototypeFindByIdAccessTokens) | **GET** /Users/{id}/accessTokens/{fk} | Find a related item by id for accessTokens.
*UserApi* | [**userPrototypeGetAccessTokens**](docs/UserApi.md#userPrototypeGetAccessTokens) | **GET** /Users/{id}/accessTokens | Queries accessTokens of User.
*UserApi* | [**userPrototypeGetUserInfo**](docs/UserApi.md#userPrototypeGetUserInfo) | **GET** /Users/{id}/userInfo | Fetches hasOne relation userInfo.
*UserApi* | [**userPrototypePatchAttributes**](docs/UserApi.md#userPrototypePatchAttributes) | **PATCH** /Users/{id} | Patch attributes for a model instance and persist it into the data source.
*UserApi* | [**userPrototypeUpdateByIdAccessTokens**](docs/UserApi.md#userPrototypeUpdateByIdAccessTokens) | **PUT** /Users/{id}/accessTokens/{fk} | Update a related item by id for accessTokens.
*UserApi* | [**userPrototypeUpdateUserInfo**](docs/UserApi.md#userPrototypeUpdateUserInfo) | **PUT** /Users/{id}/userInfo | Update userInfo of this model.
*UserApi* | [**userReplaceByIdPostUsersidReplace**](docs/UserApi.md#userReplaceByIdPostUsersidReplace) | **POST** /Users/{id}/replace | Replace attributes for a model instance and persist it into the data source.
*UserApi* | [**userReplaceByIdPutUsersid**](docs/UserApi.md#userReplaceByIdPutUsersid) | **PUT** /Users/{id} | Replace attributes for a model instance and persist it into the data source.
*UserApi* | [**userReplaceOrCreatePostUsersReplaceOrCreate**](docs/UserApi.md#userReplaceOrCreatePostUsersReplaceOrCreate) | **POST** /Users/replaceOrCreate | Replace an existing model instance or insert a new one into the data source.
*UserApi* | [**userReplaceOrCreatePutUsers**](docs/UserApi.md#userReplaceOrCreatePutUsers) | **PUT** /Users | Replace an existing model instance or insert a new one into the data source.
*UserApi* | [**userResetPassword**](docs/UserApi.md#userResetPassword) | **POST** /Users/reset | Reset password for a user with email.
*UserApi* | [**userUpdateAll**](docs/UserApi.md#userUpdateAll) | **POST** /Users/update | Update instances of the model matched by {{where}} from the data source.
*UserApi* | [**userUpsertWithWhere**](docs/UserApi.md#userUpsertWithWhere) | **POST** /Users/upsertWithWhere | Update an existing model instance or insert a new one into the data source based on the where criteria.
*UserInfoApi* | [**userInfoCount**](docs/UserInfoApi.md#userInfoCount) | **GET** /UserInfo/count | Count instances of the model matched by where from the data source.
*UserInfoApi* | [**userInfoCreate**](docs/UserInfoApi.md#userInfoCreate) | **POST** /UserInfo | Create a new instance of the model and persist it into the data source.
*UserInfoApi* | [**userInfoFind**](docs/UserInfoApi.md#userInfoFind) | **GET** /UserInfo | Find all instances of the model matched by filter from the data source.
*UserInfoApi* | [**userInfoFindById**](docs/UserInfoApi.md#userInfoFindById) | **GET** /UserInfo/{id} | Find a model instance by {{id}} from the data source.
*UserInfoApi* | [**userInfoFindOne**](docs/UserInfoApi.md#userInfoFindOne) | **GET** /UserInfo/findOne | Find first instance of the model matched by filter from the data source.
*UserInfoApi* | [**userInfoPrototypeGetBranch**](docs/UserInfoApi.md#userInfoPrototypeGetBranch) | **GET** /UserInfo/{id}/branch | Fetches belongsTo relation branch.
*UserInfoApi* | [**userInfoPrototypeGetUser**](docs/UserInfoApi.md#userInfoPrototypeGetUser) | **GET** /UserInfo/{id}/user | Fetches belongsTo relation user.
*UserInfoApi* | [**userInfoUpdateAll**](docs/UserInfoApi.md#userInfoUpdateAll) | **POST** /UserInfo/update | Update instances of the model matched by {{where}} from the data source.


## Documentation for Models

 - [AccessToken](docs/AccessToken.md)
 - [Adjustment](docs/Adjustment.md)
 - [AdjustmentDetail](docs/AdjustmentDetail.md)
 - [Branch](docs/Branch.md)
 - [Company](docs/Company.md)
 - [Customer](docs/Customer.md)
 - [Delivery](docs/Delivery.md)
 - [DeliveryDetail](docs/DeliveryDetail.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [Item](docs/Item.md)
 - [ItemCategory](docs/ItemCategory.md)
 - [ItemVariant](docs/ItemVariant.md)
 - [ItemVariantOut](docs/ItemVariantOut.md)
 - [ItemVariantStock](docs/ItemVariantStock.md)
 - [LogStockAdjustment](docs/LogStockAdjustment.md)
 - [LogStockDelivery](docs/LogStockDelivery.md)
 - [LogStockItem](docs/LogStockItem.md)
 - [LogStockPurchase](docs/LogStockPurchase.md)
 - [LogStockSale](docs/LogStockSale.md)
 - [LogTransactionPaymentDetail](docs/LogTransactionPaymentDetail.md)
 - [LogTransactionSale](docs/LogTransactionSale.md)
 - [Purchase](docs/Purchase.md)
 - [PurchaseDetail](docs/PurchaseDetail.md)
 - [Receivable](docs/Receivable.md)
 - [ReceivablePayment](docs/ReceivablePayment.md)
 - [ReceivablePaymentDetail](docs/ReceivablePaymentDetail.md)
 - [Sale](docs/Sale.md)
 - [SaleDetail](docs/SaleDetail.md)
 - [SaleDetailProfit](docs/SaleDetailProfit.md)
 - [SaleProfit](docs/SaleProfit.md)
 - [User](docs/User.md)
 - [UserInfo](docs/UserInfo.md)
 - [XAny](docs/XAny.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



