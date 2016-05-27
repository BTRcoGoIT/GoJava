package com.btrco.gojava.mod04.temperature;

public class TemperatureConverter
{
	
	public static void main(String[] args)
	{
		System.out.println(convertCelsiumToFarengeit(0));
		System.out.println(convertFarengeitToCelsium(32));
	}
	
	private static double convertFarengeitToCelsium(double farengeitDegree)
	{
		return ((farengeitDegree - 32) * (5/9));
	}
	
	private static double convertCelsiumToFarengeit(double celsiumDegree)
	{
		return ((9/5) * celsiumDegree + 32);
	}
	
}
