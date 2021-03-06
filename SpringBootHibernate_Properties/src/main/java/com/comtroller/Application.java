package com.comtroller;
//http://java.candidjava.com/tutorial/spring-custom-validator-example-with-Validator-interface.htm
//http://www.bogotobogo.com/Java/tutorials/Spring-Boot/Spring-Boot-HelloWorld-with-Maven.php(deploy as jar)
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
 

@SpringBootApplication
@ComponentScan("com.comtroller")
public class Application {
     
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
 
 
}