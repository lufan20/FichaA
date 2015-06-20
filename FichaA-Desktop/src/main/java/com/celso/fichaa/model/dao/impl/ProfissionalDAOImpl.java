package com.celso.fichaa.model.dao.impl;



import com.celso.fichaa.model.Profissional;
import com.celso.fichaa.model.dao.ProfissionalDAO;
import com.celso.fichaa.model.dao.TOBaseHibernateDao;



public class ProfissionalDAOImpl extends TOBaseHibernateDao implements ProfissionalDAO {


 public ProfissionalDAOImpl() {
super(Profissional.class);
}

}
