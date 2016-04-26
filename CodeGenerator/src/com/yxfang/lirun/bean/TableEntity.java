/**
 * 
 */
package com.yxfang.lirun.bean;

import java.util.List;

/**
 * @author yxfang
 * 
 */
public class TableEntity {
	// 全大写格式:XXX_XXX
	private String tableName;
	// 日期：yyyy-MM-dd HH:mm:dd
	private String today;
	// 实体名格式：XxxXxx
	private String entityName;
	// 实例格式：xxxXxx
	private String instantName;
	// 字段
	private List<ColumnEntity> columnList;

	public String getInstantName() {
		return instantName;
	}

	public void setInstantName(String instantName) {
		this.instantName = instantName;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public List<ColumnEntity> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<ColumnEntity> columnList) {
		this.columnList = columnList;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}
}
