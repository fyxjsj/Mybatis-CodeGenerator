/**
 * 
 */
package com.yxfang.lirun.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yxfang
 * 
 */
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		if (createTime == null) {
			createTime = new Date();
		}
		this.createTime = createTime;
	}

}
