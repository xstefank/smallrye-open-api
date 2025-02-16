package test.io.smallrye.openapi.runtime.scanner.resources.jakarta;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import test.io.smallrye.openapi.runtime.scanner.entities.Greeting;

/**
 * Endpoint with no produces or consumes
 *
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
@Path("/greeting")
public class DefaultContentTypeResource {

    @GET
    @Path("/hello")
    public Greeting hello() {
        return new Greeting("Hello there");
    }

    @POST
    @Path("/hello")
    public Greeting hello(Greeting greeting) {
        return greeting;
    }

    @GET
    @Path("/goodbye")
    @Produces(MediaType.APPLICATION_XML)
    public Greeting byebye() {
        return new Greeting("Good Bye !");
    }

}
