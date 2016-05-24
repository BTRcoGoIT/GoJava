package com.btrco.gojava.mod02.flowers;

public class Flower
{
	
	private String name;
	private String color;
	private boolean isBloom;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public boolean isBloom()
	{
		return isBloom;
	}
	
	public void setBloom(boolean bloom)
	{
		isBloom = bloom;
	}
}
