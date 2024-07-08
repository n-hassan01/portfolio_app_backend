package com.middlewareit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.middlewareit.models.Educations;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * dao interface for the educations view
 */

public interface EducationDao extends JpaRepository<Educations, Integer> {

}
