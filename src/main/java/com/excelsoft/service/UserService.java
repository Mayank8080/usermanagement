package com.excelsoft.service;

import java.util.List;

import com.excelsoft.entity.User;

public interface UserService 
{
	User addNewUserService(User u);
	List<User>listAllUserService();
	User updateUserService(User u,int userId);
	User deleteUserService(int userId);
}