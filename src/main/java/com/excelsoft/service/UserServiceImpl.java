package com.excelsoft.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.excelsoft.dao.UserDao;
import com.excelsoft.entity.User;

@Component
public class UserServiceImpl implements  UserService
{
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public User addNewUserService(User u) 
	{
		u=userDao.addNewUser(u);
		return u;
	}

	@Override
	@Transactional
	public List<User> listAllUserService() 
	{
		return userDao.listAllUser();
	}

	@Override
	@Transactional
	public User updateUserService(User u, int userId) 
	{
		u=userDao.updateUser(u, userId);
		if(u==null)
		{
			System.out.println("user id not fount");
		}
		return u;
	}

	@Override
	@Transactional
	public User deleteUserService(int userId) 
	{
		
		return userDao.deleteUser(userId);
	}

}