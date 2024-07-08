package com.middlewareit.models;

import java.util.List;

/**
 * author: Naimul Hassan 
 * date: 7/7/2024
 */
/**
 * model class for creating object of a view just a pojo
 */

public class ViewResponeInfo {

	private PageInfo pageInfo;
	private List<ContentInfo> contentInfo;

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public List<ContentInfo> getContentInfo() {
		return contentInfo;
	}

	public void setContentInfo(List<ContentInfo> contentInfo) {
		this.contentInfo = contentInfo;
	}

}
