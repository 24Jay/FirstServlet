package com.head.first.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		resp.setContentType("imag/jpg");

		ServletContext context = getServletContext();
		String mail = context.getInitParameter("email");

		ServletConfig config = getServletConfig();
		String email = config.getInitParameter("email");
		resp.getWriter().println("ServletContext Parameter: mail=" + mail + "<br>"
				+ "ServletConfig Parameter: email=" + email);

		// 请求分派
		// RequestDispatcher view = req.getRequestDispatcher("/JVM.jpg");
		// view.forward(req, resp);

		// 重定向
		// resp.sendRedirect("http://sports.qq.com/nba/");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
