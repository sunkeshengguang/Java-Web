package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CompanyDao;
import com.dao.impl.CompanyDaoImp;
import com.model.Company;



/**
 * Servlet implementation class AddRecruitment
 * @author 
 */
public class AddRecruitment extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();//获取session
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		
		String companyName = request.getParameter("companyname");
		String companyIntroduction = request.getParameter("companyintroduction");
		String companyAddress = request.getParameter("companyaddress");
		String companyContact = request.getParameter("companycontact");
		String jobName = request.getParameter("jobname");
		String jobDuty = request.getParameter("jobduty");
		String jobRequire = request.getParameter("jobrequire");
		int jobIsAvailable = 1;
		
		Company company = new Company();
		company.setCompanyName(companyName);
		company.setCompanyIntroduction(companyIntroduction);
		company.setCompanyAddress(companyAddress);
		company.setCompanyContact(companyContact);
		company.setJobName(jobName);
		company.setJobDuty(jobDuty);
		company.setJobRequire(jobRequire);
		company.setJobIsavailable(jobIsAvailable);
		
		CompanyDao companyDao = new CompanyDaoImp();
		if(companyDao.insertCompanyJob(company)) {
			System.out.println("Add successfully!");
			response.sendRedirect("showAdmin.jsp");//添加信息成功
		} else {
			System.out.println("Add failure!");
			response.sendRedirect("addRecruitment.jsp");//添加信息失败
		}
	}
}
