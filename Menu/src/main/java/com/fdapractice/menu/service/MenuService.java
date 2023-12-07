package com.fdapractice.menu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdapractice.menu.entity.MenuEntity;



@Service 
public interface MenuService {
	public MenuEntity addToMenu(MenuEntity menu);
	public MenuEntity updateMenu(MenuEntity menu);
	public List<MenuEntity> viewAllMenu();
	public void deleteMenuById(int Id);
	
}
