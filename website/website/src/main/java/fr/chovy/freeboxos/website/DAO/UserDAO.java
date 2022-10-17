package fr.chovy.freeboxos.website.DAO;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public String getAllUser(){
        String user;

        user = entityManager.createQuery("SELECT COUNT(u) FROM User u").getSingleResult().toString();
        return user;

    }

}
