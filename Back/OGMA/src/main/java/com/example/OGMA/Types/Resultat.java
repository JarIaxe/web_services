package com.example.OGMA.Types;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Resultat implements Serializable{
    private static final long serialVersionUID = -8537962680206576813L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ID_INSCRIPTION")
    private Long id_inscription;
    @Column(name = "NOTE")
    private String note;

    public Resultat(){
        super();
    }

    public Resultat(Long id_inscription, String note){
        super();
        this.id_inscription = id_inscription;
        this.note = note;
    }

    public Long getId() {
        return id;
    }
    public Long getId_inscription() {
        return id_inscription;
    }
    public String getNote() {
        return note;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setId_inscription(Long id_inscription) {
        this.id_inscription = id_inscription;
    }
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Id : "+id+", id_Inscription : "+id_inscription+", note : "+note;
    }

    
}
