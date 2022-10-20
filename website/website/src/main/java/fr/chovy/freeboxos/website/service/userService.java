package fr.chovy.freeboxos.website.service;
import fr.chovy.freeboxos.website.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component(value = "userService")
public class userService implements IUserService{

    @Autowired
    private UserDAO repoUser;


    @Override
    public String getAllUser(){
        return repoUser.getAllUser();
    }
}
