package com.head.first.servlet.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener
{

	public void contextInitialized(ServletContextEvent sce)
	{
		ServletContext sc = sce.getServletContext();
		String br = sc.getInitParameter("breed");

		Dog dog = new Dog(br);
		sc.setAttribute("dog", dog);

	}

	public void contextDestroyed(ServletContextEvent sce)
	{
		// TODO Auto-generated method stub

	}

}
