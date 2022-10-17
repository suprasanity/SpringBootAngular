package fr.chovy.freeboxos.website.service;

import com.austinv11.servicer.Service;
import fr.chovy.freeboxos.website.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public interface IUserService {
    @Autowired
    UserDAO repoUser = new UserDAO();
    List getAllUser();
}
