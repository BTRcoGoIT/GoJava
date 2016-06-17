package com.btrco.gojava.mod08;

import java.util.ArrayList;
import java.util.List;

public class CollectionHelper
{
	
	/**
	 * Можно было бы потратить больше времени и с помощью рефлексии сделать универсальный
	 * метод, но на это у меня нету времени.
	 * Еще времени не хватило на универсальнуую таблицу(члтобы ширина колонки была динамична 
	 * в зависимости от длины содержания(по самому длинному слову))
	 * @param list
	 */
	
//	private static List<Integer> columnLength;
	
	public static void printCollectionAsTable(List<com.btrco.gojava.mod08.fileSystem.File> list)
	{
		printHeader();
		
		System.out.println();
		for (int i = 0; i < list.size(); i++)
		{
			String spaces = getSpaces(list.get(i).getName(), true);
			printVerticalLine();
			System.out.print(spaces + list.get(i).getName() + getSpaces(spaces + list.get(i).getName(), false));
			
			spaces = getSpaces(list.get(i).getType(), true);
			printVerticalLine();
			System.out.print(spaces + list.get(i).getType() + getSpaces(spaces + list.get(i).getType(), false));
			
			spaces = getSpaces(String.valueOf(list.get(i).getSize()), true);
			printVerticalLine();
			System.out.print(spaces + list.get(i).getSize() + getSpaces(spaces + list.get(i).getSize(), false));
			
			spaces = getSpaces(list.get(i).getFolder(), true);
			printVerticalLine();
			System.out.print(spaces + list.get(i).getFolder() + getSpaces(spaces + list.get(i).getFolder(), false));
			
			spaces = getSpaces(list.get(i).getDate(), true);
			printVerticalLine();
			System.out.print(spaces + list.get(i).getDate() + getSpaces(spaces + list.get(i).getDate(), false));
			
			printVerticalLine();
			System.out.println();
			printHorisontalLine(116);
			System.out.println();
		}
		
	}
	
	public static String getSpaces(String text, boolean isFirst)
	{
		String spaces = "";
		int counter;
		if (isFirst)
		{
			counter = (22 - text.length())/2;
		}
		else 
		{
			counter = 22 - text.length();
		}
		for (int i = 0; i < counter; i++)
		{
			spaces+=" ";
		}
		return spaces;
	}
	
	
	/*private static void initColumnLengthList()
	{
		columnLength = new ArrayList<>();
		for (int i = 0; i < 5; i++)
		{
			columnLength.add(0);
		}
	}*/
	
	/**
	 * Тут тоже можно считать длину пробелов с помощью метода
	 */
	public static void printHeader()
	{
		printHorisontalHeadeLine(116);
		System.out.println();
		printVerticalLine();
		System.out.print("         Name         ");
		printVerticalLine();
		System.out.print("         Size         ");
		printVerticalLine();
		System.out.print("         Type         ");
		printVerticalLine();
		System.out.print("         Info         ");
		printVerticalLine();
		System.out.print("         Info         ");
		printVerticalLine();
		System.out.println();
		printHorisontalHeadeLine(116);		
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
	
	/*public static void calculateLengthOfTheLongestLineInTable(List<TestInformationClass> list)
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
	}*/
	
}
