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
public class Branch {
  
  @SerializedName("companyId")
  private Double companyId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("remarks")
  private String remarks = null;
  @SerializedName("id")
  private Double id = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getCompanyId() {
    return companyId;
  }
  public void setCompanyId(Double companyId) {
    this.companyId = companyId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
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
    Branch branch = (Branch) o;
    return (this.companyId == null ? branch.companyId == null : this.companyId.equals(branch.companyId)) &&
        (this.name == null ? branch.name == null : this.name.equals(branch.name)) &&
        (this.address == null ? branch.address == null : this.address.equals(branch.address)) &&
        (this.phone == null ? branch.phone == null : this.phone.equals(branch.phone)) &&
        (this.remarks == null ? branch.remarks == null : this.remarks.equals(branch.remarks)) &&
        (this.id == null ? branch.id == null : this.id.equals(branch.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.companyId == null ? 0: this.companyId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.remarks == null ? 0: this.remarks.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    
    sb.append("  companyId: ").append(companyId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  remarks: ").append(remarks).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
