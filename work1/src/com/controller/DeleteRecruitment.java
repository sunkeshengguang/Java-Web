package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CompanyDao;
import com.dao.impl.CompanyDaoImp;
import com.model.Company;

/**
 * Servlet implementation class DeleteRecruitment
 * @author 
 */
public class DeleteRecruitment extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id=request.getParameter("id");
		int companyId=Integer.parseInt(id);
		Company company=new Company();
		company.setCompanyId(companyId);
		CompanyDao companyDao = new CompanyDaoImp();
		companyDao.deleteCompany(company.getCompanyId());//调用删除的方法
		response.sendRedirect("adminJobList.jsp");
		
	
	}

}
