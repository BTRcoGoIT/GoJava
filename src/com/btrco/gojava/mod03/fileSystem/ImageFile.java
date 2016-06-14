package com.btrco.gojava.mod03.fileSystem;

public class ImageFile extends File
{
	
	/**
	 * Тут в принципе можно сказать, что Boat anchor анти плагин,
	 * но не думаю, все таки это почти POJO =) 
	 */
	private int width;
	private int height;
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void draw()
	{
		
	}
	
}
