package com.btrco.gojava.mod05;

public class ArraysUtil
{
	
	public static int findSmallestElement(int[] array)
	{
		int min = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < min)
			{
				min = array[i];
			}
		}
		
		return min;
				
	}
	
	public static int findBiggestElement(int[] array)
	{
		int max = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		
		return max;
		
	}
		
	public static int[] bubleSortAscending(int[] array)
	{
		int[] sortedArray = array;
		for (int i = 0; i < sortedArray.length - 1; i++)
		{
			for (int j = 0; j < sortedArray.length - 1; j++)
			{
				if (sortedArray[j] > sortedArray[j + 1])
				{
					int temp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1] = temp;
				}
			}
			
		}
		return sortedArray;
	}	
	
	public static int[] bubleSortAscendingLikeAGod(int[] array)
	{
		int[] sortedArray = array;
		for (int i = 0; i < sortedArray.length - 1; i++)
		{
			for (int j = 0; j < sortedArray.length - 1; j++)
			{
				if (sortedArray[j] > sortedArray[j + 1])
				{
					sortedArray[j] += sortedArray[j+1];
					sortedArray[j+1] = sortedArray[j] - sortedArray[j + 1];
					sortedArray[j] = sortedArray[j] - sortedArray[j + 1];
				}
			}
			
		}
		return sortedArray;
	}
	
	public static int[] bubleSortDescending(int[] array)
	{
		int[] sortedArray = array;
		for (int i = 0; i < sortedArray.length - 1; i++)
		{
			for (int j = 0; j < sortedArray.length - 1; j++)
			{
				if (sortedArray[j] < sortedArray[j + 1])
				{
					int temp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1] = temp;
				}
			}
			
		}
		return sortedArray;
	}
	
}
