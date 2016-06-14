package com.btrco.gojava.mod03.musicStore;

import java.util.List;

public class Store
{
	/**
	 * Тут в принципе можно сказать, что Boat anchor анти плагин,
	 * но не думаю, все таки это почти POJO =) 
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
