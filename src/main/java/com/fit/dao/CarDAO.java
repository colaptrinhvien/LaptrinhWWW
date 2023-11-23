package com.fit.dao;

import java.util.List;

import com.fit.entity.Car;

public interface CarDAO {
	public List<Car> getAllCart();
	public boolean update (Car c);
	public boolean delete (Car c);
	public boolean insert (Car c);
	public Car getCartByID(int id);
}
