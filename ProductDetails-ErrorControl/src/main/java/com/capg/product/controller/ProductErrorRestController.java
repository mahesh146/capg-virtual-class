package com.capg.product.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.capg.product.exceptions.ExceptionResponse;
import com.capg.product.exceptions.ProductNotFoundException;

@RestController
@ControllerAdvice
public class ProductErrorRestController {

	@ResponseStatus(code = HttpStatus.NOT_FOUND, value = HttpStatus.NOT_FOUND,reason = "Product Not Found")
	@ExceptionHandler(ProductNotFoundException.class)
	public ExceptionResponse handleProductNotFoundException(WebRequest request) {
		return new ExceptionResponse(LocalDate.now(),HttpStatus.NOT_FOUND,"Not Found",request.getDescription(true),request.getContextPath());
	}
}