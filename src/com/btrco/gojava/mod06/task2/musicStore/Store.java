package com.btrco.gojava.mod06.task2.musicStore;

import com.btrco.gojava.mod06.task2.IncorrectInstrumentKey;
import com.btrco.gojava.mod06.task2.WrongInstrumentKeyException;

import java.util.*;

public class Store
{
	Map<String, Integer> instrumentsInShop;
	List<Instrument> instruments;
	Map<String, Integer> currentOrder;
	
	public Store()
	{
		instrumentsInShop = new HashMap<>();		
		instruments = new ArrayList<>();
	}
	
	public List<Instrument> prepareInstruments(Map<String, Integer> order) throws WrongInstrumentKeyException, IncorrectInstrumentKey
	{
		this.currentOrder = order;
		
		List<Instrument> instrumentsForOrder = new ArrayList<>();
		Set<String> keySet = this.currentOrder.keySet();
		
		for (String key : keySet)
		{
			if (this.instrumentsInShop.get(key) == null)
			{
				throw new IncorrectInstrumentKey("You want something wrong from me =)");
			}
			availibilityCheck(key);
			instrumentsForOrder.addAll(getInstrumentsFromWarehouse(key));
		}
		
		return instrumentsForOrder;
	}
	
	public boolean addInstrumentToShop(Instrument instrument)
	{
		if (instrumentsInShop.get(instrument.getName()) == null)
		{
			instrumentsInShop.put(instrument.getName(), 0);
		}
		instrumentsInShop.put(instrument.getName(), instrumentsInShop.get(instrument.getName())+1);
		return instruments.add(instrument);
	}
	
	private void availibilityCheck(String instrumentKey) throws WrongInstrumentKeyException
	{
		int instrumentNumberInOrder = this.currentOrder.get(instrumentKey);
		int instrumentNumberInShop = instrumentsInShop.get(instrumentKey);
		if (instrumentNumberInOrder > instrumentNumberInShop)
		{
			throw new WrongInstrumentKeyException("There is no so many pianos in our Shop");
		}
		
	}
	
	public List<Instrument> getInstrumentsFromWarehouse(String instrumentKey)
	{
		List<Instrument> instrumentsFromWarehouse = new ArrayList<>();
		for (int i = 0; i < this.currentOrder.get(instrumentKey); i++)
		{
			if (instrumentsFromWarehouse.size() == this.currentOrder.get(instrumentKey))
			{
				break;
			}
			for (int j = 0; j < this.instruments.size(); j++)
			{
				Instrument instrument = this.instruments.get(j);
				if (instrumentsFromWarehouse.size() == this.currentOrder.get(instrumentKey))
				{
					break;
				} 
				else if (instrument.getName().equals(instrumentKey))
				{
					instrumentsFromWarehouse.add(instrument);
					this.instruments.remove(instrument);
				}
			}
		}
		
		return instrumentsFromWarehouse;
	}
	
	public Map<String, Integer> getInstrumentsInShop()
	{
		return instrumentsInShop;
	}
	
	public List<Instrument> getInstruments()
	{
		return instruments;
	}
}
