/**
 * 
 */
package com.yxfang.lirun.bean;

/**
 * @author yxfang
 * 
 */
public class ColumnEntity {
	// 类型
	private String typeName;
	// 第一个字母小写，其他首字母大写：xxxXxxXxx
	private String fieldName;
	// 首字母大写：XxxXxx
	private String fieldNameUpcase;
	// 全大写格式：XXX_XXX
	private String fieldNameFullUpcase;
	// 评论
	private String columnComment;

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldNameUpcase() {
		return fieldNameUpcase;
	}

	public void setFieldNameUpcase(String fieldNameUpcase) {
		this.fieldNameUpcase = fieldNameUpcase;
	}

	public String getFieldNameFullUpcase() {
		return fieldNameFullUpcase;
	}

	public void setFieldNameFullUpcase(String fieldNameFullUpcase) {
		this.fieldNameFullUpcase = fieldNameFullUpcase;
	}

}
