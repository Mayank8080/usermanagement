package com.excelsoft.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.excelsoft.entity.User;
@Component
public class UserDaoImpl implements UserDao
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("1ToN_PU");
	EntityManager em=emf.createEntityManager();


	@Override
	@Transactional
	public User addNewUser(User u) 
	{
		em.persist(u);
		return u;
	}

	@Override
	@Transactional
	public List<User> listAllUser() {
		System.out.println("Inside DaoImpl listAllUsers()......");
		Query query=em.createQuery("select u from User u");
		List<User> ulist=query.getResultList();
		
		return ulist;
	}


	
	@Override
	@Transactional
	public User updateUser(User u,int userId) 
	{
		User user=em.find(User.class, userId);
		if(user!=null)
		{
			user.setName(u.getName());
			user.setContactNo(u.getContactNo());
			user.setGender(u.getGender());
			user.setAddress(u.getAddress());
		}
		else
		{
			System.out.println("User not found");
		}
		return user;
	}

	
	@Override
	@Transactional
	public User deleteUser(int userId) 
	{
		User user=em.find(User.class,userId);
		if(user!=null)
		{
			em.remove(user);
		}
		else
		{
			System.out.println("User not found");
		}
		return user;
	}

}