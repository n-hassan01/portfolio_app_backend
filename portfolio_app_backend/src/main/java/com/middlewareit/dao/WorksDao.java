package com.middlewareit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.middlewareit.models.Works;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * dao interface for the works view
 */

public interface WorksDao extends JpaRepository<Works, Integer> {

}
