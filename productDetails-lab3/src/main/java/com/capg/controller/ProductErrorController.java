package com.capg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.capg.exception.ProductNotFoundException;

public class ProductErrorController {
	@ExceptionHandler(ProductNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Product Not Found" , code = HttpStatus.NOT_FOUND)
	public void handleUserNotFoundException() {
		
	}
}
