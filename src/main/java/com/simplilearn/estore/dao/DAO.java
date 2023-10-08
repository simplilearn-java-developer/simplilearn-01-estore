package com.simplilearn.estore.dao;

import java.util.List;

public interface DAO<T> {

     T get(long id);
     List<T> getAll();
     void save(T object);
     void update(T object);
     void delete(long id);
}
