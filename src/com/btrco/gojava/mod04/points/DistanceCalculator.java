package com.btrco.gojava.mod04.points;

public class DistanceCalculator
{
	
	public static double calculate(Point point1, Point point2)
	{
		return Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2) + Math.pow((point1.getY() - point2.getY()), 2));
	}
}