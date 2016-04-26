/**
 * 
 */
package com.yxfang.lirun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yxfang.lirun.bean.DBEntity;
import com.yxfang.lirun.bean.Page;
import com.yxfang.lirun.bean.PageRequest;
import com.yxfang.lirun.dao.DBEntityDao;
import com.yxfang.lirun.service.DBEntityService;

/**
 * @author yxfang
 * 
 */
@Component("dBEntityService")
public class DBEntityServiceImpl implements DBEntityService {

	@Autowired
	private DBEntityDao dBEntityDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.yxfang.lirun.service.BaseService#insert(com.yxfang.lirun.entity.BaseEntity
	 * )
	 */
	@Override
	public void insert(DBEntity entity) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.yxfang.lirun.service.BaseService#find(com.yxfang.lirun.entity.BaseEntity)
	 */
	@Override
	public List<DBEntity> find(DBEntity entity) {
		return dBEntityDao.find(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.yxfang.lirun.service.BaseService#delete(java.lang.Long)
	 */
	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.yxfang.lirun.service.BaseService#update(com.yxfang.lirun.entity.BaseEntity
	 * )
	 */
	@Override
	public void update(DBEntity entity) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.yxfang.lirun.service.BaseService#getById(java.lang.Long)
	 */
	@Override
	public DBEntity getById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer pageCount(PageRequest<DBEntity> pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<DBEntity> pageResult(PageRequest<DBEntity> pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
