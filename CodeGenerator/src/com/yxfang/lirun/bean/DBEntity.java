package com.yxfang.lirun.bean;

/**
 * @author yxfang
 * 
 */
public class DBEntity extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6052853494860051857L;
	private String tableName;
	private String tableSchema;
	private String columnComment;
	private String field;
	private String type;

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
