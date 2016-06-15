package com.btrco.gojava.mod08;

import java.util.ArrayList;
import java.util.List;

public class CollectionHelper
{
	
	/**
	 * Можно было бы потратить больше времени и с помощью рефлексии сделать универсальный
	 * метод, но на это у меня нету времени.
	 *
	 * @param list
	 */
	
	private static List<Integer> columnLength;
	
	public static void printCollectionAsTable(List<TestInformationClass> list)
	{
		initColumnLengthList();
		calculateLengthOfTheLongestLineInTable(list);
		
		printHorisontalHeadeLine();
		System.out.println();
		for (int i = 0; i < list.size(); i++)
		{
			printVerticalLine();
			System.out.print(" " + list.get(i).getName() + " ");
			printVerticalLine();
			System.out.print(" " + list.get(i).getSoName() + " ");
			printVerticalLine();
			System.out.print(" " + list.get(i).getCity() + " ");
			printVerticalLine();
			System.out.print(" " + list.get(i).getAge() + " ");
			printVerticalLine();
			System.out.print(" " + list.get(i).getNumber() + " ");
			printVerticalLine();
			System.out.println();
			printHorisontalLine();
			System.out.println();
		}
		
	}
	
	private static void initColumnLengthList()
	{
		columnLength = new ArrayList<>();
		for (int i = 0; i < 5; i++)
		{
			columnLength.add(0);
		}
	}
	
	public static void printHeader()
	{
		
	}
	
	
	public static void printHorisontalLine(int length)
	{
		for (int i = 0; i < length; i++)
		{
			System.out.print("-");
		}
	}
	
	public static void printHorisontalHeadeLine(int length)
	{
		for (int i = 0; i < length; i++)
		{
			System.out.print("=");
		}
	}
	
	public static void printVerticalLine()
	{
		System.out.print("|");
	}
	
	public static void calculateLengthOfTheLongestLineInTable(List<TestInformationClass> list)
	{
		for (int i = 0; i < list.size(); i++)
		{
			int length = 0;
			int fullLength = 0;
			length += list.get(i).getName().length();
			if (length > columnLength.get(0))
			{
				columnLength.set(0, length);
				fullLength+=length;
			}
			length += list.get(i).getSoName().length();
			if (length > columnLength.get(1))
			{
				columnLength.set(1, length);
				fullLength+=length;
			}
			length += list.get(i).getCity().length();
			if (length > columnLength.get(2))
			{
				columnLength.set(2, length);
				fullLength+=length;
			}
			length += Integer.toString(list.get(i).getAge()).length();
			if (length > columnLength.get(3))
			{
				columnLength.set(3, length);
				fullLength+=length;
			}
			length += Integer.toString(list.get(i).getNumber()).length();
			if (length > columnLength.get(4))
			{
				columnLength.set(4, length);
				fullLength+=length;
			}
			if (fullLength > columnLength.get(5))
			{
				columnLength.set(5, fullLength);
			}
		}
	}
	
}
