package com.esdrasdemorais.mechanicalworkshop.domain.model;

import java.util.Date;
import java.util.List;

public class Forecast {
	protected Date nextServiceIn;
	protected Double cost;
	protected List<Date> schedules;
}
