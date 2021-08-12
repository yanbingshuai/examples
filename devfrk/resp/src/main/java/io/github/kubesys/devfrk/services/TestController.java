/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.devfrk.services;

import io.github.kubesys.devfrk.HttpContext;
import io.github.kubesys.devfrk.annotation.ExceptionHandler;
import io.github.kubesys.devfrk.annotation.RequestMapping;
import io.github.kubesys.devfrk.annotation.ResponseBody;
import io.github.kubesys.devfrk.annotation.RestController;


@RequestMapping(value= "/test")
@RestController
public class TestController {
	
	@RequestMapping(value= "/getHello")
	@ResponseBody
	public Object getHello(String name, int age) throws Exception {
		if (name.equals("mary")) {
			return name + ":" + age;
		}
		if (!name.equals("henry")) {
			return new User(name, age);
		}
		throw new Exception("support later");
	}
	
	@RequestMapping(value= "/sayHello")
	@ResponseBody
	public void sayHello(String name, int age) throws Exception {
	}
	
	
	@ExceptionHandler
	@ResponseBody
	public String invalidResponse(HttpContext r, Exception e) throws Exception {
		return r.getPath()+ ":" + e;
	}
	
	public static class User {
		
		protected String name;
		
		protected int age;
		
		public User(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

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