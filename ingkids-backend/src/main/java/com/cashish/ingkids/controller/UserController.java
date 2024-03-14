package com.cashish.ingkids.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cashish.ingkids.data.DataUtil;
import com.cashish.ingkids.data.LoginType;
import com.cashish.ingkids.model.dto.LoginRequest;
import com.cashish.ingkids.model.dto.LoginResponse;
import com.cashish.ingkids.model.entity.Parent;

@RestController
@RequestMapping("api/user")
public class UserController {

	public UserController() {

	}

	@PostMapping("/login/v1")
	public LoginResponse login(@RequestBody LoginRequest loginUserDto) {
		for (Parent parent : DataUtil.parentList) {
			if (parent.getUsername().equals(loginUserDto.getUsername())) {
				return new LoginResponse(true, parent.getId(), parent.getChildId(), LoginType.PARENT);
			} else if (parent.getChildName().equals(loginUserDto.getUsername())) {
				return new LoginResponse(true, parent.getId(), parent.getChildId(), LoginType.CHILD);
			}
		}
		return new LoginResponse(false, 0, 0, LoginType.PARENT);
	}

}
