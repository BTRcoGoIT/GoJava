package com.btrco.gojava.mod04.shapes;

public class ShapeAreaCalculator
{
	
	
	public static void main(String[] args)
	{
		Shape circle = new Circle(5);
		System.out.println(circle.calculateArea());
		
		Shape rectangle = new Rectangle(4, 5);
		System.out.println(rectangle.calculateArea());
		
		Shape triangle = new Triangle(5, 4);
		System.out.println(triangle.calculateArea());
	}
	
}
