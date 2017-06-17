package com.hsp.actions;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//����һ��action����Ҫ�̳�Action��
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hsp.forms.UserForm;

public class LoginAction extends Action{

	//������Ҫ����дһ������,execute �ᱻ�Զ����ã��е�����servlet���service����/doGet/doPost����
	//alt +
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//��formת�ɶ�Ӧ��UserForm����
		UserForm userForm=(UserForm)form;
		System.out.println("�û���="+userForm.getUsername());
		
//����֤
		if("123".equals(userForm.getPassword())){
			//���������123������Ϊ�ǺϷ��û�����תokҳ��
			//�����ַ���request������
			request.setAttribute("username", userForm.getUsername());
			return mapping.findForward("ok");
		}
		else
		{
			return mapping.findForward("err");
		}
		
	}

	
}
