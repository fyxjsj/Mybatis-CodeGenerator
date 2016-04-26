package com.yxfang.lirun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxfang.lirun.dao.${table.entityName}Dao;
import com.yxfang.lirun.bean.Page;
import com.yxfang.lirun.bean.PageRequest;
import com.yxfang.lirun.bean.${table.entityName};
import com.yxfang.lirun.service.${table.entityName}Service;

/**
*@author:yxfang
*@date:${table.today}
*/
@Service("${table.instantName}Service")
public class ${table.entityName}ServiceImpl extends BaseServiceImpl<${table.entityName}> implements ${table.entityName}Service {
	@Resource
	private ${table.entityName}Dao ${table.instantName}Dao;
	
	@Override
	public List<${table.entityName}> find(${table.entityName} ${table.instantName}){
		return ${table.instantName}Dao.find(${table.instantName});
	}

	@Override
	public void insert(${table.entityName} ${table.instantName}) {
		${table.instantName}Dao.insert(${table.instantName});
	}

	@Override
	public void delete(Object id) {
		${table.instantName}Dao.delete(id);
	}

	@Override
	public void update(${table.entityName} ${table.instantName}) {
		${table.instantName}Dao.update(${table.instantName});
	}

	@Override
	public ${table.entityName} getById(Object id) {
		return ${table.instantName}Dao.getById(id);
	}


	@Override
	public Integer pageCount(PageRequest<${table.entityName}> pageRequest) {
		return ${table.instantName}Dao.pageCount(pageRequest);
	}

	@Override
	public Page<${table.entityName}> pageResult(PageRequest<${table.entityName}> pageRequest) {
		return ${table.instantName}Dao.pageResult(pageRequest);
	}
}
