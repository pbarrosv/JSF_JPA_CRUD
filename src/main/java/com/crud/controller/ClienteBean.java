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

		ClienteDao clienteDao = new ClienteDao();
		return clienteDao.findAllClie();

	}
	
	public void updateClie(Long id) {
		ClienteDao clienteDao = new ClienteDao();
		Cliente clie = new Cliente();
		clie = clienteDao.findClie(id);
		System.out.print(clie);
	}
}
