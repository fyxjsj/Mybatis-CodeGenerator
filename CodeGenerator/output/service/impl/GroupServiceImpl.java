package com.yxfang.lirun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxfang.lirun.dao.GroupDao;
import com.yxfang.lirun.bean.Page;
import com.yxfang.lirun.bean.PageRequest;
import com.yxfang.lirun.bean.Group;
import com.yxfang.lirun.service.GroupService;

/**
*@author:yxfang
*@date:2016-04-22 20:14:37
*/
@Service("groupService")
public class GroupServiceImpl extends BaseServiceImpl<Group> implements GroupService {
	@Resource
	private GroupDao groupDao;
	
	@Override
	public List<Group> find(Group group){
		return groupDao.find(group);
	}

	@Override
	public void insert(Group group) {
		groupDao.insert(group);
	}

	@Override
	public void delete(Object id) {
		groupDao.delete(id);
	}

	@Override
	public void update(Group group) {
		groupDao.update(group);
	}

	@Override
	public Group getById(Object id) {
		return groupDao.getById(id);
	}


	@Override
	public Integer pageCount(PageRequest<Group> pageRequest) {
		return groupDao.pageCount(pageRequest);
	}

	@Override
	public Page<Group> pageResult(PageRequest<Group> pageRequest) {
		return groupDao.pageResult(pageRequest);
	}
}
