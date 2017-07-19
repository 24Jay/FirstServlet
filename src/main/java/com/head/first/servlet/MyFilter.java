package com.head.first.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class MyFilter implements Filter
{

	public void init(FilterConfig filterConfig) throws ServletException
	{

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		MyHttpRequestWrapper wrapper = new MyHttpRequestWrapper((HttpServletRequest)request);
		chain.doFilter(wrapper, response);
	}

	public void destroy()
	{

	}

}
