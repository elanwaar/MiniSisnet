package com.miniprojet.sisnet.Api;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.miniprojet.sisnet.DAO.Tables.Client;
import com.miniprojet.sisnet.DAO.Tables.User;

@Path("/user")
public class UserResource {

	@Path("/login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response login (User user) throws SQLException {
		
		if(user.getRole() == "employee" || user.getRole() == "admin")
			return Response.status(200).build();
		else {
			return Response.status(401).build();
		}
	
	}
}
