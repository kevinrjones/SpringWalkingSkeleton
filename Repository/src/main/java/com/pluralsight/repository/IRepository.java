package com.pluralsight.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> Entities(String query, Object[] params);
    T New();
    void Add(T entity);
    void Create(T entity);
    void Delete(T entity);
    void Save();

}
