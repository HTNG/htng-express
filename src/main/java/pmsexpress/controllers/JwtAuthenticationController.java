package pmsexpress.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pmsexpress.configuration.JwtTokenUtil;
import pmsexpress.models.AuthRequest;
import pmsexpress.models.HapiAuthResponse;
import pmsexpress.services.AuthenticationService;
import pmsexpress.services.JwtUserDetailsService;


@RestController
@CrossOrigin
public class JwtAuthenticationController {

    

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserDetailsService jwtInMemoryUserDetailsService;

    @Autowired
    private AuthenticationService authService;
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest authRequest) throws Exception {
      authService.authenticate(authRequest.getApiId(), authRequest.getApiKey());
      final UserDetails userDetails = jwtInMemoryUserDetailsService
              .loadUserByUsername(authRequest.getApiId());
      final String token = jwtTokenUtil.generateToken(userDetails);
      return ResponseEntity.ok(new HapiAuthResponse(token));
    }
}