package com.Configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader1 {
	public static Properties p;
	public Configuration_Reader1() throws IOException
	{
	File f= new File("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\src\\main\\java\\com\\testdata\\properties\\Automation.properties");
	FileInputStream fis= new FileInputStream(f);
	p= new Properties();
	p.load(fis);
	}
	public String get_Config_Url()
	{
	String value= p.getProperty("url");
	return value;
	}
	public String get_Config_email()
	{
		String name=p.getProperty("email");
		return name;
	}
	public String get_Config_Password()
	{
		String password= p.getProperty("password");
		return password;
	}
	

}
