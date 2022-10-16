package fr.chovy.freeboxos.website.Service;

import fr.chovy.freeboxos.website.DAO.UserDAO;

import java.util.List;

public class userService implements IUserService{
    private UserDAO repoUser = new UserDAO();
    public userService(){}

    @Override
    public List getAllUser(){
        return repoUser.getAllUser();
    }
}
