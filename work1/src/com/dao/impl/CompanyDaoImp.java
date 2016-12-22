package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.CompanyDao;
import com.hibernate.HibernateSessionFactory;
import com.model.*;

/**
 * class CompanyDaoImp extends CompanyDao
 * @author 
 */

public class CompanyDaoImp extends CompanyDao {

	Session session=HibernateSessionFactory.getSession();
	Transaction tr=session.beginTransaction();
	

    public List<Company> queryAllCompany() {
		//查询全部公司的信息
    List<Company> list =  session.createQuery("from Company").list();
    session.flush();
	tr.commit();//提交事务
	return list;
	}
    
    public void deleteCompany(int id) {
    	Company company = (Company) session.load(Company.class, id);
    	session.delete(company);//删除数据
    	session.flush();
    	tr.commit();//提交事务

 	}
    
    public boolean insertCompanyJob(Company company) {
	
    	// TODO Auto-generated method stub
		session.save(company);
		tr.commit();
		return true;
	}   

}
	
	

