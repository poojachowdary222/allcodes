package com.fdapractice.menu.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fdapractice.menu.entity.MenuEntity;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity,Integer>{

}
