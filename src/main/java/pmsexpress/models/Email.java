package pmsexpress.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import pmsexpress.enums.EmailTypeEnum;

public class Email {
  
  @JsonProperty("email_type")
  private EmailTypeEnum emailType;
  
  @JsonProperty("is_primary_email")
  private boolean isPrimaryEmail;
  
  @JsonProperty("email_address")
  private String emailAdress;

  public EmailTypeEnum getEmailType() {
    return emailType;
  }

  public void setEmailType(EmailTypeEnum emailType) {
    this.emailType = emailType;
  }

  public boolean isPrimaryEmail() {
    return isPrimaryEmail;
  }

  public void setPrimaryEmail(boolean isPrimaryEmail) {
    this.isPrimaryEmail = isPrimaryEmail;
  }

  public String getEmailAdress() {
    return emailAdress;
  }

  public void setEmailAdress(String emailAdress) {
    this.emailAdress = emailAdress;
  }
  
  

}
