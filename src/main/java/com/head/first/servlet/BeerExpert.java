package com.head.first.servlet;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class BeerExpert
{
	public List<String> getBrand(String color)
	{
		List<String> list = new ArrayList<String>();

		if (color.equals("amber"))
		{
			list.add("Jack Amber");
			list.add("Red Moose");
		}
		else
		{
			list.add("Jail Pale Ale");
			list.add("Gout Stout");
		}
		return list;
	}
}
