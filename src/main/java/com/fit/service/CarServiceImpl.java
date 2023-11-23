package com.fit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.dao.CarDAO;
import com.fit.entity.Car;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDAO carDAO;
	
	@Override
	public List<Car> getAllCart() {
		return carDAO.getAllCart();
	}

	@Override
	public boolean update(Car c) {
		return carDAO.update(c);
	}

	@Override
	public boolean delete(Car c) {
		return carDAO.delete(c);
	}

	@Override
	public boolean insert(Car c) {
		return carDAO.insert(c);
	}

	@Override
	public Car getCartByID(int id) {
		return carDAO.getCartByID(id);
	}

}
