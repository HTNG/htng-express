package pmsexpress.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmsexpress.models.Room;
import pmsexpress.repositories.DeprecatedReservationRepository;
import pmsexpress.repositories.ReservationRepository;
import pmsexpress.repositories.RoomRepository;

@Service
public class RoomService {
    /**
     * This class is a service class for any room based functions.It should be extended to encapsulate anything you
     * may want to do with a room
     */

    @Autowired
    private RoomRepository roomRepo;

    public void saveRoom(Room room) {
        roomRepo.save(room);
    }
}
