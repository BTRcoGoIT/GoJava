package com.btrco.gojava.mod03.fileSystem;

public class TextFile extends File
{
	
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
