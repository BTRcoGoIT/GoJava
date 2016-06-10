package com.btrco.gojava.mod06.mod04.shapes;

public class Triangle implements Shape
{
	
	private float a;
	private float h;
	
	public Triangle(float a, float h)
	{
		this.a = a;
		this.h = h;
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
	
	public float getH()
	{
		return h;
	}
	
	public void setH(float h)
	{
		if (h <= 0)
		{
			throw new IllegalArgumentException("Hight can not be 0 or negative");
		}
		else
		{
			this.h = h;
		}
	}
	
	@Override
	public double calculateArea()
	{
		if (this.h <= 0 || this.a <= 0)
		{
			throw new IllegalArgumentException("Hight can not be 0 or negative");
		}
		else
		{
			return (this.a * this.h) / 2;
		}
	}
}
