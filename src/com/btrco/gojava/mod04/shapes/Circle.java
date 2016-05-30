package com.btrco.gojava.mod04.shapes;

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
		this.r = r;
	}
	
	@Override
	public double calculateArea()
	{
		return this.r * PI;
	}
}
