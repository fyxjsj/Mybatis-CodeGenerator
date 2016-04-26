package com.yxfang.lirun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yxfang.lirun.service.RecordService;

/**
*@author:yxfang
*@date:2016-04-22 20:14:37
*/
@Controller
@RequestMapping("/manage/record")
public class RecordController {

	@Resource
	private RecordService recordService;
}
