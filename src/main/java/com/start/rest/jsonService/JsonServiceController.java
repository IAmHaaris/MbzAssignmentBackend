package com.start.rest.jsonService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins="http://localhost:3000")

@RestController
public class JsonServiceController {
	@GetMapping(path="callnow")
	public String HelloWorld() {
		final String uri = "http://jsonplaceholder.typicode.com/posts";

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	    return result;
		
	}
}
