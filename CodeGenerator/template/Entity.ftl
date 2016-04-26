package com.yxfang.lirun.bean;

import java.util.Date;
import lombok.Data;
/**
*@author:yxfang
*@date:${table.today}
*/
@Data
public class ${table.entityName} extends BaseEntity {

private static final long serialVersionUID = 1L;
	
<#if table.columnList?? && table.columnList?size gt 0>
	<#list table.columnList as field>
		<#if field.fieldName!='id' && field.fieldName!='createtime'>
		/**
		* ${field.columnComment}
		*/
		private ${field.typeName} ${field.fieldName};
		</#if>
	</#list>
</#if>
}
