package org.example.service;

import org.example.api.UserBean;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldService {

    @Inject
    protected UserBean userBean;    //Cant inject into a private field because Dagger creates adapter classes for wiring code in the background instead of using Reflection.

    @GET
    public String sayHello(){
        return "Hello There From Dropwizard using Dagger: userBean Data: "+userBean.getName() + "with the id: "+userBean.randomId;
    }
}
