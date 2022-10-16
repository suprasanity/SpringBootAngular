package fr.chovy.freeboxos.website.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="utilisateur")
public class User implements Serializable {
    private static final long serialVersionUID = 746237126088051312L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name="nom")
    private  String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="email")
    private String email;

    @Column(name = "date_naissance")
    private Date date_naissance;
}
