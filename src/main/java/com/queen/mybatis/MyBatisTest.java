package com.queen.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.queen.mybatis.bean.Emp;
import com.queen.mybatis.mapper.EmpMapper;

/**
 * @since 2017-08-12
 * @author queen 
 * 定义一个MyBatisTest测试类
 *
 */
public class MyBatisTest {
	
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void testBatchSave() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			EmpMapper mapper = openSession.getMapper(EmpMapper.class);
			List<Emp> empList = new ArrayList<Emp>();
			/*empList.add(new Emp(null,"Lucy","Lucy@sina.com",1));
			empList.add(new Emp(null,"Lily","Lily@sina.com",2));
			empList.add(new Emp(null,"Lizy","Lizy@sina.com",3));*/
			empList.add(new Emp(null,"Lucy123","Lucy123@sina.com",1));
			empList.add(new Emp(null,"Lily123","Lily123@sina.com",2));
			//empList.add(new Emp(null,"Lizy123","Lizy123@sina.com",3));
			mapper.batchSave(empList);
			//别忘了事务最后要提交
			openSession.commit();
		} finally {
			openSession.close();
		}
 
	}
	
}
