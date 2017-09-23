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

import io.swagger.client.model.ItemVariant;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DeliveryDetail {
  
  @SerializedName("deliveryId")
  private Double deliveryId = null;
  @SerializedName("itemVariantId")
  private Double itemVariantId = null;
  @SerializedName("quantity")
  private Double quantity = null;
  @SerializedName("id")
  private Double id = null;
  @SerializedName("itemVariant")
  private ItemVariant itemVariant = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getDeliveryId() {
    return deliveryId;
  }
  public void setDeliveryId(Double deliveryId) {
    this.deliveryId = deliveryId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getItemVariantId() {
    return itemVariantId;
  }
  public void setItemVariantId(Double itemVariantId) {
    this.itemVariantId = itemVariantId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getQuantity() {
    return quantity;
  }
  public void setQuantity(Double quantity) {
    this.quantity = quantity;
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
  public ItemVariant getItemVariant() {
    return itemVariant;
  }
  public void setItemVariant(ItemVariant itemVariant) {
    this.itemVariant = itemVariant;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryDetail deliveryDetail = (DeliveryDetail) o;
    return (this.deliveryId == null ? deliveryDetail.deliveryId == null : this.deliveryId.equals(deliveryDetail.deliveryId)) &&
        (this.itemVariantId == null ? deliveryDetail.itemVariantId == null : this.itemVariantId.equals(deliveryDetail.itemVariantId)) &&
        (this.quantity == null ? deliveryDetail.quantity == null : this.quantity.equals(deliveryDetail.quantity)) &&
        (this.id == null ? deliveryDetail.id == null : this.id.equals(deliveryDetail.id)) &&
        (this.itemVariant == null ? deliveryDetail.itemVariant == null : this.itemVariant.equals(deliveryDetail.itemVariant));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.deliveryId == null ? 0: this.deliveryId.hashCode());
    result = 31 * result + (this.itemVariantId == null ? 0: this.itemVariantId.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.itemVariant == null ? 0: this.itemVariant.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryDetail {\n");
    
    sb.append("  deliveryId: ").append(deliveryId).append("\n");
    sb.append("  itemVariantId: ").append(itemVariantId).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  itemVariant: ").append(itemVariant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
