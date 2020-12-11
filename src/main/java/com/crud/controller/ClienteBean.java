package com.crud.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.crud.model.Cliente;

@ManagedBean(name = "clienteBean")
@RequestScoped
public class ClienteBean {
	
	public List<Cliente> findAllClientes() {
		List<Cliente> listClie = new ArrayList<Cliente>();
		
		Cliente c1 = new Cliente();
		c1.setId(2L);
		c1.setNombres("luis");
		c1.setApellidos("Lima");
		c1.setDireccion("Lima");


		Cliente c2 = new Cliente();
		c2.setId(3L);
		c2.setNombres("Pedro");
		c2.setApellidos("Lima");
		c2.setDireccion("Lima");
		
		listClie.add(c1);
		listClie.add(c2);
		return listClie;
	}
}
