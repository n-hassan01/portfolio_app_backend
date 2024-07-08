package com.middlewareit.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * template class for all the dto class of db view
 * every entity for a view can extend this class and reduce code redundancy
 */

@MappedSuperclass
public class Viewinfo {
//	@MappedSuperclass is an annotation in the Java Persistence API (JPA) that is used to 
//	designate a class whose mapping information is applied to its subclasses but is not itself an entity. 
//	A class annotated with @MappedSuperclass cannot be queried or persisted directly. 
//	Instead, it serves as a base class that provides common mappings for its subclasses.

	@Id
	private Integer id;
	private String pageTitle;
	private String pageSubtitle;
	private Integer sequence;
	private String ContentTitle;
	private String contentDescription;
	private String contentIcon;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getContentTitle() {
		return ContentTitle;
	}

	public void setContentTitle(String contentTitle) {
		ContentTitle = contentTitle;
	}

	public String getContentDescription() {
		return contentDescription;
	}

	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}

	public String getContentIcon() {
		return contentIcon;
	}

	public void setContentIcon(String contentIcon) {
		this.contentIcon = contentIcon;
	}

}
