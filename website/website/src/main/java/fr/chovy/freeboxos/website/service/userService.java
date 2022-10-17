package fr.chovy.freeboxos.website.service;

import com.austinv11.servicer.Service;
import fr.chovy.freeboxos.website.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Component(value = "userService")
public class userService implements IUserService{

    @Autowired
    private UserDAO repoUser;


    @Override
    public List getAllUser(){
        return repoUser.getAllUser();
    }
}
