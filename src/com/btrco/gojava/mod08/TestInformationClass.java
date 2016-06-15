package com.btrco.gojava.mod08;

public class TestInformationClass
{
	
	private String name;
	private String soName;
	private String city;
	private int	age;
	private int number;
	
	public TestInformationClass(String name, String soName, String city, int age, int number)
	{
		this.name = name;
		this.soName = soName;
		this.city = city;
		this.age = age;
		this.number = number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getSoName()
	{
		return soName;
	}
	
	public void setSoName(String soName)
	{
		this.soName = soName;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
}
