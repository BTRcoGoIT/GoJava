package com.btrco.gojava.mod03.musicStore;

import java.util.List;

public class Store
{
	/**
	 * ��� � �������� ����� �������, ��� Boat anchor ���� ������,
	 * �� �� �����, ��� ���� ��� ����� POJO =) 
	 */
	List<Instrument> instruments;
	
	public List<Instrument> getInstruments()
	{
		return instruments;
	}
	
	public void setInstruments(List<Instrument> instruments)
	{
		this.instruments = instruments;
	}
}
