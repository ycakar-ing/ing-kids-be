package com.cashish.ingkids.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.cashish.ingkids.model.entity.Goal;
import com.cashish.ingkids.model.entity.Parent;
import com.cashish.ingkids.model.entity.Task;

public class DataUtil {
	public static List<Parent> parentList;
	public static List<Goal> goalList;
	public static List<Task> taskList;
	public static int goalId = 1;
	public static int taskId = 1;
	static {
		goalList=new ArrayList<>();
		taskList=new ArrayList<>();
		parentList = new ArrayList<>();
		goalList.add(new Goal(goalId++, 1, "Buy tablet", 1500, GoalStatus.COMPLETED));
		goalList.add(new Goal(goalId++, 1, "Buy iphone", 2500, GoalStatus.ONGOING));
		taskList.add(new Task(taskId++, 1, "Clean your room", 15, TaskType.DAILY, TaskStatus.ONGOING));
		taskList.add(new Task(taskId++, 1, "Do your homework", 15, TaskType.DAILY, TaskStatus.PENDING));
		taskList.add(new Task(taskId++, 1, "Saving", 15, TaskType.ADDITIONAL, TaskStatus.COMPLETED));
		taskList.add(new Task(taskId++, 1, "Brush your teeth", 15, TaskType.ADDITIONAL, TaskStatus.COMPLETED));
		taskList.add(new Task(taskId++, 1, "Brush your teeth", 15, TaskType.ADDITIONAL, TaskStatus.COMPLETED));
		parentList.add(new Parent(1, "Name surname", "username", 1, "child-username", BigDecimal.valueOf(1250),
				goalList,
				taskList
						));
	}
}