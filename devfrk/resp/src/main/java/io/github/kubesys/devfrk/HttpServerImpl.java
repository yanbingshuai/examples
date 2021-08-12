/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.devfrk;

import io.github.kubesys.devfrk.annotation.ComponentScan;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 */
@ComponentScan(basePackages = {
		"io.github.kubesys.devfrk" })
public class HttpServerImpl  {

	public static void main(String[] args) throws Exception {
		HttpServerRunner.run(HttpServerImpl.class, args);
	}

}