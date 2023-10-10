package com.org.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.dto.BusDto;
import com.org.service.IBusService;

@RestController
public class BusRestController {
	
	@Autowired
	private IBusService ibusService;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveBus(@RequestBody BusDto dto){
		String saveBusDtls = ibusService.saveBusDtls(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveBusDtls);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

}
