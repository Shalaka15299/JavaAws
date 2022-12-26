package com.training.kindle.dao;

import java.util.List;

public interface IDao<T> {

	List<T> findAll();
	T findOne(int id);
	boolean findOneAndDelete(int id);
	boolean findOneAndUpdate(int id,T t);
	boolean createNew(T t);
}
