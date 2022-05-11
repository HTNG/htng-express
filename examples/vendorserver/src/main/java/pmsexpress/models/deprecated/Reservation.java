
package pmsexpress.models.deprecated;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "property",
    "guest",
    "reservation",
    "payment"
})
@Generated("jsonschema2pojo")
public class Reservation implements Serializable {

  @JsonProperty("property")
  private Property property;
  @JsonProperty("guest")
  private Guest guest;
  @JsonProperty("reservation")
  private ReservationDetails reservationDetails;
  @JsonProperty("payment")
  private Payment payment;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private final static long serialVersionUID = 5717794434462970865L;

  @JsonProperty("property")
  public Property getProperty() {
    return property;
  }

  @JsonProperty("property")
  public void setProperty(Property property) {
    this.property = property;
  }

  @JsonProperty("guest")
  public Guest getGuest() {
    return guest;
  }

  @JsonProperty("guest")
  public void setGuest(Guest guest) {
    this.guest = guest;
  }

  @JsonProperty("reservation")
  public ReservationDetails getReservationDetails() {
    return reservationDetails;
  }

  @JsonProperty("reservation")
  public void setReservation(ReservationDetails reservationDetails) {
    this.reservationDetails = reservationDetails;
  }

  @JsonProperty("payment")
  public Payment getPayment() {
    return payment;
  }

  @JsonProperty("payment")
  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(Reservation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("property");
    sb.append('=');
    sb.append(((this.property == null) ? "<null>" : this.property));
    sb.append(',');
    sb.append("guest");
    sb.append('=');
    sb.append(((this.guest == null) ? "<null>" : this.guest));
    sb.append(',');
    sb.append("reservation");
    sb.append('=');
    sb.append(((this.reservationDetails == null) ? "<null>" : this.reservationDetails));
    sb.append(',');
    sb.append("payment");
    sb.append('=');
    sb.append(((this.payment == null) ? "<null>" : this.payment));
    sb.append(',');
    sb.append("additionalProperties");
    sb.append('=');
    sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
    sb.append(',');
    if (sb.charAt((sb.length() - 1)) == ',') {
      sb.setCharAt((sb.length() - 1), ']');
    } else {
      sb.append(']');
    }
    return sb.toString();
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = ((result * 31) + ((this.property == null) ? 0 : this.property.hashCode()));
    result = ((result * 31) + ((this.reservationDetails == null) ? 0 : this.reservationDetails.hashCode()));
    result = ((result * 31) + ((this.guest == null) ? 0 : this.guest.hashCode()));
    result = ((result * 31) + ((this.payment == null) ? 0 : this.payment.hashCode()));
    result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Reservation) == false) {
      return false;
    }
    Reservation rhs = ((Reservation) other);
    return ((((((this.property == rhs.property) || ((this.property != null) && this.property.equals(rhs.property))) &&
        ((this.reservationDetails == rhs.reservationDetails) ||
            ((this.reservationDetails != null) && this.reservationDetails.equals(rhs.reservationDetails)))) &&
        ((this.guest == rhs.guest) || ((this.guest != null) && this.guest.equals(rhs.guest)))) &&
        ((this.payment == rhs.payment) || ((this.payment != null) && this.payment.equals(rhs.payment)))) &&
        ((this.additionalProperties == rhs.additionalProperties) ||
            ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
  }

}
