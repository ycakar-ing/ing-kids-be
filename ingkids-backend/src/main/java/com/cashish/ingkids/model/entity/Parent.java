package com.cashish.ingkids.model.entity;

import java.math.BigDecimal;
import java.util.List;

public class Parent {

	private int id;

	private String name;

	private String username;

	private int childId;

	private String childName;

	private BigDecimal totalBalance;
	
	private List<Goal> goalList;
	private List<Task> taskList;
	
	

	public Parent(int id, String name, String username, int childId, String childName, BigDecimal toplamBakiye,
			List<Goal> goalList, List<Task> taskList) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.childId = childId;
		this.childName = childName;
		this.totalBalance = toplamBakiye;
		this.goalList = goalList;
		this.taskList = taskList;
	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getUsername() {

		return username;

	}

	public void setUsername(String username) {

		this.username = username;

	}

	public int getChildId() {

		return childId;

	}

	public void setChildId(int childId) {

		this.childId = childId;

	}

	public String getChildName() {

		return childName;

	}

	public void setChildName(String childName) {

		this.childName = childName;

	}


	public List<Goal> getGoalList() {
		return goalList;
	}

	public void setGoalList(List<Goal> goalList) {
		this.goalList = goalList;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public BigDecimal getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(BigDecimal totalBalance) {
		this.totalBalance = totalBalance;
	}
	
	

}
