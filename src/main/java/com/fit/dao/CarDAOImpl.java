package com.fit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fit.entity.Car;

@Repository
public class CarDAOImpl implements CarDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Car> getAllCart() {
		Session session = sessionFactory.getCurrentSession();
		List<Car> cars = session.createQuery("from Car", Car.class).list();
		return cars;
	}

	@Override
	@Transactional
	public boolean update(Car c) {
		Session session = sessionFactory.getCurrentSession();
		session.update(c);
		return true;
	}

	@Override
	@Transactional
	public boolean delete(Car c) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(c);
		return true;
	}

	@Override
	@Transactional
	public boolean insert(Car c) {
		Session session = sessionFactory.getCurrentSession();
		session.save(c);
		return true;
	}

	@Override
	@Transactional
	public Car getCartByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Car car = session.createQuery("from Car where id = " + id, Car.class).uniqueResult();
		return car;
	}

}
