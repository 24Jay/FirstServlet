package com.head.first.servlet.listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ListenerServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		Dog dog = (Dog) getServletContext().getAttribute("dog");

		HttpSession session = req.getSession();
		if (session.isNew())
		{
			out.println("A newly created session!");
		}
		else
		{
			out.println("welcome back!");
		}
		
		Cookie cookie = new Cookie("name", "Jay");
		resp.addCookie(cookie);

		out.println("Dog's breed is: " + dog.getBreed());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
