package org.java.dao;

import org.apache.ibatis.annotations.Select;
import org.java.entity.Dept;

import java.util.List;

public interface DeptDao {
    @Select("select * from dept where dept_no=#{id}")
    Dept findById(Long id);
    @Select("select * from dept")
    List<Dept> findAll();
}
