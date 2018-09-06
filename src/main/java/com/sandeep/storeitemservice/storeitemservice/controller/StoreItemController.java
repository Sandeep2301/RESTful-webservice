package com.sandeep.storeitemservice.storeitemservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class StoreItemController {
	private static Logger LOGGER = LoggerFactory.getLogger(StoreItemController.class);
	
	@PostMapping("/item")
	public void createItem() {
		
	}
	
}
