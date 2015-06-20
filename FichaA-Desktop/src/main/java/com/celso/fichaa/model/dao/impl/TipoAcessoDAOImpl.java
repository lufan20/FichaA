package com.celso.fichaa.model.dao.impl;

import com.celso.fichaa.model.TipoAcesso;
import com.celso.fichaa.model.dao.TipoAcessoDAO;
import com.celso.fichaa.model.dao.TOBaseHibernateDao;

public class TipoAcessoDAOImpl extends TOBaseHibernateDao implements TipoAcessoDAO {

    public TipoAcessoDAOImpl() {
        super(TipoAcesso.class);
    }

}
