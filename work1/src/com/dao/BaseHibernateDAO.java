package com.dao;

import org.hibernate.Session;
import com.hibernate.*;


/**
 * Data access object (DAO) for domain model
 * @author 
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}