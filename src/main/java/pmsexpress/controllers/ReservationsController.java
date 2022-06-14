package pmsexpress.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pmsexpress.models.Reservation;
import pmsexpress.services.ReservationService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/htngexpress/v1/reservations")
public class ReservationsController {

    /**
     *  Reservations	Get a single reservation	"GET
     *  [base]/htngexpress/v1/reservations/{chaincode}/{propertyCode}/{reservationid}"
     *
     * Reservations	Get reservations by reservationstatus [Pending Discussion-syncing/resyncing, potentially V2]	"GET
     *  [base]/htngexpress/v1/reservations/{chaincode}/{propertyCode}/{reservationstatus}"
     *
     * Reservations	Get reservations by date [Pending Discussion-syncing/resyncing, potentially V2]	"GET
     *  [base]/htngexpress/v1/reservations/{propertyCode}/reservation/{fromDate}/{toDate}"
     */
    @Autowired
    private ReservationService resService;

    @GetMapping("/{chaincode}/{propertycode}/{reservationid}")
    public Reservation getSingleReservation(@PathVariable("chaincode") String chainCode,
                                     @PathVariable("propertycode") String propertyCode,
                                     @PathVariable("reservationid") String reservationId) {

        return null;
    }

    @GetMapping("/{chaincode}/{propertycode}/{reservationstatus}")
    public List<Reservation> getByReservationStatus(@PathVariable("chaincode") String chainCode,
                                                    @PathVariable("propertycode") String propertyCode,
                                                    @PathVariable("reservationstatus") String reservationStatus) {

        return null;
    }

    @GetMapping("/{chaincode}/{propertycode}/reservation/{fromdate}/{todate}")
    public List<Reservation> getByReservationStatus(@PathVariable("chaincode") String chainCode,
                                                    @PathVariable("propertycode") String propertyCode,
                                                    @PathVariable("fromdate") LocalDate fromDate,
                                                    @PathVariable("todate") LocalDate toDate) {

        return null;
    }


}
