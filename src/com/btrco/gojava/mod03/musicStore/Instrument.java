package com.btrco.gojava.mod03.musicStore;

public class Instrument
{
	/**
	 * ��� � �������� ����� �������, ��� Boat anchor ���� ������,
	 * �� �� �����, ��� ���� ��� ����� POJO =) 
	 */
	private String name;
	private String model;
	private String country;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public void setCountry(String country)
	{
		this.country = country;
	}
	
}
