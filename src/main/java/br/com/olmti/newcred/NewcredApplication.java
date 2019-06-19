package br.com.olmti.newcred;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages={"br.com.olmti.newcred", "br.com.olmti.newcred"})
@EnableAutoConfiguration
//@ComponentScan("com.nervy.dialer.domain")
@ComponentScan({"br.com"})
@EnableJpaRepositories("br.com.olmti.newcred.dao")
public class NewcredApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewcredApplication.class, args);
	}
	
	

}
