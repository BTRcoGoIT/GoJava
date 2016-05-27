package com.btrco.gojava.mod04.shapes;

import com.btrco.gojava.mod04.shapes.Circle;
import com.btrco.gojava.mod04.shapes.Rectangle;
import com.btrco.gojava.mod04.shapes.Shape;
import com.btrco.gojava.mod04.shapes.Triangle;

public class ShapeAreaCalculator
{
	
	public static final double PI = 3.14;
	
	public static void main(String[] args)
	{
		Shape circle = new Circle(5);
		System.out.println(calc(circle));
		
		Shape rectangle = new Rectangle(4, 5);
		System.out.println(calc(rectangle));
		
		Shape triangle = new Triangle(5, 4);
		System.out.println(calc(triangle));
	}
	
	private static double calc(Shape shape)
	{
		switch (shape.getType())
		{
			case "circle":
				return ((Circle)shape).getR() * PI;
			case "rectangle":
				return ((Rectangle)shape).getA() * ((Rectangle)shape).getB();
			case "triangle":
				return (((Triangle)shape).getA() * ((Triangle)shape).getH())/2;
			default:
				return 0;
		}
	}
	
}
