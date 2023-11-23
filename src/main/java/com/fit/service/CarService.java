package com.fit.service;

import java.util.List;

import com.fit.entity.Car;

public interface CarService {
	public List<Car> getAllCart();
	public Car getCartByID(int id);
	public boolean update (Car c);
	public boolean delete (Car c);
	public boolean insert (Car c);
}
