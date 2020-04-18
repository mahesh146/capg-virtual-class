package com.capg.product.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Product Not Found", value = HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException {
public ProductNotFoundException(String message) {
	// TODO Auto-generated constructor stub
	super(message);
}
}
