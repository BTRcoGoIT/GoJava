package com.btrco.gojava.mod06.mod04.points;

public class Test
{
	
	public static void main(String[] args)
	{
		Point point1 = null/*new Point(5, 5)*/;
		Point point2 = new Point(10, 10);
		try
		{
			System.out.println(DistanceCalculator.calculate(point1, point2));
		} 
		catch (NullPointerException e)
		{
			e.printStackTrace();
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}	
		
	}
	
}
