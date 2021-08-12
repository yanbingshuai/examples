/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.devfrk.services;

import io.github.kubesys.devfrk.Counter;
import io.github.kubesys.devfrk.annotation.Autowired;
import io.github.kubesys.devfrk.annotation.RequestMapping;
import io.github.kubesys.devfrk.annotation.RestController;


@RequestMapping(value= "/cnt2")
@RestController
public class Cnt2Controller {
	
	@Autowired
	protected Counter cnt;
	
	@RequestMapping(value= "/get")
	public int getHello() throws Exception {
		return cnt.getCount();
	}
	
}