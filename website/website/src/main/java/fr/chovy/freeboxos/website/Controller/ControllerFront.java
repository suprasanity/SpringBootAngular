package fr.chovy.freeboxos.website.Controller;

import discord4j.rest.service.UserService;
import fr.chovy.freeboxos.website.DAO.UserDAO;
import fr.chovy.freeboxos.website.service.userService;
import fr.chovy.freeboxos.website.WebsiteApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "chovy.freeboxos.fr")
public class ControllerFront {

    @Autowired
    userService sb;
    @Autowired
    UserDAO dao;

    @PostMapping("/getAllUser")
    @ResponseBody
    public List authentified(){
        return sb.getAllUser();
    }


    @PostMapping("/botMsg")
    @ResponseBody
    public String sendMsg(@RequestBody String msg){
        WebsiteApplication.bot.sendMsg(msg);
        return "true";
    }

}
