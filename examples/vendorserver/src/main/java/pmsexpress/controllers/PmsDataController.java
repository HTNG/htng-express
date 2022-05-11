package pmsexpress.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.victools.jsonschema.generator.OptionPreset;
import com.github.victools.jsonschema.generator.SchemaGenerator;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfig;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfigBuilder;
import com.github.victools.jsonschema.generator.SchemaVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pmsexpress.models.Reservation;
import pmsexpress.services.ReservationService;

@RestController
public class PmsDataController {

  @Autowired
  private ReservationService resService;

  @GetMapping("/showresmodel")
  private String showResModel() {
    SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_2019_09,
        OptionPreset.PLAIN_JSON);
    SchemaGeneratorConfig config = configBuilder.build();
    SchemaGenerator generator = new SchemaGenerator(config);
    JsonNode jsonSchema = generator.generateSchema(Reservation.class);

    return jsonSchema.toString();
  }
  
  @GetMapping("/showoldresmodel")
  private String showOldResModel() {
    SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_2019_09,
        OptionPreset.PLAIN_JSON);
    SchemaGeneratorConfig config = configBuilder.build();
    SchemaGenerator generator = new SchemaGenerator(config);
    JsonNode jsonSchema = generator.generateSchema(pmsexpress.models.deprecated.Reservation.class);

    return jsonSchema.toString();
  }

  @PostMapping("/acceptall")
  private void acceptAll() {
    // do nothing
  }

  @PostMapping("/acceptoldres")
  private void saveOldRes(@RequestBody pmsexpress.models.deprecated.Reservation oldRes) {
    resService.saveDeprecatedReservation(oldRes);
  }

}
