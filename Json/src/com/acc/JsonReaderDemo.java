package com.acc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.stream.JsonReader;

public class JsonReaderDemo
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		try
		{
			JsonReader reader = new JsonReader(new FileReader(
					"E:/Workspace/Json/file.json"));
			reader.beginObject();
			
			while (reader.hasNext())
			{
				String name = reader.nextName();
				System.out.println(name);
				System.out.println(reader.nextString());
				
				/*if (name.equals("name"))
				{
					System.out.println(name);
					System.out.println(reader.nextString());
					//System.out.println(reader.);
				}*/
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
