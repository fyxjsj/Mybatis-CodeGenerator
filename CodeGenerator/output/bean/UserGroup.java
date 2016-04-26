package com.yxfang.lirun.bean;

import java.util.Date;
import lombok.Data;
/**
*@author:yxfang
*@date:2016-04-22 20:14:38
*/
@Data
public class UserGroup extends BaseEntity {

private static final long serialVersionUID = 1L;
	
		/**
		* 用户ID
		*/
		private Integer userid;
		/**
		* 组ID
		*/
		private Integer groupid;
}
