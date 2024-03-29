package pmsexpress.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import pmsexpress.enums.LoyaltyLevelEnum;
import pmsexpress.enums.LoyaltyProgramTypeEnum;

public class Loyalty {
  @JsonProperty("loyalty_program_type")
  private LoyaltyProgramTypeEnum loyaltyProgramType;
  
  @JsonProperty("loyalty_level")
  private LoyaltyLevelEnum loyaltyLevel;
  
  @JsonProperty("loyalty_membership_id")
  private String loyaltyMembershipId;

  public LoyaltyProgramTypeEnum getLoyaltyProgramType() {
    return loyaltyProgramType;
  }

  public void setLoyaltyProgramType(LoyaltyProgramTypeEnum loyaltyProgramType) {
    this.loyaltyProgramType = loyaltyProgramType;
  }

  public LoyaltyLevelEnum getLoyaltyLevel() {
    return loyaltyLevel;
  }

  public void setLoyaltyLevel(LoyaltyLevelEnum loyaltyLevel) {
    this.loyaltyLevel = loyaltyLevel;
  }

  public String getLoyaltyMembershipId() {
    return loyaltyMembershipId;
  }

  public void setLoyaltyMembershipId(String loyaltyMembershipId) {
    this.loyaltyMembershipId = loyaltyMembershipId;
  }

  
}
