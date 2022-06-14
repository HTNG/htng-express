package pmsexpress.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.victools.jsonschema.generator.OptionPreset;
import com.github.victools.jsonschema.generator.SchemaGenerator;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfig;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfigBuilder;
import com.github.victools.jsonschema.generator.SchemaVersion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pmsexpress.models.AcceptAllResponse;
import pmsexpress.models.Reservation;
import pmsexpress.models.Room;
import pmsexpress.services.ReservationService;
import pmsexpress.services.RoomService;

@RestController
public class PmsDataController {

  @Autowired
  private ReservationService resService;

  @Autowired
  private RoomService roomService;

  @GetMapping("/showresmodel")
  public String showResModel() {
    SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_2019_09,
        OptionPreset.PLAIN_JSON);
    SchemaGeneratorConfig config = configBuilder.build();
    SchemaGenerator generator = new SchemaGenerator(config);
    JsonNode jsonSchema = generator.generateSchema(Reservation.class);

    return jsonSchema.toString();
  }
  
  @Deprecated
  @GetMapping("/showoldresmodel")
  public String showOldResModel() {
    SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_2019_09,
        OptionPreset.PLAIN_JSON);
    SchemaGeneratorConfig config = configBuilder.build();
    SchemaGenerator generator = new SchemaGenerator(config);
    JsonNode jsonSchema = generator.generateSchema(pmsexpress.models.deprecated.Reservation.class);

    return jsonSchema.toString();
  }

  @Deprecated
  @PostMapping("/acceptall")
  public AcceptAllResponse acceptAll(String data) {
    AcceptAllResponse msg = new AcceptAllResponse();
    msg.setMessage("data received!");
    msg.setErrors("no errors detected!");
    return msg;
  }

  // Room POST
  @PostMapping("/acceptroom")
  public AcceptAllResponse acceptRoomPost(@RequestBody Room room ) {
    roomService.saveRoom(room);
    AcceptAllResponse msg = new AcceptAllResponse();
    msg.setMessage("data received");
    return msg;
  }

  @Deprecated
  @PostMapping("/acceptoldres")
  public void saveOldRes(@RequestBody pmsexpress.models.deprecated.Reservation oldRes) {
    resService.saveDeprecatedReservation(oldRes);
  }
  
  @PostMapping("/acceptnewres")
  public void saveNewRes(@RequestBody pmsexpress.models.Reservation newRes) {
    resService.saveReservation(newRes);
  }
  
  @GetMapping("/getreservations")
  public List<Reservation> getReservations() {
    return resService.getAllReservations();
  }
  
  @GetMapping("/getreservationsbystatus")
  public List<Reservation> getReservationsByStatus(@RequestParam("status") String status) {
    return resService.getReservationsByStatus(status);
  }
  
  @GetMapping("/getreservationsbyroomnumber")
  public List<Reservation> getReservationsByRoomNumber(@RequestParam("roomnumber") String roomNumber) {
    return resService.getReservationsByRoomNumber(roomNumber);
  }

  @GetMapping("/getoldreservations")
  public List<pmsexpress.models.deprecated.Reservation> getOldReservations() {
    return resService.getAllOldReservations();
  }
}
