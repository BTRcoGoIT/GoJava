package com.btrco.gojava.mod03.flowers;

import java.util.List;

public class FlowerBouquet
{
	
	private List<Flower> flowers;
	
	public List<Flower> getFlowers()
	{
		return flowers;
	}
	
	public void setFlowers(List<Flower> flowers)
	{
		this.flowers = flowers;
	}
	
	/**
	 * Тут в принципе можно сказать, что Boat anchor анти плагин,
	 * но не думаю, все таки это почти POJO =) 
	 */
	public void addFlower(Flower flower)
	{
		this.flowers.add(flower);
	}
	
}
