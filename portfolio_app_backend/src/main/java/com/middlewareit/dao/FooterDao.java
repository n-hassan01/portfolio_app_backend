package com.middlewareit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.middlewareit.models.Footer;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * dao interface for the footer table
 */

public interface FooterDao extends JpaRepository<Footer, String> {

}
