package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HController {
	
		@Autowired
		UserDAO userDao;
	
		//http://localhost:8080/home
		@RequestMapping("home")
		public ModelAndView home(User1 user) {

			ModelAndView mv = new ModelAndView();
			//mv.addObject("userInfo", user);
			mv.setViewName("index.jsp");

			return mv;
		}

		@RequestMapping("addUser")
	public ModelAndView add(User1 user) {
 
			System.out.println(user.getName());
			System.out.println(user.getSalary());
			System.out.println(user.getEmpNo());
			ModelAndView mv = new ModelAndView();
			mv.addObject("userInfo", user);
			mv.setViewName("addUser.jsp");
			userDao.save(user); // save to database
			return mv;
		}
		
		@RequestMapping("displayUser")
		public ModelAndView display(@RequestParam String empNo) {
			ModelAndView mv = new ModelAndView();
			User1 user = userDao.findById(empNo).orElse(new User1());
			mv.addObject("value", user);
			mv.setViewName("display.jsp");
			System.out.println("Display user");
			System.out.println(user.getName());
			System.out.println(user.getSalary());
			
			return mv;
			
		}
		
		@RequestMapping("deleteUser")
		public ModelAndView delete(@RequestParam String empNo) {
			ModelAndView mv = new ModelAndView();
		
			User1 user = userDao.findById(empNo).orElse(new User1());
			userDao.deleteById(empNo);
			mv.addObject("deleted", user);
			mv.setViewName("delete.jsp");
			
			return mv;
			
		}
		
		@RequestMapping("updateUser")
		public ModelAndView update(@RequestParam String empNo) {
			ModelAndView mv = new ModelAndView();
			User1 user = userDao.findById(empNo).orElse(new User1());
			userDao.deleteById(empNo);
			mv.addObject("update", user);
			mv.setViewName("update.jsp");
			return mv;
			
		}
}
