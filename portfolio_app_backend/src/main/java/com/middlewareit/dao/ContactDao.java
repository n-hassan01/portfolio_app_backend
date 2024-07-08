package com.middlewareit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.middlewareit.models.Contact;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * dao interface for the services view
 */

public interface ContactDao extends JpaRepository<Contact, Integer> {

}
