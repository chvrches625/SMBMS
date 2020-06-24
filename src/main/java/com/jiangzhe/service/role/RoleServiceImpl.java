package com.jiangzhe.service.role;

import java.sql.Connection;
import java.util.List;

import com.jiangzhe.dao.BaseDao;
import com.jiangzhe.dao.role.RoleDao;
import com.jiangzhe.dao.role.RoleDaoImpl;
import com.jiangzhe.pojo.Role;


public class RoleServiceImpl implements RoleService{
	
	private RoleDao roleDao;
	
	public RoleServiceImpl(){
		roleDao = new RoleDaoImpl();
	}
	
	@Override
	public List<Role> getRoleList() {
		Connection connection = null;
		List<Role> roleList = null;
		try {
			connection = BaseDao.getConnection();
			roleList = roleDao.getRoleList(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeResource(connection, null, null);
		}
		return roleList;
	}
	
}