package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CandidateDao;
import com.dao.impl.CandidateDaoImp;
import com.model.Candidate;
import com.model.Company;

/**
 * Servlet implementation class CandidateInfo
 * @author 
 */
public class CandidateInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String candidateName= request.getParameter("candidatename");
		String candidateResume = request.getParameter("candidateresume");
		String id=request.getParameter("id");//获取界面传来的id值
		int companyid=Integer.parseInt(id);
		Company company=new Company();
		company.setCompanyId(companyid);
		Candidate candidate=new Candidate();
		candidate.setCandidateName(candidateName);
		candidate.setCandidateResume(candidateResume);
		candidate.setCompany(company);
		CandidateDao candidateDao=new CandidateDaoImp();

		if(candidateDao.insertCandidate(candidate)) {
			System.out.println("Add successfully!");
			response.sendRedirect("showUser.jsp");//添加成功
		} else {
			System.out.println("Add failure!");
			response.sendRedirect("showUser.jsp");//添加失败
		}
	}
}		
		
		
		
		
		
		
		
		
		
		