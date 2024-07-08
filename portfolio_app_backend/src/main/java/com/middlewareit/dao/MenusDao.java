package com.middlewareit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.middlewareit.models.Menus;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * dao interface for the menus view
 */

public interface MenusDao extends JpaRepository<Menus, Integer> {

}
