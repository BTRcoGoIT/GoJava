package com.btrco.gojava.mod04.points;

public class DistanceCalculator
{
	public static void main(String[] args)
	{
		Point point1 = new Point(5, 5);
		Point point2 = new Point(10, 10);
		System.out.println(calculate(point1, point2));
	}
	
	private static double calculate(Point point1, Point point2){
		return Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2) + Math.pow((point1.getY() - point2.getY()), 2));
	}
}
