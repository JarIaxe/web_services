package com.example.OGMA;

import javax.ws.rs.ApplicationPath;

import com.example.OGMA.Resources.InscriptionResource;
import com.example.OGMA.Resources.MatiereResource;
import com.example.OGMA.Resources.ResultatResource;
import com.example.OGMA.Resources.StudentResources;
import com.example.OGMA.Resources.TeacherResource;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("rest")
@Configuration
public class JerseyConfiguration extends ResourceConfig 
{
    public JerseyConfiguration(){
        register(StudentResources.class);
        register(InscriptionResource.class);
        register(TeacherResource.class);
        register(MatiereResource.class);
        register(ResultatResource.class);
    }
}