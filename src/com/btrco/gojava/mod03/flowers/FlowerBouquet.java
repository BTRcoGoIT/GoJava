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
	
	public void addFlower(Flower flower)
	{
		this.flowers.add(flower);
	}
	
}
