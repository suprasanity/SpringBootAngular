package fr.chovy.freeboxos.website;

import Discord.Bot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsiteApplication {
public static Bot bot;
    public static void main(String[] args) {

       // SpringApplication.run(WebsiteApplication.class, args);
        bot =new Bot();
    }

}
