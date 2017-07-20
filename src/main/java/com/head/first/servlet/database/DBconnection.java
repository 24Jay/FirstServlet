package com.head.first.servlet.database;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBconnection
{

	public static Connection getConnection() throws NamingException, SQLException
	{
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");// 固定，不需要修改

		DataSource ds = (DataSource) envContext.lookup("MysqlData");
		return ds.getConnection();

	}
	
}