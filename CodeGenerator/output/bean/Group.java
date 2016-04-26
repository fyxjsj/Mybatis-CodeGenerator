package com.yxfang.lirun.bean;

import java.util.Date;
import lombok.Data;
/**
*@author:yxfang
*@date:2016-04-22 20:14:37
*/
@Data
public class Group extends BaseEntity {

private static final long serialVersionUID = 1L;
	
		/**
		* 组名
		*/
		private String groupname;
		/**
		* 组简介
		*/
		private String intro;
}
