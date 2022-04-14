package com.example.OGMA.Resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.example.OGMA.Repository.InscriptionRepository;
import com.example.OGMA.Types.Inscription;

import org.springframework.beans.factory.annotation.Autowired;

@Path("inscription")
public class InscriptionResource {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Inscription createInscription( @QueryParam("id_student") long id_student,
                            @QueryParam("id_matiere") long id_matiere) {
        Inscription i = new Inscription(id_student, id_matiere);
        i = inscriptionRepository.save(i);
        return i;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Inscription> getAllInscription(){
        return inscriptionRepository.findAll();
    }
    
}
