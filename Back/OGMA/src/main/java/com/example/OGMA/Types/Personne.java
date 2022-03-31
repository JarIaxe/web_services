package com.example.OGMA.Types;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "PERSONNE")
public class Personne implements Serializable {
    private static final long serialVersionUID = -8537962680206576813L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPERSONNE")
    private Long id;
    @Column(name = "PERS_NOM")
    private String prenom;
    @Column(name = "PERS_AGE")
    private String age;

    public Personne(){
        super();
    }

    public Personne(String prenom, String age){
        super();
        this.prenom = prenom;
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString(){
        return "ID: "+id.toString() + ", Nom : "+prenom+", Age : "+age;
    }
}