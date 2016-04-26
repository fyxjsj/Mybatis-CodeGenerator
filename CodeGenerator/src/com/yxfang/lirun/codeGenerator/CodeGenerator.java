/**
 * 
 */
package com.yxfang.lirun.codeGenerator;

import com.yxfang.lirun.bean.ColumnEntity;
import com.yxfang.lirun.bean.DBEntity;
import com.yxfang.lirun.bean.TableEntity;
import com.yxfang.lirun.context.CodeContext;
import com.yxfang.lirun.enums.DataTypeHandler;
import com.yxfang.lirun.service.DBEntityService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * mybatis 自动生成
 */
public class CodeGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"SpringContext.xml"});
			BeanFactory factory=(BeanFactory) appContext;
			DBEntityService dBEntityService=(DBEntityService) factory.getBean(DBEntityService.class);
			CodeContext codeContext=(CodeContext) factory.getBean(CodeContext.class);
			String[] tableNames = codeContext.getTableNames().split(",");
			String packageName = codeContext.getPackageName();
			for (String tableName : tableNames) {
				DBEntity entity = new DBEntity();
				entity.setTableName(tableName);
				entity.setTableSchema(codeContext.getTableSchema());
				List<ColumnEntity> columnList = new ArrayList<ColumnEntity>();
				List<DBEntity> eL = dBEntityService.find(entity);
				for (DBEntity en : eL) {
					ColumnEntity column = new ColumnEntity();
					System.out.println(en.getField() + "====" + en.getType());
					String[] fieldStrs = en.getField().split("_");
					StringBuilder upcaseFieldStrs = new StringBuilder();
					for (String field : fieldStrs) {
						if (field != null) {
							String lastStr = field.substring(1).toLowerCase();
							upcaseFieldStrs.append(field.substring(0, 1)).append(lastStr);
						}
					}
					System.out.println("upcase====" + upcaseFieldStrs);
					System.out.println("lowcase====" + upcaseFieldStrs.substring(0, 1).toLowerCase() + upcaseFieldStrs.substring(1));
					column.setFieldName(upcaseFieldStrs.substring(0, 1).toLowerCase() + upcaseFieldStrs.substring(1));
					column.setFieldNameFullUpcase(en.getField());
					column.setFieldNameUpcase(upcaseFieldStrs.toString());
					column.setTypeName(DataTypeHandler.getJavaType(en.getType()));
					column.setColumnComment(en.getColumnComment());
					columnList.add(column);
				}
				TableEntity table = new TableEntity();
				table.setColumnList(columnList);
				table.setTableName(tableName);
				tableName = upcaseStr(tableName);
				table.setEntityName(tableName);
				table.setToday(getToday());
				table.setInstantName(tableName.substring(0, 1).toLowerCase() + tableName.substring(1));
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("table", table);
				params.put("tableName", tableName);
				params.put("packageName", packageName);
				FreemakerUtil.generateFile(params);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 字符串根据"_"截断，转大小写，格式：XxxXxx
	 * 
	 * @param strs
	 * @return
	 */
	public static String upcaseStr(String strs) {
		String[] fieldStrs = strs.split("_");
		StringBuilder upcaseFieldStrs = new StringBuilder();
		for (String field : fieldStrs) {
			if (field != null) {
				String lastStr = field.substring(1).toLowerCase();
				upcaseFieldStrs.append(field.substring(0, 1)).append(lastStr);
			}
		}
		return upcaseFieldStrs.toString();
	}

	/**
	 * 获取日期
	 * 
	 * @return
	 */
	public static String getToday() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}

}
