package fr.chovy.freeboxos.website;

import fr.chovy.freeboxos.website.Discord.Bot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsiteApplication {
    public static  Bot bot = new Bot();
    public static void main(String[] args) {

        SpringApplication.run(WebsiteApplication.class, args);

    }

}
