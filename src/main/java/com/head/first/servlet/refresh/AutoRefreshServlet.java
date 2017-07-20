package com.head.first.servlet.refresh;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AutoRefreshServlet extends HttpServlet
{

	/**
	 * 刷新网页的最简单的方式是使用响应对象的方法 response.setIntHeader()
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{

		// 设置刷新自动加载的时间为1秒
		resp.setIntHeader("Refresh", 1);
		resp.setContentType("text/html;charset=UTF-8");

		Calendar calendar = new GregorianCalendar();

		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		if (calendar.get(Calendar.AM_PM) == 0)
			am_pm = "AM";
		else
			am_pm = "PM";

		String CT = hour + ":" + minute + ":" + second + " " + am_pm;

		PrintWriter out = resp.getWriter();
		String title = "使用 Servlet 自动刷新页面";
		String docType = "<!DOCTYPE html> \n";
		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n"
				+ "<p>当前时间是：" + CT + "</p>\n");
	}

}
