package com.btrco.gojava.mod03.fileSystem;

public class SoundFile extends File
{
	
	/**
	 * ��� � �������� ����� �������, ��� Boat anchor ���� ������,
	 * �� �� �����, ��� ���� ��� ����� POJO =) 
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
