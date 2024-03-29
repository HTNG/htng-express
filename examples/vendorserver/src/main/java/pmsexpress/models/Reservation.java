package pmsexpress.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import pmsexpress.enums.RatePlanCodeEnum;
import pmsexpress.enums.ReservationStatusEnum;
import pmsexpress.enums.ReservationStatusHtngEnum;
import pmsexpress.enums.RoomNumberEnum;
import pmsexpress.enums.RoomTypeCodeEnum;

public class Reservation {
  
  @JsonProperty("arrival_date")
  private LocalDateTime arrivalDateTime;
  
  @JsonProperty("estimated_time_of_arrival")
  private LocalDateTime estimatedTimeOfArrival;
  
  @JsonProperty("departure_date")
  private LocalDateTime departureDate;
  
  @JsonProperty("estimated_time_of_departure")
  private LocalDateTime estimatedTimeOfDeparture;
  
  @JsonProperty("number_of_adults")
  private int numberOfAdults;
  
  @JsonProperty("number_of_children")
  private int numberOfChildren;
  
  @JsonProperty("room_type_code")
  private RoomTypeCodeEnum roomTypeCode;
  
  @JsonProperty("room_type_name")
  private String roomTypeName;
  
  @JsonProperty("room_number")
  private RoomNumberEnum roomNumber;
  
  @JsonProperty("company_name")
  private String companyName;
  
  @JsonProperty("reservation_status_pms")
  private ReservationStatusEnum reservationStatusPms;
  
  @JsonProperty("reservation_status_htng")
  private List<ReservationStatusHtngEnum> reservationStatusHtng;
  
  @JsonProperty("group_code")
  private String groupCode;
  
  @JsonProperty("pms_reservation_id")
  private String pmsReservationId;
  
  @JsonProperty("pms_reservation_id_share_with")
  private List<String> pmsReservationIdShareWith;
  
  @JsonProperty("pms_confirmation_code")
  private String pmsConfirmationCode;
  
  @JsonProperty("external_confirmation_code")
  private Map<String, String> externalConfirmationCode;
  
  @JsonProperty("reservation_preference_code")
  private List<String> reservationPreferenceCode;
  
  @JsonProperty("rate_plan_code")
  private RatePlanCodeEnum ratePlanCode;
  
  @JsonProperty("rate_plan_name")
  private String ratePlanName;
  
  @JsonProperty("room_rate")
  private BigDecimal roomRate;
  
  @JsonProperty("currency_code")
  private String currencyCode;
  
  @JsonProperty("is_posting_allowed")
  private boolean isPostingAllowed;
  
  @JsonProperty("primary_guest")
  private Guest primaryGuest;
  
  @JsonProperty("additional_guests")
  private List<Guest> additionalGuests;

  public LocalDateTime getArrivalDateTime() {
    return arrivalDateTime;
  }

  public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
  }

  public LocalDateTime getEstimatedTimeOfArrival() {
    return estimatedTimeOfArrival;
  }

  public void setEstimatedTimeOfArrival(LocalDateTime estimatedTimeOfArrival) {
    this.estimatedTimeOfArrival = estimatedTimeOfArrival;
  }

  public LocalDateTime getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(LocalDateTime departureDate) {
    this.departureDate = departureDate;
  }

  public LocalDateTime getEstimatedTimeOfDeparture() {
    return estimatedTimeOfDeparture;
  }

  public void setEstimatedTimeOfDeparture(LocalDateTime estimatedTimeOfDeparture) {
    this.estimatedTimeOfDeparture = estimatedTimeOfDeparture;
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

  public RoomTypeCodeEnum getRoomTypeCode() {
    return roomTypeCode;
  }

  public void setRoomTypeCode(RoomTypeCodeEnum roomTypeCode) {
    this.roomTypeCode = roomTypeCode;
  }

  public String getRoomTypeName() {
    return roomTypeName;
  }

  public void setRoomTypeName(String roomTypeName) {
    this.roomTypeName = roomTypeName;
  }

  public RoomNumberEnum getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(RoomNumberEnum roomNumber) {
    this.roomNumber = roomNumber;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public ReservationStatusEnum getReservationStatusPms() {
    return reservationStatusPms;
  }

  public void setReservationStatusPms(ReservationStatusEnum reservationStatusPms) {
    this.reservationStatusPms = reservationStatusPms;
  }

  public List<ReservationStatusHtngEnum> getReservationStatusHtng() {
    return reservationStatusHtng;
  }

  public void setReservationStatusHtng(List<ReservationStatusHtngEnum> reservationStatusHtng) {
    this.reservationStatusHtng = reservationStatusHtng;
  }

  public String getGroupCode() {
    return groupCode;
  }

  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  public String getPmsReservationId() {
    return pmsReservationId;
  }

  public void setPmsReservationId(String pmsReservationId) {
    this.pmsReservationId = pmsReservationId;
  }

  public List<String> getPmsReservationIdShareWith() {
    return pmsReservationIdShareWith;
  }

  public void setPmsReservationIdShareWith(List<String> pmsReservationIdShareWith) {
    this.pmsReservationIdShareWith = pmsReservationIdShareWith;
  }

  public String getPmsConfirmationCode() {
    return pmsConfirmationCode;
  }

  public void setPmsConfirmationCode(String pmsConfirmationCode) {
    this.pmsConfirmationCode = pmsConfirmationCode;
  }

  public Map<String, String> getExternalConfirmationCode() {
    return externalConfirmationCode;
  }

  public void setExternalConfirmationCode(Map<String, String> externalConfirmationCode) {
    this.externalConfirmationCode = externalConfirmationCode;
  }

  public List<String> getReservationPreferenceCode() {
    return reservationPreferenceCode;
  }

  public void setReservationPreferenceCode(List<String> reservationPreferenceCode) {
    this.reservationPreferenceCode = reservationPreferenceCode;
  }

  public RatePlanCodeEnum getRatePlanCode() {
    return ratePlanCode;
  }

  public void setRatePlanCode(RatePlanCodeEnum ratePlanCode) {
    this.ratePlanCode = ratePlanCode;
  }

  public String getRatePlanName() {
    return ratePlanName;
  }

  public void setRatePlanName(String ratePlanName) {
    this.ratePlanName = ratePlanName;
  }

  public BigDecimal getRoomRate() {
    return roomRate;
  }

  public void setRoomRate(BigDecimal roomRate) {
    this.roomRate = roomRate;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public boolean isPostingAllowed() {
    return isPostingAllowed;
  }

  public void setPostingAllowed(boolean isPostingAllowed) {
    this.isPostingAllowed = isPostingAllowed;
  }

  public Guest getPrimaryGuest() {
    return primaryGuest;
  }

  public void setPrimaryGuest(Guest primaryGuest) {
    this.primaryGuest = primaryGuest;
  }

  public List<Guest> getAdditionalGuests() {
    return additionalGuests;
  }

  public void setAdditionalGuests(List<Guest> additionalGuests) {
    this.additionalGuests = additionalGuests;
  }
  
  
}
