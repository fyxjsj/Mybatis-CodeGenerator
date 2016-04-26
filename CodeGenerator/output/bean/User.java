package com.yxfang.lirun.bean;

import java.util.Date;
import lombok.Data;
/**
*@author:yxfang
*@date:2016-04-22 20:14:37
*/
@Data
public class User extends BaseEntity {

private static final long serialVersionUID = 1L;
	
		/**
		* 用户昵称
		*/
		private String username;
		/**
		* 手机号
		*/
		private String tel;
		/**
		* 电子邮件
		*/
		private String email;
		/**
		* 用户头像
		*/
		private String headerpic;
}
