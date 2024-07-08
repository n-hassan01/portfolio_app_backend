package com.middlewareit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * /** dto for the skils view
 */

@Entity
@Table(name = "skills_v")
public class SkillsV {

	@Id
	private Integer id;
	private String pageTitle;
	private String pageSubtitle;
	private Integer sequence;
	private String contentTitle;
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
		return contentTitle;
	}

	public void setContentTitle(String contentTitle) {
		contentTitle = contentTitle;
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
