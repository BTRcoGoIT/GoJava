package com.btrco.gojava.mod06.mod04.temperature;

public class Test
{
	
	public static void main(String[] args)
	{
		try
		{
			System.out.println(TemperatureConverter.convertCelsiumToFarengeit(-273.16));
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		try
		{
			System.out.println(TemperatureConverter.convertFarengeitToCelsium(-459.68));
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}
	
}
