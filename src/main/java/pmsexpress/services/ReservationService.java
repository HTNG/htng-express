package pmsexpress.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmsexpress.models.Reservation;
import pmsexpress.repositories.DeprecatedReservationRepository;
import pmsexpress.repositories.ReservationRepository;

@Service
public class ReservationService {

  /**
   * This class is a service class for any Reservation based functions.It should be extended to encapsulate anything you
   * may want to do with a Reservation
   */

  @Autowired
  private DeprecatedReservationRepository oldResRepo;

  @Autowired
  private ReservationRepository resRepo;

  public void saveDeprecatedReservation(pmsexpress.models.deprecated.Reservation oldres) {
    oldResRepo.save(oldres);
  }

  public void saveReservation(Reservation res) {
    // first check that this is an update or a new record
    Optional<Reservation> existingRes = resRepo.findOneByPmsReservationId(res.getPmsReservationId());
    if (existingRes.isPresent()) {
      // update
      Reservation updateable = existingRes.get();
      res.setId(updateable.getId());
    }
    resRepo.save(res);
  }

  public List<Reservation> getAllReservations() {
    return resRepo.findAll();
  }

  public List<pmsexpress.models.deprecated.Reservation> getAllOldReservations() {
    return oldResRepo.findAll();
  }

  public List<Reservation> getReservationsByStatus(String status) {
    return resRepo.findReservationByReservationStatusPms(status);
  }

  public List<Reservation> getReservationsByRoomNumber(String roomNumber) {
    return resRepo.findReservationByRoomNumber(roomNumber);
  }
}
