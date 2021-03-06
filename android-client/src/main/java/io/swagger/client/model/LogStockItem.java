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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LogStockItem {
  
  @SerializedName("itemVariantId")
  private Double itemVariantId = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("quantityBefore")
  private Double quantityBefore = null;
  @SerializedName("quantityInput")
  private Double quantityInput = null;
  @SerializedName("quantityAfter")
  private Double quantityAfter = null;
  @SerializedName("referenceId")
  private Double referenceId = null;
  @SerializedName("id")
  private Double id = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getItemVariantId() {
    return itemVariantId;
  }
  public void setItemVariantId(Double itemVariantId) {
    this.itemVariantId = itemVariantId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getQuantityBefore() {
    return quantityBefore;
  }
  public void setQuantityBefore(Double quantityBefore) {
    this.quantityBefore = quantityBefore;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getQuantityInput() {
    return quantityInput;
  }
  public void setQuantityInput(Double quantityInput) {
    this.quantityInput = quantityInput;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getQuantityAfter() {
    return quantityAfter;
  }
  public void setQuantityAfter(Double quantityAfter) {
    this.quantityAfter = quantityAfter;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getReferenceId() {
    return referenceId;
  }
  public void setReferenceId(Double referenceId) {
    this.referenceId = referenceId;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogStockItem logStockItem = (LogStockItem) o;
    return (this.itemVariantId == null ? logStockItem.itemVariantId == null : this.itemVariantId.equals(logStockItem.itemVariantId)) &&
        (this.status == null ? logStockItem.status == null : this.status.equals(logStockItem.status)) &&
        (this.quantityBefore == null ? logStockItem.quantityBefore == null : this.quantityBefore.equals(logStockItem.quantityBefore)) &&
        (this.quantityInput == null ? logStockItem.quantityInput == null : this.quantityInput.equals(logStockItem.quantityInput)) &&
        (this.quantityAfter == null ? logStockItem.quantityAfter == null : this.quantityAfter.equals(logStockItem.quantityAfter)) &&
        (this.referenceId == null ? logStockItem.referenceId == null : this.referenceId.equals(logStockItem.referenceId)) &&
        (this.id == null ? logStockItem.id == null : this.id.equals(logStockItem.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.itemVariantId == null ? 0: this.itemVariantId.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.quantityBefore == null ? 0: this.quantityBefore.hashCode());
    result = 31 * result + (this.quantityInput == null ? 0: this.quantityInput.hashCode());
    result = 31 * result + (this.quantityAfter == null ? 0: this.quantityAfter.hashCode());
    result = 31 * result + (this.referenceId == null ? 0: this.referenceId.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogStockItem {\n");
    
    sb.append("  itemVariantId: ").append(itemVariantId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  quantityBefore: ").append(quantityBefore).append("\n");
    sb.append("  quantityInput: ").append(quantityInput).append("\n");
    sb.append("  quantityAfter: ").append(quantityAfter).append("\n");
    sb.append("  referenceId: ").append(referenceId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
