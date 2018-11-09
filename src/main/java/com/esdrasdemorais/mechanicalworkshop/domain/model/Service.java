package com.esdrasdemorais.mechanicalworkshop.domain.model;

import java.util.Date;
import java.util.List;

import com.esdrasdemorais.mechanicalworkshop.domain.model.interfaces.IService;

public abstract class Service implements IService {
	protected String type;
	protected Boolean isActive;
	protected Double averageCost;
	protected List<Schedule> schedules;
	protected List<Forecast> forecasts;
	protected Machine machine;
	
	public String getType() {
		return type;
	}
	public Double getAverageCost() {
		return averageCost;
	}
	public void setAverageCost(Double averageCost) {
		this.averageCost = averageCost;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}
