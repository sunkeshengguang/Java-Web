package com.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.model.Company;

/**
 * @see com.model.Company
 * @author  */
public class CompanyDao extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(CompanyDao.class);
	// property constants
	public static final String COMPANY_NAME = "companyName";
	public static final String COMPANY_INTRODUCTION = "companyIntroduction";
	public static final String COMPANY_ADDRESS = "companyAddress";
	public static final String COMPANY_CONTACT = "companyContact";
	public static final String JOB_NAME = "jobName";
	public static final String JOB_DUTY = "jobDuty";
	public static final String JOB_REQUIRE = "jobRequire";
	public static final String JOB_ISAVAILABLE = "jobIsavailable";

	public void save(Company transientInstance) {
		log.debug("saving Company instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Company persistentInstance) {
		log.debug("deleting Company instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Company findById(java.lang.Integer id) {
		log.debug("getting Company instance with id: " + id);
		try {
			Company instance = (Company) getSession().get("com.bean.Company",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Company instance) {
		log.debug("finding Company instance by example");
		try {
			List results = getSession().createCriteria("com.bean.Company")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Company instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Company as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCompanyName(Object companyName) {
		return findByProperty(COMPANY_NAME, companyName);
	}

	public List findByCompanyIntroduction(Object companyIntroduction) {
		return findByProperty(COMPANY_INTRODUCTION, companyIntroduction);
	}

	public List findByCompanyAddress(Object companyAddress) {
		return findByProperty(COMPANY_ADDRESS, companyAddress);
	}

	public List findByCompanyContact(Object companyContact) {
		return findByProperty(COMPANY_CONTACT, companyContact);
	}

	public List findByJobName(Object jobName) {
		return findByProperty(JOB_NAME, jobName);
	}

	public List findByJobDuty(Object jobDuty) {
		return findByProperty(JOB_DUTY, jobDuty);
	}

	public List findByJobRequire(Object jobRequire) {
		return findByProperty(JOB_REQUIRE, jobRequire);
	}

	public List findByJobIsavailable(Object jobIsavailable) {
		return findByProperty(JOB_ISAVAILABLE, jobIsavailable);
	}

	public List findAll() {
		log.debug("finding all Company instances");
		try {
			String queryString = "from Company";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Company merge(Company detachedInstance) {
		log.debug("merging Company instance");
		try {
			Company result = (Company) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Company instance) {
		log.debug("attaching dirty Company instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public boolean insertCompanyJob(Company company) {
		// TODO Auto-generated method stub
		return false;
	}
	
    public List<Company> queryAllCompany() {
	    return null;
	}
	    
	public void deleteCompany(int id) {

	 	}


	

}