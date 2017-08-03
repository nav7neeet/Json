package com.acc;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class ToJsonDemo
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		StringList stringList = new StringList();
		Gson gson = new Gson();
		String name = gson.toJson(stringList);
		//System.out.println(gson.toJson(stringList));
		try
		{
			FileWriter writer = new FileWriter(
					"C:/Users/navneet.a.mishra/workspace/Json/demo.json");
			writer.write(name);
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
