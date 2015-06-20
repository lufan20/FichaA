package com.celso.fichaa.model.dao.impl;



import com.celso.fichaa.model.Endereco;
import com.celso.fichaa.model.dao.EnderecoDAO;
import com.celso.fichaa.model.dao.TOBaseHibernateDao;



public class EnderecoDAOImpl extends TOBaseHibernateDao implements EnderecoDAO {


 public EnderecoDAOImpl() {
super(Endereco.class);
}

}
