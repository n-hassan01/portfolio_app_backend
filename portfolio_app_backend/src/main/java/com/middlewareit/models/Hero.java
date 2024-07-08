package com.middlewareit.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

/**
 * author: Naimul Hassan 
 * date: 7/6/2024
 */
/**
 * /** dto for the hero table
 */

@Entity
public class Hero {

	@EmbeddedId
	private HeroCompositeKey heroCompositeKey;
	private String designation;
	private String experienceCount;
	private String experienceDescription;
	private String projectCount;
	private String projectDescription;
	private String displayImage;

	public HeroCompositeKey getHeroCompositeKey() {
		return heroCompositeKey;
	}

	public void setHeroCompositeKey(HeroCompositeKey heroCompositeKey) {
		this.heroCompositeKey = heroCompositeKey;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getExperienceCount() {
		return experienceCount;
	}

	public void setExperienceCount(String experienceCount) {
		this.experienceCount = experienceCount;
	}

	public String getExperienceDescription() {
		return experienceDescription;
	}

	public void setExperienceDescription(String experienceDescription) {
		this.experienceDescription = experienceDescription;
	}

	public String getProjectCount() {
		return projectCount;
	}

	public void setProjectCount(String projectCount) {
		this.projectCount = projectCount;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getDisplayImage() {
		return displayImage;
	}

	public void setDisplayImage(String displayImage) {
		this.displayImage = displayImage;
	}

}
