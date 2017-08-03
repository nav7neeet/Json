package com.acc;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.stream.JsonWriter;

public class JsonWriterDemo
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		JsonWriter writer;
		
		try
		{
			writer = new JsonWriter(new FileWriter(
					"E:/Workspace/Json/file.json"));
			
			writer.beginObject();
			
			writer.name("name").value("Eklavya");
			writer.name("age").value(21);
			writer.name("proficiency").value("archery");
			
			writer.endObject();
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
