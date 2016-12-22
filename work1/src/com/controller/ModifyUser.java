package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.dao.impl.UserDaoImp;
import com.model.User;
/**
 * Servlet implementation class ModifyUser
 * @author 
 */
public class ModifyUser extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String message=null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String id=request.getParameter("id");
		System.out.println(id.toString());
		int userId=Integer.parseInt(id.trim());
		PrintWriter out = response.getWriter();
        User user=new User();
        user.setUserPassword(password);
        user.setUserUsername(username);
        user.setUserName(name);
        user.setUserId(userId);
        UserDao dao=new UserDaoImp();
	    dao.updateUser(user);//调用修改用户的方法
	    System.out.println("Update Success!");
	    response.sendRedirect("showUser.jsp");//修改成功，返回showUser.jsp
		out.flush();
		out.close();
		}
}

