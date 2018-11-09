package com.esdrasdemorais.mechanicalworkshop.domain.model.interfaces;

public interface IMachine {
	public void setType(String type);
	public void setWeight(Double weight);
	public void setCapacity(Double capacity);
	public void setModel(String model);
	public void setIsAvailable(Boolean isAvailable);
	//public void setLocalization(Position position);
	public void setColor(String color);
	public void setHasFuel(Boolean hasFuel);
	public void setBrand(String brand);
}