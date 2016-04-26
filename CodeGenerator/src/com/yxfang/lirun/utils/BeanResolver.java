/**
 * 
 */
package com.yxfang.lirun.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yxfang
 * @date 2014-1-9 下午01:21:33
 */
public class BeanResolver {
	public static Map<String, Object> beanConvertToMap(Object bean) {
		Method[] methods = bean.getClass().getMethods();
		Map<String, Object> data = new HashMap<String, Object>();
		for (Method method : methods) {
			String methodName = method.getName();
			if (methodName.startsWith("get")) {
				String methodRename = methodName.substring(3, 4).toLowerCase()
						+ methodName.substring(4);
				try {
					Object methoedValue = bean.getClass().getMethod(methodName)
							.invoke(bean);
					if (methoedValue != null) {
						data.put(methodRename, String.valueOf(methoedValue));
					}
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				}
			}
		}
		return data;
	}
}
