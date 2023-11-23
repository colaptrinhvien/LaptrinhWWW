package com.fit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fit.entity.Car;
import com.fit.service.CarService;

@Controller
@RequestMapping("/")
public class CarController {
	
	@Autowired
	private CarService service;
	
	@RequestMapping("/")
	public ModelAndView showHomePage() {
		List<Car> cars = service.getAllCart();
		ModelAndView model = new ModelAndView("home-page");
		model.addObject("cars", cars);
		return model;
	}
	
	@RequestMapping("/show-form-insert")
	public ModelAndView showFormInsert() {
		ModelAndView model = new ModelAndView("form-insert");
		model.addObject("car", new Car());
		return model;
	}
	
	@RequestMapping("/insert")
	public ModelAndView insertCar(@ModelAttribute("car") Car car) {
		service.insert(car);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}
	
	@RequestMapping("/delete/{id}")
	public ModelAndView deleteCar(@PathVariable("id") int id) {
		service.delete(new Car(id));
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}
	
	@RequestMapping("/show-form-update/{id}")
	public ModelAndView updateCar(@PathVariable("id") int id) {
		Car car = service.getCartByID(id);
		ModelAndView model = new ModelAndView("form-update");
		model.addObject("car", car);
		return model;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateCar(@ModelAttribute("car") Car car) {
		service.update(car);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}
}
