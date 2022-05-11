package pmsexpress.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class HapiAuthRequest implements Serializable {
  
    private static final long serialVersionUID = 5926468583005150707L;
    
    @JsonProperty("api_key")
    private String apiKey;
    
    @JsonProperty("api_id")
    private String apiId;
    
    //need default constructor for JSON Parsing
    public HapiAuthRequest()
    {
        
    }

    public HapiAuthRequest(String apiId, String apiKey) {
        this.setApiId(apiId);
        this.setApiKey(apiKey);
    }

    public String getApiKey() {
      return apiKey;
    }

    public void setApiKey(String apikey) {
      this.apiKey = apikey;
    }

    public String getApiId() {
      return apiId;
    }

    public void setApiId(String apiId) {
      this.apiId = apiId;
    }
    
    
    

}
