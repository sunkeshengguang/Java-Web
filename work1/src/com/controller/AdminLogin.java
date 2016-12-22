package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDao;
import com.dao.impl.AdminDaoImp;
import com.model.Admin;

/**
 * Servlet implementation class AdminLogin
 * @author 
 */
public class AdminLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 用于获取session对象username和password，如果session不存在，则创建新对象
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		session.setAttribute("adminUsername", username);
		session.setAttribute("adminPassword", password);
		System.out.println(username);
		System.out.println(password);
		PrintWriter out = response.getWriter();
		AdminDao adminDao = new AdminDaoImp();
		Admin admin=new Admin();
        admin.setAdminUsername(username);
		admin.setAdminPassword(password);
		session.setAttribute("admin", admin);
		/*Admin admin = adminDao.queryAdmin(username, password);
		session.setAttribute("adminName", admin.getAdminName());
		session.setAttribute("admin", admin);*/
		String message = "Wrong username or password, login failed!";
		admin.setAdminName("sunke");
		  if(adminDao.Check(admin)){
			  System.out.println("*****");
		    	RequestDispatcher view=request.getRequestDispatcher("showAdmin.jsp");
		    	view.forward(request, response);//登录成功
		    }
		    else
		    {
		    	request.setAttribute("message", message);
		    	RequestDispatcher view=request.getRequestDispatcher("error.jsp");
	    	view.forward(request, response);//登录失败
		    }
			out.flush();
			out.close();
	}
}
