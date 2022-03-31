package com.example.OGMA.Resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.example.OGMA.Repository.PersonneRepository;
import com.example.OGMA.Types.Personne;

import org.springframework.beans.factory.annotation.Autowired;

@Path("personnes")
public class PersonneResources 
{
    @Autowired
    private PersonneRepository personneRepository;


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Personne createPersonne( @QueryParam("prenom") String prenom, @QueryParam("age") String age){
        System.out.println("début test ajout");
        Personne p = new Personne(prenom, age);
        p = personneRepository.save(p);
        return p;
    }

    @GET
    public void getPersonnes() {
        Iterable<Personne> varTemp =  personneRepository.findAll();
        for (Personne personne :varTemp) {
            System.out.println(personne.toString());
        }
    }

}