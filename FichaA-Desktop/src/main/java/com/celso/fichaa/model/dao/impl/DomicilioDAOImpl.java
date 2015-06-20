package com.celso.fichaa.model.dao.impl;



import com.celso.fichaa.model.Domicilio;
import com.celso.fichaa.model.dao.DomicilioDAO;
import com.celso.fichaa.model.dao.TOBaseHibernateDao;



public class DomicilioDAOImpl extends TOBaseHibernateDao implements DomicilioDAO {


 public DomicilioDAOImpl() {
super(Domicilio.class);
}

}
