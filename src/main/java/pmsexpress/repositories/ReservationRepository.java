package pmsexpress.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pmsexpress.models.Reservation;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation, String> {

  List<Reservation> findReservationByReservationStatusPms(String status);

  List<Reservation> findReservationByRoomNumber(String roomNumber);

  Optional<Reservation> findOneByPmsReservationId(String pmsReservationId);

}
