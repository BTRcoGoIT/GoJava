package com.btrco.gojava.mod08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner
{
	
	public static void main(String[] args)
	{
		List<TestInformationClass> testInformationClassList = new ArrayList<>();
		
		for (int i = 0; i < 5; i++)
		{
			String name = "Name " + (i * 43);
			String soName = "Second name " + i;
			String city = "Testcity " + new Random().nextInt(54654);
			int	age = i * 10;
			int number = 3805033 + i;
			testInformationClassList.add(new TestInformationClass(name, soName, city, age, number));
		}
		
		CollectionHelper.printCollectionAsTable(testInformationClassList);
	}
	
}
