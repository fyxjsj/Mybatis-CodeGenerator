/**
 * 
 */
package com.yxfang.lirun.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * @author yxfang
 * 
 */
public class PageRequest<T extends BaseEntity> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8066256312384413816L;

	/**
	 * 正序排列
	 */
	public static final String ORDER_ASC = "ASC";
	/**
	 * 倒序排列
	 */
	public static final String ORDER_DESC = "DESC";

	/**
	 * 每页记录条数
	 */
	public Integer pageSize;
	/**
	 * 排序方式
	 */
	public String order;
	/**
	 * 排序字段
	 */
	public String sort;
	/**
	 * 开始记录行
	 */
	public Integer startIndex;
	/**
	 * 实体类
	 */
	public String clazz;
	/**
	 * 查询参数
	 */
	public Map<String, Object> params;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public Map<String, Object> getParams() {
		params.put("startIndex", this.getStartIndex());
		params.put("pageSize", this.getPageSize());
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		if (startIndex > 1) {
			startIndex -= 1;
		}
		this.startIndex = startIndex;
	}

}
