package br.com.olmti.newcred.auth;

import org.apache.logging.log4j.Logger;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SecurityAuthImpl {
	
//	@Component
//	@Service
//	public class SecurityServiceImpl implements SecurityAuth{
//
//	    private AuthenticationManager authenticationManager = new AuthenticationManager() {
//			
//			@Override
//			public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
//
//	    @Autowired
//	    private UserDetailsService userDetailsService;
//
//	    //private static final Logger logger = LoggerFactory.getLogger(SecurityServiceImpl.class);
//
//	    @Override
//	    public String findLoggedInUsername() {
//	        Object userDetails = SecurityContextHolder.getContext().getAuthentication().getDetails();
//	        if (userDetails instanceof UserDetails) {
//	            return ((UserDetails)userDetails).getUsername();
//	        }
//
//	        return null;
//	    }
//
//	    @Override
//	    public void autoLogin(String username, String password) {
//	        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//	        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
//
//	        authenticationManager.authenticate(usernamePasswordAuthenticationToken);
//
//	        if (usernamePasswordAuthenticationToken.isAuthenticated()) {
//	            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//	         //   logger.debug(String.format("Auto login %s successfully!", username));
//	        }
//	    }
//	}

}
