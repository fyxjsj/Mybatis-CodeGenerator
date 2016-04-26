package com.yxfang.lirun.bean;

import java.util.Date;
import lombok.Data;
/**
*@author:yxfang
*@date:2016-04-22 20:14:37
*/
@Data
public class Record extends BaseEntity {

private static final long serialVersionUID = 1L;
	
		/**
		* 用户ID
		*/
		private Integer userid;
		/**
		* 打卡图片
		*/
		private String pic;
		/**
		* 打卡备注
		*/
		private String ps;
		/**
		* 组ID
		*/
		private Integer groupid;
		/**
		* 打卡时间
		*/
		private Date time;
		/**
		* 打卡状态
		*/
		private Integer state;
}
