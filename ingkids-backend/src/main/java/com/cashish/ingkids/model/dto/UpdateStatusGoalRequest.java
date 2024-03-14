package com.cashish.ingkids.model.dto;

import com.cashish.ingkids.data.GoalStatus;

public class UpdateStatusGoalRequest {

	private int id;
	private GoalStatus goalStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public GoalStatus getGoalStatus() {
		return goalStatus;
	}
	public void setGoalStatus(GoalStatus goalStatus) {
		this.goalStatus = goalStatus;
	}
	
	
}
