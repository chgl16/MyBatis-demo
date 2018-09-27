package xyz.cglzwz.mybatis.demo1.main;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import xyz.cglzwz.mybatis.demo1.pojo.Role;
import xyz.cglzwz.mybatis.demo1.mapper.RoleMapper;
import xyz.cglzwz.mybatis.demo1.util.SqlSessionFactoryUtil;

/**
 * @主函数
 * 
 * @author chgl16
 * @Date 2018.9.26
 */

public class Main {

	public static void main(String[] args) {
		// 使用log4j打印日志
		Logger log = Logger.getLogger(Main.class);
		// 获取SqlSession对象
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.openSqlSession();
			// 通过映射器(接口和mapper.xml文件组合)方式发送SQL
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			// 操作打印
			Role role1 = roleMapper.getRole(2L);
			log.info(role1.getRoleName());
			
			Role role2 = new Role();
			role2.setRoleName("小绿");
			role2.setNote("绿色出行");
			int flag = roleMapper.insertRole(role2);
			log.info(flag);
			// 增删改需要提交处理
			sqlSession.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			// 在finally里面关闭资源，终结SqlSession对象的生命周期
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		

	}

}
