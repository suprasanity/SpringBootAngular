package fr.chovy.freeboxos.website.Controller;

import fr.chovy.freeboxos.website.Service.userService;
import fr.chovy.freeboxos.website.WebsiteApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "chovy.freeboxos.fr")
public class ControllerFront {
    @PostMapping("/getAllUser")
    @ResponseBody
    public List authentified(){
        return new userService().getAllUser();
    }


    @PostMapping("/botMsg")
    @ResponseBody
    public String sendMsg(@RequestBody String msg){
        WebsiteApplication.bot.sendMsg(msg);
        return "true";
    }

}
