package fr.chovy.freeboxos.website.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="utilisateur")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "mdp")
    private String mdp;
    @Column(name="nom")
    private  String nom;

    @Column(name="prenom")
    private String prenom;

}
