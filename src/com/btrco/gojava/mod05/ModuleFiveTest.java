package com.btrco.gojava.mod05;

public class ModuleFiveTest
{
	
	public static void main(String[] args)
	{
		int[] testArray = {-16, -9, -5, 0, 3, 7, 12, 18, 20, 24, 30, 32, 38, 47, 50};
		
		System.out.println(ArraysUtil.findBiggestElement(testArray));
		
		System.out.println(ArraysUtil.findSmallestElement(testArray));
		
		int[] sortedArray = ArraysUtil.bubleSortAscending(testArray);
		for (int i = 0; i < sortedArray.length; i++)
		{
			System.out.print(sortedArray[i] + " ");
		}
		
		System.out.println("");
		
		sortedArray = ArraysUtil.bubleSortDescending(testArray);
		for (int i = 0; i < sortedArray.length; i++)
		{
			System.out.print(sortedArray[i] + " ");
		}
		
		System.out.println("");
		
		sortedArray = ArraysUtil.bubleSortAscendingLikeAGod(testArray);
		for (int i = 0; i < sortedArray.length; i++)
		{
			System.out.print(sortedArray[i] + " ");
		}
		
	}
	
}
