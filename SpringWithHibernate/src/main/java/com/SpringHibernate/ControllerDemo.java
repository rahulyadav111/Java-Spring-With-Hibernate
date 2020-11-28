package com.SpringHibernate;


import java.util.List;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.DispatcherServlet;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;

import model.Student;
import model.StudentDao;

@Controller
public class ControllerDemo {
	
	//InternalResourceViewResolver obj=
	//DispatcherServlet obj=
	@RequestMapping("/register")
	public String view(Model m)
	{
		m.addAttribute("bean",new Student());
		return "register";
	}

	@RequestMapping(value="/stor",method=RequestMethod.POST)
	public String view1(@Valid @ModelAttribute("bean") Student s,BindingResult br) 
	{
		if(br.hasErrors())
		{
			return "register";
		}	
		else {
			StudentDao.save(s);
			return "success";
		}
	}
	@RequestMapping(value="/display",method = RequestMethod.POST)
	public String display(Model m)
	{
		Configuration con=new Configuration().configure("hibrnate.cfg.xml");
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		List list=session.createQuery("from Student").list();
		m.addAttribute("data",list);
		return"display";
	}
	
}
