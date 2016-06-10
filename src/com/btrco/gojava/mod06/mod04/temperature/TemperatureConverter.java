package com.btrco.gojava.mod06.mod04.temperature;

public class TemperatureConverter
{
	
	public static double convertFarengeitToCelsium(double farengeitDegree)
	{
		double celsium = ((farengeitDegree - 32) / 1.8);
		if (celsium < -273.15)
		{
			throw new IllegalArgumentException("The temperature can't be colder that absolute zero temperature(-273.15)");
		}
		else
		{
			return celsium;
		}
	}
	
	public static double convertCelsiumToFarengeit(double celsiumDegree)
	{
		double farengeit = (1.8 * celsiumDegree) + 32;
		if (farengeit < -459.67)
		{
			throw new IllegalArgumentException("The temperature can't be colder that absolute zero temperature (-459,67)");
		}
		else
		{
			return farengeit;
		}
	}
	
}
