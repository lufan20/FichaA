/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celso.fichaa.model.dao;

import java.io.Serializable;
import java.util.List;

public interface TOBaseDao<T, PK extends Serializable> {
    public Class getObjectClass();
	public T save(T object);
	public T load(PK primaryKey);
    public T get(PK primaryKey);
	public List listAll();
	public List findByExample(final T example);
	public T findOneByExample(final T example);
	public List listAll(final int first,final int max);
	public int listAllPageCount();
	public List findByExample(final T example,final int first,final int max);
	public int findByExamplePageCount(final T example);
    public void update(T object);
    public void delete(T object);
    public void rebind(T object);
}