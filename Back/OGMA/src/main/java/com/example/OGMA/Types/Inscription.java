package com.example.OGMA.Types;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Inscription implements Serializable{
    private static final long serialVersionUID = -8537962680206576813L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ID_STUDENT")
    private Long id_student;
    @Column(name = "ID_MATIERE")
    private Long id_matiere;

    public Inscription(){
        super();
    }

    public Inscription(Long id_student, Long id_matiere){
        super();
        this.id_student = id_student;
        this.id_matiere = id_matiere;
    }

    public Long getId() {
        return id;
    }
    public Long getId_student() {
        return id_student;
    }
    public Long getId_matiere() {
        return id_matiere;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setId_student(Long id_student) {
        this.id_student = id_student;
    }
    public void setId_matiere(Long id_matiere) {
        this.id_matiere = id_matiere;
    }

    @Override
    public String toString() {
        return "id : "+id+", id student : "+id_student+", id_matiere"+id_matiere;
    }

}
