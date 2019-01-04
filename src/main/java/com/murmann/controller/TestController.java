package com.murmann.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.murmann.model.ResponseMessage;

@RestController
public class TestController {

	@GetMapping("/prime")
	public ResponseMessage isPrime(@RequestParam(name="number") long number) {
		return new ResponseMessage(number);
	}
	
}
