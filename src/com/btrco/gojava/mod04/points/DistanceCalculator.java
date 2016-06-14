package com.btrco.gojava.mod04.points;

public class DistanceCalculator
{
	
	public static double calculate(Point point1, Point point2)
	{
		/**
		 * “ут Magic number 2, и вроде бы повтор€ющиес€ действи€ ал€ Copy and paste, 
		 * но не думаю, что вынесение в отдельный метод Math.pow((point1.getX() - point2.getX()), 2)
		 * или point1.getX() - point2.getX() даст какойто положительный результат, но можно разнести по методам
		 * или отдельным переменным.
		 */
		return Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2) + Math.pow((point1.getY() - point2.getY()), 2));
	}
}
