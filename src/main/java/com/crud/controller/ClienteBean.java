package com.crud.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.crud.dao.ClienteDao;
import com.crud.model.Cliente;

@ManagedBean(name = "miBean")
@RequestScoped
public class ClienteBean {

	public List<Cliente> findAllClien() {

		ClienteDao clienteDao = new ClienteDao();
		return clienteDao.findAllClie();

	}
	
	public String toeditClie(Long id) {
		ClienteDao clienteDao = new ClienteDao();
		Cliente clie = new Cliente();
		clie = clienteDao.findClie(id);
		//System.out.print(clie);
		Map<String, Object> sessionMap = FacesContext
				.getCurrentInstance()
				.getExternalContext()
				.getSessionMap();
		sessionMap.put("cliente", clie);
		return "/faces/editar.xhtml";
	}
	
	public String toupdateClie(Cliente cliente) {
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.editClie(cliente);
		return "/faces/index.xhtml";
	}
}
