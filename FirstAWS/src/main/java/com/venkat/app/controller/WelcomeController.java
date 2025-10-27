package com.venkat.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class WelcomeController {

    @GetMapping("/{id}")
    public String welcome(@PathVariable int id) {
    	if(id<0) {
    		throw new IllegalArgumentException("Invalid ID: " + id);
    	}
        return "welcome" + id;
    }
    
    @GetMapping("/extra/{app}")
    public String waste(@PathVariable String app) throws Exception {
    	if(app.equals(app))
    		throw new Exception(app);
    	return "Welcome waste"; 
    }
}
