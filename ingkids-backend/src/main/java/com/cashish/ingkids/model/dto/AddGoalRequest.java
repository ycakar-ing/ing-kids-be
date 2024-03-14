package com.cashish.ingkids.model.dto;

import com.cashish.ingkids.model.entity.Goal;

public class AddGoalRequest {

	private int childId;
	private String description;
	public int getChildId() {
		return childId;
	}
	public void setChildId(int childId) {
		this.childId = childId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
