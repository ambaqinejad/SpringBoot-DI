package ir.ambaqinejad.springbootfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootFirstAppApplication.class, args);
        Alien a = context.getBean(Alien.class);
        a.code();
    }

}
