package br.com.olmti.newcred.auth;

import org.springframework.stereotype.Component;

@Component
public interface SecurityAuth {
	    String findLoggedInUsername();
	    void autoLogin(String username, String password);
}

