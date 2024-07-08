package com.middlewareit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * /** dto for the hireme table
 */

@Entity
public class Hireme {

	@Id
	private String pageTitle;
	private String pageSubtitle;
	private String description;

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getPageSubtitle() {
		return pageSubtitle;
	}

	public void setPageSubtitle(String pageSubtitle) {
		this.pageSubtitle = pageSubtitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
