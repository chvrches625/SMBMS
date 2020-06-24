package com.jiangzhe.service.user;
//import java.sql.Connection;
import com.jiangzhe.pojo.User;

import java.sql.SQLException;
import java.util.List;


public interface UserService {
	
	//�����û���Ϣ
	public boolean add(User user);
	
	//�û���¼
	public User login(String userCode, String password);
	
	//����������ѯ�û��б�
	public List<User> getUserList(String queryUserName, int queryUserRole, int currentPageNo, int pageSize);
	
	//��ѯ��¼��
	public int getUserCount(String username, int userRole);
	
	//����userCode��ѯ��User
	public User selectUserCodeExist(String userCode);
	
	//����IDɾ��user
	public boolean deleteUserById(Integer delId);
	
	//����ID����user
	public User getUserById(String id);
	
	//�޸��û���Ϣ
	public boolean modify(User user);
	
	//�����û�ID�޸�����
	public boolean updatePwd(int id, String password)throws SQLException, Exception;
}
