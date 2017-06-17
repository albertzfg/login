package com.hsp.actions;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//这是一个action（需要继承Action）
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hsp.forms.UserForm;

public class LoginAction extends Action{

	//我们需要重新写一个方法,execute 会被自动调用，有点类似servlet里的service方法/doGet/doPost方法
	//alt +
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//把form转成对应的UserForm对象
		UserForm userForm=(UserForm)form;
		System.out.println("用户名="+userForm.getUsername());
		
//简单验证
		if("123".equals(userForm.getPassword())){
			//如果密码是123，就认为是合法用户，跳转ok页面
			//把名字放入request对象中
			request.setAttribute("username", userForm.getUsername());
			return mapping.findForward("ok");
		}
		else
		{
			return mapping.findForward("err");
		}
		
	}

	
}
