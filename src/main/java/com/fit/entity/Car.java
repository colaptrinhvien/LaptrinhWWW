package com.fit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	private int year;
	private String manufacturer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + ", year=" + year + ", manufacturer="
				+ manufacturer + "]";
	}
	
	public Car(int id, String name, double price, int year, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.year = year;
		this.manufacturer = manufacturer;
	}
	public Car(String name, double price, int year, String manufacturer) {
		super();
		this.name = name;
		this.price = price;
		this.year = year;
		this.manufacturer = manufacturer;
	}
	public Car(int id) {
		super();
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
