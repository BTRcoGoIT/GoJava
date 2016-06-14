package com.btrco.gojava.mod03.flowers;

import java.util.List;

public class RoseBush
{
	/**
	 * Тут в принципе можно сказать, что Boat anchor анти плагин,
	 * но не думаю, все таки это почти POJO =) 
	 */
	private List<Rose> roses;
	
	public List<Rose> getRoses()
	{
		return roses;
	}
	
	public void setRoses(List<Rose> roses)
	{
		this.roses = roses;
	}
}
