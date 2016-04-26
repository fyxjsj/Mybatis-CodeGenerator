package com.yxfang.lirun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxfang.lirun.dao.UserGroupDao;
import com.yxfang.lirun.bean.Page;
import com.yxfang.lirun.bean.PageRequest;
import com.yxfang.lirun.bean.UserGroup;
import com.yxfang.lirun.service.UserGroupService;

/**
*@author:yxfang
*@date:2016-04-22 20:14:38
*/
@Service("userGroupService")
public class UserGroupServiceImpl extends BaseServiceImpl<UserGroup> implements UserGroupService {
	@Resource
	private UserGroupDao userGroupDao;
	
	@Override
	public List<UserGroup> find(UserGroup userGroup){
		return userGroupDao.find(userGroup);
	}

	@Override
	public void insert(UserGroup userGroup) {
		userGroupDao.insert(userGroup);
	}

	@Override
	public void delete(Object id) {
		userGroupDao.delete(id);
	}

	@Override
	public void update(UserGroup userGroup) {
		userGroupDao.update(userGroup);
	}

	@Override
	public UserGroup getById(Object id) {
		return userGroupDao.getById(id);
	}


	@Override
	public Integer pageCount(PageRequest<UserGroup> pageRequest) {
		return userGroupDao.pageCount(pageRequest);
	}

	@Override
	public Page<UserGroup> pageResult(PageRequest<UserGroup> pageRequest) {
		return userGroupDao.pageResult(pageRequest);
	}
}
