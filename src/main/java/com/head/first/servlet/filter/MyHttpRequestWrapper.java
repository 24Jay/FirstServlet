package com.head.first.servlet.filter;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyHttpRequestWrapper extends HttpServletRequestWrapper
{
	// private Map<String, String[]> params;

	public MyHttpRequestWrapper(HttpServletRequest request)
	{
		super(request);
		// params.putAll(request.getParameterMap());
	}

	@Override
	public String getParameter(String name)
	{
		String value = super.getParameter(name);
		if ("color".equals(name))
		{
			return "This is modified!";
		}
		return null;
	}

	@Override
	public Map<String, String[]> getParameterMap()
	{
		// return super.getParameterMap();
		return null;
	}

	@Override
	public String[] getParameterValues(String name)
	{
		// return super.getParameterValues(name);
		return null;
	}

}
