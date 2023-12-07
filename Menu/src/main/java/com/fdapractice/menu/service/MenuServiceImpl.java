package com.fdapractice.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdapractice.menu.entity.MenuEntity;
import com.fdapractice.menu.entity.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService {
@Autowired
MenuRepository menuRepo;

	@Override
	public MenuEntity addToMenu(MenuEntity menu) {
		
		return menuRepo.save(menu);
		
	}

	@Override
	public MenuEntity updateMenu(MenuEntity menu) {
		
		return menuRepo.save(menu) ;
	}

	@Override
	public List<MenuEntity> viewAllMenu() {
		return menuRepo.findAll();
	}

	@Override
	public void deleteMenuById(int Id) {
		menuRepo.deleteById(Id);
		
	}

}
