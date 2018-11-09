package com.esdrasdemorais.mechanicalworkshop.domain.model.interfaces;

import java.util.List;

import com.esdrasdemorais.mechanicalworkshop.domain.model.Forecast;
import com.esdrasdemorais.mechanicalworkshop.domain.model.Machine;
import com.esdrasdemorais.mechanicalworkshop.domain.model.Schedule;

public interface IService {
	public void setType(String serviceType);
	public void setIsActive(Boolean isActive);
	public void setAverageCost(Double cost);
	public void setSchedules(List<Schedule> schedules);
	public void setForecasts(List<Forecast> forecasts);
	public void setMachine(Machine machine);
}
