package org.propertiesOperations;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	public static void main(String[] args) {
		try {
			String fileName="./propertiesFiles/Config.properties";
			FileInputStream fis = new FileInputStream(fileName);
			Properties prop = new Properties();
			prop.load(fis);
			String url = prop.getProperty("url");
			System.out.println("URL : "+url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getPropData(String key) {
		try {
			String file="./propertiesFiles/Config.properties";
			FileInputStream fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			return prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}