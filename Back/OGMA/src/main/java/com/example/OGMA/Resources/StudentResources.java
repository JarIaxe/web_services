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

import com.example.OGMA.Repository.StudentRepository;
import com.example.OGMA.Types.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

@Path("/students")
@CrossOrigin(value = "localhost:4200")
public class StudentResources{

    @Autowired
    private StudentRepository studentRepository;

    @CrossOrigin
    @Path("/new")
    @POST
    public Student createStudent(@QueryParam("nom") String nom,
                                 @QueryParam("prenom") String prenom,
                                 @QueryParam("cursus") String cursus, 
                                 @QueryParam("site") String site, 
                                 @QueryParam("mail") String mail) {
        System.out.println();
        Student s = new Student(nom, prenom, cursus, site, mail);
        s = studentRepository.save(s);
        return s;
    }

    
    @GET
    @Path("/list")
    public Iterable<Student> getStudentList() {
        Iterable<Student> varTemp = studentRepository.findAll();
        return varTemp;
    }

    @CrossOrigin
    @DELETE
    public String deleteStudent(@QueryParam("idStudent") Long idStudent){
        System.out.println(idStudent);
        try {
            studentRepository.deleteById(idStudent);
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
    public Student getStudentByIdStudent(@PathParam("id") Optional<Long> id){
        System.out.println(id.isPresent());
        if (id.isPresent()) {
            Optional<Student> stud = this.studentRepository.findById(id.get());
            if (stud.isPresent()){
                return stud.get();
            }
            else{
                return new Student();
            }
        }
        else return new Student();
    }

    @CrossOrigin
    @POST
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateStudent(@RequestBody Student upStud){
        System.out.println("début put");
        if (upStud.getId() != null) {
            Optional<Student> stud = this.studentRepository.findById(upStud.getId());
            if (stud.isPresent()){
                Student oldStud = stud.get();
                oldStud = upStud;
                this.studentRepository.save(oldStud);
            }
        }
    }
    
}