package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.dao.impl.UserDaoImp;
import com.model.User;


/**
 * Servlet implementation class Register
 * @author 
 */
public class Register extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		User user = new User();
		user.setUserUsername(username);
		user.setUserPassword(password);
		user.setUserName(name);

		UserDao userDao = new UserDaoImp();
		userDao.addUser(user);//向user数据库添加新注册的用户
		System.out.println("Register successfully!");
		response.sendRedirect("userLogin.jsp");
	}
}
