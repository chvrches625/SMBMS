package com.jiangzhe.dao.role;

import com.jiangzhe.dao.BaseDao;
import com.jiangzhe.pojo.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoleDaoImpl implements RoleDao {

	@Override
	public List<Role> getRoleList(Connection connection) throws Exception {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Role> roleList = new ArrayList<Role>();
		if (connection != null) {
			String sql = "select * from smbms_role";
			Object[] params = {};
			rs = BaseDao.execute(connection, sql, params,rs,pstm );
			while (rs.next()) {
				Role _role = new Role();
				_role.setId(rs.getInt("id"));
				_role.setRoleCode(rs.getString("roleCode"));
				_role.setRoleName(rs.getString("roleName"));
				roleList.add(_role);
			}
			BaseDao.closeResource(null, pstm, rs);
		}

		return roleList;
	}
}
