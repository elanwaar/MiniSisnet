package com.miniprojet.sisnet.Api;

import java.net.http.HttpResponse;
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

import org.apache.http.protocol.ResponseServer;

import com.miniprojet.sisnet.DAO.Tables.Client;
import com.miniprojet.sisnet.Services.Client_Service;

@Path("/client")
public class ClientResource {
	
	@Path("/insert")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insert (Client client) {
		
		Client_Service client_Service = new Client_Service();
		
		try {
			client_Service.insert(client);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Response
			      .status(201)
			      .header("Access-Control-Allow-Origin", "*")
			      
			      
			      .header("Access-Control-Allow-Methods", 
			        "POST")
			      .entity("")
			      .build();
	}
	 
	 @Path("/get")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<Client> getAllData() {
	     
		 Client_Service client_Service = new Client_Service();
		 client_Service.getAll();
		 
	     return client_Service.getAll();
	}
	 
	 @Path("/get/{id}")
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public Client getClientById(@PathParam("id") Integer id) {
		 Client_Service client_Service = new Client_Service();
		 return client_Service.getClientById(id);
	 }
	 
	 @Path("/update/{id}")
	 @PUT
	 @Produces(MediaType.APPLICATION_JSON)
	 @Consumes(MediaType.APPLICATION_JSON)
	 public Client updateClient(@PathParam("id") Integer id, Client client) throws SQLException {
		 
		 Client_Service client_Service = new Client_Service();
		 client_Service.update(client);
		 
		 return client;
	 }
	 
	 @Path("/delete/{id}")
	 @DELETE
	 @Produces(MediaType.TEXT_HTML)
	 public Response delete(@PathParam("id") Integer id) {
		 
	    

		Client_Service client_Service = new Client_Service();
		boolean deleted = false;
		try {
			
			deleted = client_Service.delete(id);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response
			      .status(200)
			      
			      .entity("")
			      .build();
		 
	 }
	 
	 
	 
	 
	 
	 
	 
}
