package com.btrco.gojava.mod08.fileSystem;

import com.btrco.gojava.mod08.task1.ColumnLengthException;

public class TextFile extends File
{
	
	public TextFile(String name, int size, String folder, String data) throws ColumnLengthException
	{
		super(name, size, File.TEXT_FILE_TYPE, folder, data);
	}
	
}
