package pmsexpress.services;

import java.util.ArrayList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
  
  /**
   * Password is a BCrypt string. Use https://www.javainuse.com/onlineBcrypt to generate the pass
   */

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("arvoia".equals(username)) {
            return new User("arvoia", 
                            "$2a$10$chCrwL0cCdpzvI6CFwGZK.dFPA.n/VYSQBYQwyk8eLnOCtrQLrg3O",
                            new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }

}