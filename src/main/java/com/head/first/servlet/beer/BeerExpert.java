package com.head.first.servlet.beer;

import java.util.ArrayList;
import java.util.List;


public class BeerExpert
{
	public List<Beer> getBrands(String color)
	{
		List<Beer> list = new ArrayList<Beer>();

		if (color.equals("amber"))
		{
			list.add(new Beer("Jack Amber"));
			list.add(new Beer("Red Moose"));
		}
		else
		{
			list.add(new Beer("Jail Pale Ale"));
			list.add(new Beer("Gout Stout"));
		}
		return list;
	}

	public Beer getBrand(String color)
	{
		if (color.equals("light"))
			return new Beer("青岛啤酒");
		else if (color.equals("amber"))
			return new Beer("哈尔滨啤酒");
		else if (color.equals("brown"))
			return new Beer("楚天啤酒");
		else if (color.equals("dark"))
			return new Beer("雪花啤酒");
		else
			return new Beer("燕京啤酒");
	}
}
