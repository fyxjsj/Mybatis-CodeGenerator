package com.yxfang.lirun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxfang.lirun.dao.UserGroupCoinDao;
import com.yxfang.lirun.bean.Page;
import com.yxfang.lirun.bean.PageRequest;
import com.yxfang.lirun.bean.UserGroupCoin;
import com.yxfang.lirun.service.UserGroupCoinService;

/**
*@author:yxfang
*@date:2016-04-22 20:14:38
*/
@Service("userGroupCoinService")
public class UserGroupCoinServiceImpl extends BaseServiceImpl<UserGroupCoin> implements UserGroupCoinService {
	@Resource
	private UserGroupCoinDao userGroupCoinDao;
	
	@Override
	public List<UserGroupCoin> find(UserGroupCoin userGroupCoin){
		return userGroupCoinDao.find(userGroupCoin);
	}

	@Override
	public void insert(UserGroupCoin userGroupCoin) {
		userGroupCoinDao.insert(userGroupCoin);
	}

	@Override
	public void delete(Object id) {
		userGroupCoinDao.delete(id);
	}

	@Override
	public void update(UserGroupCoin userGroupCoin) {
		userGroupCoinDao.update(userGroupCoin);
	}

	@Override
	public UserGroupCoin getById(Object id) {
		return userGroupCoinDao.getById(id);
	}


	@Override
	public Integer pageCount(PageRequest<UserGroupCoin> pageRequest) {
		return userGroupCoinDao.pageCount(pageRequest);
	}

	@Override
	public Page<UserGroupCoin> pageResult(PageRequest<UserGroupCoin> pageRequest) {
		return userGroupCoinDao.pageResult(pageRequest);
	}
}
