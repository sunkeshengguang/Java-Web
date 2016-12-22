package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CandidateDao;
import com.dao.CompanyDao;
import com.dao.impl.CandidateDaoImp;
import com.dao.impl.CompanyDaoImp;
import com.model.Candidate;
import com.model.Company;

/**
 * Servlet implementation class ApplyJob
 * @author 
 */

public class ApplyJob extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("id");
        System.out.println(a.toString());
	    request.setAttribute("id", a);
	    RequestDispatcher rd=request.getRequestDispatcher("applyJobInfo.jsp");
	    rd.forward(request,response);
	    }

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String a=request.getParameter("id");//获取用户要申请的公司的id
        System.out.println(a.toString());
	    request.setAttribute("id", a);//将id设置成属性
	    RequestDispatcher rd=request.getRequestDispatcher("applyJobInfo.jsp");
	    rd.forward(request,response);
				
	}

}

		
	


