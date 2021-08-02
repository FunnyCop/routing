package com.logan.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/" )

public class DojoController {
	
	@RequestMapping( "/{dojo}" )
	public String dojo( @PathVariable( "dojo" ) String dojo ) {
		
		if ( dojo.equals( ( String ) "dojo" ) )
			{ return "The dojo is awesome!"; }
		
		if ( dojo.equals( ( String ) "burbank-dojo" ) )
			{ return "Burbank Dojo is located in Southern California"; }
		
		if ( dojo.equals( ( String ) "san-jose" ) )
			{ return "SJ dojo is the headquarters"; }
		
		return dojo;
	}

}
