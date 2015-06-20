/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celso.fichaa.model.dao;

import com.celso.fichaa.ABerturaSession;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Example.PropertySelector;
import org.hibernate.type.Type;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, timeout = 20)
public abstract class TOBaseHibernateDao extends HibernateDaoSupport implements TOBaseDao, PropertySelector {
    private static final Log logger = LogFactory.getLog(TOBaseHibernateDao.class);
    private final Class objectClass;
    private static Session s;

    public TOBaseHibernateDao(final Class objectClass) {
        this.objectClass = objectClass;
        
        if(s == null){
            s = ABerturaSession.getSessionFactory().openSession();
        }
        
       
    }
 
    /**
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public Class getObjectClass() {
        return objectClass;
    }
 
    /**
     *
     * @param example
     * @return
     */
    @Override
    public int findByExamplePageCount(final Object example) {
        final List l = findByExample(example);
        final Integer i = l.size();
        return i;
    }
 
    @Override
    public int listAllPageCount() {
        final List l = listAll();
        final Integer i = l.size();
        return i;
    }
 
    /*
     * (non-Javadoc)
     *
     * @see br.ufrgs.hcpa.template.dao.GetNetBaseDao#findOneByExample(T)
     */
    @Override
    public Object findOneByExample(final Object example) {
        final List res = findByExample(example, 0, 1);
        if ((res != null) && (res.size() == 1)) {
            return res.get(0);
        } else {
            return null;
        }
    }
 
    /**
     *
     * @param object
     * @return
     */
    @Override
    public Object save(final Object object) {
        try {
            
            //s.save(object);
            s.getTransaction().begin();
            s.save(object);
            s.flush();
            s.getTransaction().commit();
            return object;
        } catch (final HibernateException ex) {
            TOBaseHibernateDao.logger.error(ex);
            //throw convertHibernateAccessException(ex);
        }
        return null;
    }
 
    /**
     *
     * @param object
     */
    @Override
    public void update(final Object object) {
        try {
            
            s.getTransaction().begin();
            s.update(object);
            s.flush();
            s.getTransaction().commit();
        } catch (final HibernateException ex) {
            TOBaseHibernateDao.logger.error(ex);
            throw convertHibernateAccessException(ex);
        }
    }
 
    /**
     *
     * @param object
     */
    @Override
    public void rebind(final Object object) {
        try {
            s.refresh(object);
        } catch (final HibernateException ex) {
            TOBaseHibernateDao.logger.error(ex);
            throw convertHibernateAccessException(ex);
        }
    }
 
    public void delete(final Object object) {
        try {
            s.getTransaction().begin();
            s.delete(object);
            s.flush();
            s.getTransaction().commit();
        } catch (final HibernateException ex) {
            TOBaseHibernateDao.logger.error(ex);
            throw convertHibernateAccessException(ex);
        }
    }
 
    @SuppressWarnings("unchecked")
    public Object load(final Serializable primaryKey) {
        try {
            final Object o = s.load(objectClass, primaryKey);
            return (Object) o;
        } catch (final HibernateException ex) {
            TOBaseHibernateDao.logger.error(ex);
            throw convertHibernateAccessException(ex);
        }
    }
 
    @SuppressWarnings("unchecked")
    public Object get(final Serializable primaryKey) {
        try {
            final Object o = s.load(objectClass, primaryKey);
            return (Object) o;
        } catch (final HibernateException ex) {
            TOBaseHibernateDao.logger.error(ex);
            throw convertHibernateAccessException(ex);
        }
    }
 
    @SuppressWarnings("unchecked")
    public List listAll() {
        try {
            final Criteria c = s.createCriteria(objectClass);
            addOrderToCriteria(c);
            return c.list();
        } catch (final HibernateException ex) {
            TOBaseHibernateDao.logger.error(ex);
            throw convertHibernateAccessException(ex);
        }
    }
 
    @SuppressWarnings("unchecked")
    public List findByExample(final Object example) {
        try {
            final Criteria c = s.createCriteria(objectClass);
            c.add(Example.create(example).enableLike(MatchMode.ANYWHERE).ignoreCase().setPropertySelector(this));
            addOrderToCriteria(c);
            addPropertiedToCriteria(c, example);
            return c.list();
        } catch (final HibernateException ex) {
            TOBaseHibernateDao.logger.error(ex);
            throw convertHibernateAccessException(ex);
        }
    }
 
    protected void addPropertiedToCriteria(final Criteria c, final Object example) {
    }
 
    @SuppressWarnings("unchecked")
    public List findByExample(final Object example, final int first, final int max) {
        try {
            final Criteria c = s.createCriteria(objectClass);
            c.add(Example.create(example).enableLike(MatchMode.ANYWHERE).ignoreCase().setPropertySelector(this));
            addPropertiedToCriteria(c, example);
            addOrderToCriteria(c);
            if (first != 0) {
                c.setFirstResult(first);
            }
            if (max != 0) {
                c.setMaxResults(max);
            }
            return c.list();
        } catch (final HibernateException ex) {
            TOBaseHibernateDao.logger.error(ex);
            throw convertHibernateAccessException(ex);
        }
    }
 
    @SuppressWarnings("unchecked")
    public List listAll(final int first, final int max) {
        try {
            final Criteria c = s.createCriteria(objectClass);
            addOrderToCriteria(c);
            if (first != 0) {
                c.setFirstResult(first);
            }
            if (max != 0) {
                c.setMaxResults(max);
            }
            return c.list();
        } catch (final HibernateException ex) {
            TOBaseHibernateDao.logger.error(ex);
            throw convertHibernateAccessException(ex);
        }
    }
 
    protected void addOrderToCriteria(Criteria c) {
    }
 
    public boolean include(Object propertyValue, String propertyName, Type type) {
        if ((propertyValue != null) && (propertyValue instanceof String)) {
            return !"".equals(((String) propertyValue).trim());
        }
        return propertyValue != null;
    }
 
   
}