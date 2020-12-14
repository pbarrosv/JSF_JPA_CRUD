package com.crud.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.crud.dao.ClienteDao;
import com.crud.model.Cliente;

@ManagedBean(name = "clienteBean")
@RequestScoped
public class ClienteBean {
	
	public List<Cliente> findAllClientes() {
		
		ClienteDao clienteDao = new ClienteDao();
		return clienteDao.findAllClie();
	}
}
