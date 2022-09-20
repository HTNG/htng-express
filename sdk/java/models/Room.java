package pmsexpress.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import pmsexpress.enums.FrontOfficeOccupancyStatusEnum;
import pmsexpress.enums.HouseKeepingCleaningStatusEnum;
import pmsexpress.enums.HousekeepingOccupancyStatusEnum;
import pmsexpress.enums.InventoryStatusEnum;
import pmsexpress.enums.RoomTypeCodeEnum;
import pmsexpress.enums.ServiceStatusEnum;

public class Room {
  
  @JsonProperty("room_number")
  private String roomNumber;
  
  @JsonProperty("is_inventoried")
  private boolean isInventoried;
  
  @JsonProperty("room_type_code")
  private RoomTypeCodeEnum roomTypeCode;
  
  @JsonProperty("status_front_office_occupancy")
  private FrontOfficeOccupancyStatusEnum statusFrontOfficeOccupancy;
  
  @JsonProperty("status_housekeeping_occupancy")
  private HousekeepingOccupancyStatusEnum statusHousekeepingOccupancy;
  
  @JsonProperty("status_housekeeping_cleaning")
  private HouseKeepingCleaningStatusEnum statusHousekeepingCleaning;
  
  @JsonProperty("status_inventory")
  private InventoryStatusEnum statusInventory;
  
  @JsonProperty("status_service")
  private ServiceStatusEnum statusService;

  public String getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber;
  }

  public boolean isInventoried() {
    return isInventoried;
  }

  public void setInventoried(boolean isInventoried) {
    this.isInventoried = isInventoried;
  }

  public RoomTypeCodeEnum getRoomTypeCode() {
    return roomTypeCode;
  }

  public void setRoomTypeCode(RoomTypeCodeEnum roomTypeCode) {
    this.roomTypeCode = roomTypeCode;
  }

  public FrontOfficeOccupancyStatusEnum getStatusFrontOfficeOccupancy() {
    return statusFrontOfficeOccupancy;
  }

  public void setStatusFrontOfficeOccupancy(FrontOfficeOccupancyStatusEnum statusFrontOfficeOccupancy) {
    this.statusFrontOfficeOccupancy = statusFrontOfficeOccupancy;
  }

  public HousekeepingOccupancyStatusEnum getStatusHousekeepingOccupancy() {
    return statusHousekeepingOccupancy;
  }

  public void setStatusHousekeepingOccupancy(HousekeepingOccupancyStatusEnum statusHousekeepingOccupancy) {
    this.statusHousekeepingOccupancy = statusHousekeepingOccupancy;
  }

  public HouseKeepingCleaningStatusEnum getStatusHousekeepingCleaning() {
    return statusHousekeepingCleaning;
  }

  public void setStatusHousekeepingCleaning(HouseKeepingCleaningStatusEnum statusHousekeepingCleaning) {
    this.statusHousekeepingCleaning = statusHousekeepingCleaning;
  }

  public InventoryStatusEnum getStatusInventory() {
    return statusInventory;
  }

  public void setStatusInventory(InventoryStatusEnum statusInventory) {
    this.statusInventory = statusInventory;
  }

  public ServiceStatusEnum getStatusService() {
    return statusService;
  }

  public void setStatusService(ServiceStatusEnum statusService) {
    this.statusService = statusService;
  }
  

}
