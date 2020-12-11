package com.crud.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.crud.model.Cliente;
import com.crud.model.JPAUtil;

public class ClienteDao {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	public void saverClie(Cliente clie) {
		entity.getTransaction().begin();/*Empezamos una transacci´ón*/
		entity.persist(clie); /*Persistir el objeto*/
		entity.getTransaction().commit();/*Cerrar la transacción y guardar en la BD*/
		JPAUtil.shutdown();
	}
	
	public void editClie(Cliente clie) {
		entity.getTransaction().begin();
		entity.merge(clie);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
	
	public Cliente findClie(int id) {
		Cliente cl = new Cliente();
		cl = entity.find(Cliente.class, id);
		JPAUtil.shutdown();
		return cl;
	}
	
	public List<Cliente> findAllClie(int id) {
		
		List<Cliente> Listcl = new ArrayList<Cliente>();
		Query q = entity.createQuery("Select c from Cliente c");
		Listcl = q.getResultList();
		return Listcl;
	}
}
