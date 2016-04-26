<?xml version="1.0" encoding="UTF-8" ?>  
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.yxfang.lirun.dao.${table.entityName}Dao">
	<!--插入-->
	<insert id="insert" parameterType="com.yxfang.lirun.bean.${table.entityName}">
		INSERT INTO ${table.tableName}(
	<#if table.columnList?? && table.columnList?size gt 0>
		<#list table.columnList as field>
		<#if field.fieldNameFullUpcase!='ID' && field.fieldNameFullUpcase!='CREATETIME'>
		${field.fieldNameFullUpcase}<#if field_index= table.columnList?size-2><#else>,</#if>
		</#if>
		</#list>
		)
		VALUES (
		<#list table.columnList as field>
		<#if field.fieldName!='id'  && field.fieldName!='createtime'>
		${"#{"+field.fieldName+"}"}<#if field_index= table.columnList?size-2><#else>,</#if>
		</#if>
		</#list>
		)
	</#if>
	</insert>
	
	<!--更新-->
	<update id="update" parameterType="com.yxfang.lirun.bean.${table.entityName}">
		UPDATE ${table.tableName}
		<set>
		<#if table.columnList?? && table.columnList?size gt 0>
		<#list table.columnList as field>
		<#if field.fieldName!='id'  && field.fieldName!='createtime'>
			<if test="${field.fieldName}!=null">
				 ${field.fieldNameFullUpcase}=${"#{"+field.fieldName+"}"}<#if field_index= table.columnList?size-2><#else>,</#if>
			</if>
		</#if>
		</#list>	
		</#if>
		</set>
		WHERE ID =${"#"}{id}
	</update>

	<!-- 删除信息 -->
	<delete id="delete" parameterType="integer">
		DELETE FROM ${table.tableName} WHERE
		ID = ${"#"}{id}
	</delete>

	<!-- 查询字段 -->
	<sql id="selectFieldSQL">
		SELECT 
		<#if table.columnList?? && table.columnList?size gt 0>
		<#list table.columnList as field>
			${field.fieldNameFullUpcase} ${field.fieldName}<#if field_index= table.columnList?size-1><#else>,</#if>
		</#list>
		</#if>
	</sql>

	<select id="getById" parameterType="integer"
		resultType="com.yxfang.lirun.bean.${table.entityName}">
		SELECT * FROM ${table.tableName} WHERE
		ID = ${"#"}{id}
	</select>

	<!-- 查询 -->
	<select id="find" parameterType="${table.entityName}"
		resultType="com.yxfang.lirun.bean.${table.entityName}">
		<include refid="selectFieldSQL" />
		FROM
		${table.tableName}
		<where>
			1=1
		<#if table.columnList?? && table.columnList?size gt 0>
		<#list table.columnList as field>
		<#if field.fieldName!='id'  && field.fieldName!='createtime'>
			<if test="${field.fieldName}!=null">
			  AND ${field.fieldNameFullUpcase}=${"#{"+field.fieldName+"}"}<#if field_index= table.columnList?size-2><#else>,</#if>
			</if>
		</#if>
		</#list>	
		</#if>
		</where>
	</select>

	<!-- 分页查询（条件） -->
	<sql id="page_condition">
		<where>
			1=1
			<#if table.columnList?? && table.columnList?size gt 0>
		<#list table.columnList as field>
		<#if field.fieldName!='id'  && field.fieldName!='createtime'>
			<if test="${field.fieldName}!=null">
			  AND ${field.fieldNameFullUpcase}=${"#{"+field.fieldName+"}"}<#if field_index= table.columnList?size-2><#else>,</#if>
			</if>
		</#if>
		</#list>	
		</#if>
		</where>
	</sql>

	<!-- 查询字段 -->
	<sql id="pageFieldSQL">
		limit ${"#"}{startIndex},${"#"}{pageSize}
	</sql>

	<!-- 分页计数 -->
	<select id="pageList" parameterType="map"
		resultType="com.yxfang.lirun.bean.${table.entityName}">
		<include refid="selectFieldSQL" />
		FROM
		${table.tableName}
		<include refid="page_condition" />
		<include refid="pageFieldSQL" />
	</select>

	<!-- 分页计数 -->
	<select id="pageCount" parameterType="map" resultType="int">
		SELECT count(*)
		  FROM ${table.tableName}
		<include refid="page_condition" />
	</select>
</mapper>
