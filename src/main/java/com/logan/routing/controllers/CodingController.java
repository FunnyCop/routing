package com.logan.routing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/coding" )

public class CodingController {

	@RequestMapping( "" )
	public String coding() { return "Hello Coding Dojo!"; }
	
	@RequestMapping( "/python" )
	public String python() { return "Python/Flask is awesome!"; }
	
	@RequestMapping( "/java" )
	public String java() { return "Java/Spring is better!"; }
}
