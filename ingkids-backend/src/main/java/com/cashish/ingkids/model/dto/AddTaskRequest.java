package com.cashish.ingkids.model.dto;

import com.cashish.ingkids.data.TaskStatus;
import com.cashish.ingkids.data.TaskType;

public class AddTaskRequest {

	private int childId;
	private String description;
	private int point;
	private TaskType type;
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
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public TaskType getType() {
		return type;
	}
	public void setType(TaskType type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	
}
