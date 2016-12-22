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
 * Servlet implementation class UserPersonal
 * @author 
 */
public class UserPersonal extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");

		session.setAttribute("userUsername", username);
		session.setAttribute("userPassword", password);
		User user = new User();
		user.setUserUsername(username);
		user.setUserPassword(password);
		user.setUserName(name);
		session.setAttribute("user", user);
		UserDao userDao = new UserDaoImp();
		userDao.save(user);
		response.sendRedirect("userLogin.jsp");
	}
}
