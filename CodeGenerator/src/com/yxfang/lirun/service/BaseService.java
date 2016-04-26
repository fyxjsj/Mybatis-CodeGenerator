package com.yxfang.lirun.service;

import java.util.List;

import com.yxfang.lirun.bean.BaseEntity;
import com.yxfang.lirun.bean.Page;
import com.yxfang.lirun.bean.PageRequest;

/**
 * @author yxfang
 * @date 2014-7-10 下午04:06:23
 */
public interface BaseService<T extends BaseEntity> {
	/**
	 * 插入
	 * 
	 * @param entity
	 */
	void insert(T entity);

	/**
	 * 条件查询
	 * 
	 * @param params
	 */
	List<T> find(T entity);

	/**
	 * 删除
	 */
	void delete(Object id);

	/**
	 * 更新
	 * 
	 * @param entity
	 * @return
	 */
	public void update(T entity);

	/**
	 * 根据id获取对象
	 * 
	 * @param entity
	 * @return
	 */
	public T getById(Object id);

	/**
	 * 根据条件查询总记录条数
	 * 
	 * @param params
	 * @return
	 */
	public Integer pageCount(PageRequest<T> pageRequest);

	/**
	 * 获取分页数据
	 * 
	 * @return
	 */
	public Page<T> pageResult(PageRequest<T> pageRequest);
}
