
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

@Deprecated
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "numAdults",
    "numChildren",
    "rate",
    "amount"
})
@Generated("jsonschema2pojo")
public class DailyRate implements Serializable
{

    @JsonProperty("date")
    private String date;
    @JsonProperty("numAdults")
    private Integer numAdults;
    @JsonProperty("numChildren")
    private Integer numChildren;
    @JsonProperty("rate")
    private String rate;
    @JsonProperty("amount")
    private Amount amount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8265668950253617973L;

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("numAdults")
    public Integer getNumAdults() {
        return numAdults;
    }

    @JsonProperty("numAdults")
    public void setNumAdults(Integer numAdults) {
        this.numAdults = numAdults;
    }

    @JsonProperty("numChildren")
    public Integer getNumChildren() {
        return numChildren;
    }

    @JsonProperty("numChildren")
    public void setNumChildren(Integer numChildren) {
        this.numChildren = numChildren;
    }

    @JsonProperty("rate")
    public String getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(String rate) {
        this.rate = rate;
    }

    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
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
        sb.append(DailyRate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("numAdults");
        sb.append('=');
        sb.append(((this.numAdults == null)?"<null>":this.numAdults));
        sb.append(',');
        sb.append("numChildren");
        sb.append('=');
        sb.append(((this.numChildren == null)?"<null>":this.numChildren));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.numAdults == null)? 0 :this.numAdults.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.numChildren == null)? 0 :this.numChildren.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DailyRate) == false) {
            return false;
        }
        DailyRate rhs = ((DailyRate) other);
        return (((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.numAdults == rhs.numAdults)||((this.numAdults!= null)&&this.numAdults.equals(rhs.numAdults))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))))&&((this.numChildren == rhs.numChildren)||((this.numChildren!= null)&&this.numChildren.equals(rhs.numChildren))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
