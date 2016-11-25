package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-14T16:46:15.581+01:00")
public class ResponseEntity   {
  
  private Object body = null;

public enum StatusCodeEnum {
  _100("100"),
  _101("101"),
  _102("102"),
  _103("103"),
  _200("200"),
  _201("201"),
  _202("202"),
  _203("203"),
  _204("204"),
  _205("205"),
  _206("206"),
  _207("207"),
  _208("208"),
  _226("226"),
  _300("300"),
  _301("301"),
  _302("302"),
  _302("302"),
  _303("303"),
  _304("304"),
  _305("305"),
  _307("307"),
  _308("308"),
  _400("400"),
  _401("401"),
  _402("402"),
  _403("403"),
  _404("404"),
  _405("405"),
  _406("406"),
  _407("407"),
  _408("408"),
  _409("409"),
  _410("410"),
  _411("411"),
  _412("412"),
  _413("413"),
  _413("413"),
  _414("414"),
  _414("414"),
  _415("415"),
  _416("416"),
  _417("417"),
  _418("418"),
  _419("419"),
  _420("420"),
  _421("421"),
  _422("422"),
  _423("423"),
  _424("424"),
  _426("426"),
  _428("428"),
  _429("429"),
  _431("431"),
  _451("451"),
  _500("500"),
  _501("501"),
  _502("502"),
  _503("503"),
  _504("504"),
  _505("505"),
  _506("506"),
  _507("507"),
  _508("508"),
  _509("509"),
  _510("510"),
  _511("511");

  private String value;

  StatusCodeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private StatusCodeEnum statusCode = null;
  private Integer statusCodeValue = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("body")
  public Object getBody() {
    return body;
  }
  public void setBody(Object body) {
    this.body = body;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("statusCode")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("statusCodeValue")
  public Integer getStatusCodeValue() {
    return statusCodeValue;
  }
  public void setStatusCodeValue(Integer statusCodeValue) {
    this.statusCodeValue = statusCodeValue;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseEntity {\n");
    
    sb.append("    body: ").append(StringUtil.toIndentedString(body)).append("\n");
    sb.append("    statusCode: ").append(StringUtil.toIndentedString(statusCode)).append("\n");
    sb.append("    statusCodeValue: ").append(StringUtil.toIndentedString(statusCodeValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
