package com.github.peneksglazami.resources.v2;

import com.github.peneksglazami.resources.v1.GreetingResourceV1;
import io.swagger.annotations.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Second version of service.
 */
@Api(value = "Greeting operations")
@Path("/")
public class GreetingResourceV2 {

    private GreetingResourceV1 greetingResourceV1 = new GreetingResourceV1();

    @ApiOperation(value = "To greet by name", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "I don't say hello to strangers")
    })
    @Path("v2/sayHello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response sayHello(@ApiParam(required = true) @QueryParam("name") String name) {
        if (name == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("I don't say hello to strangers").build();
        }
        return Response.ok("Hello, " + name + "!", MediaType.TEXT_PLAIN).build();
    }

    @ApiOperation(value = "To greet like a resident of Hawaii")
    @Path("v2/sayAloha")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayAloha() {
        return greetingResourceV1.sayAloha();
    }
}
