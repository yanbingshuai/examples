/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.devfrk.services;

import javax.devfrk.http.annotation.Autowired;
import javax.devfrk.http.annotation.RequestMapping;
import javax.devfrk.http.annotation.RestController;

import io.github.kubesys.devfrk.Counter;


@RequestMapping(value= "/cnt1")
@RestController
public class Cnt1Controller {
	
	@Autowired
	protected Counter cnt;
	
	@RequestMapping(value= "/get")
	public int getHello() throws Exception {
		return cnt.getCount();
	}
	
}