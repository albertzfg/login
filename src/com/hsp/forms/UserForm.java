package com.hsp.forms;
//这是一个用户表单，用于填充数据
import org.apache.struts.action.ActionForm;

public class UserForm  extends ActionForm{

	//定义属性
	//应该和jsp页面的控件名称一致
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
