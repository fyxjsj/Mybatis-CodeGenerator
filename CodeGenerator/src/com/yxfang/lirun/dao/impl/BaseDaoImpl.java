package com.yxfang.lirun.dao.impl;

import java.util.List; 

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.yxfang.lirun.bean.BaseEntity;
import com.yxfang.lirun.bean.Page;
import com.yxfang.lirun.bean.PageRequest;

/**
 * @author yxfang
 * @date 2014-7-10 下午04:06:23
 */
public class BaseDaoImpl<T extends BaseEntity> extends SqlSessionDaoSupport {
	/**
	 * 点
	 */
	private final static String DOT = ".";
	
/*	@Resource
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate)
    {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }
*/
	/**
	 * 获取当前方法名称
	 * 
	 * @return
	 */
	protected String getMethodName() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}

	/**
	 * 获取命名空间
	 * 
	 * @param
	 * @return
	 */
	protected String getNameSpace() {
		return getClass().getCanonicalName() + DOT;
	}

	/**
	 * 插入
	 * 
	 * @param entity
	 */
	public void insert(T entity) {
		getSqlSession().insert(getNameSpace() + getMethodName(), entity);
	}

	/**
	 * 条件查询
	 * 
	 * @param entity
	 */
	public List<T> find(T entity) {
		return getSqlSession().selectList(getNameSpace() + getMethodName(), entity);
	}

	/**
	 * 删除
	 */
	public void delete(Object id) {
		getSqlSession().delete(getNameSpace() + getMethodName(), id);
	}

	/**
	 * 更新
	 * 
	 * @param entity
	 * @return
	 */
	public void update(T entity) {
		getSqlSession().update(getNameSpace() + getMethodName(), entity);
	}

	/**
	 * 根据id获取对象
	 * 
	 * @param
	 * @return
	 */
	public T getById(Object id) {
		return getSqlSession().selectOne(getNameSpace() + getMethodName(), id);
	}

	/**
	 * 根据条件查询总记录条数
	 * 
	 * @param pageRequest
	 * @return
	 */
	public Integer pageCount(PageRequest<T> pageRequest) {
		return (Integer) getSqlSession().selectOne(getNameSpace() + getMethodName(), pageRequest.getParams());
	}

	/**
	 * 获取分页数据
	 * 
	 * @return
	 */
	public Page<T> pageResult(PageRequest<T> pageRequest) {
		int count = this.pageCount(pageRequest);
		List<T> result = getSqlSession().selectList(getNameSpace() + getMethodName(), pageRequest.getParams());
		Page<T> page = new Page<T>(result, count);
		return page;
	}
}
