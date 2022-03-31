package com.example.OGMA.Types;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "STUDENTS")
public class Student implements Serializable{
    private static final long serialVersionUID = -8537962680206576813L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "CURSUS")
    private String cursus;
    @Column(name = "SITE")
    private String site;
    @Column(name = "MAIL")
    private String mail;
    private String nomComplet;

    public Student(){
        super();
    }

    public Student(String nom, String prenom, String cursus, String site, String mail){
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.cursus = cursus;
        this.site = site;
        this.mail = mail;
        this.nomComplet = nom + " " + prenom;
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
    public String getCursus() {
        return cursus;
    }
    public String getSite() {
        return site;
    }
    public String getMail() {
        return mail;
    }
    public String getNomComplet() {
        return nomComplet;
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
    public void setCursus(String cursus) {
        this.cursus = cursus;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    @Override
    public String toString(){
        return "ID : "+id.toString() + ", Nom : "+nom+", Prenom : "+prenom+", Cursus : "+ cursus + ", Site : "+site+", Mail : "+mail;
    }

}