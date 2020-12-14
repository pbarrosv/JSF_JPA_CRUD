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
		entity.getTransaction().begin();
		entity.persist(clie); 
		entity.getTransaction().commit();
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
	
	public List<Cliente> findAllClie() {
		
		List<Cliente> Listcl = new ArrayList<>();
		Query q = entity.createQuery("Select c From ZXC c"); 
		Listcl = q.getResultList();
		return Listcl;
	}
}
