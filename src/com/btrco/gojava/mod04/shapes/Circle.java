package com.btrco.gojava.mod04.shapes;

public class Circle extends Shape
{
	private float r;
	
	public Circle(float r)
	{
		this.r = r;
		super.setType("circle");
	}
	
	public float getR()
	{
		return r;
	}
	
	public void setR(float r)
	{
		this.r = r;
	}
	
}
