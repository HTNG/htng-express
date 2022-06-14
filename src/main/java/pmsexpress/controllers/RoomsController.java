package pmsexpress.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pmsexpress.enums.FrontOfficeOccupancyStatusEnum;
import pmsexpress.enums.HouseKeepingCleaningStatusEnum;
import pmsexpress.models.FullRoomStatus;
import pmsexpress.services.RoomService;

@RestController
@RequestMapping("/htngexpress/v1/rooms")
public class RoomsController {

    @Autowired
    private RoomService roomService;

    @PutMapping("/{chaincode}/{propertycode}/{roomnumber}/frontofficestatus")
    public void updateFrontOfficeStatus(@PathVariable("chaincode") String chainCode,
                                                     @PathVariable("propertycode") String propertyCode,
                                                     @PathVariable("roomnumber") String roomNumber,
                                                     @RequestBody FrontOfficeOccupancyStatusEnum status) {

    }

    @PutMapping("/{chaincode}/{propertycode}/{roomnumber}/housekeepingstatus")
    public void updateHousekeepingRoomStatus(@PathVariable("chaincode") String chainCode,
                                              @PathVariable("propertycode") String propertyCode,
                                              @PathVariable("roomnumber") String roomNumber,
                                              @RequestBody HouseKeepingCleaningStatusEnum status) {

    }

    @PutMapping("/{chaincode}/{propertycode}/{roomnumber}/roomstatus")
    public void updateHousekeepingAndFrontOfficeRoomStatus(@PathVariable("chaincode") String chainCode,
                                              @PathVariable("propertycode") String propertyCode,
                                              @PathVariable("roomnumber") String roomNumber,
                                              @RequestBody FullRoomStatus status) {

    }

    @GetMapping("/{chaincode}/{propertycode}/{roomnumber}/frontofficestatus")
    public FrontOfficeOccupancyStatusEnum getFrontOfficeStatusForRoom(@PathVariable("chaincode") String chainCode,
                                       @PathVariable("propertycode") String propertyCode,
                                       @PathVariable("roomnumber") String roomNumber)  {
        return null;
    }

    @GetMapping("/{chaincode}/{propertycode}/{roomnumber}/housekeepingstatus")
    public HouseKeepingCleaningStatusEnum getHousekeepingStatusForRoom(@PathVariable("chaincode") String chainCode,
                                                                      @PathVariable("propertycode") String propertyCode,
                                                                      @PathVariable("roomnumber") String roomNumber)  {
        return null;
    }
}
