package com.krakedev.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.entidades.Cliente;
import com.krakedev.persistencia.ClientesBDD;

@Path("clientes")
public class ServicioClientes {
	
	@Path("m1")
	@GET
	public String saludar() {
		String a= "HolaMundo desde WEBSERVICES";
		return a;
	}
	
	
	@Path("mbuscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente buscar() {
		Cliente cliente = new Cliente("1727039917","Kelvin");
		return cliente;
	}
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Cliente cliente) {
		System.out.println(">>>>>>>" +cliente);
		ClientesBDD cli = new ClientesBDD();
		cli.insertar(cliente);
	}
	
	@Path("act")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Cliente cliente) {
		System.out.println("ACTUALIZANDOCLIENTE>>>>>>>" +cliente);
	}
	
}
