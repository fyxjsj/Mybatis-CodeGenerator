/**
 * 
 */
package com.yxfang.lirun.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yxfang 数据库对java库映射
 */
public class DataTypeHandler {

	public static String getJavaType(String dataType) {
		Map<String, String> typeSteam = new HashMap<String, String>();
		typeSteam.put("VARCHAR", "String");
		typeSteam.put("VARCHAR2", "String");
		typeSteam.put("NVARCHAR", "String");
		typeSteam.put("TEXT", "String");
		typeSteam.put("LONGTEXT", "String");
		typeSteam.put("INT", "Integer");
		typeSteam.put("BIGINT", "Integer");
		typeSteam.put("DATETIME", "Date");
		typeSteam.put("TIMESTAMP", "Date");
		typeSteam.put("CHAR", "String");
		typeSteam.put("DOUBLE", "Double");
		return typeSteam.get(dataType);
	}
}
