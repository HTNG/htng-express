package pmsexpress.models;

import pmsexpress.enums.FrontOfficeOccupancyStatusEnum;
import pmsexpress.enums.HouseKeepingCleaningStatusEnum;

public class FullRoomStatus {

    private FrontOfficeOccupancyStatusEnum frontOfficeOccupancyStatus;
    private HouseKeepingCleaningStatusEnum houseKeepingCleaningStatus;

    public FrontOfficeOccupancyStatusEnum getFrontOfficeOccupancyStatus() {
        return frontOfficeOccupancyStatus;
    }

    public void setFrontOfficeOccupancyStatus(FrontOfficeOccupancyStatusEnum frontOfficeOccupancyStatus) {
        this.frontOfficeOccupancyStatus = frontOfficeOccupancyStatus;
    }

    public HouseKeepingCleaningStatusEnum getHouseKeepingCleaningStatus() {
        return houseKeepingCleaningStatus;
    }

    public void setHouseKeepingCleaningStatus(HouseKeepingCleaningStatusEnum houseKeepingCleaningStatus) {
        this.houseKeepingCleaningStatus = houseKeepingCleaningStatus;
    }
}
