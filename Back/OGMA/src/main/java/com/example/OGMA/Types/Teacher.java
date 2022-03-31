package com.example.OGMA.Types;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEACHER")
public class Teacher implements Serializable{
    private static final long serialVersionUID = -8537962680206576813L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "SITE")
    private String site;
    @Column(name = "MAIL")
    private String mail;

    public Teacher(){
        super();
    }

    public Teacher(String nom, String prenom, String site, String mail){
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.site = site;
        this.mail = mail;
    }

    public Long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getSite() {
        return site;
    }
    public String getMail() {
        return mail;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "ID : "+id+", Nom : "+nom+", Prenom : "+prenom+", Site : "+site+", Mail : "+mail;
    }
}
