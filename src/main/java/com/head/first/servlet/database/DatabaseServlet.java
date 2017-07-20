package com.head.first.servlet.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.NamingException;
import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		resp.setHeader("content-type", "text/html;charset=UTF-8");

		PrintWriter out = resp.getWriter();
		try
		{
			Connection con = DBconnection.getConnection();
			Statement statement = con.createStatement();
			String sql = "select * from singers join songs join albums";
			ResultSet res = statement.executeQuery(sql);

			while (res.next())
			{
				out.print("<br>ID=" + res.getInt("id"));
				out.print(",  name=" + res.getString("name"));
				out.print(",  state=" + res.getString("state"));
			}
		}
		catch (NamingException e)
		{
			out.println(e.getMessage());
		}
		catch (SQLException e)
		{
			out.println(e.getMessage());
		}

	}

}
