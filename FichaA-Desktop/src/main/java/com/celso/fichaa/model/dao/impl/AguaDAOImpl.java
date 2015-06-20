/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celso.fichaa.model.dao.impl;

import com.celso.fichaa.model.Agua;
import com.celso.fichaa.model.dao.AguaDAO;
import com.celso.fichaa.model.dao.TOBaseHibernateDao;


public class AguaDAOImpl extends TOBaseHibernateDao implements AguaDAO {

    public AguaDAOImpl() {
        super(Agua.class);
    }

    
    
}
