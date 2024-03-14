package com.cashish.ingkids.model.dto;

import com.cashish.ingkids.data.TaskStatus;

public class UpdateStatusTaskRequest {

	private int id;
	private TaskStatus taskStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TaskStatus getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

	
	
}
