package com.github.peneksglazami.resources.v2;

import com.github.peneksglazami.resources.v1.GreetingResourceV1;
import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Second version of service.
 */
@Api
@Path("/")
public class GreetingResourceV2{

    private GreetingResourceV1 greetingResourceV1 = new GreetingResourceV1();

    @Path("v2/sayHello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@QueryParam("name") String name) {
        return "Hello, " + name + "!";
    }

    @Path("v2/sayAloha")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayAloha() {
        return greetingResourceV1.sayAloha();
    }
}
