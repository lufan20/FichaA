package com.celso.fichaa.model.dao.impl;



import com.celso.fichaa.model.Paredes;
import com.celso.fichaa.model.dao.ParedesDAO;
import com.celso.fichaa.model.dao.TOBaseHibernateDao;



public class ParedesDAOImpl extends TOBaseHibernateDao implements ParedesDAO {


 public ParedesDAOImpl() {
super(Paredes.class);
}

}
