/**
 * loopback-boilerplate
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.Customer;
import io.swagger.client.model.Receivable;
import io.swagger.client.model.SaleDetail;
import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Sale {
  
  @SerializedName("invoiceNo")
  private String invoiceNo = null;
  @SerializedName("customerId")
  private Double customerId = null;
  @SerializedName("subTotalAmount")
  private Double subTotalAmount = null;
  @SerializedName("discountPercentage")
  private Double discountPercentage = null;
  @SerializedName("discountNominal")
  private Double discountNominal = null;
  @SerializedName("taxPercentage")
  private Double taxPercentage = null;
  @SerializedName("taxNominal")
  private Double taxNominal = null;
  @SerializedName("totalAmount")
  private Double totalAmount = null;
  @SerializedName("receiveCash")
  private Double receiveCash = null;
  @SerializedName("receiveTransfer")
  private Double receiveTransfer = null;
  @SerializedName("remarks")
  private String remarks = null;
  @SerializedName("saleDate")
  private Date saleDate = null;
  @SerializedName("salesName")
  private String salesName = null;
  @SerializedName("isReceivable")
  private Boolean isReceivable = null;
  @SerializedName("isDone")
  private Boolean isDone = null;
  @SerializedName("id")
  private Double id = null;
  @SerializedName("saleDetail")
  private List<SaleDetail> saleDetail = null;
  @SerializedName("receivable")
  private Receivable receivable = null;
  @SerializedName("customer")
  private Customer customer = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getInvoiceNo() {
    return invoiceNo;
  }
  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCustomerId() {
    return customerId;
  }
  public void setCustomerId(Double customerId) {
    this.customerId = customerId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSubTotalAmount() {
    return subTotalAmount;
  }
  public void setSubTotalAmount(Double subTotalAmount) {
    this.subTotalAmount = subTotalAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDiscountPercentage() {
    return discountPercentage;
  }
  public void setDiscountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDiscountNominal() {
    return discountNominal;
  }
  public void setDiscountNominal(Double discountNominal) {
    this.discountNominal = discountNominal;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTaxPercentage() {
    return taxPercentage;
  }
  public void setTaxPercentage(Double taxPercentage) {
    this.taxPercentage = taxPercentage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTaxNominal() {
    return taxNominal;
  }
  public void setTaxNominal(Double taxNominal) {
    this.taxNominal = taxNominal;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTotalAmount() {
    return totalAmount;
  }
  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getReceiveCash() {
    return receiveCash;
  }
  public void setReceiveCash(Double receiveCash) {
    this.receiveCash = receiveCash;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getReceiveTransfer() {
    return receiveTransfer;
  }
  public void setReceiveTransfer(Double receiveTransfer) {
    this.receiveTransfer = receiveTransfer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRemarks() {
    return remarks;
  }
  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getSaleDate() {
    return saleDate;
  }
  public void setSaleDate(Date saleDate) {
    this.saleDate = saleDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSalesName() {
    return salesName;
  }
  public void setSalesName(String salesName) {
    this.salesName = salesName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsReceivable() {
    return isReceivable;
  }
  public void setIsReceivable(Boolean isReceivable) {
    this.isReceivable = isReceivable;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsDone() {
    return isDone;
  }
  public void setIsDone(Boolean isDone) {
    this.isDone = isDone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SaleDetail> getSaleDetail() {
    return saleDetail;
  }
  public void setSaleDetail(List<SaleDetail> saleDetail) {
    this.saleDetail = saleDetail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Receivable getReceivable() {
    return receivable;
  }
  public void setReceivable(Receivable receivable) {
    this.receivable = receivable;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Customer getCustomer() {
    return customer;
  }
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sale sale = (Sale) o;
    return (this.invoiceNo == null ? sale.invoiceNo == null : this.invoiceNo.equals(sale.invoiceNo)) &&
        (this.customerId == null ? sale.customerId == null : this.customerId.equals(sale.customerId)) &&
        (this.subTotalAmount == null ? sale.subTotalAmount == null : this.subTotalAmount.equals(sale.subTotalAmount)) &&
        (this.discountPercentage == null ? sale.discountPercentage == null : this.discountPercentage.equals(sale.discountPercentage)) &&
        (this.discountNominal == null ? sale.discountNominal == null : this.discountNominal.equals(sale.discountNominal)) &&
        (this.taxPercentage == null ? sale.taxPercentage == null : this.taxPercentage.equals(sale.taxPercentage)) &&
        (this.taxNominal == null ? sale.taxNominal == null : this.taxNominal.equals(sale.taxNominal)) &&
        (this.totalAmount == null ? sale.totalAmount == null : this.totalAmount.equals(sale.totalAmount)) &&
        (this.receiveCash == null ? sale.receiveCash == null : this.receiveCash.equals(sale.receiveCash)) &&
        (this.receiveTransfer == null ? sale.receiveTransfer == null : this.receiveTransfer.equals(sale.receiveTransfer)) &&
        (this.remarks == null ? sale.remarks == null : this.remarks.equals(sale.remarks)) &&
        (this.saleDate == null ? sale.saleDate == null : this.saleDate.equals(sale.saleDate)) &&
        (this.salesName == null ? sale.salesName == null : this.salesName.equals(sale.salesName)) &&
        (this.isReceivable == null ? sale.isReceivable == null : this.isReceivable.equals(sale.isReceivable)) &&
        (this.isDone == null ? sale.isDone == null : this.isDone.equals(sale.isDone)) &&
        (this.id == null ? sale.id == null : this.id.equals(sale.id)) &&
        (this.saleDetail == null ? sale.saleDetail == null : this.saleDetail.equals(sale.saleDetail)) &&
        (this.receivable == null ? sale.receivable == null : this.receivable.equals(sale.receivable)) &&
        (this.customer == null ? sale.customer == null : this.customer.equals(sale.customer));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.invoiceNo == null ? 0: this.invoiceNo.hashCode());
    result = 31 * result + (this.customerId == null ? 0: this.customerId.hashCode());
    result = 31 * result + (this.subTotalAmount == null ? 0: this.subTotalAmount.hashCode());
    result = 31 * result + (this.discountPercentage == null ? 0: this.discountPercentage.hashCode());
    result = 31 * result + (this.discountNominal == null ? 0: this.discountNominal.hashCode());
    result = 31 * result + (this.taxPercentage == null ? 0: this.taxPercentage.hashCode());
    result = 31 * result + (this.taxNominal == null ? 0: this.taxNominal.hashCode());
    result = 31 * result + (this.totalAmount == null ? 0: this.totalAmount.hashCode());
    result = 31 * result + (this.receiveCash == null ? 0: this.receiveCash.hashCode());
    result = 31 * result + (this.receiveTransfer == null ? 0: this.receiveTransfer.hashCode());
    result = 31 * result + (this.remarks == null ? 0: this.remarks.hashCode());
    result = 31 * result + (this.saleDate == null ? 0: this.saleDate.hashCode());
    result = 31 * result + (this.salesName == null ? 0: this.salesName.hashCode());
    result = 31 * result + (this.isReceivable == null ? 0: this.isReceivable.hashCode());
    result = 31 * result + (this.isDone == null ? 0: this.isDone.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.saleDetail == null ? 0: this.saleDetail.hashCode());
    result = 31 * result + (this.receivable == null ? 0: this.receivable.hashCode());
    result = 31 * result + (this.customer == null ? 0: this.customer.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sale {\n");
    
    sb.append("  invoiceNo: ").append(invoiceNo).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("  subTotalAmount: ").append(subTotalAmount).append("\n");
    sb.append("  discountPercentage: ").append(discountPercentage).append("\n");
    sb.append("  discountNominal: ").append(discountNominal).append("\n");
    sb.append("  taxPercentage: ").append(taxPercentage).append("\n");
    sb.append("  taxNominal: ").append(taxNominal).append("\n");
    sb.append("  totalAmount: ").append(totalAmount).append("\n");
    sb.append("  receiveCash: ").append(receiveCash).append("\n");
    sb.append("  receiveTransfer: ").append(receiveTransfer).append("\n");
    sb.append("  remarks: ").append(remarks).append("\n");
    sb.append("  saleDate: ").append(saleDate).append("\n");
    sb.append("  salesName: ").append(salesName).append("\n");
    sb.append("  isReceivable: ").append(isReceivable).append("\n");
    sb.append("  isDone: ").append(isDone).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  saleDetail: ").append(saleDetail).append("\n");
    sb.append("  receivable: ").append(receivable).append("\n");
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
