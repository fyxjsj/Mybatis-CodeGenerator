package com.yxfang.lirun.dao.impl;

import org.springframework.stereotype.Repository;

import com.yxfang.lirun.dao.UserDao;
import com.yxfang.lirun.bean.User;

/**
*@author:yxfang
*@date:2016-04-22 20:14:37
*/
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
