package com.dao;



import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.model.Candidate;
import com.model.Company;

/**
 * 
 * @see com.model.Candidate
 * @author  */
public class CandidateDao extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CandidateDao.class);
	// property constants
	public static final String CANDIDATE_NAME = "candidateName";
	public static final String CANDIDATE_RESUME = "candidateResume";

	public void save(Candidate transientInstance) {
		log.debug("saving Candidate instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Candidate persistentInstance) {
		log.debug("deleting Candidate instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Candidate findById(java.lang.Integer id) {
		log.debug("getting Candidate instance with id: " + id);
		try {
			Candidate instance = (Candidate) getSession().get(
					"test3.Candidate", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Candidate instance) {
		log.debug("finding Candidate instance by example");
		try {
			List results = getSession().createCriteria("test3.Candidate")
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
		log.debug("finding Candidate instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Candidate as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCandidateName(Object candidateName) {
		return findByProperty(CANDIDATE_NAME, candidateName);
	}

	public List findByCandidateResume(Object candidateResume) {
		return findByProperty(CANDIDATE_RESUME, candidateResume);
	}

	public List findAll() {
		log.debug("finding all Candidate instances");
		try {
			String queryString = "from Candidate";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Candidate merge(Candidate detachedInstance) {
		log.debug("merging Candidate instance");
		try {
			Candidate result = (Candidate) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Candidate instance) {
		log.debug("attaching dirty Candidate instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Candidate instance) {
		log.debug("attaching clean Candidate instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public boolean insertCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		
		return true;
	}
	public List<Candidate> queryAllCandidate(){
		return null;
		
	}
}