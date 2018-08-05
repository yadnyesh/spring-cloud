package io.yadnyesh.sampleclientservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);
	
	@Autowired
	private DiscoveryClient discoveryClient;
}
