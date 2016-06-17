package com.btrco.gojava.mod08;

import com.btrco.gojava.mod08.fileSystem.*;

import java.util.ArrayList;
import java.util.List;

public class Runner
{
	
	public static void main(String[] args)
	{
		
		List<File> files = new ArrayList<>();
		
		for (int i = 0; i < 15; i++)
		{
			if (i < 5)
			{
				try
				{
					files.add(new SoundFile("Sound " + i, (i + 1)*1564, "NewFolder", "17.06.2016"));
				} catch (ColumnLengthException e)
				{
					e.printStackTrace();
				}
			}
			else if (i < 10)
			{
				try
				{
					files.add(new ImageFile("Image " + i, (i + 1)*144, "NewFolder", "17.06.2016"));
				} catch (ColumnLengthException e)
				{
					e.printStackTrace();
				}
			}
			else 
			{
				try
				{
					files.add(new TextFile("Text " + i, (i + 1)*14, "NewFolder", "17.06.2016"));
				} catch (ColumnLengthException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		CollectionHelper.printCollectionAsTable(files);
		
	}
	
}
