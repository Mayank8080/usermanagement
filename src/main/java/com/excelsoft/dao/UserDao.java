package com.excelsoft.dao;

import java.util.List;

import com.excelsoft.entity.User;

public interface UserDao 
{
	
	User addNewUser(User u);
	List<User> listAllUser();
	User updateUser(User u,int userId);
	User deleteUser(int userId);
}