/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.devfrk;

import javax.devfrk.http.HttpServerApplication;
import javax.devfrk.http.annotation.ComponentScan;
import javax.devfrk.http.annotation.HttpBootApplication;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 */
@ComponentScan(basePackages = {
		"io.github.kubesys.devfrk" })
@HttpBootApplication
public class HttpServerImpl  {

	public static void main(String[] args) {
		HttpServerApplication.run(HttpServerImpl.class, args);
	}

}