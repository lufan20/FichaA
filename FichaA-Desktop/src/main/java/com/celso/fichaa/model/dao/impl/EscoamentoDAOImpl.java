package com.celso.fichaa.model.dao.impl;



import com.celso.fichaa.model.Escoamento;
import com.celso.fichaa.model.dao.EscoamentoDAO;
import com.celso.fichaa.model.dao.TOBaseHibernateDao;



public class EscoamentoDAOImpl extends TOBaseHibernateDao implements EscoamentoDAO {


 public EscoamentoDAOImpl() {
super(Escoamento.class);
}

}
