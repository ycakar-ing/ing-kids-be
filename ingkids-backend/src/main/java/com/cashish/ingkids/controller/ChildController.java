package com.cashish.ingkids.controller;

import java.math.BigDecimal;
import java.util.Collections;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cashish.ingkids.data.DataUtil;
import com.cashish.ingkids.data.GoalStatus;
import com.cashish.ingkids.data.TaskStatus;
import com.cashish.ingkids.data.TaskType;
import com.cashish.ingkids.model.dto.AddGoalRequest;
import com.cashish.ingkids.model.dto.AddGoalResponse;
import com.cashish.ingkids.model.dto.AddTaskRequest;
import com.cashish.ingkids.model.dto.AddTaskResponse;
import com.cashish.ingkids.model.dto.GetGoalsResponse;
import com.cashish.ingkids.model.dto.GetTasksResponse;
import com.cashish.ingkids.model.dto.UpdateGoalRequest;
import com.cashish.ingkids.model.dto.UpdateGoalResponse;
import com.cashish.ingkids.model.dto.UpdateStatusGoalRequest;
import com.cashish.ingkids.model.dto.UpdateStatusGoalResponse;
import com.cashish.ingkids.model.dto.UpdateStatusTaskRequest;
import com.cashish.ingkids.model.dto.UpdateStatusTaskResponse;
import com.cashish.ingkids.model.entity.Goal;
import com.cashish.ingkids.model.entity.Parent;
import com.cashish.ingkids.model.entity.Task;

@CrossOrigin
@RestController
@RequestMapping("api/child")
public class ChildController {

	@GetMapping("/tasks/get/daily/v1/{id}")
	public GetTasksResponse getDailyTasks(@PathVariable int id) {
		for (Parent parent : DataUtil.parentList) {
			if (parent.getChildId() == id) {
				return new GetTasksResponse(
						parent.getTaskList().stream().filter(t -> t.getType() == TaskType.DAILY).toList());
			}
		}
		return new GetTasksResponse(Collections.emptyList());
	}

	@GetMapping("/tasks/get/additional/v1/{id}")
	public GetTasksResponse getAdditionalTasks(@PathVariable int id) {
		for (Parent parent : DataUtil.parentList) {
			if (parent.getChildId() == id) {

				return new GetTasksResponse(
						parent.getTaskList().stream().filter(t -> t.getType() == TaskType.ADDITIONAL).toList());
			}
		}
		return new GetTasksResponse(Collections.emptyList());
	}

	@GetMapping("/goals/get/v1/{id}")
	public GetGoalsResponse getGoals(@PathVariable int id) {
		for (Parent parent : DataUtil.parentList) {
			if (parent.getChildId() == id) {
				return new GetGoalsResponse(parent.getGoalList());
			}
		}
		return new GetGoalsResponse(Collections.emptyList());
	}

	@PostMapping("/goals/add/v1")
	public AddGoalResponse addGoals(@RequestBody AddGoalRequest addGoalRequest) {

		AddGoalResponse response = new AddGoalResponse();
		for (Parent parent : DataUtil.parentList) {
			if (parent.getChildId() == addGoalRequest.getChildId()) {
				parent.getGoalList().add(new Goal(DataUtil.goalId++, addGoalRequest.getChildId(),
						addGoalRequest.getDescription(), null, GoalStatus.ONGOING));

			}
		}
		response.setMessage("success");
		return response;
	}

	@PostMapping("/tasks/add/v1")
	public AddTaskResponse addTasks(@RequestBody AddTaskRequest addTaskRequest) {

		AddTaskResponse response = new AddTaskResponse();
		for (Parent parent : DataUtil.parentList) {
			if (parent.getChildId() == addTaskRequest.getChildId()) {
				parent.getTaskList()
						.add(new Task(DataUtil.taskId++, addTaskRequest.getChildId(), addTaskRequest.getDescription(),
								addTaskRequest.getPoint(), addTaskRequest.getType(), TaskStatus.ONGOING));
			}
		}
		response.setMessage("success");
		return response;
	}

	@PutMapping("/goals/update/v1")
	public UpdateGoalResponse updateGoal(@RequestBody UpdateGoalRequest updateGoalRequest) {

		UpdateGoalResponse response = new UpdateGoalResponse();
		for (Parent parent : DataUtil.parentList) {
			for (Goal goal : parent.getGoalList())
				if (goal.getId() == updateGoalRequest.getId()) {
					goal.setPoint(updateGoalRequest.getPoint());
				}
		}
		response.setMessage("success");
		return response;
	}

	@PutMapping("/goals/update-status/v1")
	public UpdateStatusGoalResponse updateStatusGoal(@RequestBody UpdateStatusGoalRequest request) {

		UpdateStatusGoalResponse response = new UpdateStatusGoalResponse();
		for (Parent parent : DataUtil.parentList) {
			for (Goal goal : parent.getGoalList())
				if (goal.getId() == request.getId()) {
					goal.setStatus(request.getGoalStatus());
					parent.getTotalBalance().subtract(BigDecimal.valueOf(goal.getPoint()));
				}
		}
		response.setMessage("success");
		return response;
	}

	@PutMapping("/tasks/update-status/v1")
	public UpdateStatusTaskResponse updateStatusGoal(@RequestBody UpdateStatusTaskRequest request) {

		UpdateStatusTaskResponse response = new UpdateStatusTaskResponse();
		for (Parent parent : DataUtil.parentList) {
			for (Task task : parent.getTaskList())
				if (task.getId() == request.getId()) {
					task.setStatus(request.getTaskStatus());
					parent.getTotalBalance().add(BigDecimal.valueOf(task.getPoint()));
				}
		}
		response.setMessage("success");
		return response;
	}

}
