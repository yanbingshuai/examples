/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.devfrk;

public class Counter {

	protected int cnt = 0;
	
	public int getCount() {
		return cnt++;
	}
}
