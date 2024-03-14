package com.cashish.ingkids.model.entity;

import com.cashish.ingkids.data.TaskStatus;
import com.cashish.ingkids.data.TaskType;

public class Task {
	private int id;

	private int childId;

	private String description;

	private int point;

	private TaskType type;

	private TaskStatus status;
	
	

	public Task(int id, int childId, String description, int point, TaskType type, TaskStatus status) {
		super();
		this.id = id;
		this.childId = childId;
		this.description = description;
		this.point = point;
		this.type = type;
		this.status = status;
	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

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

	public TaskStatus getStatus() {

		return status;

	}

	public void setStatus(TaskStatus status) {

		this.status = status;

	}
}
