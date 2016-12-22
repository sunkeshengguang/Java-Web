package com.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.CandidateDao;
import com.hibernate.HibernateSessionFactory;
import com.model.Candidate;
import com.model.Company;
/**
 * class CandidateDaoImp extends CandidateDao
 * @author 
 */
public class CandidateDaoImp extends CandidateDao{

	Session session=HibernateSessionFactory.getSession();
	Transaction tr=session.beginTransaction();
	public boolean insertCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		session.save(candidate);
		tr.commit();
		return true;
	}

	public List<Candidate> queryAllCandidate(){
		 List<Candidate> list =  session.createQuery("from Candidate").list();
		 session.flush();
	     tr.commit();//提交事务
		return list;
		
	}
}
