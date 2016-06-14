package com.btrco.gojava.mod03.fileSystem;

public class TextFile extends File
{
	
	/**
	 * Тут в принципе можно сказать, что Boat anchor анти плагин,
	 * но не думаю, все таки это почти POJO =) 
	 */
	private String text;
	
	public String getText()
	{
		return text;
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
	
}
