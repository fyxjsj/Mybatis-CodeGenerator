package com.yxfang.lirun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxfang.lirun.dao.UserDao;
import com.yxfang.lirun.bean.Page;
import com.yxfang.lirun.bean.PageRequest;
import com.yxfang.lirun.bean.User;
import com.yxfang.lirun.service.UserService;

/**
*@author:yxfang
*@date:2016-04-22 20:14:37
*/
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	@Resource
	private UserDao userDao;
	
	@Override
	public List<User> find(User user){
		return userDao.find(user);
	}

	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

	@Override
	public void delete(Object id) {
		userDao.delete(id);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User getById(Object id) {
		return userDao.getById(id);
	}


	@Override
	public Integer pageCount(PageRequest<User> pageRequest) {
		return userDao.pageCount(pageRequest);
	}

	@Override
	public Page<User> pageResult(PageRequest<User> pageRequest) {
		return userDao.pageResult(pageRequest);
	}
}
