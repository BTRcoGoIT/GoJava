package com.btrco.gojava.mod03.fileSystem;

import java.util.List;

public class Folder
{
	
	/**
	 * Тут в принципе можно сказать, что Boat anchor анти плагин,
	 * но не думаю, все таки это почти POJO =) 
	 */
	List<File> fileList;
	List<Folder> folderListr;
	
	public List<File> getFileList()
	{
		return fileList;
	}
	
	public List<Folder> getFolderListr()
	{
		return folderListr;
	}
	
	public boolean addFile(File file)
	{
		return fileList.add(file);	
	}
	
	public boolean removeFile(File file)
	{
		return fileList.remove(file);
	}
	
	
}
