package com.head.first.servlet.beer;

public class Beer
{
	private String brand="ZHANGJIE";

	public Beer(String br)
	{
		this.brand = br;
	}
	
	
	/**
	 * JavaBean得需要无参数构造函数
	 * 
	 */
	public Beer()
	{
		this.brand="Coca";
	}
	
	
	
	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

}
