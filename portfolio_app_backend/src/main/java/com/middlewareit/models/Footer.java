package com.middlewareit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * /** dto for the footer table
 */

@Entity
public class Footer {

	@Id
	private String fullName;
	private String description;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
