package com.cashish.ingkids.model.entity;

import com.cashish.ingkids.data.GoalStatus;

public class Goal {
	private int id;

	private int childId;

	private String description;

	private Integer point;

	private GoalStatus status;
	
	

	public Goal(int id, int childId, String description, Integer point, GoalStatus status) {
		super();
		this.id = id;
		this.childId = childId;
		this.description = description;
		this.point = point;
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

	public Integer getPoint() {

		return point;

	}

	public void setPoint(Integer point) {

		this.point = point;

	}

	public GoalStatus getStatus() {

		return status;

	}

	public void setStatus(GoalStatus status) {

		this.status = status;

	}
}
