package com.excelsoft.usercontroller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.excelsoft.dao.UserDao;
import com.excelsoft.entity.User;
import com.excelsoft.service.UserService;

@Controller

public class UserController {
	@Autowired
	private UserDao userdao;

	@RequestMapping("/ControllerListUsers.htm")
	public ModelAndView showAllUsers() {
		System.out.println("Inside the showAllUsers() method");
		ModelAndView mav=new ModelAndView();
		mav.addObject("user",userdao.listAllUser());
		mav.setViewName("ListUser.jsp");
		return mav;
	}

	@RequestMapping("/ControllerNewUser.htm")
	public ModelAndView addNewUser(@RequestParam("userid") int uid, @RequestParam("name") String name,
			@RequestParam("contactno") BigInteger cno, @RequestParam("gender") String gender,
			@RequestParam("address") String address) {
		ModelAndView mav = new ModelAndView();
		User u = new User();
		u.setUserId(uid);
		u.setName(name);
		u.setContactNo(cno);
		u.setGender(gender);
		u.setAddress(address);
//		if (userdao.addNewUser(u) != null) {
			mav.addObject("user", userdao.addNewUser(u));
//		} else {
//			mav.addObject("user", "Sorry unable to add new user");
//		}

		mav.setViewName("NewUser.jsp");
		return mav;
	}

	@RequestMapping("/ControllerUpdateUser.htm")
	public ModelAndView updateExistingUser(@RequestParam("userid") int uid,@RequestParam("name") String name,
			@RequestParam("contactno") BigInteger cno,@RequestParam("gender") String gender,@RequestParam("address") String address) {
		ModelAndView mav = new ModelAndView();
		User u=new User();
		u.setName(name);
		u.setContactNo(cno);
		u.setGender(gender);
		u.setAddress(address);
//		if(userdao.updateUser(u, uid)!=null) {
		mav.addObject("user", userdao.updateUser(u, uid));
//		}
//		else 
//		{
//			mav.addObject("user", "User not found");
//		}
		mav.setViewName("UpdateUser.jsp");
		return mav;
	}

	@RequestMapping("/ControllerDeleteUser.htm")
	public ModelAndView deleteExistingUser(@RequestParam("userid") int uid) {
		ModelAndView mav = new ModelAndView();
//		if(userdao.deleteUser(uid)!=null) {
			mav.addObject("user", userdao.deleteUser(uid));
//		}
//		else 
//		{
//			mav.addObject("user", "User not found");
//		}
		mav.setViewName("DeleteUser.jsp");
		return mav;

}

}