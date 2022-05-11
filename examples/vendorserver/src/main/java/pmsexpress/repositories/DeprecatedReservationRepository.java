package pmsexpress.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pmsexpress.models.deprecated.Reservation;

@Repository
public interface DeprecatedReservationRepository extends MongoRepository<Reservation, String> {

}
