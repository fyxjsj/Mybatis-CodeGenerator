package com.yxfang.lirun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxfang.lirun.dao.RecordDao;
import com.yxfang.lirun.bean.Page;
import com.yxfang.lirun.bean.PageRequest;
import com.yxfang.lirun.bean.Record;
import com.yxfang.lirun.service.RecordService;

/**
*@author:yxfang
*@date:2016-04-22 20:14:37
*/
@Service("recordService")
public class RecordServiceImpl extends BaseServiceImpl<Record> implements RecordService {
	@Resource
	private RecordDao recordDao;
	
	@Override
	public List<Record> find(Record record){
		return recordDao.find(record);
	}

	@Override
	public void insert(Record record) {
		recordDao.insert(record);
	}

	@Override
	public void delete(Object id) {
		recordDao.delete(id);
	}

	@Override
	public void update(Record record) {
		recordDao.update(record);
	}

	@Override
	public Record getById(Object id) {
		return recordDao.getById(id);
	}


	@Override
	public Integer pageCount(PageRequest<Record> pageRequest) {
		return recordDao.pageCount(pageRequest);
	}

	@Override
	public Page<Record> pageResult(PageRequest<Record> pageRequest) {
		return recordDao.pageResult(pageRequest);
	}
}
