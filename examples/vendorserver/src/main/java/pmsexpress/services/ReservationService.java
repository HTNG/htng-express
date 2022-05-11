package pmsexpress.services;

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
    resRepo.save(res);
  }
}
