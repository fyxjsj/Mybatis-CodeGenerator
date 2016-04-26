/**
 * 
 */
package com.yxfang.lirun.bean;

import java.util.List;

/**
 * @author yxfang
 * @date 2014-7-15 上午10:02:48
 */
public class Page<T extends BaseEntity> implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2737990890987058021L;
	/**
	 * 返回结果
	 */
	public List<T> result;
	/**
	 * 记录总条数
	 */
	public Integer count;
	/**
	 * 当前页数
	 */
	public Integer currPage;
	/**
	 * 总页数
	 */
	public Integer pageCount;
	/**
	 * 每页记录数
	 */
	public Integer pageSize;

	/**
	 * 
	 * @param result
	 *            结果集
	 * @param count
	 *            总数
	 */
	public Page(List<T> result, Integer count) {
		this.result = result;
		this.count = count;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCurrPage() {
		return currPage;
	}

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	public Integer getPageCount() {
		if (count == 0) {
			pageCount = 0;
		} else {
			pageCount = count % pageSize == 0 ? (count / pageSize) : (count
					/ pageSize + 1);
		}
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

}
