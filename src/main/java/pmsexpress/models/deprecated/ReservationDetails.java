
package pmsexpress.models.deprecated;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Deprecated
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ids",
    "arrival",
    "departure",
    "status",
    "room"
})
@Generated("jsonschema2pojo")
public class ReservationDetails implements Serializable {

  @JsonProperty("ids")
  private List<Id> ids = null;
  @JsonProperty("arrival")
  private Arrival arrival;
  @JsonProperty("departure")
  private Departure departure;
  @JsonProperty("status")
  private String status;
  @JsonProperty("room")
  private Room room;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private final static long serialVersionUID = -1976187695231561677L;

  @JsonProperty("ids")
  public List<Id> getIds() {
    return ids;
  }

  @JsonProperty("ids")
  public void setIds(List<Id> ids) {
    this.ids = ids;
  }

  @JsonProperty("arrival")
  public Arrival getArrival() {
    return arrival;
  }

  @JsonProperty("arrival")
  public void setArrival(Arrival arrival) {
    this.arrival = arrival;
  }

  @JsonProperty("departure")
  public Departure getDeparture() {
    return departure;
  }

  @JsonProperty("departure")
  public void setDeparture(Departure departure) {
    this.departure = departure;
  }

  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  @JsonProperty("room")
  public Room getRoom() {
    return room;
  }

  @JsonProperty("room")
  public void setRoom(Room room) {
    this.room = room;
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
    sb.append(ReservationDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("ids");
    sb.append('=');
    sb.append(((this.ids == null) ? "<null>" : this.ids));
    sb.append(',');
    sb.append("arrival");
    sb.append('=');
    sb.append(((this.arrival == null) ? "<null>" : this.arrival));
    sb.append(',');
    sb.append("departure");
    sb.append('=');
    sb.append(((this.departure == null) ? "<null>" : this.departure));
    sb.append(',');
    sb.append("status");
    sb.append('=');
    sb.append(((this.status == null) ? "<null>" : this.status));
    sb.append(',');
    sb.append("room");
    sb.append('=');
    sb.append(((this.room == null) ? "<null>" : this.room));
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
    result = ((result * 31) + ((this.arrival == null) ? 0 : this.arrival.hashCode()));
    result = ((result * 31) + ((this.ids == null) ? 0 : this.ids.hashCode()));
    result = ((result * 31) + ((this.departure == null) ? 0 : this.departure.hashCode()));
    result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.room == null) ? 0 : this.room.hashCode()));
    result = ((result * 31) + ((this.status == null) ? 0 : this.status.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof ReservationDetails) == false) {
      return false;
    }
    ReservationDetails rhs = ((ReservationDetails) other);
    return (((((((this.arrival == rhs.arrival) || ((this.arrival != null) && this.arrival.equals(rhs.arrival))) &&
        ((this.ids == rhs.ids) || ((this.ids != null) && this.ids.equals(rhs.ids)))) &&
        ((this.departure == rhs.departure) || ((this.departure != null) && this.departure.equals(rhs.departure)))) &&
        ((this.additionalProperties == rhs.additionalProperties) ||
            ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) &&
        ((this.room == rhs.room) || ((this.room != null) && this.room.equals(rhs.room)))) &&
        ((this.status == rhs.status) || ((this.status != null) && this.status.equals(rhs.status))));
  }

}
