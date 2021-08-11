/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.devfrk.services;

import javax.devfrk.http.annotation.ExceptionHandler;
import javax.devfrk.http.annotation.RequestMapping;
import javax.devfrk.http.annotation.RequestMethod;
import javax.devfrk.http.annotation.ResponseBody;
import javax.devfrk.http.annotation.RestController;

@RequestMapping(value= "/test")
@RestController
public class TestController {
	
	@RequestMapping(value= "/getHello")
	public Object getHello(String name, int age) {
		return "Hello, " + name + "!" + "," + age;
	}
	
	@RequestMapping(value= "/postHello", method = {RequestMethod.POST})
	public Object postHello(User user) {
		return "Hello, " + user.getName() + "," + user.getAge() + "!";
	}
	
	public static class User {
		
		protected String name;
		
		protected int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
	}
}