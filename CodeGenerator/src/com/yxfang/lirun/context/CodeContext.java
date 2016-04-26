/**

 * 
 */
package com.yxfang.lirun.context;

import java.io.Serializable;

/**
 * @author Administrator
 * 
 */
public class CodeContext implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tableNames;
	private String packageName;
	private String tableSchema;

	public String getTableNames() {
		return tableNames;
	}

	public void setTableNames(String tableNames) {
		this.tableNames = tableNames;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

}
