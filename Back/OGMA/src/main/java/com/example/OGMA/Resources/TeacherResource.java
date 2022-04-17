package com.example.OGMA.Resources;

import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.example.OGMA.Repository.TeacherRepository;
import com.example.OGMA.Types.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

@Path("/teachers")
@CrossOrigin(value = "localhost:4200")
public class TeacherResource {

    @Autowired
    private TeacherRepository teacherRepository;

    @CrossOrigin
    @Path("/new")
    @POST
    public Teacher createTeacher(@QueryParam("nom") String nom,
                                 @QueryParam("prenom") String prenom,
                                 @QueryParam("site") String site, 
                                 @QueryParam("mail") String mail){
        System.out.println(nom+" "+prenom+" "+site+" "+mail);
        Teacher s = new Teacher(nom, prenom, site, mail);
        s = teacherRepository.save(s);
        return s;
    }

    
    @GET
    @Path("/list")
    public Iterable<Teacher> getTeacherList() {
        Iterable<Teacher> varTemp = teacherRepository.findAll();
        return varTemp;
    }

    @CrossOrigin
    @DELETE
    public String deleteTeacher(@QueryParam("id") Long id){
        System.out.println(id);
        try {
            teacherRepository.deleteById(id);
            return "Suppression effectuée";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "Suppression interrompu";
        }
    }

    @CrossOrigin
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Teacher getTeacherByIdTeacher(@PathParam("id") Optional<Long> id){
        System.out.println(id.isPresent());
        if (id.isPresent()) {
            Optional<Teacher> teach = this.teacherRepository.findById(id.get());
            if (teach.isPresent()){
                return teach.get();
            }
            else{
                return new Teacher();
            }
        }
        else return new Teacher();
    }

    @CrossOrigin
    @POST
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateTeacher(@RequestBody Teacher upTeach){
        System.out.println("début put");
        if (upTeach.getId() != null) {
            Optional<Teacher> stud = this.teacherRepository.findById(upTeach.getId());
            if (stud.isPresent()){
                Teacher oldTeach = stud.get();
                oldTeach = upTeach;
                this.teacherRepository.save(oldTeach);
            }
        }
    }
}
