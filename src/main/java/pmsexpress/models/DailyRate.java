package pmsexpress.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.LocalDate;

public class DailyRate {
  
  @JsonProperty("date_from")
  private LocalDate dateFrom;
  
  @JsonProperty("date_to")
  private LocalDate dateTo;
  
  @JsonProperty("num_adults")
  private int numberOfAdults;
  
  @JsonProperty("num_children")
  private int numberOfChildren;
  
  @JsonProperty("rate_plan_code")
  private String ratePlanCode;
  
  @JsonProperty("room_rate")
  private BigDecimal roomRate;

  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public int getNumberOfAdults() {
    return numberOfAdults;
  }

  public void setNumberOfAdults(int numberOfAdults) {
    this.numberOfAdults = numberOfAdults;
  }

  public int getNumberOfChildren() {
    return numberOfChildren;
  }

  public void setNumberOfChildren(int numberOfChildren) {
    this.numberOfChildren = numberOfChildren;
  }

  public String getRatePlanCode() {
    return ratePlanCode;
  }

  public void setRatePlanCode(String ratePlanCode) {
    this.ratePlanCode = ratePlanCode;
  }

  public BigDecimal getRoomRate() {
    return roomRate;
  }

  public void setRoomRate(BigDecimal roomRate) {
    this.roomRate = roomRate;
  }
  
  
  
}
