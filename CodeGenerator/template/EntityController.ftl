package com.yxfang.lirun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yxfang.lirun.service.${table.entityName}Service;

/**
*@author:yxfang
*@date:${table.today}
*/
@Controller
@RequestMapping("/manage/${table.instantName}")
public class ${table.entityName}Controller {

	@Resource
	private ${table.entityName}Service ${table.instantName}Service;
}
