package pmsexpress.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Property {
  
  @JsonProperty("property_code")
  private String propertyCode;
  
  @JsonProperty("chain_code")
  private String chainCode;

  public String getPropertyCode() {
    return propertyCode;
  }

  public void setPropertyCode(String propertyCode) {
    this.propertyCode = propertyCode;
  }

  public String getChainCode() {
    return chainCode;
  }

  public void setChainCode(String chainCode) {
    this.chainCode = chainCode;
  }  

}