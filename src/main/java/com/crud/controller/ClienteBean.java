package com.crud.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.crud.dao.ClienteDao;
import com.crud.model.Cliente;

@ManagedBean(name = "miBean")
@RequestScoped
public class ClienteBean {

	public List<Cliente> findAllClien() {
		
		ClienteDao clienteDao = new ClienteDao(); return clienteDao.findAllClie();
		 
		/*List<Cliente> listaClientes = new ArrayList<>();
		Cliente c1 = new Cliente();
		c1.setId(1L);
		c1.setNombres("Elivar");
		c1.setApellidos("Largo");
		c1.setDireccion("Loja");

		Cliente c2 = new Cliente();
		c2.setId(1L);
		c2.setNombres("Elivar1");
		c2.setApellidos("Largo1");
		c2.setDireccion("Loja1");
		listaClientes.add(c1);
		listaClientes.add(c2);

		return listaClientes;*/

	}
}
