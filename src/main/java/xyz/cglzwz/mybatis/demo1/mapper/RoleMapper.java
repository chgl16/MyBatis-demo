package xyz.cglzwz.mybatis.demo1.mapper;

import java.util.List;
import xyz.cglzwz.mybatis.demo1.pojo.Role;;

/**
 * @映射器的接口类
 * 
 * @author chgl16
 * @Date 2018.9.26
 */

public interface RoleMapper {
	public int insertRole(Role role);
	public int deleteRole(Long id);
	public int updateRole(Role role);
	public Role getRole(Long id);
	public List<Role> findRoles(String roleName);
}
