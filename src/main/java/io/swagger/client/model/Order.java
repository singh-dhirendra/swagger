package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-11T13:19:52.734+01:00")
public class Order   {
  
  private Date checkOutdate = null;
  private Date checkinDate = null;
  private String customerName = null;
  private Integer hotelId = null;
  private Integer identifier = null;
  private Integer numberOfAdults = null;
  private Integer orderId = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("checkOutdate")
  public Date getCheckOutdate() {
    return checkOutdate;
  }
  public void setCheckOutdate(Date checkOutdate) {
    this.checkOutdate = checkOutdate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("checkinDate")
  public Date getCheckinDate() {
    return checkinDate;
  }
  public void setCheckinDate(Date checkinDate) {
    this.checkinDate = checkinDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("customerName")
  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hotelId")
  public Integer getHotelId() {
    return hotelId;
  }
  public void setHotelId(Integer hotelId) {
    this.hotelId = hotelId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("identifier")
  public Integer getIdentifier() {
    return identifier;
  }
  public void setIdentifier(Integer identifier) {
    this.identifier = identifier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfAdults")
  public Integer getNumberOfAdults() {
    return numberOfAdults;
  }
  public void setNumberOfAdults(Integer numberOfAdults) {
    this.numberOfAdults = numberOfAdults;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("orderId")
  public Integer getOrderId() {
    return orderId;
  }
  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    checkOutdate: ").append(StringUtil.toIndentedString(checkOutdate)).append("\n");
    sb.append("    checkinDate: ").append(StringUtil.toIndentedString(checkinDate)).append("\n");
    sb.append("    customerName: ").append(StringUtil.toIndentedString(customerName)).append("\n");
    sb.append("    hotelId: ").append(StringUtil.toIndentedString(hotelId)).append("\n");
    sb.append("    identifier: ").append(StringUtil.toIndentedString(identifier)).append("\n");
    sb.append("    numberOfAdults: ").append(StringUtil.toIndentedString(numberOfAdults)).append("\n");
    sb.append("    orderId: ").append(StringUtil.toIndentedString(orderId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
