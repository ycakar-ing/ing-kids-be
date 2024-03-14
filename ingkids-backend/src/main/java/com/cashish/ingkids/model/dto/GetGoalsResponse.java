package com.cashish.ingkids.model.dto;

import java.util.List;

import com.cashish.ingkids.model.entity.Goal;
import com.cashish.ingkids.model.entity.Task;

public class GetGoalsResponse {
	private List<Goal> goal;

	public GetGoalsResponse(List<Goal> goal) {
		super();
		this.goal = goal;
	}

	public List<Goal> getGoal() {
		return goal;
	}

	public void setGoal(List<Goal> goal) {
		this.goal = goal;
	}

}
