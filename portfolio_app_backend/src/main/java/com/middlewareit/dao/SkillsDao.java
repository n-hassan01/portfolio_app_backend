package com.middlewareit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.middlewareit.models.SkillsV;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * dao interface for the skills view
 */

public interface SkillsDao extends JpaRepository<SkillsV, Integer> {

}
