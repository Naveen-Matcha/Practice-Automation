package com.Data.driven.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//location of file
		FileInputStream file = new FileInputStream("E:\\Selenium workspace\\TestAutomationPractice\\TestData\\config.properties");
		//loading properties file
		Properties proObject = new Properties();
		proObject.load(file);
		//Data reading from properties file
		String URL = proObject.getProperty("appurl");
		String userName = proObject.getProperty("usename");
		String password = proObject.getProperty("password");
		
		System.out.println(URL+" "+userName+" "+password+" ");
		//Reading all keys from properties file
		Set<String> keys = proObject.stringPropertyNames();
		System.out.println(keys);
		//Reading all values from properties file
		Collection<Object> value = proObject.values();
		System.out.println(value);

	}

}
