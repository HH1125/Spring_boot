package com.hh.boot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hh.boot.dao.IDeptDAO;
import com.hh.boot.service.IDeptService;
import com.hh.boot.vo.Dept;
@Service
public class DeptServiceImpl implements IDeptService {

	@Resource
	private IDeptDAO deptDAO;
	
	@Override
	public List<Dept> list() {
		return this.deptDAO.findAll();
	}

}
