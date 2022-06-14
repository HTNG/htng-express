package pmsexpress.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import pmsexpress.enums.VipCodeEnum;

public class Guest {
  
  @JsonProperty("name_suffix")
  private String nameSuffix;
  
  @JsonProperty("name_prefix")
  private String namePrefix;
  
  @JsonProperty("name_first")
  private String nameFirst;
  
  @JsonProperty("name_middle")
  private String nameMiddle;
  
  @JsonProperty("name_last")
  private String nameLast;
  
  @JsonProperty("vip_code")
  private VipCodeEnum vipCode;
  
  @JsonProperty("company_name")
  private String companyName;
  
  @JsonProperty("prefered_language")
  private String preferredLanguage; // iso code validation e.g. en-US, en-IE, fr-FR, fr-CA, etc
  
  @JsonProperty("profile_id")
  private String profileId;
  
  @JsonProperty("loyalty")
  private Loyalty loyalty;
  
  @JsonProperty("phone_mobile")
  private String phoneMobile;
  
  @JsonProperty("email")
  private Email email;
  
  @JsonProperty("preferences")
  private List<String> preferences;

  public String getNameSuffix() {
    return nameSuffix;
  }

  public void setNameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
  }

  public String getNamePrefix() {
    return namePrefix;
  }

  public void setNamePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
  }

  public String getNameFirst() {
    return nameFirst;
  }

  public void setNameFirst(String nameFirst) {
    this.nameFirst = nameFirst;
  }

  public String getNameMiddle() {
    return nameMiddle;
  }

  public void setNameMiddle(String nameMiddle) {
    this.nameMiddle = nameMiddle;
  }

  public String getNameLast() {
    return nameLast;
  }

  public void setNameLast(String nameLast) {
    this.nameLast = nameLast;
  }

  public VipCodeEnum getVipCode() {
    return vipCode;
  }

  public void setVipCode(VipCodeEnum vipCode) {
    this.vipCode = vipCode;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getPreferredLanguage() {
    return preferredLanguage;
  }

  public void setPreferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }

  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public Loyalty getLoyalty() {
    return loyalty;
  }

  public void setLoyalty(Loyalty loyalty) {
    this.loyalty = loyalty;
  }

  public String getPhoneMobile() {
    return phoneMobile;
  }

  public void setPhoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
  }

  public Email getEmail() {
    return email;
  }

  public void setEmail(Email email) {
    this.email = email;
  }

  public List<String> getPreferences() {
    return preferences;
  }

  public void setPreferences(List<String> preferences) {
    this.preferences = preferences;
  }
  

  
}
