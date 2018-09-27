package xyz.cglzwz.mybatis.demo1.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @使用mybatis-conf.xml
 * @通过SqlSessionFactoryBuilder来构建SqlSessionFactory
 * @SqlSessionFactory应是单例模式，此处省略了单例锁代码
 * 
 * @author chgl16
 * @Date 2018.9.26
 */
public class SqlSessionFactoryUtil {
	
	/** 声明为static */
	public static SqlSession openSqlSession() throws Exception {
		String sqlConfigXML = "mybatis-config.xml";
		// 将资源文件输入到流
		InputStream inputStream = Resources.getResourceAsStream(sqlConfigXML);
		// SqlSessionFactoryBuilder对象调用build方法读取输入流
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
		return build.openSession();
	}
}
