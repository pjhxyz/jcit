package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class MyDataDAOImpl implements MyDataDAO<MyData> {
	private static final long serialVersionUID = 1L;
	
	private EntityManager entityManager;
	
	public MyDataDAOImpl() {
		super();
	}
	
	public MyDataDAOImpl(EntityManager manager) {
		entityManager = manager;
	}

	@Override
	public List<MyData> getAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("from MyData");
		List<MyData> list = query.getResultList();
		entityManager.close();
		return list;
	}

}
