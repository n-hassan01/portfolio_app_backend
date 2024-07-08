package com.middlewareit.models;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * /** dto for the page content info and will act like template for all pages
 */

public class ContentInfo {

	private Integer id;
	private Integer sequence;
	private String title;
	private String description;
	private String icon;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
