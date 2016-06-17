package com.btrco.gojava.mod08.fileSystem;

import com.btrco.gojava.mod08.task1.ColumnLengthException;

public class ImageFile extends File
{
		
	public ImageFile(String name, int size, String folder, String data) throws ColumnLengthException
	{
		super(name, size, File.IMAGE_FILE_TYPE, folder, data);
	}
		
}
