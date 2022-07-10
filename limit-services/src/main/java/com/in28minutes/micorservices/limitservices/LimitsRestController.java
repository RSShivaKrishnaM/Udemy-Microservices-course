package com.in28minutes.micorservices.limitservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.micorservices.limitservices.bean.LimitsConfiguration;

@RestController
public class LimitsRestController {

	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsConfiguration() {
		return new LimitsConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}

}
