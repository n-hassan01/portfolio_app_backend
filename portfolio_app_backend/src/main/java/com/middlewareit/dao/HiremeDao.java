package com.middlewareit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.middlewareit.models.Hireme;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * dao interface for the hireme table
 */

public interface HiremeDao extends JpaRepository<Hireme, String> {

}
