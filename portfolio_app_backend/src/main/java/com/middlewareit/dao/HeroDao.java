package com.middlewareit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.middlewareit.models.Hero;
import com.middlewareit.models.HeroCompositeKey;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * dao interface for the hero table
 */

public interface HeroDao extends JpaRepository<Hero, HeroCompositeKey> {

}
