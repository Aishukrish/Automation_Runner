package com.Configuration.helper;

import java.io.IOException;

public class File_Reader_Manager1 {
	private File_Reader_Manager1() {
	}
	public static File_Reader_Manager1 get_Instance_frm1()
	{
		File_Reader_Manager1 frm1= new File_Reader_Manager1();
		return frm1;
	}
	public Configuration_Reader1 get_Instance_CR1() throws IOException
	{
		Configuration_Reader1  reader1= new Configuration_Reader1();
		return reader1;
		
	}


}
