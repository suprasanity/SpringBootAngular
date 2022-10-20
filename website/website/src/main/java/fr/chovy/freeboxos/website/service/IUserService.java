package fr.chovy.freeboxos.website.service;


import fr.chovy.freeboxos.website.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IUserService {
    @Autowired
    UserDAO repoUser = new UserDAO();
    String getAllUser();
}
