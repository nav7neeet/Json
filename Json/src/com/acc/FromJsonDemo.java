package com.acc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class FromJsonDemo
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Gson gson = new Gson();
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(
					"C:/Users/navneet.a.mishra/workspace/Json/demo.json"));
			StringList name = gson.fromJson(br, StringList.class);
			
			//String data1=name.getj(); 
			System.out.println(name);
		}
		catch (JsonSyntaxException e)
		{
			e.printStackTrace();
		}
		catch (JsonIOException e)
		{
			e.printStackTrace();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
}
