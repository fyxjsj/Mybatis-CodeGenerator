/**
 * 
 */
package com.yxfang.lirun.codeGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * @author yxfang
 * 
 */
public class FreemakerUtil {
	private static Configuration cfg;

	private static final String JAVA_SUFFIX = ".java";
	private static final String XML_SUFFIX = ".xml";
	private static final String FTL_SUFFIX = ".ftl";

	public static void generateFile(Map<String, Object> params) {
		process(params);
	}

	/**
	 * 初始化模板参数
	 */
	public static void process(Map<String, Object> params) {
		try {
			cfg = new Configuration();
			cfg.setDirectoryForTemplateLoading(new File(System.getProperty("user.dir") + "/template"));
			String tableName = (String) params.get("tableName");
			// 生成实体
			Template t = cfg.getTemplate("Entity.ftl");
			outToFile(t, params, "/bean/" + tableName + JAVA_SUFFIX);
			// Dao
			Template t1 = cfg.getTemplate("EntityDao.ftl");
			outToFile(t1, params, "/dao/" + tableName + "Dao" + JAVA_SUFFIX);
			// DaoImpl
			Template t2 = cfg.getTemplate("EntityDaoImpl.ftl");
			outToFile(t2, params, "/dao/impl/" + tableName + "DaoImpl" + JAVA_SUFFIX);
			// Service
			Template t3 = cfg.getTemplate("EntityService.ftl");
			outToFile(t3, params, "/service/" + tableName + "Service" + JAVA_SUFFIX);
			// ServiceImpl
			Template t4 = cfg.getTemplate("EntityServiceImpl.ftl");
			outToFile(t4, params, "/service/impl/" + tableName + "ServiceImpl" + JAVA_SUFFIX);
			// Mapper
			Template t5 = cfg.getTemplate("EntitySqlMapper.ftl");
			outToFile(t5, params, "/mapper/" + tableName + "Mapper" + XML_SUFFIX);
			// Controller
			Template t6 = cfg.getTemplate("EntityController.ftl");
			outToFile(t6, params, "/controller/" + tableName + "Controller" + JAVA_SUFFIX);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	// 输出到文件
	public static void outToFile(Template t, Map<String, Object> params, String fileName) {
		try {
			t.process(params, new OutputStreamWriter(
					new FileOutputStream(new File(System.getProperty("user.dir") + "/output/" + fileName)), "utf-8"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static {
		File controller = new File(System.getProperty("user.dir") + "/output/controller");
		File daoImpl = new File(System.getProperty("user.dir") + "/output/dao/impl");
		
		File bean = new File(System.getProperty("user.dir") + "/output/bean");
		File serviceImpl = new File(System.getProperty("user.dir") + "/output/service/impl");
		File mapper = new File(System.getProperty("user.dir") + "/output/mapper");
		
		if(!controller.exists()) {
			controller.mkdirs();
		}
		if(!daoImpl.exists()) {
			daoImpl.mkdirs();
		}
		if(!bean.exists()) {
			bean.mkdirs();
		}
		if(!serviceImpl.exists()) {
			serviceImpl.mkdirs();
		}
		if(!mapper.exists()) {
			mapper.mkdirs();
		}
	}
}
