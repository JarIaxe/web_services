package com.example.OGMA;

import javax.ws.rs.ApplicationPath;

import com.example.OGMA.Resources.PersonneResources;
import com.example.OGMA.Resources.StudentResources;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("rest")
@Configuration
public class JerseyConfiguration extends ResourceConfig 
{
    public JerseyConfiguration(){
        register(PersonneResources.class);
        register(StudentResources.class);
    }
}