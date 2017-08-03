package org.vaadin.spring.tutorial;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 

import com.thetransactioncompany.cors.CORSFilter;
import com.vaadin.spring.annotation.SpringComponent;

@SpringBootApplication
public class TutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutorialApplication.class, args);
    }
    
    @SpringComponent
    @WebFilter(urlPatterns = "/*", initParams = @WebInitParam(name = "cors.allowOrigin", value = "*"))
    public static class EmbeddedUICorsFilter extends CORSFilter{
    	
    }
     
    
}
