package com.cashish.ingkids.model.dto;

import java.util.List;

import com.cashish.ingkids.model.entity.Task;

public class GetTasksResponse {
	private List<Task> tasks;
	
	

	public GetTasksResponse(List<Task> tasks) {
		super();
		this.tasks = tasks;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
}
