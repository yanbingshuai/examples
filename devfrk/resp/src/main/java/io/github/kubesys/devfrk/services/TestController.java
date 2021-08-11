/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.devfrk.services;

import javax.devfrk.http.annotation.ExceptionHandler;
import javax.devfrk.http.annotation.RequestMapping;
import javax.devfrk.http.annotation.ResponseBody;
import javax.devfrk.http.annotation.RestController;
import javax.devfrk.http.httpserver.HttpContext;


@RequestMapping(value= "/test")
@RestController
public class TestController {
	
	@RequestMapping(value= "/getHello")
	public Object getHello(String name, int age) throws Exception {
		throw new Exception("support later");
	}
	
	
	@ExceptionHandler
	@ResponseBody
	public String invalidResponse(HttpContext r, Exception e) throws Exception {
		return r.getPath()+ ":" + e.getLocalizedMessage();
	}
	
}