package com.acc;

import com.google.gson.Gson;

public class JsonDemo
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Gson gson = new Gson();
		System.out.println(gson.toJson(1));
	}
	
}
