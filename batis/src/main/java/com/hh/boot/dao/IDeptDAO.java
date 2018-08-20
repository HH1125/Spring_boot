package com.hh.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hh.boot.vo.Dept;
@Mapper
public interface IDeptDAO {
	public List<Dept> findAll();
}
