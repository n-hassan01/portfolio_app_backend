package com.middlewareit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.middlewareit.models.Demo;

/**
 * author: Naimul Hassan 
 * date: 7/3/2024
 */
/**
 * sample dao interface
 */

public interface DemoDao extends JpaRepository<Demo, Integer> {

}
