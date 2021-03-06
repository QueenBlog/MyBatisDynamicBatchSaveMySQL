package com.queen.mybatis.mapper;

import java.util.List;

import com.queen.mybatis.bean.Emp;
/**
 * @since 2017-08-12
 * @author queen 
 * 定义一个EmpMapper接口
 *
 */
public interface EmpMapper {
	
	/**
	 * 批量插入数据  本地修改一份
	 * @param empList
	 */
	public void batchSave(List<Emp> empList);
}
