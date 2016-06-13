package com.btrco.gojava.mod06.task2;

import com.btrco.gojava.mod06.task2.musicStore.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner
{
	public static void main(String[] args)
	{
		Store musicStore = new Store();
		for (int i = 0; i < 10; i++)
		{
			musicStore.addInstrumentToShop(new Piano());
			musicStore.addInstrumentToShop(new Guitar());
			musicStore.addInstrumentToShop(new Trumpet());
		}
		System.out.println("Instruments in Shop before order processing " + musicStore.getInstruments().size());
		
		Map<String, Integer> order = new HashMap<>();
		order.put("aaa", 2);
		order.put(Instrument.GUITAR_KEY, 2);
		order.put(Instrument.TRUMPET_KEY, 2);
		
		List<Instrument> instruments = new ArrayList<>();
		try
		{
			instruments = musicStore.prepareInstruments(order);
			
		} 
		catch (WrongInstrumentKeyException e)
		{
			e.printStackTrace();
		} catch (IncorrectInstrumentKey incorrectInstrumentKey)
		{
			incorrectInstrumentKey.printStackTrace();
		}
		
		System.out.println("Instruments in Order after order processing " + instruments.size());
		System.out.println("Instruments in Shop after order processing " + musicStore.getInstruments().size());
		
	}
}
