package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.dao.impl.UserDaoImp;
import com.model.User;


/**
 * Servlet implementation class UserLogin
 * @author 
 */
public class UserLogin extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();//获取session
	    String message=null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int userId=0;
		String name=null;
		System.out.println(username);
		System.out.println(password);
		session.setAttribute("userUsername", username);
		session.setAttribute("userPassword", password);
		PrintWriter out = response.getWriter();
        User user=new User();
        user.setUserPassword(password);
        user.setUserUsername(username);
        
        UserDao dao=new UserDaoImp();
        List list=dao.queryUserIdbyUserUsername(user);
        
        for (Iterator i = list.iterator(); i.hasNext();) {
            userId=(Integer) i.next();
        }
        request.setAttribute("userId", userId);
        List list1=dao.queryUserNamebyUserUsername(user);
        
        for (Iterator i = list1.iterator(); i.hasNext();) {
            name=(String) i.next();
        }
        user.setUserId(userId);
        user.setUserName(name);
        session.setAttribute("user", user);
        
	    if(dao.Check(user)){
	    	RequestDispatcher view=request.getRequestDispatcher("showUser.jsp");
	    	view.forward(request, response);//登录成功
	    }
	    else
	    {
	    	message="Wrong username or password, login failed!";
	    	request.setAttribute("message", message);
	    	RequestDispatcher view=request.getRequestDispatcher("error.jsp");
    	view.forward(request, response);//登录失败
	    }
		out.flush();
		out.close();
		}
}

