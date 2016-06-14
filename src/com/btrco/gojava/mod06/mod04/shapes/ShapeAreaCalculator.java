package com.btrco.gojava.mod06.mod04.shapes;

public class ShapeAreaCalculator
{
	
	
	public static void main(String[] args)
	{
		/**
		 * Hard code + Magic numbers
		 */
		Circle circle = new Circle(5);
		System.out.println(circle.calculateArea());
		
		Rectangle rectangle = new Rectangle(4, 5);
		System.out.println(rectangle.calculateArea());
		
		Triangle triangle = new Triangle(5, 4);
		System.out.println(triangle.calculateArea());
		
		try
		{
			triangle.setA(0);
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			circle.setR(-3);
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			rectangle.setA(-6);
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}
	
}
