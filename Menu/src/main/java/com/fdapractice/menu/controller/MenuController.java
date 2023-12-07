package com.fdapractice.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fdapractice.menu.entity.MenuEntity;
import com.fdapractice.menu.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {

	
	@Autowired
	private MenuService menuservice;
	

	@PostMapping("/add")
	public MenuEntity addMenu(@RequestBody MenuEntity menu) {
		return menuservice.addToMenu(menu);
		
	}
	@PutMapping ("/update")
	public MenuEntity updateMenu(@RequestBody MenuEntity menu) {
		return menuservice.updateMenu(menu);
	}
	@DeleteMapping ("/delete/{id}")
	public String deleteMenu(@PathVariable int id) {
		 menuservice.deleteMenuById(id);
		 return "deletedId = " + id+ "data";
	}
	@GetMapping("/viewAllMenu") 
	public List<MenuEntity> viewAllMenu() {
 
		return menuservice.viewAllMenu();
	}
		
}
