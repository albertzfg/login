package com.hsp.forms;
//����һ���û����������������
import org.apache.struts.action.ActionForm;

public class UserForm  extends ActionForm{

	//��������
	//Ӧ�ú�jspҳ��Ŀؼ�����һ��
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
