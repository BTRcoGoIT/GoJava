package com.btrco.gojava.mod04.temperature;

public class TemperatureConverter
{
	
	public static double convertFarengeitToCelsium(double farengeitDegree)
	{
	 	/**
	 	* Magic numbers
	 	*/
		return ((farengeitDegree - 32) * (5 / 9));
	}
	
	public static double convertCelsiumToFarengeit(double celsiumDegree)
	{
		/**
		 * Magic numbers
		 */
		return ((9 / 5) * celsiumDegree + 32);
	}
	
}
