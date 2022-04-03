package com.example.OGMA.Resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.example.OGMA.Repository.StudentRepository;
import com.example.OGMA.Types.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "losalhost:4200", maxAge = 3600)
@Path("student")
public class StudentResources{

    @Autowired
    private StudentRepository studentRepository;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student createStudent(@QueryParam("nom") String nom,
                                 @QueryParam("prenom") String prenom,
                                 @QueryParam("cursus") String cursus, 
                                 @QueryParam("site") String site, 
                                 @QueryParam("mail") String mail){
        Student s = new Student(nom, prenom, cursus, site, mail);
        s = studentRepository.save(s);
        return s;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Student> getStudentList() {
        String content = "[\n\t";
        Iterable<Student> vartemp = studentRepository.findAll();
        for (Student student : vartemp) {
            content += "{\n\t\tid: " +student.getId()+ ",\n\t\tnom : " +student.getNom()+ ",\n\t\tprenom : " +student.getPrenom()+ ",\n\t\tcursus : " +student.getCursus()+ ",\n\t\tmail: " + student.getMail() + "\n\t},";
        }
        content += "\n]";
        System.out.println(content);
        return vartemp;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteStudent(@QueryParam("idStudent") Long idStudent){
        try {
            studentRepository.deleteById(idStudent);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}