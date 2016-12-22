package com.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.model.Recruitment;

/**
 * @see com.model.Recruitment
 * @author
 */
public class RecruitmentDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(RecruitmentDAO.class);
	// property constants
	public static final String JOB_NAME = "jobName";
	public static final String JOB_DUTY = "jobDuty";
	public static final String JOB_REQUIRE = "jobRequire";
	public static final String JOB_ISAVAILABLE = "jobIsavailable";

	public void save(Recruitment transientInstance) {
		log.debug("saving Recruitment instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Recruitment persistentInstance) {
		log.debug("deleting Recruitment instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Recruitment findById(java.lang.Integer id) {
		log.debug("getting Recruitment instance with id: " + id);
		try {
			Recruitment instance = (Recruitment) getSession().get(
					"com.bean.Recruitment", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Recruitment instance) {
		log.debug("finding Recruitment instance by example");
		try {
			List results = getSession().createCriteria("com.bean.Recruitment")
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
		log.debug("finding Recruitment instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Recruitment as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
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
		log.debug("finding all Recruitment instances");
		try {
			String queryString = "from Recruitment";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Recruitment merge(Recruitment detachedInstance) {
		log.debug("merging Recruitment instance");
		try {
			Recruitment result = (Recruitment) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Recruitment instance) {
		log.debug("attaching dirty Recruitment instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	
}