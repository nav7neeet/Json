package com.acc;

import java.util.ArrayList;
import java.util.List;

public class StringList
{
	
	/**
	 * @param args
	 */
	private String data1 = "Jai Hind";
	
	private String data2 = "absolution";
	
	private List<String> list = new ArrayList<String>()
	{
		{
			add("hi");
			add("hello");
		}
	};
	
	public String toString()
	{
		return "DataObjects [data1=" + data1 + ", data2=" + data2 + ", list="
				+ list + "]";
	}
	
	public void fun()
	{
		System.out.println("function...");
	}
}
