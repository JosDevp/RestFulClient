/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 * REST Web Service
 *
 * @author Zeus
 */
@Path("/generic")
public class Musica {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Musica
     */
    public Musica() {
    }

    /**
     * Retrieves representation of an instance of testing.Musica
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/obtener")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getJson() {
               Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		return track;
    }

    @GET
    @Path("/saludo/name={nombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String saludo(@PathParam("nombre")String nombre){
        
        
        return "Hola"+nombre;
    }
    
    @GET
    @Path("/suma/n1={valor1}&n2={valor2}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String suma(@PathParam("valor1") int n1,@PathParam("valor2")int n2){
        
       return "El suma de "+n1 +"+"+n2+" es "+(n1+n2);
    }
    
    
    /**
     * PUT method for updating or creating an instance of Musica
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Track track){
        
        String result ="Track saved:"+track;
        
        return Response.status(201).entity(result).build();
    }
}
