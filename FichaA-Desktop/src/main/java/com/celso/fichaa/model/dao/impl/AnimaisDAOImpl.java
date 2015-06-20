/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celso.fichaa.model.dao.impl;

import com.celso.fichaa.model.Animais;
import com.celso.fichaa.model.dao.AnimaisDAO;
import com.celso.fichaa.model.dao.TOBaseHibernateDao;

/**
 *
 * @author Celso Bomfim
 */
public class AnimaisDAOImpl extends TOBaseHibernateDao implements AnimaisDAO{

    public AnimaisDAOImpl(Class objectClass) {
        super(Animais.class);
    }
    
}
