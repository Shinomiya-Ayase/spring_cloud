package org.java.service;

import org.java.entity.Dept;

import java.util.List;

public interface DeptService {
    Dept findById(Long id);
    List<Dept> findAll();
}
