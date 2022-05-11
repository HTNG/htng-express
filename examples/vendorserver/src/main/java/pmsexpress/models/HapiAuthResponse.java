package pmsexpress.models;

import java.io.Serializable;

public class HapiAuthResponse implements Serializable {
  private static final long serialVersionUID = -8091879091924046844L;
  private final String jwttoken;

  public HapiAuthResponse(String jwttoken) {
    this.jwttoken = jwttoken;
  }

  public String getToken() {
    return this.jwttoken;
  }
}
