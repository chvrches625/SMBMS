package com.jiangzhe.dao.user;

import com.jiangzhe.dao.BaseDao;
import com.jiangzhe.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public User getLoginUser(Connection connection, String userCode) throws SQLException;

    //修改当前用户密码
    public int updatePwd(Connection connection, int id, String password) throws SQLException, Exception;

    //通过userId删除user
    int deleteUserById(Connection connection, Integer delId) throws Exception;

    //通过userId获取user
    User getUserById(Connection connection, String id) throws Exception;

    //修改用户信息
    int modify(Connection connection, User user) throws Exception;

    //查询用户总数
    public int getUserCount(Connection connection,String username ,int userRole)throws SQLException, Exception;

    //增加用户信息
    int add(Connection connection, User user) throws Exception;

    //通过条件查询-userList
    public List<User> getUserList(Connection connection, String userName, int userRole, int currentPageNo, int pageSize)throws Exception;

}
