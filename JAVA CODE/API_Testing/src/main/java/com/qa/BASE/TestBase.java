package com.qa.BASE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public int Response_Status_Code_200 =200;
	public int Response_Status_Code_300 =300;
	public int Response_Status_Code_400 =400;
	
	
	public Properties prop;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Applications/Projects/JAVA CODE/API_Testing/src/main/java/com/qa/configration/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
