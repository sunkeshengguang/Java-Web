package com.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.dao.AdminDao;
import com.hibernate.HibernateSessionFactory;
import com.model.Admin;
/**
 * class AdminDaoImp extends AdminDao
 * @author 
 */
public class AdminDaoImp extends AdminDao {

	Session session=HibernateSessionFactory.getSession();
	Transaction tr=session.beginTransaction();
	
	public Admin queryAdmin(String username, String password) {
		Admin admin = null;
		String sql = "select u.adminPassword from Admin u where u.adminUsername='" +username+ "'";  
		 List list = session.createQuery(sql).list();  
		 if(!list.isEmpty()) {  
		     Iterator it = list.iterator();  
		     while(it.hasNext()) {  
		         String get = (String) it.next();  
		         System.out.println(get); 
		         admin.setAdminPassword("get");   
		         } 
		     
		     admin.setAdminUsername("username");
		     HibernateSessionFactory.closeSession();  
			    return admin;   //检查是否与数据库中的信息匹配
		 }
		    HibernateSessionFactory.closeSession();  
		    return admin;     
}

 
	public boolean Check(Admin admin){
		String sql = "select u.adminPassword from Admin u where u.adminUsername='" +admin.getAdminUsername()+ "'";  
		 List list = session.createQuery(sql).list();  
		 if(!list.isEmpty()) {  
		     Iterator it = list.iterator();  
		     while(it.hasNext()) {  
		         String get = (String) it.next();  
		         System.out.println(get); 
		         if(get.equals(admin.getAdminPassword())) {  //检查是否与数据库中的信息匹配
		                HibernateSessionFactory.closeSession();  
		                return true;  
		         } 
		     }
		 }
		    HibernateSessionFactory.closeSession();  
		    return false;     
	}
	
    public String queryAdminName(String AdminUsername) {
    Admin admin=new Admin();
    String a = (String) session.load(Admin.class, AdminUsername);//根据adminUsername查询
    return a;
}
}