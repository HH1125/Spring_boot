package com.hh.boot.controller;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hh.boot.service.IDeptService;
import com.hh.boot.vo.Dept;


@RequestMapping("dept")
@Controller
public class DeptController {
	@Resource
	private IDeptService deptService;
	@Resource
	private MessageSource messageSource;
	
	
	@RequestMapping("list")
	@ResponseBody
	public List<Dept> list(Model model){
		System.err.println(this.messageSource.getMessage("admin", new Object[]{"管理员"},Locale.getDefault()));
		return this.deptService.list();
	}
}
