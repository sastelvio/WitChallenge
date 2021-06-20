/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.rest;

import java.math.BigDecimal;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Sastelvio Serafim Manuel
 */
@Path("calculate")
public class Calculate {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public Calculate() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "";
    }

    @Path("sum")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getSum(@PathParam("a") @QueryParam("a") BigDecimal a, @PathParam("b") @QueryParam("b") BigDecimal b) {
        return a.add(b).toString();
    }

    @Path("subtract")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getSubtract(@PathParam("a") @QueryParam("a") BigDecimal a, @PathParam("b") @QueryParam("b") BigDecimal b) {
        return a.subtract(b).toString();
    }

    @Path("multiply")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMultiply(@PathParam("a") @QueryParam("a") BigDecimal a, @PathParam("b") @QueryParam("b") BigDecimal b) {
        return a.multiply(b).toString();
    }

    @Path("divide")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getDevide(@PathParam("a") @QueryParam("a") BigDecimal a, @PathParam("b") @QueryParam("b") BigDecimal b) {
        return a.divide(b).toString();
    }
}
