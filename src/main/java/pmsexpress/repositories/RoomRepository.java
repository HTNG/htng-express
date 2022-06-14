package pmsexpress.repositories;

import com.mongodb.Mongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pmsexpress.models.Room;

@Repository
public interface RoomRepository extends MongoRepository<Room, String> {

}
