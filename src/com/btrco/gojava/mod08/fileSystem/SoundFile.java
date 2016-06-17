package com.btrco.gojava.mod08.fileSystem;

import com.btrco.gojava.mod08.task1.ColumnLengthException;

public class SoundFile extends File
{

	public SoundFile(String name, int size, String folder, String data) throws ColumnLengthException
	{
		super(name, size, File.SOUND_FILE_TYPE, folder, data);
	}

	
}
