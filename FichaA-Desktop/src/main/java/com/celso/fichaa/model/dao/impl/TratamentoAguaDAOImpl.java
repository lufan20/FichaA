package com.celso.fichaa.model.dao.impl;



import com.celso.fichaa.model.TratamentoAgua;
import com.celso.fichaa.model.dao.TratamentoAguaDAO;
import com.celso.fichaa.model.dao.TOBaseHibernateDao;



public class TratamentoAguaDAOImpl extends TOBaseHibernateDao implements TratamentoAguaDAO {


 public TratamentoAguaDAOImpl() {
super(TratamentoAgua.class);
}

}
