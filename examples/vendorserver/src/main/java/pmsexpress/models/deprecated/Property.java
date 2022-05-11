
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
    "propertyCode",
    "chainCode"
})
@Generated("jsonschema2pojo")
public class Property implements Serializable
{

    @JsonProperty("propertyCode")
    private String propertyCode;
    @JsonProperty("chainCode")
    private String chainCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8519016443789323982L;

    @JsonProperty("propertyCode")
    public String getPropertyCode() {
        return propertyCode;
    }

    @JsonProperty("propertyCode")
    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    @JsonProperty("chainCode")
    public String getChainCode() {
        return chainCode;
    }

    @JsonProperty("chainCode")
    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
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
        sb.append(Property.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("propertyCode");
        sb.append('=');
        sb.append(((this.propertyCode == null)?"<null>":this.propertyCode));
        sb.append(',');
        sb.append("chainCode");
        sb.append('=');
        sb.append(((this.chainCode == null)?"<null>":this.chainCode));
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
        result = ((result* 31)+((this.propertyCode == null)? 0 :this.propertyCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.chainCode == null)? 0 :this.chainCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Property) == false) {
            return false;
        }
        Property rhs = ((Property) other);
        return ((((this.propertyCode == rhs.propertyCode)||((this.propertyCode!= null)&&this.propertyCode.equals(rhs.propertyCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.chainCode == rhs.chainCode)||((this.chainCode!= null)&&this.chainCode.equals(rhs.chainCode))));
    }

}
