package com.sample.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sample.exception.json.FaultResponseJson;

@ControllerAdvice
public class RestExceptionHandler {

	 @ExceptionHandler(Exception.class)
	   protected ResponseEntity<Object> handleEntityNotFound(Exception ex) {
	       FaultResponseJson faultResponseJson = new FaultResponseJson();
	       faultResponseJson.setErrorCode(500);
	       faultResponseJson.setErrorMessage(ex.getMessage());
	       return buildResponseEntity(faultResponseJson);
	 }
	 
	 private ResponseEntity<Object> buildResponseEntity(FaultResponseJson faultResponseJson) {
		 return new ResponseEntity<>(faultResponseJson, HttpStatus.OK);
	 }
}
