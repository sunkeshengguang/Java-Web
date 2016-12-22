package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminDao;
import com.dao.impl.AdminDaoImp;
/**
 * Servlet implementation class AdminPersonal
 * @author 
 */
public class AdminPersonal {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name= request.getParameter("name");
		
		AdminDao adminDao = new AdminDaoImp();
		/*if(adminDao.modify(username, password, name)) {
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("personal.jsp");
		}*/
	}
}
