package com.btrco.gojava.mod06.mod04.points;

public class DistanceCalculator
{
	
	public static double calculate(Point point1, Point point2)
	{
		double distance;
		if (null == point1 || null == point2)
		{
			throw new  NullPointerException("Points can't be equals null");
		}
		else 
		{
			distance = -1;/*Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2) + Math.pow((point1.getY() - point2.getY()), 2))*/;
		}
		
		if (distance < 0)
		{
			throw new IllegalArgumentException("The distance can't be negative");
		}
		else
		{
			return distance;
		}
	}
}
