package com.btrco.gojava.mod04.shapes;

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
		this.a = a;
	}
	
	public float getH()
	{
		return h;
	}
	
	public void setH(float h)
	{
		this.h = h;
	}
	
	@Override
	public double calculateArea()
	{
		return (this.a * this.h) / 2;
	}
}
