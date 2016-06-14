package com.btrco.gojava.mod03.flowers;

public class Flower
{
	
	/**
	 * Тут в принципе можно сказать, что Boat anchor анти плагин,
	 * но не думаю, все таки это почти POJO =) 
	 */
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
