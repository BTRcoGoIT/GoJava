package com.btrco.gojava.mod05;

public class ModuleFiveTest
{
	
	public static void main(String[] args)
	{
		int[] testArray = {-16, -9, -5, 0, 3, 7, 12, 18, 20, 24, 30, 32, 38, 47, 50};
		int[] testArrayAscending = {-16, -9, -5, 0, 3, 7, 12, 18, 20, 24, 30, 32, 38, 47, 50};
		int[] testArrayDescending = {50, 47, 38, 32, 30, 24, 20, 18, 12, 7, 3, 0, -5, -9, -16};
		int testBiggestInt = 50;
		int testSmallestInt = -16;
		
		System.out.println(ArraysUtil.findBiggestElement(testArray));
		System.out.println(assertIntEquals(ArraysUtil.findBiggestElement(testArray), testBiggestInt));
		
		System.out.println(ArraysUtil.findSmallestElement(testArray));
		System.out.println(assertIntEquals(ArraysUtil.findSmallestElement(testArray), testSmallestInt));
		
		int[] sortedArray = ArraysUtil.bubleSortAscending(testArray);
		for (int i = 0; i < sortedArray.length; i++)
		{
			System.out.print(sortedArray[i] + " ");
		}
		
		System.out.println("");
		System.out.println(assertArrayEquals(sortedArray, testArrayAscending));
		
		sortedArray = ArraysUtil.bubleSortDescending(testArray);
		for (int i = 0; i < sortedArray.length; i++)
		{
			System.out.print(sortedArray[i] + " ");
		}
		
		System.out.println("");
		System.out.println(assertArrayEquals(sortedArray, testArrayDescending));
		
		sortedArray = ArraysUtil.bubleSortAscendingLikeAGod(testArray);
		for (int i = 0; i < sortedArray.length; i++)
		{
			System.out.print(sortedArray[i] + " ");
		}
		
		System.out.println("");
		System.out.println(assertArrayEquals(sortedArray, testArrayAscending));
		
	}
	
	private static boolean assertArrayEquals(int[] actualResult, int[] expectedResult)
	{
		boolean equals = true;
		for (int i = 0; i < expectedResult.length; i++)
		{
			if (!(actualResult[i] == expectedResult[i]))
			{
				equals = false;
				break;
			}
		}
		return equals;
	}
	
	private static boolean assertIntEquals(int actualResult, int expectedResult)
	{
		return actualResult == expectedResult;
	}
	
}
