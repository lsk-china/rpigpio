package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Controller {
    @Autowired
    private GPIO gpio;

	@GetMapping("/test")
	public String test() {
		return "test";
	}

    @GetMapping("/on")
    public String on() {
        gpio.on();
        return "Success";
    }

    @GetMapping("/off")
    public String off() {
        gpio.off();
        return "Success";
    }
}
