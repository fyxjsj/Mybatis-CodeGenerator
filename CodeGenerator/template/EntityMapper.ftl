package ${packageName}.dao;

import ${packageName}.bean.${table.entityName};
import java.util.List;
import java.util.Map;

/**
*@author:yxfang
*@date:${table.today}
*/
public interface ${table.entityName}Mapper{
	/**
     * 保存
     * @param ${table.instantName}
     */
	public void insert(${table.entityName} ${table.instantName});
	/**
     * 更新
     * @param ${table.instantName}
     */
    public void update(${table.entityName} ${table.instantName});
	/**
     * 根据id获取实体
     * @param id
     * @return
     */
    public ${table.entityName} getById(${table.columnList[0].typeName} id);
	/**
     * 删除
     * @param id
     */
    public void delete(${table.columnList[0].typeName} id);
	/**
     * 条件查询
     * @param ${table.instantName}
     * @return
     */
    public List<${table.entityName}> find(${table.entityName} ${table.instantName});
	/**
     * 分页计数
     * @param map
     * @return
     */
    public int pageCount(Map map);
	/**
     * 分页
     * @param map
     * @return
     */
    public List<${table.entityName}> pageList(Map map);
}
