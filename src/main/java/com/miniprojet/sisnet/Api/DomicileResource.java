package com.miniprojet.sisnet.Api;

import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.miniprojet.sisnet.DAO.Tables.Domicile;
import com.miniprojet.sisnet.Services.Domicile_Service;

@Path("/domicile")
public class DomicileResource {

	@Path("/insert")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response insert(Domicile domicile) {
		
		Domicile_Service domicile_Service = new Domicile_Service();		
		try {
			domicile_Service.insert(domicile);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return Response.status(404).entity("No resources found.").build();
		}
		
		return Response.status(200).entity(domicile).build();
	}
	
	@Path("/get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllData(){
		
		Domicile_Service domicile_Service = new Domicile_Service();
		List<Domicile> listDomiciles = domicile_Service.getAll();
		
		if (!listDomiciles.isEmpty()) {
			return Response.status(200).entity(listDomiciles).build();
		}
		else {
			return Response.status(404).entity("No resources found.").build();
		}
		
	}
	
	@Path("/get/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Domicile getById(@PathParam("id") Integer id) throws SQLException{
		
		Domicile_Service domicile_Service = new Domicile_Service();
		
			Domicile domicile = domicile_Service.getDomicileById(id);
			return domicile;
			
	}
	
	@Path("/update/{id}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") Integer id, Domicile domicile){
		
		Domicile_Service domicile_Service = new Domicile_Service();
		Domicile updated_domicile = new Domicile();
		try {
			updated_domicile = domicile_Service.update(domicile);
		} catch (Exception e) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(updated_domicile).build();
		
	}
	
	@Path("/delete/{id}")
	@DELETE
	@Produces(MediaType.TEXT_HTML)
	public Response delete(@PathParam("id") Integer id) throws SQLException {
		
		Domicile_Service domicile_Service = new Domicile_Service();
		if(domicile_Service.delete(id) == true) {
			return Response.status(204).build();
		}else {
			return Response.status(404).build();
		}
	}
	
	
	
	
}
