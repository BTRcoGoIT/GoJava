package com.btrco.gojava.mod03.fileSystem;

public class SoundFile extends File
{
	
	/**
	 * Тут в принципе можно сказать, что Boat anchor анти плагин,
	 * но не думаю, все таки это почти POJO =) 
	 */
	private int duration;
	private int bitrate;
	
	public int getDuration()
	{
		return duration;
	}
	
	public int getBitrate()
	{
		return bitrate;
	}
	
	public void play()
	{
	}
	
}
