package com.celso.fichaa.model.dao.impl;



import com.celso.fichaa.model.Localizacao;
import com.celso.fichaa.model.dao.LocalizacaoDAO;
import com.celso.fichaa.model.dao.TOBaseHibernateDao;



public class LocalizacaoDAOImpl extends TOBaseHibernateDao implements LocalizacaoDAO {


 public LocalizacaoDAOImpl() {
super(Localizacao.class);
}

}
