package com.example.OGMA.Types;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "MATIERE")
public class Matiere implements Serializable{
    private static final long serialVersionUID = -8537962680206576813L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NOM_MATIERE")
    private String nom_matiere;
    @Column(name = "ID_TEACHER")
    private Long id_teacher;
    @Column(name = "SALLE")
    private String nomSalle;

    public Matiere(){
        super();
    }

    public Matiere(String nom_matiere,Long id_teacher, String nomSalle){
        super();
        this.nom_matiere = nom_matiere;
        this.id_teacher = id_teacher;
        this.nomSalle = nomSalle;
    }

    public Long getId() {
        return id;
    }
    public Long getId_teacher() {
        return id_teacher;
    }
    public String getNomSalle() {
        return nomSalle;
    }
    public String getNom_matiere() {
        return nom_matiere;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setId_teacher(Long id_teacher) {
        this.id_teacher = id_teacher;
    }
    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }
    public void setNom_matiere(String nom_matiere) {
        this.nom_matiere = nom_matiere;
    }

    @Override
    public String toString(){
        return "ID : "+id+", nom de la matière"+nom_matiere+", id Teacher : "+id_teacher+", nom de la salle"+nomSalle;
    }

}
