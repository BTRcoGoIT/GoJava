package com.btrco.gojava.mod06.mod04.shapes;

public class Rectangle implements Shape
{
	
	private float a;
	private float b;
	
	public Rectangle(float a, float b)
	{
		this.a = a;
		this.b = b;
	}
	
	public float getA()
	{
		return a;
	}
	
	public void setA(float a)
	{
		if (a <= 0)
		{
			throw new IllegalArgumentException("Side can not be 0 or negative");
		}
		else
		{
			this.a = a;
		}
		
	}
	
	public float getB()
	{
		return b;
	}
	
	public void setB(float b)
	{
		if (b <= 0)
		{
			throw new IllegalArgumentException("Side can not be 0 or negative");
		}
		else
		{
			this.b = b;
		}
	}
	
	@Override
	public double calculateArea()
	{
		if (this.a <= 0 || this.b <= 0)
		{
			throw new IllegalArgumentException("Sides can not be 0 or negative");
		}
		else
		{
			return this.a * this.b;
		}
	}
}
