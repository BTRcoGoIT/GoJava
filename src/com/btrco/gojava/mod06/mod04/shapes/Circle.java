package com.btrco.gojava.mod06.mod04.shapes;

public class Circle implements Shape
{
	public static final double PI = 3.14;
	private float r;
	
	public Circle(float r)
	{
		this.r = r;
	}
	
	public float getR()
	{
		return r;
	}
	
	public void setR(float r)
	{
		if (r <= 0)
		{
			throw new IllegalArgumentException("Radius can not be 0 or negative");
		}
		else
		{
			this.r = r;
		}
	}
	
	@Override
	public double calculateArea()
	{
		if (this.r <= 0)
		{
			throw new IllegalArgumentException("Radius can not be 0 or negative");
		}
		else
		{
			return this.r * PI;
		}
	}
}
