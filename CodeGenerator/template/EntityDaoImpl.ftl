package com.yxfang.lirun.dao.impl;

import org.springframework.stereotype.Repository;

import com.yxfang.lirun.dao.${table.entityName}Dao;
import com.yxfang.lirun.bean.${table.entityName};

/**
*@author:yxfang
*@date:${table.today}
*/
@Repository("${table.instantName}Dao")
public class ${table.entityName}DaoImpl extends BaseDaoImpl<${table.entityName}> implements ${table.entityName}Dao {

}
