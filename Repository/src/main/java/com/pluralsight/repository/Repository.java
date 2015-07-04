package com.pluralsight.repository;

import java.util.List;

public interface Repository<T> {
    List<T> Entities();
    T New();
    void Add(T entity);
    void Create(T entity);
    void Delete(T entity);
    void Save();

}
