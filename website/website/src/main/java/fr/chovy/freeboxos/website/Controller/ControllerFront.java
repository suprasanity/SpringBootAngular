package fr.chovy.freeboxos.website.Controller;

import fr.chovy.freeboxos.website.DAO.UserDAO;
import fr.chovy.freeboxos.website.WebsiteApplication;
import fr.chovy.freeboxos.website.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "chovy.freeboxos.fr")
public class ControllerFront {

    @Qualifier("userService")
    @Autowired
    userService sb;
    @Autowired
    UserDAO dao;

    @PostMapping("/getAllUser")
    @ResponseBody
    public String getUser(){
        return sb.getAllUser();
    }


    @PostMapping("/botMsg")
    @ResponseBody
    public String sendMsg(@RequestBody String msg){
        WebsiteApplication.bot.sendMsg(msg,"954877593197350964","954877593713266731");
        return "true";
    }

}
