package com.miniprojet.sisnet.Controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;


import com.miniprojet.sisnet.Services.Cliente_Service;

@WebServlet(value = "/allClients")
public class selectAll_clients extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cliente_Service cliente_Service = new Cliente_Service();
		
		String json = new Gson().toJson(cliente_Service.getAll());

		resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
		
	}
	
}
