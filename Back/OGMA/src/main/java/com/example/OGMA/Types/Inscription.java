package com.example.OGMA.Types;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="INSCRIPTION")
public class Inscription implements Serializable{
    private static final long serialVersionUID = -8537962680206576813L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "IDSTUDENT")
    private Long IDSTUDENT;
    @Column(name = "IDMATIERE")
    private Long IDMATIERE;

    public Inscription(){
        super();
    }

    public Inscription(Long id_student, Long id_matiere){
        super();
        this.IDSTUDENT = id_student;
        this.IDMATIERE = id_matiere;
    }

    public Long getId() {
        return id;
    }
    public Long getId_student() {
        return IDSTUDENT;
    }
    public Long getId_matiere() {
        return IDMATIERE;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setId_student(Long id_student) {
        this.IDSTUDENT = id_student;
    }
    public void setId_matiere(Long id_matiere) {
        this.IDMATIERE = id_matiere;
    }

    @Override
    public String toString() {
        return "id : "+id+", id student : "+IDSTUDENT+", id_matiere"+IDMATIERE;
    }

}
