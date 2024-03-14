package com.cashish.ingkids.model.dto;

import com.cashish.ingkids.data.LoginType;

public class LoginResponse {

	private boolean success;
	private int user_id;
	private int child_id;
	private LoginType loginType;
	
	
	
	public LoginResponse(boolean success, int user_id, int child_id, LoginType loginType) {
		super();
		this.success = success;
		this.user_id = user_id;
		this.child_id = child_id;
		this.loginType = loginType;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getChild_id() {
		return child_id;
	}
	public void setChild_id(int child_id) {
		this.child_id = child_id;
	}
	public LoginType getLoginType() {
		return loginType;
	}
	public void setLoginType(LoginType loginType) {
		this.loginType = loginType;
	}
	
	
	
	
	
}
