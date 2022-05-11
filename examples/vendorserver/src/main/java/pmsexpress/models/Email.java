package pmsexpress.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import pmsexpress.enums.EmailTypeEnum;

public class Email {
  
  @JsonProperty("email_type")
  private EmailTypeEnum emailType;
  
  @JsonProperty("email_is_primary")
  private boolean isPrimaryEmail;
  
  @JsonProperty("email_address")
  private String emailAdress;

}
