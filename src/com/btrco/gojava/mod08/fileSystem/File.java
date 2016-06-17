package com.btrco.gojava.mod08.fileSystem;

import com.btrco.gojava.mod08.task1.ColumnLengthException;

public class File implements Comparable<File>
{
	
	public static final String TEXT_FILE_TYPE = ".txt";
	public static final String SOUND_FILE_TYPE = ".mp3";
	public static final String IMAGE_FILE_TYPE = ".jpg";
	
	private String name;
	private int size;
	private String type;
	private String folder;
	private String date;
	
	public File(String name, int size, String type, String folder, String data) throws ColumnLengthException
	{
		if (name.length() > 22 || String.valueOf(size).length() > 22 || type.length() > 22 || folder.length() > 22 || data.length() > 22)
		{
			throw new ColumnLengthException("Sorry, but column can't be bigger than 22 characters");
		}
		this.name = name;
		this.size = size;
		this.type = type;
		this.folder = folder;
		this.date = data;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getFolder()
	{
		return folder;
	}
	
	public String getDate()
	{
		return date;
	}
	
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}
	
	@Override
	public int compareTo(File file)
	{
		return this.name.compareTo(file.getName()) + 
				this.type.compareTo(file.getType()) +
				this.folder.compareTo(file.getFolder()) +
				this.date.compareTo(file.getDate()) +
				Integer.compare(this.size, file.getSize());
	}
}
