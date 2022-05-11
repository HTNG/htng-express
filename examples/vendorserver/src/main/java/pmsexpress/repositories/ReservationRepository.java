package pmsexpress.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pmsexpress.models.Reservation;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation, String> {

}
