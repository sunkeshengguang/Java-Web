package com.dao.impl;

import java.util.Iterator;
import java.util.List;

import com.hibernate.HibernateSessionFactory;
import com.dao.UserDao;
import com.hibernate.*;
import com.model.User;

import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * class UserDaoImp extends UserDao
 * @author 
 */
public class UserDaoImp extends UserDao{

	Session session=HibernateSessionFactory.getSession();
	Transaction tr=session.beginTransaction();
	public void addUser(User user) {
		session.save(user);
		tr.commit();
	}
	
    public boolean Check(User user) {  
	    String sql = "select u.userPassword from User u where u.userUsername='" +user.getUserUsername()+ "'";  
	    List list = session.createQuery(sql).list();  
	    if(!list.isEmpty()) {  
	        Iterator it = list.iterator();  
	        while(it.hasNext()) {  
	            String get = (String) it.next();  
	            System.out.println(get);  
	            if(get.equals(user.getUserPassword())) {  //检查是否与数据库中的信息匹配
	                HibernateSessionFactory.closeSession();  
	                return true;  
	            }  
	        }  
	    }  
	    HibernateSessionFactory.closeSession();  
	    return false;      
	 }  
    
    public List queryUserIdbyUserUsername(User user){
    	String sql = "select u.userId from User u where u.userUsername='" +user.getUserUsername()+ "'";  
	    List list = session.createQuery(sql).list();
		return list; 
    }
    public List queryUserNamebyUserUsername(User user){
    	String sql = "select u.userName from User u where u.userUsername='" +user.getUserUsername()+ "'";  
	    List list = session.createQuery(sql).list();
		return list; 
    }
	public List findByUserUsername(Object userUsername) {
		return findByProperty(USER_USERNAME, userUsername);
	}
	public void updateUser(User user){
	    session.update(user);//修改 
	    tr.commit();//提交事务
	}
}
