package com.btrco.gojava.mod04.shapes;

public class Rectangle extends Shape
{
	
	private float a;
	private float b;
	
	public Rectangle(float a, float b)
	{
		this.a = a;
		this.b = b;
		super.setType("rectangle");
	}
	
	public float getA()
	{
		return a;
	}
	
	public void setA(float a)
	{
		this.a = a;
	}
	
	public float getB()
	{
		return b;
	}
	
	public void setB(float b)
	{
		this.b = b;
	}
	
}
