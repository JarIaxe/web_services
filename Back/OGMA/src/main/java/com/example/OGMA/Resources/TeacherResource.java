package com.example.OGMA.Resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.example.OGMA.Repository.TeacherRepository;
import com.example.OGMA.Types.Teacher;

import org.springframework.beans.factory.annotation.Autowired;

@Path("teacher")
public class TeacherResource {

    @Autowired
    private TeacherRepository teacherRepository;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Teacher createTeacher(@QueryParam("nom") String nom,
                                 @QueryParam("prenom") String prenom,
                                 @QueryParam("site") String site,
                                 @QueryParam("mail") String mail) {
        Teacher t = new Teacher(nom, prenom, site, mail);
        t = teacherRepository.save(t);
        return t;
    }

    @GET
    public void getTeacherList(){
        Iterable<Teacher> vartemp = teacherRepository.findAll();
        for (Teacher teacher : vartemp) {
            System.out.println(teacher.toString());
        }
    }
}
